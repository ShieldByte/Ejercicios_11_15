import sys
from antlr4 import *
from SQLLexer import SQLLexer
from SQLParser import SQLParser
from SQLVisitor import SQLVisitor

# Número de control: 21031117

class MiVisitante(SQLVisitor):
    def __init__(self):
        self.tablas = {}          # Guarda los datos de las tablas
        self.estructuras = {}     # Guarda las columnas, tipos y restricciones

    # Root: recorre las sentencias del script
    def visitRoot(self, ctx):
        for stmt in ctx.statement():
            self.visit(stmt)
        return None

    # Procesa el CREATE TABLE
    def visitCreateTableStmt(self, ctx):
        nombre = ctx.tableName().getText()
        columnas = []
        tipos = {}
        restricciones = {}

        for col_def in ctx.columnDef():
            nombre_col = col_def.columnName().getText()
            tipo_dato = self.visit(col_def.dataType())
            columnas.append(nombre_col)
            tipos[nombre_col] = tipo_dato

            # Restricciones de la columna
            restricciones[nombre_col] = []
            for constraint in col_def.columnConstraint():
                if constraint.PRIMARY() and constraint.KEY():
                    restricciones[nombre_col].append("PRIMARY KEY")
                if constraint.NOT() and constraint.NULL():
                    restricciones[nombre_col].append("NOT NULL")

        self.estructuras[nombre] = {
            'columnas': columnas,
            'tipos': tipos,
            'restricciones': restricciones
        }
        self.tablas[nombre] = {'datos': []}
        print(f"Tabla '{nombre}' creada.")
        return None

    # Procesa el INSERT INTO
    def visitInsertStmt(self, ctx):
        nombre = ctx.tableName().getText()
        if nombre not in self.estructuras:
            print(f"Error: La tabla '{nombre}' no existe.")
            return None

        # Columnas a las que se les inserta
        columnas_destino = [col.getText() for col in ctx.columnName()]
        if not columnas_destino:
            columnas_destino = self.estructuras[nombre]['columnas']

        filas_insertadas = 0
        for value_list in ctx.valueList():
            valores = [self.visit(v) for v in value_list.value()]
            
            fila = {}
            for i, col in enumerate(columnas_destino):
                if i < len(valores):
                    fila[col] = valores[i]
                else:
                    fila[col] = None

            # Rellenar con autoincrementales si es SERIAL
            for col in self.estructuras[nombre]['columnas']:
                if col not in fila:
                    if self.estructuras[nombre]['tipos'].get(col) == "SERIAL":
                        datos_existentes = self.tablas[nombre]['datos']
                        if datos_existentes:
                            ultimo_id = max(f.get(col, 0) for f in datos_existentes if f.get(col) is not None)
                            fila[col] = ultimo_id + 1
                        else:
                            fila[col] = 1
                    else:
                        fila[col] = None

            self.tablas[nombre]['datos'].append(fila)
            filas_insertadas += 1

        print(f"Insertados {filas_insertadas} registros en '{nombre}'.")
        return None

    # Procesa el SELECT
    def visitSelectStmt(self, ctx):
        columnas_seleccion = []
        alias_tabla = {}
        for select_col in ctx.selectColumns().selectColumn():
            if select_col.tableAlias():
                alias = select_col.tableAlias().getText()
                col = select_col.columnName().getText()
                columnas_seleccion.append((alias, col))
            else:
                columnas_seleccion.append((None, select_col.columnName().getText()))

        # Tabla principal
        from_ctx = ctx.fromClause()
        tabla_principal = from_ctx.tableRef(0)
        nombre_tabla_principal = tabla_principal.tableName().getText()
        alias_principal = tabla_principal.ID().getText() if tabla_principal.ID() else nombre_tabla_principal
        alias_tabla[alias_principal] = nombre_tabla_principal

        # INNER JOIN
        if from_ctx.joinCondition():
            tabla_secundaria = from_ctx.tableRef(1)
            nombre_tabla_sec = tabla_secundaria.tableName().getText()
            alias_sec = tabla_secundaria.ID().getText() if tabla_secundaria.ID() else nombre_tabla_sec
            alias_tabla[alias_sec] = nombre_tabla_sec

            # Condicion del JOIN
            join_ctx = from_ctx.joinCondition()
            col_izq_alias = join_ctx.tableAlias(0).getText()
            col_izq = join_ctx.ID(0).getText()
            col_der_alias = join_ctx.tableAlias(1).getText()
            col_der = join_ctx.ID(1).getText()
        else:
            alias_sec = None
            nombre_tabla_sec = None
            col_izq_alias = col_izq = col_der_alias = col_der = None

        datos_principales = self.tablas[nombre_tabla_principal]['datos']
        datos_secundarios = self.tablas[nombre_tabla_sec]['datos'] if alias_sec else None

        # Hacer el join
        resultados = []
        for fila_principal in datos_principales:
            if alias_sec and datos_secundarios:
                for fila_sec in datos_secundarios:
                    val_izq = fila_principal.get(col_izq) if col_izq_alias == alias_principal else fila_sec.get(col_izq)
                    val_der = fila_sec.get(col_der) if col_der_alias == alias_sec else fila_principal.get(col_der)
                    if val_izq == val_der:
                        fila_combinada = {}
                        for col, val in fila_principal.items():
                            fila_combinada[f"{alias_principal}.{col}"] = val
                        for col, val in fila_sec.items():
                            fila_combinada[f"{alias_sec}.{col}"] = val
                        resultados.append(fila_combinada)
            else:
                fila_combinada = {}
                for col, val in fila_principal.items():
                    fila_combinada[f"{alias_principal}.{col}"] = val
                resultados.append(fila_combinada)

        # Filtrar con WHERE
        if ctx.whereCondition():
            where_ctx = ctx.whereCondition().expr()
            resultados_filtrados = []
            for fila in resultados:
                if self.evaluar_condicion(where_ctx, fila, alias_tabla):
                    resultados_filtrados.append(fila)
            resultados = resultados_filtrados

        # Mostrar resultados de la consulta
        if resultados:
            encabezados = []
            for alias, col in columnas_seleccion:
                if alias:
                    encabezados.append(f"{alias}.{col}")
                else:
                    encabezados.append(col)

            print(" | ".join(encabezados))
            print("-" * 60)

            for fila in resultados:
                fila_texto = []
                for alias, col in columnas_seleccion:
                    if alias:
                        clave = f"{alias}.{col}"
                    else:
                        clave = col
                    valor = fila.get(clave, "NULL")
                    fila_texto.append(str(valor))
                print(" | ".join(fila_texto))
        else:
            print("No se encontraron filas.")

        return None

    # Evaluar condicion del WHERE
    def evaluar_condicion(self, ctx, fila, alias_tabla):
        if ctx.COMPARACION():
            operador = ctx.COMPARACION().getText()
            izquierda = self.evaluar_expresion(ctx.expr(0), fila, alias_tabla)
            derecha = self.evaluar_expresion(ctx.expr(1), fila, alias_tabla)

            if operador == '=':
                return izquierda == derecha
            elif operador == '>':
                return izquierda > derecha
            elif operador == '<':
                return izquierda < derecha
            elif operador == '>=':
                return izquierda >= derecha
            elif operador == '<=':
                return izquierda <= derecha
            elif operador == '<>':
                return izquierda != derecha
            return False
        return True

    def evaluar_expresion(self, ctx, fila, alias_tabla):
        if ctx.value():
            return self.visit(ctx.value())
        if ctx.tableAlias():
            alias = ctx.tableAlias().getText()
            col = ctx.ID().getText()
            clave = f"{alias}.{col}"
            return fila.get(clave, "NULL")
        if ctx.ID():
            for clave, valor in fila.items():
                if clave.endswith(f".{ctx.ID().getText()}"):
                    return valor
            return "NULL"
        return None

    def visitValue(self, ctx):
        if ctx.NUM():
            return int(ctx.NUM().getText())
        if ctx.CADENA():
            return ctx.CADENA().getText()[1:-1]
        return None

    def visitDataType(self, ctx):
        if ctx.SERIAL():
            return "SERIAL"
        if ctx.INTEGER():
            return "INTEGER"
        if ctx.VARCHAR():
            tam = ctx.NUM().getText()
            return f"VARCHAR({tam})"
        if ctx.DATE():
            return "DATE"
        return "DESCONOCIDO"

if __name__ == '__main__':
    if len(sys.argv) > 1:
        nombre_archivo = sys.argv[1]
        input_stream = FileStream(nombre_archivo, encoding="utf-8")
    else:
        texto = input("Introduce el codigo SQL: ")
        input_stream = InputStream(texto)

    lexer = SQLLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = SQLParser(tokens)
    arbol = parser.root()

    visitante = MiVisitante()
    visitante.visit(arbol)