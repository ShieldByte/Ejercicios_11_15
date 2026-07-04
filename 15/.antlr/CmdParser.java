// Generated from c:\Ejercicios\poo_11_5\15\Cmd.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmdParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NMAP=1, SS=2, TCPDUMP=3, CURL=4, DIG=5, JOURNALCTL=6, GREP=7, UFW=8, SUDO=9, 
		OPCION_CORTA=10, OPCION_LARGA=11, IP=12, CIDR=13, RUTA=14, DOMINIO=15, 
		TEXTO=16, CADENA=17, PALABRA_CLAVE=18, PUNTO_COMA=19, WS=20;
	public static final int
		RULE_root = 0, RULE_lineaComando = 1, RULE_comando = 2, RULE_opcion = 3, 
		RULE_argumento = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "lineaComando", "comando", "opcion", "argumento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nmap'", "'ss'", "'tcpdump'", "'curl'", "'dig'", "'journalctl'", 
			"'grep'", "'ufw'", "'sudo'", null, null, null, null, null, null, null, 
			null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NMAP", "SS", "TCPDUMP", "CURL", "DIG", "JOURNALCTL", "GREP", "UFW", 
			"SUDO", "OPCION_CORTA", "OPCION_LARGA", "IP", "CIDR", "RUTA", "DOMINIO", 
			"TEXTO", "CADENA", "PALABRA_CLAVE", "PUNTO_COMA", "WS"
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
	public String getGrammarFileName() { return "Cmd.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmdParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CmdParser.EOF, 0); }
		public List<LineaComandoContext> lineaComando() {
			return getRuleContexts(LineaComandoContext.class);
		}
		public LineaComandoContext lineaComando(int i) {
			return getRuleContext(LineaComandoContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(CmdParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(CmdParser.PUNTO_COMA, i);
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NMAP) | (1L << SS) | (1L << TCPDUMP) | (1L << CURL) | (1L << DIG) | (1L << JOURNALCTL) | (1L << GREP) | (1L << UFW) | (1L << SUDO))) != 0)) {
				{
				{
				setState(10);
				lineaComando();
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA) {
					{
					setState(11);
					match(PUNTO_COMA);
					}
				}

				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
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

	public static class LineaComandoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode SUDO() { return getToken(CmdParser.SUDO, 0); }
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public List<OpcionContext> opcion() {
			return getRuleContexts(OpcionContext.class);
		}
		public OpcionContext opcion(int i) {
			return getRuleContext(OpcionContext.class,i);
		}
		public LineaComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineaComando; }
	}

	public final LineaComandoContext lineaComando() throws RecognitionException {
		LineaComandoContext _localctx = new LineaComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lineaComando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUDO) {
				{
				setState(21);
				match(SUDO);
				}
			}

			setState(24);
			comando();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPCION_CORTA) | (1L << OPCION_LARGA) | (1L << IP) | (1L << CIDR) | (1L << RUTA) | (1L << DOMINIO) | (1L << TEXTO) | (1L << CADENA) | (1L << PALABRA_CLAVE))) != 0)) {
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IP:
				case CIDR:
				case RUTA:
				case DOMINIO:
				case TEXTO:
				case CADENA:
				case PALABRA_CLAVE:
					{
					setState(25);
					argumento();
					}
					break;
				case OPCION_CORTA:
				case OPCION_LARGA:
					{
					setState(26);
					opcion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31);
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

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode NMAP() { return getToken(CmdParser.NMAP, 0); }
		public TerminalNode SS() { return getToken(CmdParser.SS, 0); }
		public TerminalNode TCPDUMP() { return getToken(CmdParser.TCPDUMP, 0); }
		public TerminalNode CURL() { return getToken(CmdParser.CURL, 0); }
		public TerminalNode DIG() { return getToken(CmdParser.DIG, 0); }
		public TerminalNode JOURNALCTL() { return getToken(CmdParser.JOURNALCTL, 0); }
		public TerminalNode GREP() { return getToken(CmdParser.GREP, 0); }
		public TerminalNode UFW() { return getToken(CmdParser.UFW, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NMAP) | (1L << SS) | (1L << TCPDUMP) | (1L << CURL) | (1L << DIG) | (1L << JOURNALCTL) | (1L << GREP) | (1L << UFW))) != 0)) ) {
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

	public static class OpcionContext extends ParserRuleContext {
		public TerminalNode OPCION_CORTA() { return getToken(CmdParser.OPCION_CORTA, 0); }
		public TerminalNode OPCION_LARGA() { return getToken(CmdParser.OPCION_LARGA, 0); }
		public OpcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion; }
	}

	public final OpcionContext opcion() throws RecognitionException {
		OpcionContext _localctx = new OpcionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_opcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==OPCION_CORTA || _la==OPCION_LARGA) ) {
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

	public static class ArgumentoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(CmdParser.TEXTO, 0); }
		public TerminalNode CADENA() { return getToken(CmdParser.CADENA, 0); }
		public TerminalNode RUTA() { return getToken(CmdParser.RUTA, 0); }
		public TerminalNode IP() { return getToken(CmdParser.IP, 0); }
		public TerminalNode CIDR() { return getToken(CmdParser.CIDR, 0); }
		public TerminalNode DOMINIO() { return getToken(CmdParser.DOMINIO, 0); }
		public TerminalNode PALABRA_CLAVE() { return getToken(CmdParser.PALABRA_CLAVE, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IP) | (1L << CIDR) | (1L << RUTA) | (1L << DOMINIO) | (1L << TEXTO) | (1L << CADENA) | (1L << PALABRA_CLAVE))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\2\3\2\3\3\5\3\31\n\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\5\3\2\3\n\3\2\f\r\3\2\16\24\2"+
		"(\2\22\3\2\2\2\4\30\3\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n&\3\2\2\2\f\16\5\4"+
		"\3\2\r\17\7\25\2\2\16\r\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2\20\f\3\2\2"+
		"\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2"+
		"\2\25\26\7\2\2\3\26\3\3\2\2\2\27\31\7\13\2\2\30\27\3\2\2\2\30\31\3\2\2"+
		"\2\31\32\3\2\2\2\32\37\5\6\4\2\33\36\5\n\6\2\34\36\5\b\5\2\35\33\3\2\2"+
		"\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\37"+
		"\3\2\2\2\"#\t\2\2\2#\7\3\2\2\2$%\t\3\2\2%\t\3\2\2\2&\'\t\4\2\2\'\13\3"+
		"\2\2\2\7\16\22\30\35\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}