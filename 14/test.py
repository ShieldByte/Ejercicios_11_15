import sys
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from SQLLexer import SQLLexer
from SQLParser import SQLParser

# Número de control: 21031117

class Errores(ErrorListener):
    def __init__(self):
        self.hay_error = False
        self.mensaje = ""
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.hay_error = True
        self.mensaje = f"Error en linea {line}, columna {column}: {msg}"

if __name__ == '__main__':
    if len(sys.argv) > 1:
        archivo = sys.argv[1]
        input_stream = FileStream(archivo, encoding="utf-8")
        print(f"Leyendo archivo: {archivo}")
    else:
        texto = input("Ingresa SQL: ")
        input_stream = InputStream(texto)

    lexer = SQLLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = SQLParser(tokens)
    
    error_listener = Errores()
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)

    arbol = parser.root()

    print("\n--- Arbol Sintactico ---")
    print(arbol.toStringTree(recog=parser))
    print("------------------------\n")

    if error_listener.hay_error:
        print(error_listener.mensaje)
        print("SQL Incorrecto")
    else:
        print("SQL Correcto")