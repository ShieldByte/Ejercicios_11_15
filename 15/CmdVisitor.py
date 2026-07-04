# Generated from Cmd.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .CmdParser import CmdParser
else:
    from CmdParser import CmdParser

# This class defines a complete generic visitor for a parse tree produced by CmdParser.

class CmdVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CmdParser#root.
    def visitRoot(self, ctx:CmdParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CmdParser#lineaComando.
    def visitLineaComando(self, ctx:CmdParser.LineaComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CmdParser#comando.
    def visitComando(self, ctx:CmdParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CmdParser#opcion.
    def visitOpcion(self, ctx:CmdParser.OpcionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CmdParser#argumento.
    def visitArgumento(self, ctx:CmdParser.ArgumentoContext):
        return self.visitChildren(ctx)



del CmdParser