import sys
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from SQLLexer import SQLLexer
from SQLParser import SQLParser

# Número de control: 21031117  (¡CAMBIA POR EL TUYO!)

# -------------------- LISTENER PARA CAPTURAR ERRORES --------------------
class MiErrorListener(ErrorListener):
    def __init__(self):
        self.hay_error = False
        self.mensaje = ""
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.hay_error = True
        self.mensaje = f"[ERROR] Sintaxis incorrecta en linea {line}, columna {column}: {msg}"

# -------------------- EJECUCIÓN PRINCIPAL --------------------
if __name__ == '__main__':
    # 1. Leer entrada (archivo o consola)
    if len(sys.argv) > 1:
        nombre_archivo = sys.argv[1]
        input_stream = FileStream(nombre_archivo, encoding="utf-8")
        print(f"[INFO] Leyendo desde archivo: {nombre_archivo}\n")
    else:
        texto = input("Introduce el codigo SQL: ")
        input_stream = InputStream(texto)

    # 2. Análisis léxico
    lexer = SQLLexer(input_stream)
    tokens = CommonTokenStream(lexer)

    # 3. Análisis sintáctico con listener de errores
    parser = SQLParser(tokens)
    error_listener = MiErrorListener()
    parser.removeErrorListeners()          # Quita el que imprime en consola por defecto
    parser.addErrorListener(error_listener)

    # 4. Intentamos parsear
    arbol = parser.root()

    # 5. MOSTRAR EL ÁRBOL SINTÁCTICO (la evidencia)
    print("\n" + "="*70)
    print("ARBOL SINTACTICO GENERADO:")
    print("="*70)
    print(arbol.toStringTree(recog=parser))
    print("="*70 + "\n")

    # 6. Verificar si hubo error
    if error_listener.hay_error:
        print(error_listener.mensaje)
        print("[RESULTADO] La sentencia SQL es INCORRECTA (la gramatica la rechazo).")
    else:
        print("[OK] La sentencia SQL es CORRECTA (la gramatica la acepto).")
        print("[OK] La gramatica esta bien definida y reconoce la estructura.")