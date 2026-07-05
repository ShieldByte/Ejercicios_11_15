import io
from contextlib import redirect_stdout

import streamlit as st
from antlr4 import InputStream, CommonTokenStream
from SQLLexer import SQLLexer
from SQLParser import SQLParser
from SQLVisitor import SQLVisitor


class Visitor(SQLVisitor):
    def __init__(self):
        self.tablas = {}
        self.estructuras = {}

    def visitRoot(self, ctx):
        for stmt in ctx.statement():
            self.visit(stmt)
        return None

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

    def visitInsertStmt(self, ctx):
        nombre = ctx.tableName().getText()
        if nombre not in self.estructuras:
            print(f"Error: La tabla '{nombre}' no existe.")
            return None

        cols_dest = [col.getText() for col in ctx.columnName()]
        if not cols_dest:
            cols_dest = self.estructuras[nombre]['columnas']

        insertados = 0
        for val_list in ctx.valueList():
            valores = [self.visit(v) for v in val_list.value()]

            fila = {}
            for i, col in enumerate(cols_dest):
                if i < len(valores):
                    fila[col] = valores[i]
                else:
                    fila[col] = None

            for col in self.estructuras[nombre]['columnas']:
                if col not in fila:
                    if self.estructuras[nombre]['tipos'].get(col) == "SERIAL":
                        datos = self.tablas[nombre]['datos']
                        if datos:
                            ultimo = max(f.get(col, 0) for f in datos if f.get(col) is not None)
                            fila[col] = ultimo + 1
                        else:
                            fila[col] = 1
                    else:
                        fila[col] = None

            self.tablas[nombre]['datos'].append(fila)
            insertados += 1

        print(f"Insertados {insertados} registros en '{nombre}'.")
        return None

    def visitSelectStmt(self, ctx):
        cols_sel = []
        alias_tabla = {}
        for select_col in ctx.selectColumns().selectColumn():
            if select_col.tableAlias():
                alias = select_col.tableAlias().getText()
                col = select_col.columnName().getText()
                cols_sel.append((alias, col))
            else:
                cols_sel.append((None, select_col.columnName().getText()))

        from_ctx = ctx.fromClause()
        t_principal = from_ctx.tableRef(0)
        n_principal = t_principal.tableName().getText()
        a_principal = t_principal.ID().getText() if t_principal.ID() else n_principal
        alias_tabla[a_principal] = n_principal

        if from_ctx.joinCondition():
            t_secundaria = from_ctx.tableRef(1)
            n_secundario = t_secundaria.tableName().getText()
            a_secundario = t_secundaria.ID().getText() if t_secundaria.ID() else n_secundario
            alias_tabla[a_secundario] = n_secundario

            join_ctx = from_ctx.joinCondition()
            alias_izq = join_ctx.tableAlias(0).getText()
            col_izq = join_ctx.ID(0).getText()
            alias_der = join_ctx.tableAlias(1).getText()
            col_der = join_ctx.ID(1).getText()
        else:
            a_secundario = None
            alias_izq = col_izq = alias_der = col_der = None
            n_secundario = None

        datos_pri = self.tablas[n_principal]['datos']
        datos_sec = self.tablas[n_secundario]['datos'] if a_secundario else None

        resultados = []
        for f_pri in datos_pri:
            if a_secundario and datos_sec:
                for f_sec in datos_sec:
                    val_izq = f_pri.get(col_izq) if alias_izq == a_principal else f_sec.get(col_izq)
                    val_der = f_sec.get(col_der) if alias_der == a_secundario else f_pri.get(col_der)
                    if val_izq == val_der:
                        comb = {}
                        for col, val in f_pri.items():
                            comb[f"{a_principal}.{col}"] = val
                        for col, val in f_sec.items():
                            comb[f"{a_secundario}.{col}"] = val
                        resultados.append(comb)
            else:
                comb = {}
                for col, val in f_pri.items():
                    comb[f"{a_principal}.{col}"] = val
                resultados.append(comb)

        if ctx.whereCondition():
            w_ctx = ctx.whereCondition().expr()
            filtrados = []
            for fila in resultados:
                if self.evaluar_cond(w_ctx, fila, alias_tabla):
                    filtrados.append(fila)
            resultados = filtrados

        if resultados:
            headers = []
            for alias, col in cols_sel:
                if alias:
                    headers.append(f"{alias}.{col}")
                else:
                    headers.append(col)

            print(" | ".join(headers))
            print("-" * 50)

            for fila in resultados:
                txt = []
                for alias, col in cols_sel:
                    if alias:
                        key = f"{alias}.{col}"
                    else:
                        key = col
                    txt.append(str(fila.get(key, "NULL")))
                print(" | ".join(txt))
        else:
            print("No se encontraron filas.")
        return None

    def evaluar_cond(self, ctx, fila, alias_tabla):
        if ctx.COMPARACION():
            op = ctx.COMPARACION().getText()
            izq = self.evaluar_expr(ctx.expr(0), fila, alias_tabla)
            der = self.evaluar_expr(ctx.expr(1), fila, alias_tabla)

            if op == '=':
                return izq == der
            elif op == '>':
                return izq > der
            elif op == '<':
                return izq < der
            elif op == '>=':
                return izq >= der
            elif op == '<=':
                return izq <= der
            elif op == '<>':
                return izq != der
        return True

    def evaluar_expr(self, ctx, fila, alias_tabla):
        if ctx.value():
            return self.visit(ctx.value())
        if ctx.tableAlias():
            alias = ctx.tableAlias().getText()
            col = ctx.ID().getText()
            return fila.get(f"{alias}.{col}", "NULL")
        if ctx.ID():
            nombre_col = ctx.ID().getText()
            for k, val in fila.items():
                if k.endswith(f".{nombre_col}"):
                    return val
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
            return f"VARCHAR({ctx.NUM().getText()})"
        if ctx.DATE():
            return "DATE"
        return "DESCONOCIDO"


def interpret_source(source: str) -> str:
    stream = InputStream(source)
    lexer = SQLLexer(stream)
    tokens = CommonTokenStream(lexer)
    parser = SQLParser(tokens)
    tree = parser.root()

    buffer = io.StringIO()
    with redirect_stdout(buffer):
        visitor = Visitor()
        visitor.visit(tree)

    return buffer.getvalue()


st.title("Intérprete SQL con Streamlit - Ejercicio 13")
st.markdown("Pega tu SQL en el cuadro de texto o sube un archivo .sql/.txt para ejecutar.")

example_code = (
    "CREATE TABLE equipos (\n"
    "    id_equipo SERIAL PRIMARY KEY,\n"
    "    nombre_equipo VARCHAR(100) NOT NULL,\n"
    "    ip VARCHAR(45) NOT NULL\n"
    ");\n\n"
    "CREATE TABLE alertas_seguridad (\n"
    "    id_alerta SERIAL PRIMARY KEY,\n"
    "    id_equipo INTEGER NOT NULL,\n"
    "    tipo_alerta VARCHAR(100) NOT NULL,\n"
    "    severidad VARCHAR(20) NOT NULL,\n"
    "    fecha_alerta DATE NOT NULL\n"
    ");\n\n"
    "INSERT INTO equipos (nombre_equipo, ip) VALUES\n"
    "('Servidor Web', '192.168.1.10'),\n"
    "('Base de Datos', '192.168.1.20');\n\n"
    "INSERT INTO alertas_seguridad (id_equipo, tipo_alerta, severidad, fecha_alerta) VALUES\n"
    "(1, 'Intento de acceso no autorizado', 'Alta', '2026-06-20'),\n"
    "(2, 'Escaneo de puertos', 'Media', '2026-06-21');\n\n"
    "SELECT\n"
    "    e.nombre_equipo,\n"
    "    e.ip,\n"
    "    a.tipo_alerta,\n"
    "    a.severidad,\n"
    "    a.fecha_alerta\n"
    "FROM alertas_seguridad a INNER JOIN equipos e ON a.id_equipo = e.id_equipo\n"
    "WHERE a.severidad = 'Alta';"
)

uploaded_file = st.file_uploader("Sube un archivo .sql o .txt", type=["sql", "txt"])
if uploaded_file is not None:
    try:
        source = uploaded_file.getvalue().decode("utf-8")
    except UnicodeDecodeError:
        source = uploaded_file.getvalue().decode("latin-1")
else:
    source = example_code

source = st.text_area("Código SQL", value=source, height=320)
if st.button("Ejecutar"):
    try:
        salida = interpret_source(source)
        if salida:
            st.code(salida)
        else:
            st.success("El SQL se ejecutó correctamente, pero no hay salida para mostrar.")
    except Exception as e:
        st.error(f"Error al interpretar el SQL: {e}")
