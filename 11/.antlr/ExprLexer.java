// Generated from c:\Ejercicios\poo_11_5\11\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PUBLIC=2, CLASS=3, STATIC=4, VOID=5, MAIN=6, STRING=7, INT=8, 
		SYSTEM=9, OUT=10, PRINTLN=11, ID=12, NUM=13, CADENA=14, SUMA=15, RESTA=16, 
		ASIGNAR=17, PUNTOCOMA=18, PAR_IZQ=19, PAR_DER=20, LLAVE_IZQ=21, LLAVE_DER=22, 
		COR_IZQ=23, COR_DER=24, PUNTO=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "STRING", "INT", 
			"SYSTEM", "OUT", "PRINTLN", "ID", "NUM", "CADENA", "SUMA", "RESTA", "ASIGNAR", 
			"PUNTOCOMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "COR_IZQ", 
			"COR_DER", "PUNTO", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\7\r\u0089\n\r\f\r\16\r\u008c\13\r\3\16\6\16\u008f\n\16\r\16\16\16"+
		"\u0090\3\17\3\17\7\17\u0095\n\17\f\17\16\17\u0098\13\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33\u00b3\n\33\r\33\16\33\u00b4"+
		"\3\33\3\33\3\u0096\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5J\3\2\2"+
		"\2\7Q\3\2\2\2\tW\3\2\2\2\13^\3\2\2\2\rc\3\2\2\2\17h\3\2\2\2\21o\3\2\2"+
		"\2\23s\3\2\2\2\25z\3\2\2\2\27~\3\2\2\2\31\u0086\3\2\2\2\33\u008e\3\2\2"+
		"\2\35\u0092\3\2\2\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1"+
		"\3\2\2\2\'\u00a3\3\2\2\2)\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2"+
		"/\u00ab\3\2\2\2\61\u00ad\3\2\2\2\63\u00af\3\2\2\2\65\u00b2\3\2\2\2\67"+
		"8\7U\2\289\7{\2\29:\7u\2\2:;\7v\2\2;<\7g\2\2<=\7o\2\2=>\7\60\2\2>?\7q"+
		"\2\2?@\7w\2\2@A\7v\2\2AB\7\60\2\2BC\7r\2\2CD\7t\2\2DE\7k\2\2EF\7p\2\2"+
		"FG\7v\2\2GH\7n\2\2HI\7p\2\2I\4\3\2\2\2JK\7r\2\2KL\7w\2\2LM\7d\2\2MN\7"+
		"n\2\2NO\7k\2\2OP\7e\2\2P\6\3\2\2\2QR\7e\2\2RS\7n\2\2ST\7c\2\2TU\7u\2\2"+
		"UV\7u\2\2V\b\3\2\2\2WX\7u\2\2XY\7v\2\2YZ\7c\2\2Z[\7v\2\2[\\\7k\2\2\\]"+
		"\7e\2\2]\n\3\2\2\2^_\7x\2\2_`\7q\2\2`a\7k\2\2ab\7f\2\2b\f\3\2\2\2cd\7"+
		"o\2\2de\7c\2\2ef\7k\2\2fg\7p\2\2g\16\3\2\2\2hi\7U\2\2ij\7v\2\2jk\7t\2"+
		"\2kl\7k\2\2lm\7p\2\2mn\7i\2\2n\20\3\2\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2r"+
		"\22\3\2\2\2st\7U\2\2tu\7{\2\2uv\7u\2\2vw\7v\2\2wx\7g\2\2xy\7o\2\2y\24"+
		"\3\2\2\2z{\7q\2\2{|\7w\2\2|}\7v\2\2}\26\3\2\2\2~\177\7r\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7p\2\2\u0085\30\3\2\2\2\u0086\u008a\t\2\2\2"+
		"\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\32\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\34\3\2\2\2\u0092\u0096\7$\2\2\u0093\u0095"+
		"\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a"+
		"\7$\2\2\u009a\36\3\2\2\2\u009b\u009c\7-\2\2\u009c \3\2\2\2\u009d\u009e"+
		"\7/\2\2\u009e\"\3\2\2\2\u009f\u00a0\7?\2\2\u00a0$\3\2\2\2\u00a1\u00a2"+
		"\7=\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7*\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7"+
		"+\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7\177"+
		"\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7]\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7"+
		"_\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7\60\2\2\u00b0\64\3\2\2\2\u00b1\u00b3"+
		"\t\5\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\33\2\2\u00b7\66\3\2\2"+
		"\2\7\2\u008a\u0090\u0096\u00b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}