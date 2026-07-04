import sys
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprVisitor import ExprVisitor

# Número de control: 21031117 

class MiVisitante(ExprVisitor):
    def __init__(self):
        self.variables = {}  # Diccionario para guardar variables (numero1, numero2, resultado)

    # Visitamos la raíz, solo seguimos a la clase
    def visitRoot(self, ctx):
        return self.visit(ctx.classDef())

    # Visitamos la clase, solo seguimos al método
    def visitClassDef(self, ctx):
        return self.visit(ctx.methodDef())

    # Visitamos el método main, ejecutamos todas las instrucciones
    def visitMethodDef(self, ctx):
        for stmt in ctx.statement():
            self.visit(stmt)
        return None

    # Declaración: int numero1 = 15;
    def visitDeclaration(self, ctx):
        nombre = ctx.ID().getText()
        valor = self.visit(ctx.expr())
        self.variables[nombre] = valor
        return None

    # Asignación: resultado = numero1 + numero2;
    def visitAssignment(self, ctx):
        nombre = ctx.ID().getText()
        valor = self.visit(ctx.expr())
        self.variables[nombre] = valor
        return None

    # Print: System.out.println(...)
    def visitPrintStmt(self, ctx):
        self.visit(ctx.printArg())
        return None

    # Argumento del print: "El resultado es: " + resultado
    def visitPrintArg(self, ctx):
        if ctx.CADENA():  # Tiene comillas dobles (usamos CADENA en lugar de STRING_LIT)
            texto = ctx.CADENA().getText()[1:-1]  # Quitamos las comillas
            if ctx.expr():  # Si tiene + algo (ej: + resultado)
                valor = self.visit(ctx.expr())
                print(f"{texto}{valor}")
            else:
                print(texto)
        else:  # Solo una expresión (ej: print(5))
            valor = self.visit(ctx.expr())
            print(valor)
        return None

    # Expresiones: numero1 + numero2
    def visitExpr(self, ctx):
        if ctx.NUM():
            return int(ctx.NUM().getText())
        if ctx.ID():
            nombre = ctx.ID().getText()
            if nombre in self.variables:
                return self.variables[nombre]
            return 0
        # Ahora usamos SUMA y RESTA (en español)
        if ctx.SUMA():
            return self.visit(ctx.expr(0)) + self.visit(ctx.expr(1))
        if ctx.RESTA():
            return self.visit(ctx.expr(0)) - self.visit(ctx.expr(1))
        return 0


# -------------------- EJECUCIÓN PRINCIPAL --------------------
if __name__ == '__main__':
    if len(sys.argv) > 1:
        # Entrada por archivo (ej: python test.py prueba.txt)
        nombre_archivo = sys.argv[1]
        input_stream = FileStream(nombre_archivo, encoding="utf-8")
    else:
        # Entrada por terminal (ej: python test.py)
        texto = input("Introduce el: ")
        input_stream = InputStream(texto)

    # Análisis léxico
    lexer = ExprLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    
    # Análisis sintáctico
    parser = ExprParser(tokens)
    arbol = parser.root()  # Construye el árbol

    # Visitante (POO) para ejecutar el programa
    visitante = MiVisitante()
    visitante.visit(arbol)