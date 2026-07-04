// Generated from c:\Ejercicios\poo_11_5\11\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PUBLIC=2, CLASS=3, STATIC=4, VOID=5, MAIN=6, STRING=7, INT=8, 
		SYSTEM=9, OUT=10, PRINTLN=11, ID=12, NUM=13, CADENA=14, SUMA=15, RESTA=16, 
		ASIGNAR=17, PUNTOCOMA=18, PAR_IZQ=19, PAR_DER=20, LLAVE_IZQ=21, LLAVE_DER=22, 
		COR_IZQ=23, COR_DER=24, PUNTO=25, WS=26;
	public static final int
		RULE_root = 0, RULE_classDef = 1, RULE_methodDef = 2, RULE_statement = 3, 
		RULE_declaration = 4, RULE_assignment = 5, RULE_printStmt = 6, RULE_printArg = 7, 
		RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "classDef", "methodDef", "statement", "declaration", "assignment", 
			"printStmt", "printArg", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'System.out.println'", "'public'", "'class'", "'static'", "'void'", 
			"'main'", "'String'", "'int'", "'System'", "'out'", "'println'", null, 
			null, null, "'+'", "'-'", "'='", "';'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "STRING", "INT", 
			"SYSTEM", "OUT", "PRINTLN", "ID", "NUM", "CADENA", "SUMA", "RESTA", "ASIGNAR", 
			"PUNTOCOMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "COR_IZQ", 
			"COR_DER", "PUNTO", "WS"
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
			setState(18);
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
			setState(20);
			match(PUBLIC);
			setState(21);
			match(CLASS);
			setState(22);
			match(ID);
			setState(23);
			match(LLAVE_IZQ);
			setState(24);
			methodDef();
			setState(25);
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
			setState(27);
			match(PUBLIC);
			setState(28);
			match(STATIC);
			setState(29);
			match(VOID);
			setState(30);
			match(MAIN);
			setState(31);
			match(PAR_IZQ);
			setState(32);
			match(STRING);
			setState(33);
			match(COR_IZQ);
			setState(34);
			match(COR_DER);
			setState(35);
			match(ID);
			setState(36);
			match(PAR_DER);
			setState(37);
			match(LLAVE_IZQ);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				assignment();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				printStmt();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
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
			setState(51);
			match(INT);
			setState(52);
			match(ID);
			setState(53);
			match(ASIGNAR);
			setState(54);
			expr(0);
			setState(55);
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 12, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			match(PAR_IZQ);
			setState(64);
			printArg();
			setState(65);
			match(PAR_DER);
			setState(66);
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
		enterRule(_localctx, 14, RULE_printArg);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(CADENA);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUMA) {
					{
					setState(69);
					match(SUMA);
					setState(70);
					expr(0);
					}
				}

				}
				break;
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(ExprParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(ExprParser.RESTA, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(77);
				match(NUM);
				}
				break;
			case ID:
				{
				setState(78);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(82);
						match(SUMA);
						setState(83);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						match(RESTA);
						setState(86);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\5\5\64\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5"+
		"\tJ\n\t\3\t\5\tM\n\t\3\n\3\n\3\n\5\nR\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"Z\n\n\f\n\16\n]\13\n\3\n\2\3\22\13\2\4\6\b\n\f\16\20\22\2\2\2]\2\24\3"+
		"\2\2\2\4\26\3\2\2\2\6\35\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f;\3\2\2\2"+
		"\16@\3\2\2\2\20L\3\2\2\2\22Q\3\2\2\2\24\25\5\4\3\2\25\3\3\2\2\2\26\27"+
		"\7\4\2\2\27\30\7\5\2\2\30\31\7\16\2\2\31\32\7\27\2\2\32\33\5\6\4\2\33"+
		"\34\7\30\2\2\34\5\3\2\2\2\35\36\7\4\2\2\36\37\7\6\2\2\37 \7\7\2\2 !\7"+
		"\b\2\2!\"\7\25\2\2\"#\7\t\2\2#$\7\31\2\2$%\7\32\2\2%&\7\16\2\2&\'\7\26"+
		"\2\2\'+\7\27\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3"+
		"\2\2\2-+\3\2\2\2./\7\30\2\2/\7\3\2\2\2\60\64\5\n\6\2\61\64\5\f\7\2\62"+
		"\64\5\16\b\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65"+
		"\66\7\n\2\2\66\67\7\16\2\2\678\7\23\2\289\5\22\n\29:\7\24\2\2:\13\3\2"+
		"\2\2;<\7\16\2\2<=\7\23\2\2=>\5\22\n\2>?\7\24\2\2?\r\3\2\2\2@A\7\3\2\2"+
		"AB\7\25\2\2BC\5\20\t\2CD\7\26\2\2DE\7\24\2\2E\17\3\2\2\2FI\7\20\2\2GH"+
		"\7\21\2\2HJ\5\22\n\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KM\5\22\n\2LF\3\2\2"+
		"\2LK\3\2\2\2M\21\3\2\2\2NO\b\n\1\2OR\7\17\2\2PR\7\16\2\2QN\3\2\2\2QP\3"+
		"\2\2\2R[\3\2\2\2ST\f\6\2\2TU\7\21\2\2UZ\5\22\n\7VW\f\5\2\2WX\7\22\2\2"+
		"XZ\5\22\n\6YS\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\23\3"+
		"\2\2\2][\3\2\2\2\t+\63ILQY[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}