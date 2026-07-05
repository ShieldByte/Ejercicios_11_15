// Generated from c:/Ejercicios/poo_11_5 Streamlit/13/SQL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, SERIAL=3, PRIMARY=4, KEY=5, VARCHAR=6, INTEGER=7, NOT=8, 
		NULL=9, DATE=10, INSERT=11, INTO=12, VALUES=13, SELECT=14, FROM=15, WHERE=16, 
		INNER=17, JOIN=18, ON=19, COMPARACION=20, PAR_IZQ=21, PAR_DER=22, COMA=23, 
		PUNTO=24, PUNTO_COMA=25, ID=26, NUM=27, CADENA=28, WS=29;
	public static final int
		RULE_root = 0, RULE_statement = 1, RULE_createTableStmt = 2, RULE_tableName = 3, 
		RULE_columnDef = 4, RULE_columnName = 5, RULE_dataType = 6, RULE_columnConstraint = 7, 
		RULE_insertStmt = 8, RULE_valueList = 9, RULE_value = 10, RULE_selectStmt = 11, 
		RULE_selectColumns = 12, RULE_selectColumn = 13, RULE_fromClause = 14, 
		RULE_tableRef = 15, RULE_joinCondition = 16, RULE_whereCondition = 17, 
		RULE_expr = 18, RULE_tableAlias = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "statement", "createTableStmt", "tableName", "columnDef", "columnName", 
			"dataType", "columnConstraint", "insertStmt", "valueList", "value", "selectStmt", 
			"selectColumns", "selectColumn", "fromClause", "tableRef", "joinCondition", 
			"whereCondition", "expr", "tableAlias"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'TABLE'", "'SERIAL'", "'PRIMARY'", "'KEY'", "'VARCHAR'", 
			"'INTEGER'", "'NOT'", "'NULL'", "'DATE'", "'INSERT'", "'INTO'", "'VALUES'", 
			"'SELECT'", "'FROM'", "'WHERE'", "'INNER'", "'JOIN'", "'ON'", null, "'('", 
			"')'", "','", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "TABLE", "SERIAL", "PRIMARY", "KEY", "VARCHAR", "INTEGER", 
			"NOT", "NULL", "DATE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", 
			"WHERE", "INNER", "JOIN", "ON", "COMPARACION", "PAR_IZQ", "PAR_DER", 
			"COMA", "PUNTO", "PUNTO_COMA", "ID", "NUM", "CADENA", "WS"
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

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(SQLParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(SQLParser.PUNTO_COMA, i);
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18434L) != 0)) {
				{
				{
				setState(40);
				statement();
				setState(41);
				match(PUNTO_COMA);
				}
				}
				setState(47);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CreateTableStmtContext createTableStmt() {
			return getRuleContext(CreateTableStmtContext.class,0);
		}
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				createTableStmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				insertStmt();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(SQLParser.PAR_IZQ, 0); }
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(SQLParser.PAR_DER, 0); }
		public List<TerminalNode> COMA() { return getTokens(SQLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLParser.COMA, i);
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
			setState(53);
			match(CREATE);
			setState(54);
			match(TABLE);
			setState(55);
			tableName();
			setState(56);
			match(PAR_IZQ);
			setState(57);
			columnDef();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(58);
				match(COMA);
				setState(59);
				columnDef();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(PAR_DER);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(67);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(69);
			columnName();
			setState(70);
			dataType();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMARY || _la==NOT) {
				{
				{
				setState(71);
				columnConstraint();
				}
				}
				setState(76);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode SERIAL() { return getToken(SQLParser.SERIAL, 0); }
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SQLParser.PAR_IZQ, 0); }
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public TerminalNode PAR_DER() { return getToken(SQLParser.PAR_DER, 0); }
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SERIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(SERIAL);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(INTEGER);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(VARCHAR);
				setState(82);
				match(PAR_IZQ);
				setState(83);
				match(NUM);
				setState(84);
				match(PAR_DER);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(PRIMARY);
				setState(89);
				match(KEY);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(NOT);
				setState(91);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(SQLParser.PAR_IZQ, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(SQLParser.PAR_DER, 0); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public List<ValueListContext> valueList() {
			return getRuleContexts(ValueListContext.class);
		}
		public ValueListContext valueList(int i) {
			return getRuleContext(ValueListContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SQLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLParser.COMA, i);
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
			setState(94);
			match(INSERT);
			setState(95);
			match(INTO);
			setState(96);
			tableName();
			setState(97);
			match(PAR_IZQ);
			setState(98);
			columnName();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(99);
				match(COMA);
				setState(100);
				columnName();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(PAR_DER);
			setState(107);
			match(VALUES);
			setState(108);
			valueList();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(109);
				match(COMA);
				setState(110);
				valueList();
				}
				}
				setState(115);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(SQLParser.PAR_IZQ, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(SQLParser.PAR_DER, 0); }
		public List<TerminalNode> COMA() { return getTokens(SQLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLParser.COMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(PAR_IZQ);
			setState(117);
			value();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(118);
				match(COMA);
				setState(119);
				value();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(PAR_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public TerminalNode CADENA() { return getToken(SQLParser.CADENA, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public SelectColumnsContext selectColumns() {
			return getRuleContext(SelectColumnsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
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
			setState(129);
			match(SELECT);
			setState(130);
			selectColumns();
			setState(131);
			match(FROM);
			setState(132);
			fromClause();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(133);
				match(WHERE);
				setState(134);
				whereCondition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectColumnsContext extends ParserRuleContext {
		public List<SelectColumnContext> selectColumn() {
			return getRuleContexts(SelectColumnContext.class);
		}
		public SelectColumnContext selectColumn(int i) {
			return getRuleContext(SelectColumnContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SQLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLParser.COMA, i);
		}
		public SelectColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumns; }
	}

	public final SelectColumnsContext selectColumns() throws RecognitionException {
		SelectColumnsContext _localctx = new SelectColumnsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			selectColumn();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(138);
				match(COMA);
				setState(139);
				selectColumn();
				}
				}
				setState(144);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectColumnContext extends ParserRuleContext {
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(SQLParser.PUNTO, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SelectColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumn; }
	}

	public final SelectColumnContext selectColumn() throws RecognitionException {
		SelectColumnContext _localctx = new SelectColumnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectColumn);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				tableAlias();
				setState(146);
				match(PUNTO);
				setState(147);
				columnName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				columnName();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public TerminalNode INNER() { return getToken(SQLParser.INNER, 0); }
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			tableRef();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INNER) {
				{
				setState(153);
				match(INNER);
				setState(154);
				match(JOIN);
				setState(155);
				tableRef();
				setState(156);
				match(ON);
				setState(157);
				joinCondition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableRefContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
	}

	public final TableRefContext tableRef() throws RecognitionException {
		TableRefContext _localctx = new TableRefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			tableName();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(162);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JoinConditionContext extends ParserRuleContext {
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(SQLParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(SQLParser.PUNTO, i);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TerminalNode COMPARACION() { return getToken(SQLParser.COMPARACION, 0); }
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_joinCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			tableAlias();
			setState(166);
			match(PUNTO);
			setState(167);
			match(ID);
			setState(168);
			match(COMPARACION);
			setState(169);
			tableAlias();
			setState(170);
			match(PUNTO);
			setState(171);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCondition; }
	}

	public final WhereConditionContext whereCondition() throws RecognitionException {
		WhereConditionContext _localctx = new WhereConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whereCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(SQLParser.PUNTO, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARACION() { return getToken(SQLParser.COMPARACION, 0); }
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(176);
				value();
				}
				break;
			case 2:
				{
				setState(177);
				tableAlias();
				setState(178);
				match(PUNTO);
				setState(179);
				match(ID);
				}
				break;
			case 3:
				{
				setState(181);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(184);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(185);
					match(COMPARACION);
					setState(186);
					expr(5);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableAliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000,\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002\n\u0002"+
		"\f\u0002@\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006W\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007]\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bf\b\b\n\b\f"+
		"\bi\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bp\b\b\n\b\f\bs"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\ty\b\t\n\t\f\t|\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0088\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u008d\b\f\n\f\f\f\u0090\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u0097\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a0\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00a4\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00b7\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00bc\b\u0012\n\u0012\f\u0012\u00bf\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0000\u0001$\u0014\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\u0001\u0001\u0000\u001b\u001c\u00c2\u0000-\u0001\u0000\u0000\u0000\u0002"+
		"3\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006C\u0001"+
		"\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000"+
		"\fV\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010^\u0001"+
		"\u0000\u0000\u0000\u0012t\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000"+
		"\u0000\u0000\u0016\u0081\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000"+
		"\u0000\u0000\u001a\u0096\u0001\u0000\u0000\u0000\u001c\u0098\u0001\u0000"+
		"\u0000\u0000\u001e\u00a1\u0001\u0000\u0000\u0000 \u00a5\u0001\u0000\u0000"+
		"\u0000\"\u00ad\u0001\u0000\u0000\u0000$\u00b6\u0001\u0000\u0000\u0000"+
		"&\u00c0\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0019"+
		"\u0000\u0000*,\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".\u0001\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000004\u0003\u0004"+
		"\u0002\u000014\u0003\u0010\b\u000024\u0003\u0016\u000b\u000030\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u00004\u0003"+
		"\u0001\u0000\u0000\u000056\u0005\u0001\u0000\u000067\u0005\u0002\u0000"+
		"\u000078\u0003\u0006\u0003\u000089\u0005\u0015\u0000\u00009>\u0003\b\u0004"+
		"\u0000:;\u0005\u0017\u0000\u0000;=\u0003\b\u0004\u0000<:\u0001\u0000\u0000"+
		"\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0016\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CD\u0005\u001a\u0000"+
		"\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0003\n\u0005\u0000FJ\u0003\f"+
		"\u0006\u0000GI\u0003\u000e\u0007\u0000HG\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\t\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u001a\u0000"+
		"\u0000N\u000b\u0001\u0000\u0000\u0000OW\u0005\u0003\u0000\u0000PW\u0005"+
		"\u0007\u0000\u0000QR\u0005\u0006\u0000\u0000RS\u0005\u0015\u0000\u0000"+
		"ST\u0005\u001b\u0000\u0000TW\u0005\u0016\u0000\u0000UW\u0005\n\u0000\u0000"+
		"VO\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0005\u0004"+
		"\u0000\u0000Y]\u0005\u0005\u0000\u0000Z[\u0005\b\u0000\u0000[]\u0005\t"+
		"\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]\u000f"+
		"\u0001\u0000\u0000\u0000^_\u0005\u000b\u0000\u0000_`\u0005\f\u0000\u0000"+
		"`a\u0003\u0006\u0003\u0000ab\u0005\u0015\u0000\u0000bg\u0003\n\u0005\u0000"+
		"cd\u0005\u0017\u0000\u0000df\u0003\n\u0005\u0000ec\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0016"+
		"\u0000\u0000kl\u0005\r\u0000\u0000lq\u0003\u0012\t\u0000mn\u0005\u0017"+
		"\u0000\u0000np\u0003\u0012\t\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0011"+
		"\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0015\u0000"+
		"\u0000uz\u0003\u0014\n\u0000vw\u0005\u0017\u0000\u0000wy\u0003\u0014\n"+
		"\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}~\u0005\u0016\u0000\u0000~\u0013\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0007\u0000\u0000\u0000\u0080\u0015\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005\u000e\u0000\u0000\u0082\u0083\u0003\u0018\f\u0000"+
		"\u0083\u0084\u0005\u000f\u0000\u0000\u0084\u0087\u0003\u001c\u000e\u0000"+
		"\u0085\u0086\u0005\u0010\u0000\u0000\u0086\u0088\u0003\"\u0011\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0017\u0001\u0000\u0000\u0000\u0089\u008e\u0003\u001a\r\u0000\u008a\u008b"+
		"\u0005\u0017\u0000\u0000\u008b\u008d\u0003\u001a\r\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0019\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0003"+
		"&\u0013\u0000\u0092\u0093\u0005\u0018\u0000\u0000\u0093\u0094\u0003\n"+
		"\u0005\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0097\u0003\n\u0005"+
		"\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u001b\u0001\u0000\u0000\u0000\u0098\u009f\u0003\u001e\u000f"+
		"\u0000\u0099\u009a\u0005\u0011\u0000\u0000\u009a\u009b\u0005\u0012\u0000"+
		"\u0000\u009b\u009c\u0003\u001e\u000f\u0000\u009c\u009d\u0005\u0013\u0000"+
		"\u0000\u009d\u009e\u0003 \u0010\u0000\u009e\u00a0\u0001\u0000\u0000\u0000"+
		"\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u001d\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003\u0006\u0003\u0000"+
		"\u00a2\u00a4\u0005\u001a\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u001f\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0003&\u0013\u0000\u00a6\u00a7\u0005\u0018\u0000\u0000\u00a7"+
		"\u00a8\u0005\u001a\u0000\u0000\u00a8\u00a9\u0005\u0014\u0000\u0000\u00a9"+
		"\u00aa\u0003&\u0013\u0000\u00aa\u00ab\u0005\u0018\u0000\u0000\u00ab\u00ac"+
		"\u0005\u001a\u0000\u0000\u00ac!\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003"+
		"$\u0012\u0000\u00ae#\u0001\u0000\u0000\u0000\u00af\u00b0\u0006\u0012\uffff"+
		"\uffff\u0000\u00b0\u00b7\u0003\u0014\n\u0000\u00b1\u00b2\u0003&\u0013"+
		"\u0000\u00b2\u00b3\u0005\u0018\u0000\u0000\u00b3\u00b4\u0005\u001a\u0000"+
		"\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u001a\u0000"+
		"\u0000\u00b6\u00af\u0001\u0000\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00bd\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\n\u0004\u0000\u0000\u00b9\u00ba\u0005\u0014\u0000\u0000"+
		"\u00ba\u00bc\u0003$\u0012\u0005\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be%\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u001a\u0000\u0000\u00c1\'\u0001"+
		"\u0000\u0000\u0000\u0010-3>JV\\gqz\u0087\u008e\u0096\u009f\u00a3\u00b6"+
		"\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}