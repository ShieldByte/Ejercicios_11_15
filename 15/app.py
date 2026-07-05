import io
from contextlib import redirect_stdout

import streamlit as st
from antlr4 import InputStream, CommonTokenStream
from CmdLexer import CmdLexer
from CmdParser import CmdParser
from CmdVisitor import CmdVisitor


class Visitador(CmdVisitor):
    def __init__(self):
        self.num_linea = 1

    def visitRoot(self, ctx):
        for linea in ctx.lineaComando():
            self.visit(linea)
        return None

    def visitLineaComando(self, ctx):
        print(f"\nComando #{self.num_linea}")
        self.num_linea += 1

        if ctx.SUDO():
            print("  Sudo: si")

        cmd = self.visit(ctx.comando())
        print(f"  Base: {cmd}")

        for child in ctx.getChildren():
            if isinstance(child, CmdParser.OpcionContext):
                self.visit(child)
            elif isinstance(child, CmdParser.ArgumentoContext):
                self.visit(child)
        return None

    def visitComando(self, ctx):
        return ctx.getText()

    def visitOpcion(self, ctx):
        print(f"  Opcion: {ctx.getText()}")
        return None

    def visitArgumento(self, ctx):
        valor = ctx.getText()
        if ctx.CADENA():
            valor = ctx.CADENA().getText()[1:-1]

        tipo = "TEXTO"
        if ctx.IP():
            tipo = "IP"
        elif ctx.CIDR():
            tipo = "CIDR"
        elif ctx.RUTA():
            tipo = "RUTA"
        elif ctx.DOMINIO():
            tipo = "DOMINIO"
        elif ctx.CADENA():
            tipo = "CADENA"
        elif ctx.PALABRA_CLAVE():
            tipo = "CLAVE"

        print(f"  Arg ({tipo}): {valor}")
        return None


def interpret_source(source: str) -> str:
    stream = InputStream(source)
    lexer = CmdLexer(stream)
    tokens = CommonTokenStream(lexer)
    parser = CmdParser(tokens)
    tree = parser.root()

    buffer = io.StringIO()
    with redirect_stdout(buffer):
        visitor = Visitador()
        visitor.visit(tree)

    return buffer.getvalue()


st.title("Intérprete CMD con Streamlit - Ejercicio 15")
st.markdown("Pega comandos en el cuadro de texto o sube un archivo .cmd/.txt para analizar.")

example_code = (
    "nmap 192.168.1.10\n"
    "nmap -sV 192.168.1.10\n"
    "nmap -sn 192.168.1.0/24\n"
    "ss -tuln\n"
    "sudo tcpdump -i eth0 -c 20\n"
    "curl -I ejemplo.com\n"
    "dig MX ejemplo.com\n"
    "journalctl --since today\n"
    "grep \"Failed password\" /var/log/auth.log\n"
    "sudo ufw deny from 192.168.1.50"
)

uploaded_file = st.file_uploader("Sube un archivo .cmd o .txt", type=["cmd", "txt"])
if uploaded_file is not None:
    try:
        source = uploaded_file.getvalue().decode("utf-8")
    except UnicodeDecodeError:
        source = uploaded_file.getvalue().decode("latin-1")
else:
    source = example_code

source = st.text_area("Comandos", value=source, height=320)
if st.button("Analizar"):
    try:
        salida = interpret_source(source)
        st.code(salida)
    except Exception as e:
        st.error(f"Error al interpretar los comandos: {e}")
