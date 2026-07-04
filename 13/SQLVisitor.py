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


    # Visit a parse tree produced by SQLParser#statement.
    def visitStatement(self, ctx:SQLParser.StatementContext):
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


    # Visit a parse tree produced by SQLParser#valueList.
    def visitValueList(self, ctx:SQLParser.ValueListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#value.
    def visitValue(self, ctx:SQLParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#selectStmt.
    def visitSelectStmt(self, ctx:SQLParser.SelectStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#selectColumns.
    def visitSelectColumns(self, ctx:SQLParser.SelectColumnsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#selectColumn.
    def visitSelectColumn(self, ctx:SQLParser.SelectColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#fromClause.
    def visitFromClause(self, ctx:SQLParser.FromClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#tableRef.
    def visitTableRef(self, ctx:SQLParser.TableRefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#joinCondition.
    def visitJoinCondition(self, ctx:SQLParser.JoinConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#whereCondition.
    def visitWhereCondition(self, ctx:SQLParser.WhereConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#expr.
    def visitExpr(self, ctx:SQLParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLParser#tableAlias.
    def visitTableAlias(self, ctx:SQLParser.TableAliasContext):
        return self.visitChildren(ctx)



del SQLParser