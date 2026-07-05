# Generated from SQL.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .SQLParser import SQLParser
else:
    from SQLParser import SQLParser

# This class defines a complete listener for a parse tree produced by SQLParser.
class SQLListener(ParseTreeListener):

    # Enter a parse tree produced by SQLParser#root.
    def enterRoot(self, ctx:SQLParser.RootContext):
        pass

    # Exit a parse tree produced by SQLParser#root.
    def exitRoot(self, ctx:SQLParser.RootContext):
        pass


    # Enter a parse tree produced by SQLParser#sqlStmt.
    def enterSqlStmt(self, ctx:SQLParser.SqlStmtContext):
        pass

    # Exit a parse tree produced by SQLParser#sqlStmt.
    def exitSqlStmt(self, ctx:SQLParser.SqlStmtContext):
        pass


    # Enter a parse tree produced by SQLParser#createTableStmt.
    def enterCreateTableStmt(self, ctx:SQLParser.CreateTableStmtContext):
        pass

    # Exit a parse tree produced by SQLParser#createTableStmt.
    def exitCreateTableStmt(self, ctx:SQLParser.CreateTableStmtContext):
        pass


    # Enter a parse tree produced by SQLParser#tableName.
    def enterTableName(self, ctx:SQLParser.TableNameContext):
        pass

    # Exit a parse tree produced by SQLParser#tableName.
    def exitTableName(self, ctx:SQLParser.TableNameContext):
        pass


    # Enter a parse tree produced by SQLParser#columnDef.
    def enterColumnDef(self, ctx:SQLParser.ColumnDefContext):
        pass

    # Exit a parse tree produced by SQLParser#columnDef.
    def exitColumnDef(self, ctx:SQLParser.ColumnDefContext):
        pass


    # Enter a parse tree produced by SQLParser#columnName.
    def enterColumnName(self, ctx:SQLParser.ColumnNameContext):
        pass

    # Exit a parse tree produced by SQLParser#columnName.
    def exitColumnName(self, ctx:SQLParser.ColumnNameContext):
        pass


    # Enter a parse tree produced by SQLParser#dataType.
    def enterDataType(self, ctx:SQLParser.DataTypeContext):
        pass

    # Exit a parse tree produced by SQLParser#dataType.
    def exitDataType(self, ctx:SQLParser.DataTypeContext):
        pass


    # Enter a parse tree produced by SQLParser#columnConstraint.
    def enterColumnConstraint(self, ctx:SQLParser.ColumnConstraintContext):
        pass

    # Exit a parse tree produced by SQLParser#columnConstraint.
    def exitColumnConstraint(self, ctx:SQLParser.ColumnConstraintContext):
        pass


    # Enter a parse tree produced by SQLParser#insertStmt.
    def enterInsertStmt(self, ctx:SQLParser.InsertStmtContext):
        pass

    # Exit a parse tree produced by SQLParser#insertStmt.
    def exitInsertStmt(self, ctx:SQLParser.InsertStmtContext):
        pass


    # Enter a parse tree produced by SQLParser#updateStmt.
    def enterUpdateStmt(self, ctx:SQLParser.UpdateStmtContext):
        pass

    # Exit a parse tree produced by SQLParser#updateStmt.
    def exitUpdateStmt(self, ctx:SQLParser.UpdateStmtContext):
        pass


    # Enter a parse tree produced by SQLParser#setClause.
    def enterSetClause(self, ctx:SQLParser.SetClauseContext):
        pass

    # Exit a parse tree produced by SQLParser#setClause.
    def exitSetClause(self, ctx:SQLParser.SetClauseContext):
        pass


    # Enter a parse tree produced by SQLParser#selectStmt.
    def enterSelectStmt(self, ctx:SQLParser.SelectStmtContext):
        pass

    # Exit a parse tree produced by SQLParser#selectStmt.
    def exitSelectStmt(self, ctx:SQLParser.SelectStmtContext):
        pass


    # Enter a parse tree produced by SQLParser#joinClause.
    def enterJoinClause(self, ctx:SQLParser.JoinClauseContext):
        pass

    # Exit a parse tree produced by SQLParser#joinClause.
    def exitJoinClause(self, ctx:SQLParser.JoinClauseContext):
        pass


    # Enter a parse tree produced by SQLParser#selectList.
    def enterSelectList(self, ctx:SQLParser.SelectListContext):
        pass

    # Exit a parse tree produced by SQLParser#selectList.
    def exitSelectList(self, ctx:SQLParser.SelectListContext):
        pass


    # Enter a parse tree produced by SQLParser#selectItem.
    def enterSelectItem(self, ctx:SQLParser.SelectItemContext):
        pass

    # Exit a parse tree produced by SQLParser#selectItem.
    def exitSelectItem(self, ctx:SQLParser.SelectItemContext):
        pass


    # Enter a parse tree produced by SQLParser#tableRef.
    def enterTableRef(self, ctx:SQLParser.TableRefContext):
        pass

    # Exit a parse tree produced by SQLParser#tableRef.
    def exitTableRef(self, ctx:SQLParser.TableRefContext):
        pass


    # Enter a parse tree produced by SQLParser#expr.
    def enterExpr(self, ctx:SQLParser.ExprContext):
        pass

    # Exit a parse tree produced by SQLParser#expr.
    def exitExpr(self, ctx:SQLParser.ExprContext):
        pass



del SQLParser