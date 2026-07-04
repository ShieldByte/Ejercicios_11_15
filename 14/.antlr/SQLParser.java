// Generated from c:\Ejercicios\poo_11_5\14\SQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CREATE=2, TABLE=3, SERIAL=4, PRIMARY=5, KEY=6, VARCHAR=7, INTEGER=8, 
		NOT=9, NULL=10, DATE=11, INSERT=12, INTO=13, VALUES=14, UPDATE=15, SET=16, 
		WHERE=17, SELECT=18, FROM=19, JOIN=20, ON=21, INNER=22, LEFT=23, RIGHT=24, 
		LPAREN=25, RPAREN=26, COMMA=27, SEMI=28, DOT=29, EQ=30, GT=31, LT=32, 
		GE=33, LE=34, NE=35, ID=36, NUM=37, STRING=38, WS=39;
	public static final int
		RULE_root = 0, RULE_sqlStmt = 1, RULE_createTableStmt = 2, RULE_tableName = 3, 
		RULE_columnDef = 4, RULE_columnName = 5, RULE_dataType = 6, RULE_columnConstraint = 7, 
		RULE_insertStmt = 8, RULE_updateStmt = 9, RULE_setClause = 10, RULE_selectStmt = 11, 
		RULE_selectList = 12, RULE_tableRef = 13, RULE_expr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "sqlStmt", "createTableStmt", "tableName", "columnDef", "columnName", 
			"dataType", "columnConstraint", "insertStmt", "updateStmt", "setClause", 
			"selectStmt", "selectList", "tableRef", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'CREATE'", "'TABLE'", "'SERIAL'", "'PRIMARY'", "'KEY'", 
			"'VARCHAR'", "'INTEGER'", "'NOT'", "'NULL'", "'DATE'", "'INSERT'", "'INTO'", 
			"'VALUES'", "'UPDATE'", "'SET'", "'WHERE'", "'SELECT'", "'FROM'", "'JOIN'", 
			"'ON'", "'INNER'", "'LEFT'", "'RIGHT'", "'('", "')'", "','", "';'", "'.'", 
			"'='", "'>'", "'<'", "'>='", "'<='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CREATE", "TABLE", "SERIAL", "PRIMARY", "KEY", "VARCHAR", 
			"INTEGER", "NOT", "NULL", "DATE", "INSERT", "INTO", "VALUES", "UPDATE", 
			"SET", "WHERE", "SELECT", "FROM", "JOIN", "ON", "INNER", "LEFT", "RIGHT", 
			"LPAREN", "RPAREN", "COMMA", "SEMI", "DOT", "EQ", "GT", "LT", "GE", "LE", 
			"NE", "ID", "NUM", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<SqlStmtContext> sqlStmt() {
			return getRuleContexts(SqlStmtContext.class);
		}
		public SqlStmtContext sqlStmt(int i) {
			return getRuleContext(SqlStmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SQLParser.SEMI, i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << INSERT) | (1L << UPDATE) | (1L << SELECT))) != 0)) {
				{
				{
				setState(30);
				sqlStmt();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(31);
					match(SEMI);
					}
				}

				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlStmtContext extends ParserRuleContext {
		public CreateTableStmtContext createTableStmt() {
			return getRuleContext(CreateTableStmtContext.class,0);
		}
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public SqlStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStmt; }
	}

	public final SqlStmtContext sqlStmt() throws RecognitionException {
		SqlStmtContext _localctx = new SqlStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStmt);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				createTableStmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				insertStmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				updateStmt();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				selectStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public CreateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStmt; }
	}

	public final CreateTableStmtContext createTableStmt() throws RecognitionException {
		CreateTableStmtContext _localctx = new CreateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createTableStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(CREATE);
			setState(48);
			match(TABLE);
			setState(49);
			tableName();
			setState(50);
			match(LPAREN);
			setState(51);
			columnDef();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);
				setState(53);
				columnDef();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			columnName();
			setState(64);
			dataType();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMARY || _la==NOT) {
				{
				{
				setState(65);
				columnConstraint();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode SERIAL() { return getToken(SQLParser.SERIAL, 0); }
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataType);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SERIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(SERIAL);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(INTEGER);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(VARCHAR);
				setState(76);
				match(LPAREN);
				setState(77);
				match(NUM);
				setState(78);
				match(RPAREN);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(DATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnConstraint);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(PRIMARY);
				setState(83);
				match(KEY);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(NOT);
				setState(85);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(SQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLParser.LPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLParser.RPAREN, i);
		}
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(INSERT);
			setState(89);
			match(INTO);
			setState(90);
			tableName();
			setState(91);
			match(LPAREN);
			setState(92);
			columnName();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				columnName();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(RPAREN);
			setState(101);
			match(VALUES);
			setState(102);
			match(LPAREN);
			setState(103);
			expr(0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				expr(0);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public List<SetClauseContext> setClause() {
			return getRuleContexts(SetClauseContext.class);
		}
		public SetClauseContext setClause(int i) {
			return getRuleContext(SetClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(UPDATE);
			setState(114);
			tableName();
			setState(115);
			match(SET);
			setState(116);
			setClause();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				setClause();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(124);
				match(WHERE);
				setState(125);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			columnName();
			setState(129);
			match(EQ);
			setState(130);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(SELECT);
			setState(133);
			selectList();
			setState(134);
			match(FROM);
			setState(135);
			tableRef();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JOIN) {
				{
				setState(136);
				match(JOIN);
				setState(137);
				tableRef();
				setState(138);
				match(ON);
				setState(139);
				expr(0);
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(143);
				match(WHERE);
				setState(144);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectList);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				columnName();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					columnName();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
	}

	public final TableRefContext tableRef() throws RecognitionException {
		TableRefContext _localctx = new TableRefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(159);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode GE() { return getToken(SQLParser.GE, 0); }
		public TerminalNode LE() { return getToken(SQLParser.LE, 0); }
		public TerminalNode NE() { return getToken(SQLParser.NE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(163);
				match(STRING);
				}
				break;
			case NUM:
				{
				setState(164);
				match(NUM);
				}
				break;
			case ID:
				{
				setState(165);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(169);
						match(EQ);
						setState(170);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(172);
						match(GT);
						setState(173);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(175);
						match(LT);
						setState(176);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(178);
						match(GE);
						setState(179);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(181);
						match(LE);
						setState(182);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(184);
						match(NE);
						setState(185);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\7\2"+
		"%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6"+
		"E\n\6\f\6\16\6H\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\t"+
		"\3\t\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nb\n\n\f\n\16\ne\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\13\3\13\5\13\u0081\n"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r"+
		"\3\r\3\r\5\r\u0094\n\r\3\16\3\16\3\16\3\16\7\16\u009a\n\16\f\16\16\16"+
		"\u009d\13\16\5\16\u009f\n\16\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20"+
		"\3\20\5\20\u00a9\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00bd\n\20\f\20\16\20\u00c0"+
		"\13\20\3\20\2\3\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00ce"+
		"\2&\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2\fI\3\2\2\2\16"+
		"R\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24s\3\2\2\2\26\u0082\3\2\2\2\30\u0086"+
		"\3\2\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00a8\3\2\2\2 \"\5\4\3\2"+
		"!#\7\36\2\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$ \3\2\2\2%(\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\2\2\3*\3\3\2\2\2+\60\5\6\4\2"+
		",\60\5\22\n\2-\60\5\24\13\2.\60\5\30\r\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2"+
		"/.\3\2\2\2\60\5\3\2\2\2\61\62\7\4\2\2\62\63\7\5\2\2\63\64\5\b\5\2\64\65"+
		"\7\33\2\2\65:\5\n\6\2\66\67\7\35\2\2\679\5\n\6\28\66\3\2\2\29<\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\34\2\2>\7\3\2\2\2?@\7&\2"+
		"\2@\t\3\2\2\2AB\5\f\7\2BF\5\16\b\2CE\5\20\t\2DC\3\2\2\2EH\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2G\13\3\2\2\2HF\3\2\2\2IJ\7&\2\2J\r\3\2\2\2KS\7\6\2\2L"+
		"S\7\n\2\2MN\7\t\2\2NO\7\33\2\2OP\7\'\2\2PS\7\34\2\2QS\7\r\2\2RK\3\2\2"+
		"\2RL\3\2\2\2RM\3\2\2\2RQ\3\2\2\2S\17\3\2\2\2TU\7\7\2\2UY\7\b\2\2VW\7\13"+
		"\2\2WY\7\f\2\2XT\3\2\2\2XV\3\2\2\2Y\21\3\2\2\2Z[\7\16\2\2[\\\7\17\2\2"+
		"\\]\5\b\5\2]^\7\33\2\2^c\5\f\7\2_`\7\35\2\2`b\5\f\7\2a_\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\34\2\2gh\7\20\2\2hi\7"+
		"\33\2\2in\5\36\20\2jk\7\35\2\2km\5\36\20\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\34\2\2r\23\3\2\2\2st\7\21\2\2tu\5"+
		"\b\5\2uv\7\22\2\2v{\5\26\f\2wx\7\35\2\2xz\5\26\f\2yw\3\2\2\2z}\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2}{\3\2\2\2~\177\7\23\2\2\177\u0081"+
		"\5\36\20\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\25\3\2\2\2\u0082\u0083"+
		"\5\f\7\2\u0083\u0084\7 \2\2\u0084\u0085\5\36\20\2\u0085\27\3\2\2\2\u0086"+
		"\u0087\7\24\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7\25\2\2\u0089\u008f"+
		"\5\34\17\2\u008a\u008b\7\26\2\2\u008b\u008c\5\34\17\2\u008c\u008d\7\27"+
		"\2\2\u008d\u008e\5\36\20\2\u008e\u0090\3\2\2\2\u008f\u008a\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\7\23\2\2\u0092\u0094\5"+
		"\36\20\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\31\3\2\2\2\u0095"+
		"\u009f\7\3\2\2\u0096\u009b\5\f\7\2\u0097\u0098\7\35\2\2\u0098\u009a\5"+
		"\f\7\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u0095\3\2"+
		"\2\2\u009e\u0096\3\2\2\2\u009f\33\3\2\2\2\u00a0\u00a2\7&\2\2\u00a1\u00a3"+
		"\7&\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\35\3\2\2\2\u00a4"+
		"\u00a5\b\20\1\2\u00a5\u00a9\7(\2\2\u00a6\u00a9\7\'\2\2\u00a7\u00a9\7&"+
		"\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00be\3\2\2\2\u00aa\u00ab\f\13\2\2\u00ab\u00ac\7 \2\2\u00ac\u00bd\5\36"+
		"\20\f\u00ad\u00ae\f\n\2\2\u00ae\u00af\7!\2\2\u00af\u00bd\5\36\20\13\u00b0"+
		"\u00b1\f\t\2\2\u00b1\u00b2\7\"\2\2\u00b2\u00bd\5\36\20\n\u00b3\u00b4\f"+
		"\b\2\2\u00b4\u00b5\7#\2\2\u00b5\u00bd\5\36\20\t\u00b6\u00b7\f\7\2\2\u00b7"+
		"\u00b8\7$\2\2\u00b8\u00bd\5\36\20\b\u00b9\u00ba\f\6\2\2\u00ba\u00bb\7"+
		"%\2\2\u00bb\u00bd\5\36\20\7\u00bc\u00aa\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc"+
		"\u00b0\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2"+
		"\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\37\3\2\2\2\u00c0\u00be\3\2\2\2\25\"&/:FRXcn{\u0080\u008f\u0093\u009b"+
		"\u009e\u00a2\u00a8\u00bc\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}