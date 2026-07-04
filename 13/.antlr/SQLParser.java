// Generated from c:\Ejercicios\poo_11_5\13\SQL.g4 by ANTLR 4.9.2
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << INSERT) | (1L << SELECT))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\3\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\3\n\3\n\3\n\3\n\3\n\7\nr\n\n\f\n"+
		"\16\nu\13\n\3\13\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\7\16\u008f"+
		"\n\16\f\16\16\16\u0092\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u0099\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a2\n\20\3\21\3\21\5\21\u00a6"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00b9\n\24\3\24\3\24\3\24\7\24\u00be\n\24\f"+
		"\24\16\24\u00c1\13\24\3\25\3\25\3\25\2\3&\26\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(\2\3\3\2\35\36\2\u00c4\2/\3\2\2\2\4\65\3\2\2\2\6\67"+
		"\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fO\3\2\2\2\16X\3\2\2\2\20^\3\2\2\2\22`"+
		"\3\2\2\2\24v\3\2\2\2\26\u0081\3\2\2\2\30\u0083\3\2\2\2\32\u008b\3\2\2"+
		"\2\34\u0098\3\2\2\2\36\u009a\3\2\2\2 \u00a3\3\2\2\2\"\u00a7\3\2\2\2$\u00af"+
		"\3\2\2\2&\u00b8\3\2\2\2(\u00c2\3\2\2\2*+\5\4\3\2+,\7\33\2\2,.\3\2\2\2"+
		"-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61/\3\2\2\2"+
		"\62\66\5\6\4\2\63\66\5\22\n\2\64\66\5\30\r\2\65\62\3\2\2\2\65\63\3\2\2"+
		"\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\3\2\289\7\4\2\29:\5\b\5\2:;\7\27\2"+
		"\2;@\5\n\6\2<=\7\31\2\2=?\5\n\6\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AC\3\2\2\2B@\3\2\2\2CD\7\30\2\2D\7\3\2\2\2EF\7\34\2\2F\t\3\2\2\2G"+
		"H\5\f\7\2HL\5\16\b\2IK\5\20\t\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2M\13\3\2\2\2NL\3\2\2\2OP\7\34\2\2P\r\3\2\2\2QY\7\5\2\2RY\7\t\2\2ST\7"+
		"\b\2\2TU\7\27\2\2UV\7\35\2\2VY\7\30\2\2WY\7\f\2\2XQ\3\2\2\2XR\3\2\2\2"+
		"XS\3\2\2\2XW\3\2\2\2Y\17\3\2\2\2Z[\7\6\2\2[_\7\7\2\2\\]\7\n\2\2]_\7\13"+
		"\2\2^Z\3\2\2\2^\\\3\2\2\2_\21\3\2\2\2`a\7\r\2\2ab\7\16\2\2bc\5\b\5\2c"+
		"d\7\27\2\2di\5\f\7\2ef\7\31\2\2fh\5\f\7\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2"+
		"\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\30\2\2mn\7\17\2\2ns\5\24\13\2op\7"+
		"\31\2\2pr\5\24\13\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\23\3\2\2"+
		"\2us\3\2\2\2vw\7\27\2\2w|\5\26\f\2xy\7\31\2\2y{\5\26\f\2zx\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\30\2\2\u0080"+
		"\25\3\2\2\2\u0081\u0082\t\2\2\2\u0082\27\3\2\2\2\u0083\u0084\7\20\2\2"+
		"\u0084\u0085\5\32\16\2\u0085\u0086\7\21\2\2\u0086\u0089\5\36\20\2\u0087"+
		"\u0088\7\22\2\2\u0088\u008a\5$\23\2\u0089\u0087\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\31\3\2\2\2\u008b\u0090\5\34\17\2\u008c\u008d\7\31\2\2\u008d"+
		"\u008f\5\34\17\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\33\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\5(\25\2\u0094\u0095\7\32\2\2\u0095\u0096\5\f\7\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0099\5\f\7\2\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\35\3\2\2\2\u009a\u00a1\5 \21\2\u009b\u009c\7\23\2\2\u009c\u009d\7\24"+
		"\2\2\u009d\u009e\5 \21\2\u009e\u009f\7\25\2\2\u009f\u00a0\5\"\22\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\37\3\2\2"+
		"\2\u00a3\u00a5\5\b\5\2\u00a4\u00a6\7\34\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6!\3\2\2\2\u00a7\u00a8\5(\25\2\u00a8\u00a9\7\32\2\2"+
		"\u00a9\u00aa\7\34\2\2\u00aa\u00ab\7\26\2\2\u00ab\u00ac\5(\25\2\u00ac\u00ad"+
		"\7\32\2\2\u00ad\u00ae\7\34\2\2\u00ae#\3\2\2\2\u00af\u00b0\5&\24\2\u00b0"+
		"%\3\2\2\2\u00b1\u00b2\b\24\1\2\u00b2\u00b9\5\26\f\2\u00b3\u00b4\5(\25"+
		"\2\u00b4\u00b5\7\32\2\2\u00b5\u00b6\7\34\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b9\7\34\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\f\6\2\2\u00bb\u00bc\7\26\2\2\u00bc"+
		"\u00be\5&\24\7\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\'\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3"+
		"\7\34\2\2\u00c3)\3\2\2\2\22/\65@LX^is|\u0089\u0090\u0098\u00a1\u00a5\u00b8"+
		"\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}