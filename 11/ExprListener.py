# Generated from Expr.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#root.
    def enterRoot(self, ctx:ExprParser.RootContext):
        pass

    # Exit a parse tree produced by ExprParser#root.
    def exitRoot(self, ctx:ExprParser.RootContext):
        pass


    # Enter a parse tree produced by ExprParser#classDef.
    def enterClassDef(self, ctx:ExprParser.ClassDefContext):
        pass

    # Exit a parse tree produced by ExprParser#classDef.
    def exitClassDef(self, ctx:ExprParser.ClassDefContext):
        pass


    # Enter a parse tree produced by ExprParser#methodDef.
    def enterMethodDef(self, ctx:ExprParser.MethodDefContext):
        pass

    # Exit a parse tree produced by ExprParser#methodDef.
    def exitMethodDef(self, ctx:ExprParser.MethodDefContext):
        pass


    # Enter a parse tree produced by ExprParser#statement.
    def enterStatement(self, ctx:ExprParser.StatementContext):
        pass

    # Exit a parse tree produced by ExprParser#statement.
    def exitStatement(self, ctx:ExprParser.StatementContext):
        pass


    # Enter a parse tree produced by ExprParser#declaration.
    def enterDeclaration(self, ctx:ExprParser.DeclarationContext):
        pass

    # Exit a parse tree produced by ExprParser#declaration.
    def exitDeclaration(self, ctx:ExprParser.DeclarationContext):
        pass


    # Enter a parse tree produced by ExprParser#assignment.
    def enterAssignment(self, ctx:ExprParser.AssignmentContext):
        pass

    # Exit a parse tree produced by ExprParser#assignment.
    def exitAssignment(self, ctx:ExprParser.AssignmentContext):
        pass


    # Enter a parse tree produced by ExprParser#printStmt.
    def enterPrintStmt(self, ctx:ExprParser.PrintStmtContext):
        pass

    # Exit a parse tree produced by ExprParser#printStmt.
    def exitPrintStmt(self, ctx:ExprParser.PrintStmtContext):
        pass


    # Enter a parse tree produced by ExprParser#printArg.
    def enterPrintArg(self, ctx:ExprParser.PrintArgContext):
        pass

    # Exit a parse tree produced by ExprParser#printArg.
    def exitPrintArg(self, ctx:ExprParser.PrintArgContext):
        pass


    # Enter a parse tree produced by ExprParser#expr.
    def enterExpr(self, ctx:ExprParser.ExprContext):
        pass

    # Exit a parse tree produced by ExprParser#expr.
    def exitExpr(self, ctx:ExprParser.ExprContext):
        pass



del ExprParser