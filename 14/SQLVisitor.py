# Generated from SQL.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .SQLParser import SQLParser
else:
    from SQLParser import SQLParser

# This class defines a complete generic visitor for a parse tree produced by SQLParser.

class SQLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SQLParser#root.
    def visitRoot(self, ctx:SQLParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#sqlStmt.
    def visitSqlStmt(self, ctx:SQLParser.SqlStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#createTableStmt.
    def visitCreateTableStmt(self, ctx:SQLParser.CreateTableStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#tableName.
    def visitTableName(self, ctx:SQLParser.TableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#columnDef.
    def visitColumnDef(self, ctx:SQLParser.ColumnDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#columnName.
    def visitColumnName(self, ctx:SQLParser.ColumnNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#dataType.
    def visitDataType(self, ctx:SQLParser.DataTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#columnConstraint.
    def visitColumnConstraint(self, ctx:SQLParser.ColumnConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#insertStmt.
    def visitInsertStmt(self, ctx:SQLParser.InsertStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#updateStmt.
    def visitUpdateStmt(self, ctx:SQLParser.UpdateStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#setClause.
    def visitSetClause(self, ctx:SQLParser.SetClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#selectStmt.
    def visitSelectStmt(self, ctx:SQLParser.SelectStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#selectList.
    def visitSelectList(self, ctx:SQLParser.SelectListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#tableRef.
    def visitTableRef(self, ctx:SQLParser.TableRefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#expr.
    def visitExpr(self, ctx:SQLParser.ExprContext):
        return self.visitChildren(ctx)



del SQLParser