import sys
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprVisitor import ExprVisitor

# Numero de control: 21031117

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

if __name__ == '__main__':
    if len(sys.argv) > 1:
        archivo = sys.argv[1]
        stream = FileStream(archivo, encoding="utf-8")
    else:
        texto = input("Java code: ")
        stream = InputStream(texto)

    lexer = ExprLexer(stream)
    tokens = CommonTokenStream(lexer)
    parser = ExprParser(tokens)
    arbol = parser.root()

    v = Visitor()
    v.visit(arbol)
