import io
from contextlib import redirect_stdout

import streamlit as st
from antlr4 import InputStream, CommonTokenStream
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprVisitor import ExprVisitor


class Visitor(ExprVisitor):
    def __init__(self):
        self.variables = {}

    def visitRoot(self, ctx):
        return self.visit(ctx.classDef())

    def visitClassDef(self, ctx):
        return self.visit(ctx.methodDef())

    def visitMethodDef(self, ctx):
        for stmt in ctx.statement():
            self.visit(stmt)
        return None

    def visitDeclaration(self, ctx):
        nombre = ctx.ID().getText()
        valor = self.visit(ctx.expr())
        self.variables[nombre] = valor
        return None

    def visitAssignment(self, ctx):
        nombre = ctx.ID().getText()
        valor = self.visit(ctx.expr())
        self.variables[nombre] = valor
        return None

    def visitIfStmt(self, ctx):
        condicion = self.visit(ctx.expr())
        if condicion:
            for stmt in ctx.statement():
                self.visit(stmt)
        return None

    def visitPrintStmt(self, ctx):
        self.visit(ctx.printArg())
        return None

    def visitPrintArg(self, ctx):
        if ctx.CADENA():
            texto = ctx.CADENA().getText()[1:-1]
            if ctx.expr():
                valor = self.visit(ctx.expr())
                print(f"{texto}{valor}")
            else:
                print(texto)
        else:
            valor = self.visit(ctx.expr())
            print(valor)
        return None

    def visitExpr(self, ctx):
        if ctx.NUM():
            return int(ctx.NUM().getText())

        if ctx.CADENA():
            return ctx.CADENA().getText()[1:-1]

        if ctx.ID():
            nombre = ctx.ID().getText()
            if nombre in self.variables:
                return self.variables[nombre]
            return 0

        if ctx.SUMA():
            return self.visit(ctx.expr(0)) + self.visit(ctx.expr(1))

        if ctx.RESTA():
            return self.visit(ctx.expr(0)) - self.visit(ctx.expr(1))

        if ctx.MAYOR_IGUAL():
            return self.visit(ctx.expr(0)) >= self.visit(ctx.expr(1))

        return 0


def interpret_source(source: str) -> str:
    stream = InputStream(source)
    lexer = ExprLexer(stream)
    tokens = CommonTokenStream(lexer)
    parser = ExprParser(tokens)
    tree = parser.root()

    buffer = io.StringIO()
    with redirect_stdout(buffer):
        visitor = Visitor()
        visitor.visit(tree)

    return buffer.getvalue()


st.title("Intérprete Expr con Streamlit - Ejercicio 12")
st.markdown("Pega tu código en el cuadro de texto o sube un archivo .java para ejecutar.")

example_code = (
    'public class Main {\n'
    '    public static void main(String[] args) {\n'
    '        int x = 5;\n'
    '        if (x >= 5) {\n'
    '            System.out.println("Mayor o igual a 5");\n'
    '        }\n'
    '    }\n'
    '}'
)

uploaded_file = st.file_uploader("Sube un archivo .java", type=["java", "txt"])
if uploaded_file is not None:
    try:
        source = uploaded_file.getvalue().decode("utf-8")
    except UnicodeDecodeError:
        source = uploaded_file.getvalue().decode("latin-1")
else:
    source = example_code

source = st.text_area("Código Expr", value=source, height=300)
if st.button("Ejecutar"):
    try:
        salida = interpret_source(source)
        if salida:
            st.code(salida)
        else:
            st.success("El código se ejecutó correctamente, pero no hay salida para mostrar.")
    except Exception as e:
        st.error(f"Error al interpretar el código: {e}")
