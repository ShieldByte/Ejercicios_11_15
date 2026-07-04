import sys
from antlr4 import *
from SQLLexer import SQLLexer
from SQLParser import SQLParser
from SQLVisitor import SQLVisitor

# Número de control: 21031117  (cambia por el tuyo)

class MiVisitante(SQLVisitor):
    def __init__(self):
        self.tablas = {}  # nombre_tabla -> lista de diccionarios (filas)
        self.resultados = []  # para SELECT

    # Visitamos la raíz
    def visitRoot(self, ctx):
        for stmt in ctx.sqlStmt():
            self.visit(stmt)
        return None

    # --- CREATE TABLE ---
    def visitCreateTableStmt(self, ctx):
        nombre = ctx.tableName().getText()
        if nombre not in self.tablas:
            # Guardamos el esquema (nombres de columnas) para usarlo en INSERT
            columnas = [col.columnName().getText() for col in ctx.columnDef()]
            # Inicializamos la tabla con lista vacía
            self.tablas[nombre] = {
                'columnas': columnas,
                'filas': []
            }
            print(f"[OK] Tabla '{nombre}' creada")
        else:
            print(f"[WARNING] Tabla '{nombre}' ya existe")
        return None

    # --- INSERT ---
    def visitInsertStmt(self, ctx):
        nombre = ctx.tableName().getText()
        if nombre not in self.tablas:
            print(f"[ERROR] Tabla '{nombre}' no existe")
            return None

        # Columnas especificadas
        columnas_insert = [col.getText() for col in ctx.columnName()]
        # Valores de la fila
        valores_expr = ctx.expr()
        # Evaluamos cada expresión
        fila = {}
        for i, col in enumerate(columnas_insert):
            valor = self.visit(valores_expr[i])
            fila[col] = valor
        # Agregar fila
        self.tablas[nombre]['filas'].append(fila)
        print(f"[OK] Insertados 1 registro en '{nombre}'")
        return None

    # --- UPDATE ---
    def visitUpdateStmt(self, ctx):
        nombre = ctx.tableName().getText()
        if nombre not in self.tablas:
            print(f"[ERROR] Tabla '{nombre}' no existe")
            return None

        # Obtener las asignaciones SET
        sets = {}
        for set_clause in ctx.setClause():
            col = set_clause.columnName().getText()
            valor = self.visit(set_clause.expr())
            sets[col] = valor

        # Obtener condición WHERE (si existe)
        cond = ctx.expr() if ctx.expr() else None

        # Recorrer filas y actualizar las que cumplan
        filas = self.tablas[nombre]['filas']
        contador = 0
        for fila in filas:
            if cond is None or self._evaluate_condition(cond, fila):
                # Aplicar SET
                for col, val in sets.items():
                    fila[col] = val
                contador += 1

        print(f"[OK] Actualizados {contador} registros en '{nombre}'")
        return None

    # --- SELECT ---
    def visitSelectStmt(self, ctx):
        # Obtener lista de columnas a seleccionar
        select_list = ctx.selectList()
        if select_list.getChildCount() == 1 and select_list.getText() == '*':
            columnas_seleccion = None  # significa todas
        else:
            columnas_seleccion = [col.getText() for col in select_list.columnName()]

        # Obtener tabla principal y alias
        table_ref = ctx.tableRef()
        tabla_principal = table_ref.ID(0).getText()
        alias_principal = table_ref.ID(1).getText() if table_ref.ID(1) else None

        # JOIN (opcional)
        join = ctx.JOIN()
        if join:
            join_table_ref = ctx.tableRef(1)  # segundo tableRef
            tabla_join = join_table_ref.ID(0).getText()
            alias_join = join_table_ref.ID(1).getText() if join_table_ref.ID(1) else None
            cond_join = ctx.expr(1)  # expresión del ON
        else:
            tabla_join = None
            alias_join = None
            cond_join = None

        # WHERE (opcional)
        where_expr = ctx.expr(0) if ctx.expr(0) and not ctx.JOIN() else ctx.expr(1) if ctx.JOIN() else None

        # Obtener datos de las tablas
        if tabla_principal not in self.tablas:
            print(f"[ERROR] Tabla '{tabla_principal}' no existe")
            return None
        filas_principales = self.tablas[tabla_principal]['filas']

        if tabla_join and tabla_join not in self.tablas:
            print(f"[ERROR] Tabla '{tabla_join}' no existe")
            return None
        filas_join = self.tablas[tabla_join]['filas'] if tabla_join else []

        # Realizar JOIN (producto cartesiano con condición)
        resultados = []
        if tabla_join:
            for fila_p in filas_principales:
                for fila_j in filas_join:
                    # Combinar filas
                    fila_combinada = {}
                    # Agregar columnas de la principal con alias o sin
                    if alias_principal:
                        for col, val in fila_p.items():
                            fila_combinada[f"{alias_principal}.{col}"] = val
                    else:
                        fila_combinada.update(fila_p)
                    # Agregar columnas de la join
                    if alias_join:
                        for col, val in fila_j.items():
                            fila_combinada[f"{alias_join}.{col}"] = val
                    else:
                        # Si no hay alias, podría haber conflicto de nombres, pero simplificamos
                        for col, val in fila_j.items():
                            fila_combinada[col] = val
                    # Evaluar condición ON
                    if cond_join is None or self._evaluate_condition(cond_join, fila_combinada):
                        resultados.append(fila_combinada)
        else:
            # Sin JOIN
            for fila in filas_principales:
                if alias_principal:
                    fila_con_alias = {}
                    for col, val in fila.items():
                        fila_con_alias[f"{alias_principal}.{col}"] = val
                    resultados.append(fila_con_alias)
                else:
                    resultados.append(fila.copy())

        # Filtrar por WHERE
        if where_expr:
            resultados = [f for f in resultados if self._evaluate_condition(where_expr, f)]

        # Seleccionar columnas
        if columnas_seleccion is not None:
            resultados_filtrados = []
            for fila in resultados:
                nueva_fila = {}
                for col in columnas_seleccion:
                    # Buscar en la fila por clave exacta o con alias
                    # Primero intentamos literal
                    if col in fila:
                        nueva_fila[col] = fila[col]
                    else:
                        # Buscar con alias (si existe)
                        for key, val in fila.items():
                            if key.endswith('.' + col):
                                nueva_fila[col] = val
                                break
                resultados_filtrados.append(nueva_fila)
            resultados = resultados_filtrados

        # Mostrar resultados
        if resultados:
            # Obtener nombres de columnas
            columnas_nombres = list(resultados[0].keys()) if resultados else []
            print("Resultados SELECT:")
            print(" | ".join(columnas_nombres))
            print("-" * (len(" | ".join(columnas_nombres)) + 10))
            for fila in resultados:
                fila_str = [str(fila.get(col, '')) for col in columnas_nombres]
                print(" | ".join(fila_str))
        else:
            print("(No se encontraron filas)")

        self.resultados = resultados
        return None

    # --- Función auxiliar para evaluar condición ---
    def _evaluate_condition(self, ctx, fila):
        if ctx.getChildCount() == 3:
            left = ctx.getChild(0)
            op = ctx.getChild(1).getText()
            right = ctx.getChild(2)
            # Evaluar izquierda y derecha
            left_val = self._eval_expr(left, fila)
            right_val = self._eval_expr(right, fila)
            if op == '=':
                return left_val == right_val
            elif op == '>':
                return left_val > right_val
            elif op == '<':
                return left_val < right_val
            elif op == '>=':
                return left_val >= right_val
            elif op == '<=':
                return left_val <= right_val
            elif op == '<>':
                return left_val != right_val
        return True  # si no hay condición, siempre verdadero

    def _eval_expr(self, node, fila):
        # node puede ser ID, NUM, STRING, o una expresión compuesta
        if isinstance(node, TerminalNode):
            text = node.getText()
            if node.symbol.type == SQLLexer.NUM:
                return int(text)
            elif node.symbol.type == SQLLexer.STRING:
                return text[1:-1]  # quitar comillas
            elif node.symbol.type == SQLLexer.ID:
                # Buscar en fila con o sin alias
                if text in fila:
                    return fila[text]
                else:
                    # intentar buscar sin alias (si hay alias, quizás el nombre es "alias.col")
                    for key, val in fila.items():
                        if key.endswith('.' + text):
                            return val
                    return None
        else:
            # Si es un nodo interno, asumimos que es otra expresión (para casos anidados)
            # Pero en nuestra gramática expr solo es simple por ahora.
            pass
        return None

    # --- visitExpr (para los valores de SET e INSERT) ---
    def visitExpr(self, ctx):
        # Si es un nodo con un solo hijo (terminal)
        if ctx.getChildCount() == 1:
            child = ctx.getChild(0)
            if child.symbol.type == SQLLexer.NUM:
                return int(child.getText())
            elif child.symbol.type == SQLLexer.STRING:
                return child.getText()[1:-1]
            elif child.symbol.type == SQLLexer.ID:
                return child.getText()  # para usar en SET o WHERE, pero aquí lo dejamos
            else:
                return child.getText()
        else:
            # No manejamos operaciones complejas en SET por ahora
            return None


# -------------------- EJECUCIÓN PRINCIPAL --------------------
if __name__ == '__main__':
    if len(sys.argv) > 1:
        nombre_archivo = sys.argv[1]
        input_stream = FileStream(nombre_archivo, encoding="utf-8")
    else:
        texto = input("Introduce el código SQL: ")
        input_stream = InputStream(texto)

    lexer = SQLLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = SQLParser(tokens)
    arbol = parser.root()

    visitante = MiVisitante()
    visitante.visit(arbol)