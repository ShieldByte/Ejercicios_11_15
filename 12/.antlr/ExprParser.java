// Generated from c:/Ejercicios/poo_11_5 Streamlit/12/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PUBLIC=2, CLASS=3, STATIC=4, VOID=5, MAIN=6, STRING=7, INT=8, 
		SYSTEM=9, OUT=10, PRINTLN=11, IF=12, ID=13, NUM=14, CADENA=15, SUMA=16, 
		RESTA=17, MAYOR_IGUAL=18, ASIGNAR=19, PUNTOCOMA=20, PAR_IZQ=21, PAR_DER=22, 
		LLAVE_IZQ=23, LLAVE_DER=24, COR_IZQ=25, COR_DER=26, PUNTO=27, WS=28;
	public static final int
		RULE_root = 0, RULE_classDef = 1, RULE_methodDef = 2, RULE_statement = 3, 
		RULE_declaration = 4, RULE_tipo = 5, RULE_assignment = 6, RULE_ifStmt = 7, 
		RULE_printStmt = 8, RULE_printArg = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "classDef", "methodDef", "statement", "declaration", "tipo", 
			"assignment", "ifStmt", "printStmt", "printArg", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'System.out.println'", "'public'", "'class'", "'static'", "'void'", 
			"'main'", "'String'", "'int'", "'System'", "'out'", "'println'", "'if'", 
			null, null, null, "'+'", "'-'", "'>='", "'='", "';'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "STRING", "INT", 
			"SYSTEM", "OUT", "PRINTLN", "IF", "ID", "NUM", "CADENA", "SUMA", "RESTA", 
			"MAYOR_IGUAL", "ASIGNAR", "PUNTOCOMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "COR_IZQ", "COR_DER", "PUNTO", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			classDef();
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
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ExprParser.PUBLIC, 0); }
		public TerminalNode CLASS() { return getToken(ExprParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(ExprParser.LLAVE_IZQ, 0); }
		public MethodDefContext methodDef() {
			return getRuleContext(MethodDefContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(ExprParser.LLAVE_DER, 0); }
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PUBLIC);
			setState(25);
			match(CLASS);
			setState(26);
			match(ID);
			setState(27);
			match(LLAVE_IZQ);
			setState(28);
			methodDef();
			setState(29);
			match(LLAVE_DER);
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
	public static class MethodDefContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ExprParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(ExprParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(ExprParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TerminalNode COR_IZQ() { return getToken(ExprParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(ExprParser.COR_DER, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(ExprParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(ExprParser.LLAVE_DER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(PUBLIC);
			setState(32);
			match(STATIC);
			setState(33);
			match(VOID);
			setState(34);
			match(MAIN);
			setState(35);
			match(PAR_IZQ);
			setState(36);
			match(STRING);
			setState(37);
			match(COR_IZQ);
			setState(38);
			match(COR_DER);
			setState(39);
			match(ID);
			setState(40);
			match(PAR_DER);
			setState(41);
			match(LLAVE_IZQ);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12674L) != 0)) {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(LLAVE_DER);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				assignment();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				printStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				ifStmt();
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
	public static class DeclarationContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(ExprParser.ASIGNAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(ExprParser.PUNTOCOMA, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			tipo();
			setState(57);
			match(ID);
			setState(58);
			match(ASIGNAR);
			setState(59);
			expr(0);
			setState(60);
			match(PUNTOCOMA);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(ExprParser.ASIGNAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(ExprParser.PUNTOCOMA, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(ASIGNAR);
			setState(66);
			expr(0);
			setState(67);
			match(PUNTOCOMA);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(ExprParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(ExprParser.LLAVE_DER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IF);
			setState(70);
			match(PAR_IZQ);
			setState(71);
			expr(0);
			setState(72);
			match(PAR_DER);
			setState(73);
			match(LLAVE_IZQ);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12674L) != 0)) {
				{
				{
				setState(74);
				statement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(LLAVE_DER);
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
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public PrintArgContext printArg() {
			return getRuleContext(PrintArgContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ExprParser.PUNTOCOMA, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__0);
			setState(83);
			match(PAR_IZQ);
			setState(84);
			printArg();
			setState(85);
			match(PAR_DER);
			setState(86);
			match(PUNTOCOMA);
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
	public static class PrintArgContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode SUMA() { return getToken(ExprParser.SUMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArg; }
	}

	public final PrintArgContext printArg() throws RecognitionException {
		PrintArgContext _localctx = new PrintArgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printArg);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(CADENA);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUMA) {
					{
					setState(89);
					match(SUMA);
					setState(90);
					expr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				expr(0);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(ExprParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(ExprParser.RESTA, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(ExprParser.MAYOR_IGUAL, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(97);
				match(NUM);
				}
				break;
			case ID:
				{
				setState(98);
				match(ID);
				}
				break;
			case CADENA:
				{
				setState(99);
				match(CADENA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(103);
						match(SUMA);
						setState(104);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						match(RESTA);
						setState(107);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						match(MAYOR_IGUAL);
						setState(110);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001cu\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00037\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007L\b\u0007\n\u0007\f\u0007O\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\\\b\t\u0001\t\u0003\t_\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\ne\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\np\b\n\n\n\f\ns\t\n\u0001\n\u0000"+
		"\u0001\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0001\u0001\u0000\u0007\bu\u0000\u0016\u0001\u0000\u0000\u0000"+
		"\u0002\u0018\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000"+
		"\u00066\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n>\u0001\u0000"+
		"\u0000\u0000\f@\u0001\u0000\u0000\u0000\u000eE\u0001\u0000\u0000\u0000"+
		"\u0010R\u0001\u0000\u0000\u0000\u0012^\u0001\u0000\u0000\u0000\u0014d"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0001"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a"+
		"\u0005\u0003\u0000\u0000\u001a\u001b\u0005\r\u0000\u0000\u001b\u001c\u0005"+
		"\u0017\u0000\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005"+
		"\u0018\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\u0002"+
		"\u0000\u0000 !\u0005\u0004\u0000\u0000!\"\u0005\u0005\u0000\u0000\"#\u0005"+
		"\u0006\u0000\u0000#$\u0005\u0015\u0000\u0000$%\u0005\u0007\u0000\u0000"+
		"%&\u0005\u0019\u0000\u0000&\'\u0005\u001a\u0000\u0000\'(\u0005\r\u0000"+
		"\u0000()\u0005\u0016\u0000\u0000)-\u0005\u0017\u0000\u0000*,\u0003\u0006"+
		"\u0003\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0005\u0018\u0000\u00001\u0005\u0001\u0000"+
		"\u0000\u000027\u0003\b\u0004\u000037\u0003\f\u0006\u000047\u0003\u0010"+
		"\b\u000057\u0003\u000e\u0007\u000062\u0001\u0000\u0000\u000063\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0007"+
		"\u0001\u0000\u0000\u000089\u0003\n\u0005\u00009:\u0005\r\u0000\u0000:"+
		";\u0005\u0013\u0000\u0000;<\u0003\u0014\n\u0000<=\u0005\u0014\u0000\u0000"+
		"=\t\u0001\u0000\u0000\u0000>?\u0007\u0000\u0000\u0000?\u000b\u0001\u0000"+
		"\u0000\u0000@A\u0005\r\u0000\u0000AB\u0005\u0013\u0000\u0000BC\u0003\u0014"+
		"\n\u0000CD\u0005\u0014\u0000\u0000D\r\u0001\u0000\u0000\u0000EF\u0005"+
		"\f\u0000\u0000FG\u0005\u0015\u0000\u0000GH\u0003\u0014\n\u0000HI\u0005"+
		"\u0016\u0000\u0000IM\u0005\u0017\u0000\u0000JL\u0003\u0006\u0003\u0000"+
		"KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0018\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0001\u0000\u0000ST\u0005\u0015\u0000\u0000TU\u0003\u0012\t\u0000"+
		"UV\u0005\u0016\u0000\u0000VW\u0005\u0014\u0000\u0000W\u0011\u0001\u0000"+
		"\u0000\u0000X[\u0005\u000f\u0000\u0000YZ\u0005\u0010\u0000\u0000Z\\\u0003"+
		"\u0014\n\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\"+
		"_\u0001\u0000\u0000\u0000]_\u0003\u0014\n\u0000^X\u0001\u0000\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_\u0013\u0001\u0000\u0000\u0000`a\u0006\n\uffff"+
		"\uffff\u0000ae\u0005\u000e\u0000\u0000be\u0005\r\u0000\u0000ce\u0005\u000f"+
		"\u0000\u0000d`\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000eq\u0001\u0000\u0000\u0000fg\n\u0006\u0000\u0000gh\u0005"+
		"\u0010\u0000\u0000hp\u0003\u0014\n\u0007ij\n\u0005\u0000\u0000jk\u0005"+
		"\u0011\u0000\u0000kp\u0003\u0014\n\u0006lm\n\u0004\u0000\u0000mn\u0005"+
		"\u0012\u0000\u0000np\u0003\u0014\n\u0005of\u0001\u0000\u0000\u0000oi\u0001"+
		"\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0015\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000\b-6M[^doq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}