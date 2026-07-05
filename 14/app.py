import io
from contextlib import redirect_stdout

import streamlit as st
from antlr4 import FileStream, InputStream, CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener
from SQLLexer import SQLLexer
from SQLParser import SQLParser


class Errores(ErrorListener):
    def __init__(self):
        self.hay_error = False
        self.mensaje = ""

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.hay_error = True
        self.mensaje = f"Error en linea {line}, columna {column}: {msg}"


def parse_sql(source: str) -> str:
    input_stream = InputStream(source)
    lexer = SQLLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = SQLParser(tokens)

    error_listener = Errores()
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)

    tree = parser.root()

    buffer = io.StringIO()
    with redirect_stdout(buffer):
        print("\n--- Arbol Sintactico ---")
        print(tree.toStringTree(recog=parser))
        print("------------------------\n")

        if error_listener.hay_error:
            print(error_listener.mensaje)
            print("SQL Incorrecto")
        else:
            print("SQL Correcto")

    return buffer.getvalue()


st.title("Validador SQL con Streamlit - Ejercicio 14")
st.markdown("Pega el SQL en el cuadro de texto o sube un archivo .sql/.txt para validar la sintaxis.")

example_code = "UPDATE incidentes_seguridad SET estado = 'MITIGADO', severidad = 'MEDIA' WHERE id_incidente = 3;"

uploaded_file = st.file_uploader("Sube un archivo .sql o .txt", type=["sql", "txt"])
if uploaded_file is not None:
    try:
        source = uploaded_file.getvalue().decode("utf-8")
    except UnicodeDecodeError:
        source = uploaded_file.getvalue().decode("latin-1")
else:
    source = example_code

source = st.text_area("Código SQL", value=source, height=200)
if st.button("Validar"):
    try:
        salida = parse_sql(source)
        st.code(salida)
    except Exception as e:
        st.error(f"Error al parsear el SQL: {e}")
