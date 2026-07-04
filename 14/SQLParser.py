# Generated from SQL.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,39,192,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,1,0,1,0,3,0,33,8,0,5,0,35,8,0,10,0,12,0,38,9,0,1,0,1,0,
        1,1,1,1,1,1,1,1,3,1,46,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,5,2,55,8,
        2,10,2,12,2,58,9,2,1,2,1,2,1,3,1,3,1,4,1,4,1,4,5,4,67,8,4,10,4,12,
        4,70,9,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,3,6,81,8,6,1,7,1,7,
        1,7,1,7,3,7,87,8,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,5,8,96,8,8,10,8,12,
        8,99,9,8,1,8,1,8,1,8,1,8,1,8,1,8,5,8,107,8,8,10,8,12,8,110,9,8,1,
        8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,5,9,120,8,9,10,9,12,9,123,9,9,1,9,
        1,9,3,9,127,8,9,1,10,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,
        1,11,1,11,1,11,3,11,142,8,11,1,11,1,11,3,11,146,8,11,1,12,1,12,1,
        12,1,12,5,12,152,8,12,10,12,12,12,155,9,12,3,12,157,8,12,1,13,1,
        13,3,13,161,8,13,1,14,1,14,1,14,1,14,3,14,167,8,14,1,14,1,14,1,14,
        1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,
        1,14,1,14,5,14,187,8,14,10,14,12,14,190,9,14,1,14,0,1,28,15,0,2,
        4,6,8,10,12,14,16,18,20,22,24,26,28,0,0,204,0,36,1,0,0,0,2,45,1,
        0,0,0,4,47,1,0,0,0,6,61,1,0,0,0,8,63,1,0,0,0,10,71,1,0,0,0,12,80,
        1,0,0,0,14,86,1,0,0,0,16,88,1,0,0,0,18,113,1,0,0,0,20,128,1,0,0,
        0,22,132,1,0,0,0,24,156,1,0,0,0,26,158,1,0,0,0,28,166,1,0,0,0,30,
        32,3,2,1,0,31,33,5,28,0,0,32,31,1,0,0,0,32,33,1,0,0,0,33,35,1,0,
        0,0,34,30,1,0,0,0,35,38,1,0,0,0,36,34,1,0,0,0,36,37,1,0,0,0,37,39,
        1,0,0,0,38,36,1,0,0,0,39,40,5,0,0,1,40,1,1,0,0,0,41,46,3,4,2,0,42,
        46,3,16,8,0,43,46,3,18,9,0,44,46,3,22,11,0,45,41,1,0,0,0,45,42,1,
        0,0,0,45,43,1,0,0,0,45,44,1,0,0,0,46,3,1,0,0,0,47,48,5,2,0,0,48,
        49,5,3,0,0,49,50,3,6,3,0,50,51,5,25,0,0,51,56,3,8,4,0,52,53,5,27,
        0,0,53,55,3,8,4,0,54,52,1,0,0,0,55,58,1,0,0,0,56,54,1,0,0,0,56,57,
        1,0,0,0,57,59,1,0,0,0,58,56,1,0,0,0,59,60,5,26,0,0,60,5,1,0,0,0,
        61,62,5,36,0,0,62,7,1,0,0,0,63,64,3,10,5,0,64,68,3,12,6,0,65,67,
        3,14,7,0,66,65,1,0,0,0,67,70,1,0,0,0,68,66,1,0,0,0,68,69,1,0,0,0,
        69,9,1,0,0,0,70,68,1,0,0,0,71,72,5,36,0,0,72,11,1,0,0,0,73,81,5,
        4,0,0,74,81,5,8,0,0,75,76,5,7,0,0,76,77,5,25,0,0,77,78,5,37,0,0,
        78,81,5,26,0,0,79,81,5,11,0,0,80,73,1,0,0,0,80,74,1,0,0,0,80,75,
        1,0,0,0,80,79,1,0,0,0,81,13,1,0,0,0,82,83,5,5,0,0,83,87,5,6,0,0,
        84,85,5,9,0,0,85,87,5,10,0,0,86,82,1,0,0,0,86,84,1,0,0,0,87,15,1,
        0,0,0,88,89,5,12,0,0,89,90,5,13,0,0,90,91,3,6,3,0,91,92,5,25,0,0,
        92,97,3,10,5,0,93,94,5,27,0,0,94,96,3,10,5,0,95,93,1,0,0,0,96,99,
        1,0,0,0,97,95,1,0,0,0,97,98,1,0,0,0,98,100,1,0,0,0,99,97,1,0,0,0,
        100,101,5,26,0,0,101,102,5,14,0,0,102,103,5,25,0,0,103,108,3,28,
        14,0,104,105,5,27,0,0,105,107,3,28,14,0,106,104,1,0,0,0,107,110,
        1,0,0,0,108,106,1,0,0,0,108,109,1,0,0,0,109,111,1,0,0,0,110,108,
        1,0,0,0,111,112,5,26,0,0,112,17,1,0,0,0,113,114,5,15,0,0,114,115,
        3,6,3,0,115,116,5,16,0,0,116,121,3,20,10,0,117,118,5,27,0,0,118,
        120,3,20,10,0,119,117,1,0,0,0,120,123,1,0,0,0,121,119,1,0,0,0,121,
        122,1,0,0,0,122,126,1,0,0,0,123,121,1,0,0,0,124,125,5,17,0,0,125,
        127,3,28,14,0,126,124,1,0,0,0,126,127,1,0,0,0,127,19,1,0,0,0,128,
        129,3,10,5,0,129,130,5,30,0,0,130,131,3,28,14,0,131,21,1,0,0,0,132,
        133,5,18,0,0,133,134,3,24,12,0,134,135,5,19,0,0,135,141,3,26,13,
        0,136,137,5,20,0,0,137,138,3,26,13,0,138,139,5,21,0,0,139,140,3,
        28,14,0,140,142,1,0,0,0,141,136,1,0,0,0,141,142,1,0,0,0,142,145,
        1,0,0,0,143,144,5,17,0,0,144,146,3,28,14,0,145,143,1,0,0,0,145,146,
        1,0,0,0,146,23,1,0,0,0,147,157,5,1,0,0,148,153,3,10,5,0,149,150,
        5,27,0,0,150,152,3,10,5,0,151,149,1,0,0,0,152,155,1,0,0,0,153,151,
        1,0,0,0,153,154,1,0,0,0,154,157,1,0,0,0,155,153,1,0,0,0,156,147,
        1,0,0,0,156,148,1,0,0,0,157,25,1,0,0,0,158,160,5,36,0,0,159,161,
        5,36,0,0,160,159,1,0,0,0,160,161,1,0,0,0,161,27,1,0,0,0,162,163,
        6,14,-1,0,163,167,5,38,0,0,164,167,5,37,0,0,165,167,5,36,0,0,166,
        162,1,0,0,0,166,164,1,0,0,0,166,165,1,0,0,0,167,188,1,0,0,0,168,
        169,10,9,0,0,169,170,5,30,0,0,170,187,3,28,14,10,171,172,10,8,0,
        0,172,173,5,31,0,0,173,187,3,28,14,9,174,175,10,7,0,0,175,176,5,
        32,0,0,176,187,3,28,14,8,177,178,10,6,0,0,178,179,5,33,0,0,179,187,
        3,28,14,7,180,181,10,5,0,0,181,182,5,34,0,0,182,187,3,28,14,6,183,
        184,10,4,0,0,184,185,5,35,0,0,185,187,3,28,14,5,186,168,1,0,0,0,
        186,171,1,0,0,0,186,174,1,0,0,0,186,177,1,0,0,0,186,180,1,0,0,0,
        186,183,1,0,0,0,187,190,1,0,0,0,188,186,1,0,0,0,188,189,1,0,0,0,
        189,29,1,0,0,0,190,188,1,0,0,0,19,32,36,45,56,68,80,86,97,108,121,
        126,141,145,153,156,160,166,186,188
    ]

class SQLParser ( Parser ):

    grammarFileName = "SQL.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'CREATE'", "'TABLE'", "'SERIAL'", 
                     "'PRIMARY'", "'KEY'", "'VARCHAR'", "'INTEGER'", "'NOT'", 
                     "'NULL'", "'DATE'", "'INSERT'", "'INTO'", "'VALUES'", 
                     "'UPDATE'", "'SET'", "'WHERE'", "'SELECT'", "'FROM'", 
                     "'JOIN'", "'ON'", "'INNER'", "'LEFT'", "'RIGHT'", "'('", 
                     "')'", "','", "';'", "'.'", "'='", "'>'", "'<'", "'>='", 
                     "'<='", "'<>'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "CREATE", "TABLE", "SERIAL", 
                      "PRIMARY", "KEY", "VARCHAR", "INTEGER", "NOT", "NULL", 
                      "DATE", "INSERT", "INTO", "VALUES", "UPDATE", "SET", 
                      "WHERE", "SELECT", "FROM", "JOIN", "ON", "INNER", 
                      "LEFT", "RIGHT", "LPAREN", "RPAREN", "COMMA", "SEMI", 
                      "DOT", "EQ", "GT", "LT", "GE", "LE", "NE", "ID", "NUM", 
                      "STRING", "WS" ]

    RULE_root = 0
    RULE_sqlStmt = 1
    RULE_createTableStmt = 2
    RULE_tableName = 3
    RULE_columnDef = 4
    RULE_columnName = 5
    RULE_dataType = 6
    RULE_columnConstraint = 7
    RULE_insertStmt = 8
    RULE_updateStmt = 9
    RULE_setClause = 10
    RULE_selectStmt = 11
    RULE_selectList = 12
    RULE_tableRef = 13
    RULE_expr = 14

    ruleNames =  [ "root", "sqlStmt", "createTableStmt", "tableName", "columnDef", 
                   "columnName", "dataType", "columnConstraint", "insertStmt", 
                   "updateStmt", "setClause", "selectStmt", "selectList", 
                   "tableRef", "expr" ]

    EOF = Token.EOF
    T__0=1
    CREATE=2
    TABLE=3
    SERIAL=4
    PRIMARY=5
    KEY=6
    VARCHAR=7
    INTEGER=8
    NOT=9
    NULL=10
    DATE=11
    INSERT=12
    INTO=13
    VALUES=14
    UPDATE=15
    SET=16
    WHERE=17
    SELECT=18
    FROM=19
    JOIN=20
    ON=21
    INNER=22
    LEFT=23
    RIGHT=24
    LPAREN=25
    RPAREN=26
    COMMA=27
    SEMI=28
    DOT=29
    EQ=30
    GT=31
    LT=32
    GE=33
    LE=34
    NE=35
    ID=36
    NUM=37
    STRING=38
    WS=39

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(SQLParser.EOF, 0)

        def sqlStmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.SqlStmtContext)
            else:
                return self.getTypedRuleContext(SQLParser.SqlStmtContext,i)


        def SEMI(self, i:int=None):
            if i is None:
                return self.getTokens(SQLParser.SEMI)
            else:
                return self.getToken(SQLParser.SEMI, i)

        def getRuleIndex(self):
            return SQLParser.RULE_root

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRoot" ):
                listener.enterRoot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRoot" ):
                listener.exitRoot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRoot" ):
                return visitor.visitRoot(self)
            else:
                return visitor.visitChildren(self)




    def root(self):

        localctx = SQLParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 299012) != 0):
                self.state = 30
                self.sqlStmt()
                self.state = 32
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==28:
                    self.state = 31
                    self.match(SQLParser.SEMI)


                self.state = 38
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 39
            self.match(SQLParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SqlStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def createTableStmt(self):
            return self.getTypedRuleContext(SQLParser.CreateTableStmtContext,0)


        def insertStmt(self):
            return self.getTypedRuleContext(SQLParser.InsertStmtContext,0)


        def updateStmt(self):
            return self.getTypedRuleContext(SQLParser.UpdateStmtContext,0)


        def selectStmt(self):
            return self.getTypedRuleContext(SQLParser.SelectStmtContext,0)


        def getRuleIndex(self):
            return SQLParser.RULE_sqlStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSqlStmt" ):
                listener.enterSqlStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSqlStmt" ):
                listener.exitSqlStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSqlStmt" ):
                return visitor.visitSqlStmt(self)
            else:
                return visitor.visitChildren(self)




    def sqlStmt(self):

        localctx = SQLParser.SqlStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_sqlStmt)
        try:
            self.state = 45
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 41
                self.createTableStmt()
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 2)
                self.state = 42
                self.insertStmt()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 3)
                self.state = 43
                self.updateStmt()
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 4)
                self.state = 44
                self.selectStmt()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CreateTableStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CREATE(self):
            return self.getToken(SQLParser.CREATE, 0)

        def TABLE(self):
            return self.getToken(SQLParser.TABLE, 0)

        def tableName(self):
            return self.getTypedRuleContext(SQLParser.TableNameContext,0)


        def LPAREN(self):
            return self.getToken(SQLParser.LPAREN, 0)

        def columnDef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.ColumnDefContext)
            else:
                return self.getTypedRuleContext(SQLParser.ColumnDefContext,i)


        def RPAREN(self):
            return self.getToken(SQLParser.RPAREN, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SQLParser.COMMA)
            else:
                return self.getToken(SQLParser.COMMA, i)

        def getRuleIndex(self):
            return SQLParser.RULE_createTableStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCreateTableStmt" ):
                listener.enterCreateTableStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCreateTableStmt" ):
                listener.exitCreateTableStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateTableStmt" ):
                return visitor.visitCreateTableStmt(self)
            else:
                return visitor.visitChildren(self)




    def createTableStmt(self):

        localctx = SQLParser.CreateTableStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_createTableStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(SQLParser.CREATE)
            self.state = 48
            self.match(SQLParser.TABLE)
            self.state = 49
            self.tableName()
            self.state = 50
            self.match(SQLParser.LPAREN)
            self.state = 51
            self.columnDef()
            self.state = 56
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==27:
                self.state = 52
                self.match(SQLParser.COMMA)
                self.state = 53
                self.columnDef()
                self.state = 58
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 59
            self.match(SQLParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TableNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(SQLParser.ID, 0)

        def getRuleIndex(self):
            return SQLParser.RULE_tableName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTableName" ):
                listener.enterTableName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTableName" ):
                listener.exitTableName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTableName" ):
                return visitor.visitTableName(self)
            else:
                return visitor.visitChildren(self)




    def tableName(self):

        localctx = SQLParser.TableNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_tableName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.match(SQLParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColumnDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def columnName(self):
            return self.getTypedRuleContext(SQLParser.ColumnNameContext,0)


        def dataType(self):
            return self.getTypedRuleContext(SQLParser.DataTypeContext,0)


        def columnConstraint(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.ColumnConstraintContext)
            else:
                return self.getTypedRuleContext(SQLParser.ColumnConstraintContext,i)


        def getRuleIndex(self):
            return SQLParser.RULE_columnDef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterColumnDef" ):
                listener.enterColumnDef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitColumnDef" ):
                listener.exitColumnDef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitColumnDef" ):
                return visitor.visitColumnDef(self)
            else:
                return visitor.visitChildren(self)




    def columnDef(self):

        localctx = SQLParser.ColumnDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_columnDef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.columnName()
            self.state = 64
            self.dataType()
            self.state = 68
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==5 or _la==9:
                self.state = 65
                self.columnConstraint()
                self.state = 70
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColumnNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(SQLParser.ID, 0)

        def getRuleIndex(self):
            return SQLParser.RULE_columnName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterColumnName" ):
                listener.enterColumnName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitColumnName" ):
                listener.exitColumnName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitColumnName" ):
                return visitor.visitColumnName(self)
            else:
                return visitor.visitChildren(self)




    def columnName(self):

        localctx = SQLParser.ColumnNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_columnName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(SQLParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DataTypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SERIAL(self):
            return self.getToken(SQLParser.SERIAL, 0)

        def INTEGER(self):
            return self.getToken(SQLParser.INTEGER, 0)

        def VARCHAR(self):
            return self.getToken(SQLParser.VARCHAR, 0)

        def LPAREN(self):
            return self.getToken(SQLParser.LPAREN, 0)

        def NUM(self):
            return self.getToken(SQLParser.NUM, 0)

        def RPAREN(self):
            return self.getToken(SQLParser.RPAREN, 0)

        def DATE(self):
            return self.getToken(SQLParser.DATE, 0)

        def getRuleIndex(self):
            return SQLParser.RULE_dataType

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDataType" ):
                listener.enterDataType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDataType" ):
                listener.exitDataType(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDataType" ):
                return visitor.visitDataType(self)
            else:
                return visitor.visitChildren(self)




    def dataType(self):

        localctx = SQLParser.DataTypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_dataType)
        try:
            self.state = 80
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [4]:
                self.enterOuterAlt(localctx, 1)
                self.state = 73
                self.match(SQLParser.SERIAL)
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 2)
                self.state = 74
                self.match(SQLParser.INTEGER)
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 3)
                self.state = 75
                self.match(SQLParser.VARCHAR)
                self.state = 76
                self.match(SQLParser.LPAREN)
                self.state = 77
                self.match(SQLParser.NUM)
                self.state = 78
                self.match(SQLParser.RPAREN)
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 4)
                self.state = 79
                self.match(SQLParser.DATE)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColumnConstraintContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRIMARY(self):
            return self.getToken(SQLParser.PRIMARY, 0)

        def KEY(self):
            return self.getToken(SQLParser.KEY, 0)

        def NOT(self):
            return self.getToken(SQLParser.NOT, 0)

        def NULL(self):
            return self.getToken(SQLParser.NULL, 0)

        def getRuleIndex(self):
            return SQLParser.RULE_columnConstraint

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterColumnConstraint" ):
                listener.enterColumnConstraint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitColumnConstraint" ):
                listener.exitColumnConstraint(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitColumnConstraint" ):
                return visitor.visitColumnConstraint(self)
            else:
                return visitor.visitChildren(self)




    def columnConstraint(self):

        localctx = SQLParser.ColumnConstraintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_columnConstraint)
        try:
            self.state = 86
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5]:
                self.enterOuterAlt(localctx, 1)
                self.state = 82
                self.match(SQLParser.PRIMARY)
                self.state = 83
                self.match(SQLParser.KEY)
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 84
                self.match(SQLParser.NOT)
                self.state = 85
                self.match(SQLParser.NULL)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InsertStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INSERT(self):
            return self.getToken(SQLParser.INSERT, 0)

        def INTO(self):
            return self.getToken(SQLParser.INTO, 0)

        def tableName(self):
            return self.getTypedRuleContext(SQLParser.TableNameContext,0)


        def LPAREN(self, i:int=None):
            if i is None:
                return self.getTokens(SQLParser.LPAREN)
            else:
                return self.getToken(SQLParser.LPAREN, i)

        def columnName(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.ColumnNameContext)
            else:
                return self.getTypedRuleContext(SQLParser.ColumnNameContext,i)


        def RPAREN(self, i:int=None):
            if i is None:
                return self.getTokens(SQLParser.RPAREN)
            else:
                return self.getToken(SQLParser.RPAREN, i)

        def VALUES(self):
            return self.getToken(SQLParser.VALUES, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.ExprContext)
            else:
                return self.getTypedRuleContext(SQLParser.ExprContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SQLParser.COMMA)
            else:
                return self.getToken(SQLParser.COMMA, i)

        def getRuleIndex(self):
            return SQLParser.RULE_insertStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInsertStmt" ):
                listener.enterInsertStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInsertStmt" ):
                listener.exitInsertStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInsertStmt" ):
                return visitor.visitInsertStmt(self)
            else:
                return visitor.visitChildren(self)




    def insertStmt(self):

        localctx = SQLParser.InsertStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_insertStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 88
            self.match(SQLParser.INSERT)
            self.state = 89
            self.match(SQLParser.INTO)
            self.state = 90
            self.tableName()
            self.state = 91
            self.match(SQLParser.LPAREN)
            self.state = 92
            self.columnName()
            self.state = 97
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==27:
                self.state = 93
                self.match(SQLParser.COMMA)
                self.state = 94
                self.columnName()
                self.state = 99
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 100
            self.match(SQLParser.RPAREN)
            self.state = 101
            self.match(SQLParser.VALUES)
            self.state = 102
            self.match(SQLParser.LPAREN)
            self.state = 103
            self.expr(0)
            self.state = 108
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==27:
                self.state = 104
                self.match(SQLParser.COMMA)
                self.state = 105
                self.expr(0)
                self.state = 110
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 111
            self.match(SQLParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UpdateStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def UPDATE(self):
            return self.getToken(SQLParser.UPDATE, 0)

        def tableName(self):
            return self.getTypedRuleContext(SQLParser.TableNameContext,0)


        def SET(self):
            return self.getToken(SQLParser.SET, 0)

        def setClause(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.SetClauseContext)
            else:
                return self.getTypedRuleContext(SQLParser.SetClauseContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SQLParser.COMMA)
            else:
                return self.getToken(SQLParser.COMMA, i)

        def WHERE(self):
            return self.getToken(SQLParser.WHERE, 0)

        def expr(self):
            return self.getTypedRuleContext(SQLParser.ExprContext,0)


        def getRuleIndex(self):
            return SQLParser.RULE_updateStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUpdateStmt" ):
                listener.enterUpdateStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUpdateStmt" ):
                listener.exitUpdateStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUpdateStmt" ):
                return visitor.visitUpdateStmt(self)
            else:
                return visitor.visitChildren(self)




    def updateStmt(self):

        localctx = SQLParser.UpdateStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_updateStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.match(SQLParser.UPDATE)
            self.state = 114
            self.tableName()
            self.state = 115
            self.match(SQLParser.SET)
            self.state = 116
            self.setClause()
            self.state = 121
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==27:
                self.state = 117
                self.match(SQLParser.COMMA)
                self.state = 118
                self.setClause()
                self.state = 123
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 126
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==17:
                self.state = 124
                self.match(SQLParser.WHERE)
                self.state = 125
                self.expr(0)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SetClauseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def columnName(self):
            return self.getTypedRuleContext(SQLParser.ColumnNameContext,0)


        def EQ(self):
            return self.getToken(SQLParser.EQ, 0)

        def expr(self):
            return self.getTypedRuleContext(SQLParser.ExprContext,0)


        def getRuleIndex(self):
            return SQLParser.RULE_setClause

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSetClause" ):
                listener.enterSetClause(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSetClause" ):
                listener.exitSetClause(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSetClause" ):
                return visitor.visitSetClause(self)
            else:
                return visitor.visitChildren(self)




    def setClause(self):

        localctx = SQLParser.SetClauseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_setClause)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 128
            self.columnName()
            self.state = 129
            self.match(SQLParser.EQ)
            self.state = 130
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelectStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SELECT(self):
            return self.getToken(SQLParser.SELECT, 0)

        def selectList(self):
            return self.getTypedRuleContext(SQLParser.SelectListContext,0)


        def FROM(self):
            return self.getToken(SQLParser.FROM, 0)

        def tableRef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.TableRefContext)
            else:
                return self.getTypedRuleContext(SQLParser.TableRefContext,i)


        def JOIN(self):
            return self.getToken(SQLParser.JOIN, 0)

        def ON(self):
            return self.getToken(SQLParser.ON, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.ExprContext)
            else:
                return self.getTypedRuleContext(SQLParser.ExprContext,i)


        def WHERE(self):
            return self.getToken(SQLParser.WHERE, 0)

        def getRuleIndex(self):
            return SQLParser.RULE_selectStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelectStmt" ):
                listener.enterSelectStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelectStmt" ):
                listener.exitSelectStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelectStmt" ):
                return visitor.visitSelectStmt(self)
            else:
                return visitor.visitChildren(self)




    def selectStmt(self):

        localctx = SQLParser.SelectStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_selectStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 132
            self.match(SQLParser.SELECT)
            self.state = 133
            self.selectList()
            self.state = 134
            self.match(SQLParser.FROM)
            self.state = 135
            self.tableRef()
            self.state = 141
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==20:
                self.state = 136
                self.match(SQLParser.JOIN)
                self.state = 137
                self.tableRef()
                self.state = 138
                self.match(SQLParser.ON)
                self.state = 139
                self.expr(0)


            self.state = 145
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==17:
                self.state = 143
                self.match(SQLParser.WHERE)
                self.state = 144
                self.expr(0)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelectListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def columnName(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.ColumnNameContext)
            else:
                return self.getTypedRuleContext(SQLParser.ColumnNameContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SQLParser.COMMA)
            else:
                return self.getToken(SQLParser.COMMA, i)

        def getRuleIndex(self):
            return SQLParser.RULE_selectList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelectList" ):
                listener.enterSelectList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelectList" ):
                listener.exitSelectList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelectList" ):
                return visitor.visitSelectList(self)
            else:
                return visitor.visitChildren(self)




    def selectList(self):

        localctx = SQLParser.SelectListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_selectList)
        self._la = 0 # Token type
        try:
            self.state = 156
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 147
                self.match(SQLParser.T__0)
                pass
            elif token in [36]:
                self.enterOuterAlt(localctx, 2)
                self.state = 148
                self.columnName()
                self.state = 153
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==27:
                    self.state = 149
                    self.match(SQLParser.COMMA)
                    self.state = 150
                    self.columnName()
                    self.state = 155
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TableRefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(SQLParser.ID)
            else:
                return self.getToken(SQLParser.ID, i)

        def getRuleIndex(self):
            return SQLParser.RULE_tableRef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTableRef" ):
                listener.enterTableRef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTableRef" ):
                listener.exitTableRef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTableRef" ):
                return visitor.visitTableRef(self)
            else:
                return visitor.visitChildren(self)




    def tableRef(self):

        localctx = SQLParser.TableRefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_tableRef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 158
            self.match(SQLParser.ID)
            self.state = 160
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==36:
                self.state = 159
                self.match(SQLParser.ID)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(SQLParser.STRING, 0)

        def NUM(self):
            return self.getToken(SQLParser.NUM, 0)

        def ID(self):
            return self.getToken(SQLParser.ID, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLParser.ExprContext)
            else:
                return self.getTypedRuleContext(SQLParser.ExprContext,i)


        def EQ(self):
            return self.getToken(SQLParser.EQ, 0)

        def GT(self):
            return self.getToken(SQLParser.GT, 0)

        def LT(self):
            return self.getToken(SQLParser.LT, 0)

        def GE(self):
            return self.getToken(SQLParser.GE, 0)

        def LE(self):
            return self.getToken(SQLParser.LE, 0)

        def NE(self):
            return self.getToken(SQLParser.NE, 0)

        def getRuleIndex(self):
            return SQLParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = SQLParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 28
        self.enterRecursionRule(localctx, 28, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 166
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [38]:
                self.state = 163
                self.match(SQLParser.STRING)
                pass
            elif token in [37]:
                self.state = 164
                self.match(SQLParser.NUM)
                pass
            elif token in [36]:
                self.state = 165
                self.match(SQLParser.ID)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 188
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,18,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 186
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
                    if la_ == 1:
                        localctx = SQLParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 168
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 169
                        self.match(SQLParser.EQ)
                        self.state = 170
                        self.expr(10)
                        pass

                    elif la_ == 2:
                        localctx = SQLParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 171
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 172
                        self.match(SQLParser.GT)
                        self.state = 173
                        self.expr(9)
                        pass

                    elif la_ == 3:
                        localctx = SQLParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 174
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 175
                        self.match(SQLParser.LT)
                        self.state = 176
                        self.expr(8)
                        pass

                    elif la_ == 4:
                        localctx = SQLParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 177
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 178
                        self.match(SQLParser.GE)
                        self.state = 179
                        self.expr(7)
                        pass

                    elif la_ == 5:
                        localctx = SQLParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 180
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 181
                        self.match(SQLParser.LE)
                        self.state = 182
                        self.expr(6)
                        pass

                    elif la_ == 6:
                        localctx = SQLParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 183
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 184
                        self.match(SQLParser.NE)
                        self.state = 185
                        self.expr(5)
                        pass

             
                self.state = 190
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,18,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[14] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 5:
                return self.precpred(self._ctx, 4)
         




