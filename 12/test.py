import sys
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprVisitor import ExprVisitor

# Número de control: 21031117  (cambia por el tuyo)

class MiVisitante(ExprVisitor):
    def __init__(self):
        self.variables = {}  # Diccionario para guardar variables

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

    # Declaración: int edad = 18;  o  String adulto = "No";
    def visitDeclaration(self, ctx):
        nombre = ctx.ID().getText()
        valor = self.visit(ctx.expr())
        self.variables[nombre] = valor
        return None

    # Asignación: adulto = "Si";
    def visitAssignment(self, ctx):
        nombre = ctx.ID().getText()
        valor = self.visit(ctx.expr())
        self.variables[nombre] = valor
        return None

    # IF: if (edad >= 18) { adulto = "Si"; }
    def visitIfStmt(self, ctx):
        condicion = self.visit(ctx.expr())  # Evaluamos la condición (ej: True o False)
        if condicion:
            for stmt in ctx.statement():    # Ejecutamos todas las instrucciones dentro del bloque
                self.visit(stmt)
        return None

    # Print: System.out.println(...)
    def visitPrintStmt(self, ctx):
        self.visit(ctx.printArg())
        return None

    # Argumento del print: "¿Es adulto?: " + adulto
    def visitPrintArg(self, ctx):
        if ctx.CADENA():  # Tiene comillas dobles al inicio
            texto = ctx.CADENA().getText()[1:-1]  # Quitamos las comillas
            if ctx.expr():  # Si tiene + algo (ej: + adulto)
                valor = self.visit(ctx.expr())
                print(f"{texto}{valor}")
            else:
                print(texto)
        else:  # Solo una expresión (ej: print(edad) o print(adulto))
            valor = self.visit(ctx.expr())
            print(valor)
        return None

    # Expresiones: numero1 + numero2, edad >= 18, "Hola"
    def visitExpr(self, ctx):
        # Si es un número
        if ctx.NUM():
            return int(ctx.NUM().getText())
        
        # Si es un texto (CADENA)
        if ctx.CADENA():
            return ctx.CADENA().getText()[1:-1]  # Quitamos las comillas
        
        # Si es una variable
        if ctx.ID():
            nombre = ctx.ID().getText()
            if nombre in self.variables:
                return self.variables[nombre]
            return 0  # Si no existe, devolvemos 0
        
        # Suma
        if ctx.SUMA():
            return self.visit(ctx.expr(0)) + self.visit(ctx.expr(1))
        
        # Resta
        if ctx.RESTA():
            return self.visit(ctx.expr(0)) - self.visit(ctx.expr(1))
        
        # Comparación MAYOR_IGUAL (>=)
        if ctx.MAYOR_IGUAL():
            return self.visit(ctx.expr(0)) >= self.visit(ctx.expr(1))
        
        return 0


# -------------------- EJECUCIÓN PRINCIPAL --------------------
if __name__ == '__main__':
    if len(sys.argv) > 1:
        # Entrada por archivo (ej: python test.py prueba.txt)
        nombre_archivo = sys.argv[1]
        input_stream = FileStream(nombre_archivo, encoding="utf-8")
    else:
        # Entrada por terminal (ej: python test.py)
        texto = input("Introduce el código Java: ")
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