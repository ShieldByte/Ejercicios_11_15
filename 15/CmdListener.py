# Generated from Cmd.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .CmdParser import CmdParser
else:
    from CmdParser import CmdParser

# This class defines a complete listener for a parse tree produced by CmdParser.
class CmdListener(ParseTreeListener):

    # Enter a parse tree produced by CmdParser#root.
    def enterRoot(self, ctx:CmdParser.RootContext):
        pass

    # Exit a parse tree produced by CmdParser#root.
    def exitRoot(self, ctx:CmdParser.RootContext):
        pass


    # Enter a parse tree produced by CmdParser#lineaComando.
    def enterLineaComando(self, ctx:CmdParser.LineaComandoContext):
        pass

    # Exit a parse tree produced by CmdParser#lineaComando.
    def exitLineaComando(self, ctx:CmdParser.LineaComandoContext):
        pass


    # Enter a parse tree produced by CmdParser#comando.
    def enterComando(self, ctx:CmdParser.ComandoContext):
        pass

    # Exit a parse tree produced by CmdParser#comando.
    def exitComando(self, ctx:CmdParser.ComandoContext):
        pass


    # Enter a parse tree produced by CmdParser#opcion.
    def enterOpcion(self, ctx:CmdParser.OpcionContext):
        pass

    # Exit a parse tree produced by CmdParser#opcion.
    def exitOpcion(self, ctx:CmdParser.OpcionContext):
        pass


    # Enter a parse tree produced by CmdParser#argumento.
    def enterArgumento(self, ctx:CmdParser.ArgumentoContext):
        pass

    # Exit a parse tree produced by CmdParser#argumento.
    def exitArgumento(self, ctx:CmdParser.ArgumentoContext):
        pass



del CmdParser