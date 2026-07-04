import sys
from antlr4 import *
from CmdLexer import CmdLexer
from CmdParser import CmdParser
from CmdVisitor import CmdVisitor

# Numero de control: 21031117

class MiVisitante(CmdVisitor):
    def __init__(self):
        self.numero_linea = 1

    def visitRoot(self, ctx):
        for linea in ctx.lineaComando():
            self.visit(linea)
        return None

    def visitLineaComando(self, ctx):
        print(f"\nLinea #{self.numero_linea}")
        self.numero_linea += 1
        print("-" * 50)

        # Verificar si tiene sudo
        if ctx.SUDO():
            print("  Ejecutado con: sudo")

        # Comando principal
        comando_texto = self.visit(ctx.comando())
        print(f"  Comando: {comando_texto}")

        # Recorrer opciones y argumentos en orden
        for hijo in ctx.getChildren():
            if isinstance(hijo, CmdParser.OpcionContext):
                self.visit(hijo)
            elif isinstance(hijo, CmdParser.ArgumentoContext):
                self.visit(hijo)
        return None

    def visitComando(self, ctx):
        return ctx.getText()

    def visitOpcion(self, ctx):
        texto = ctx.getText()
        print(f"    Opcion: {texto}")
        return None

    def visitArgumento(self, ctx):
        texto = ctx.getText()
        # Quitar comillas si es cadena
        if ctx.CADENA():
            texto = ctx.CADENA().getText()[1:-1]
        tipo = self._determinar_tipo(ctx)
        print(f"    Arg [{tipo}]: {texto}")
        return None

    def _determinar_tipo(self, ctx):
        if ctx.IP():
            return "IP"
        if ctx.CIDR():
            return "CIDR"
        if ctx.RUTA():
            return "RUTA"
        if ctx.DOMINIO():
            return "DOMINIO"
        if ctx.CADENA():
            return "CADENA"
        if ctx.PALABRA_CLAVE():
            return "CLAVE"
        if ctx.TEXTO():
            return "TEXTO"
        return "DESCONOCIDO"


if __name__ == '__main__':
    if len(sys.argv) > 1:
        nombre_archivo = sys.argv[1]
        input_stream = FileStream(nombre_archivo, encoding="utf-8")
    else:
        texto = input("Introduce los comandos (separados por salto de linea): ")
        input_stream = InputStream(texto)

    lexer = CmdLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = CmdParser(tokens)
    arbol = parser.root()
    visitante = MiVisitante()
    visitante.visit(arbol)