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


    # Enter a parse tree produced by SQLParser#statement.
    def enterStatement(self, ctx:SQLParser.StatementContext):
        pass

    # Exit a parse tree produced by SQLParser#statement.
    def exitStatement(self, ctx:SQLParser.StatementContext):
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


    # Enter a parse tree produced by SQLParser#valueList.
    def enterValueList(self, ctx:SQLParser.ValueListContext):
        pass

    # Exit a parse tree produced by SQLParser#valueList.
    def exitValueList(self, ctx:SQLParser.ValueListContext):
        pass


    # Enter a parse tree produced by SQLParser#value.
    def enterValue(self, ctx:SQLParser.ValueContext):
        pass

    # Exit a parse tree produced by SQLParser#value.
    def exitValue(self, ctx:SQLParser.ValueContext):
        pass


    # Enter a parse tree produced by SQLParser#selectStmt.
    def enterSelectStmt(self, ctx:SQLParser.SelectStmtContext):
        pass

    # Exit a parse tree produced by SQLParser#selectStmt.
    def exitSelectStmt(self, ctx:SQLParser.SelectStmtContext):
        pass


    # Enter a parse tree produced by SQLParser#selectColumns.
    def enterSelectColumns(self, ctx:SQLParser.SelectColumnsContext):
        pass

    # Exit a parse tree produced by SQLParser#selectColumns.
    def exitSelectColumns(self, ctx:SQLParser.SelectColumnsContext):
        pass


    # Enter a parse tree produced by SQLParser#selectColumn.
    def enterSelectColumn(self, ctx:SQLParser.SelectColumnContext):
        pass

    # Exit a parse tree produced by SQLParser#selectColumn.
    def exitSelectColumn(self, ctx:SQLParser.SelectColumnContext):
        pass


    # Enter a parse tree produced by SQLParser#fromClause.
    def enterFromClause(self, ctx:SQLParser.FromClauseContext):
        pass

    # Exit a parse tree produced by SQLParser#fromClause.
    def exitFromClause(self, ctx:SQLParser.FromClauseContext):
        pass


    # Enter a parse tree produced by SQLParser#tableRef.
    def enterTableRef(self, ctx:SQLParser.TableRefContext):
        pass

    # Exit a parse tree produced by SQLParser#tableRef.
    def exitTableRef(self, ctx:SQLParser.TableRefContext):
        pass


    # Enter a parse tree produced by SQLParser#joinCondition.
    def enterJoinCondition(self, ctx:SQLParser.JoinConditionContext):
        pass

    # Exit a parse tree produced by SQLParser#joinCondition.
    def exitJoinCondition(self, ctx:SQLParser.JoinConditionContext):
        pass


    # Enter a parse tree produced by SQLParser#whereCondition.
    def enterWhereCondition(self, ctx:SQLParser.WhereConditionContext):
        pass

    # Exit a parse tree produced by SQLParser#whereCondition.
    def exitWhereCondition(self, ctx:SQLParser.WhereConditionContext):
        pass


    # Enter a parse tree produced by SQLParser#expr.
    def enterExpr(self, ctx:SQLParser.ExprContext):
        pass

    # Exit a parse tree produced by SQLParser#expr.
    def exitExpr(self, ctx:SQLParser.ExprContext):
        pass


    # Enter a parse tree produced by SQLParser#tableAlias.
    def enterTableAlias(self, ctx:SQLParser.TableAliasContext):
        pass

    # Exit a parse tree produced by SQLParser#tableAlias.
    def exitTableAlias(self, ctx:SQLParser.TableAliasContext):
        pass



del SQLParser