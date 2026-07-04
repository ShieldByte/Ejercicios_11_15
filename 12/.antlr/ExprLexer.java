// Generated from c:\Ejercicios\poo_11_5\12\Expr.g4 by ANTLR 4.9.2
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
		SYSTEM=9, OUT=10, PRINTLN=11, IF=12, ID=13, NUM=14, CADENA=15, SUMA=16, 
		RESTA=17, MAYOR_IGUAL=18, ASIGNAR=19, PUNTOCOMA=20, PAR_IZQ=21, PAR_DER=22, 
		LLAVE_IZQ=23, LLAVE_DER=24, COR_IZQ=25, COR_DER=26, PUNTO=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "STRING", "INT", 
			"SYSTEM", "OUT", "PRINTLN", "IF", "ID", "NUM", "CADENA", "SUMA", "RESTA", 
			"MAYOR_IGUAL", "ASIGNAR", "PUNTOCOMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "COR_IZQ", "COR_DER", "PUNTO", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00c2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\7\16\u0090\n\16\f\16\16\16\u0093"+
		"\13\16\3\17\6\17\u0096\n\17\r\17\16\17\u0097\3\20\3\20\7\20\u009c\n\20"+
		"\f\20\16\20\u009f\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\6\35\u00bd\n\35\r\35\16\35\u00be\3\35\3\35\3\u009d"+
		"\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		"\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00c5\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2"+
		"\2\2\5N\3\2\2\2\7U\3\2\2\2\t[\3\2\2\2\13b\3\2\2\2\rg\3\2\2\2\17l\3\2\2"+
		"\2\21s\3\2\2\2\23w\3\2\2\2\25~\3\2\2\2\27\u0082\3\2\2\2\31\u008a\3\2\2"+
		"\2\33\u008d\3\2\2\2\35\u0095\3\2\2\2\37\u0099\3\2\2\2!\u00a2\3\2\2\2#"+
		"\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a9\3\2\2\2)\u00ab\3\2\2\2+\u00ad\3"+
		"\2\2\2-\u00af\3\2\2\2/\u00b1\3\2\2\2\61\u00b3\3\2\2\2\63\u00b5\3\2\2\2"+
		"\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bc\3\2\2\2;<\7U\2\2<=\7{\2\2=>"+
		"\7u\2\2>?\7v\2\2?@\7g\2\2@A\7o\2\2AB\7\60\2\2BC\7q\2\2CD\7w\2\2DE\7v\2"+
		"\2EF\7\60\2\2FG\7r\2\2GH\7t\2\2HI\7k\2\2IJ\7p\2\2JK\7v\2\2KL\7n\2\2LM"+
		"\7p\2\2M\4\3\2\2\2NO\7r\2\2OP\7w\2\2PQ\7d\2\2QR\7n\2\2RS\7k\2\2ST\7e\2"+
		"\2T\6\3\2\2\2UV\7e\2\2VW\7n\2\2WX\7c\2\2XY\7u\2\2YZ\7u\2\2Z\b\3\2\2\2"+
		"[\\\7u\2\2\\]\7v\2\2]^\7c\2\2^_\7v\2\2_`\7k\2\2`a\7e\2\2a\n\3\2\2\2bc"+
		"\7x\2\2cd\7q\2\2de\7k\2\2ef\7f\2\2f\f\3\2\2\2gh\7o\2\2hi\7c\2\2ij\7k\2"+
		"\2jk\7p\2\2k\16\3\2\2\2lm\7U\2\2mn\7v\2\2no\7t\2\2op\7k\2\2pq\7p\2\2q"+
		"r\7i\2\2r\20\3\2\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2v\22\3\2\2\2wx\7U\2\2x"+
		"y\7{\2\2yz\7u\2\2z{\7v\2\2{|\7g\2\2|}\7o\2\2}\24\3\2\2\2~\177\7q\2\2\177"+
		"\u0080\7w\2\2\u0080\u0081\7v\2\2\u0081\26\3\2\2\2\u0082\u0083\7r\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v\2\2"+
		"\u0087\u0088\7n\2\2\u0088\u0089\7p\2\2\u0089\30\3\2\2\2\u008a\u008b\7"+
		"k\2\2\u008b\u008c\7h\2\2\u008c\32\3\2\2\2\u008d\u0091\t\2\2\2\u008e\u0090"+
		"\t\3\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\34\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\t\4\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\36\3\2\2\2\u0099\u009d\7$\2\2\u009a\u009c\13\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1"+
		" \3\2\2\2\u00a2\u00a3\7-\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5"+
		"$\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8\7?\2\2\u00a8&\3\2\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7"+
		"*\2\2\u00ae,\3\2\2\2\u00af\u00b0\7+\2\2\u00b0.\3\2\2\2\u00b1\u00b2\7}"+
		"\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4\62\3\2\2\2\u00b5\u00b6"+
		"\7]\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7_\2\2\u00b8\66\3\2\2\2\u00b9\u00ba"+
		"\7\60\2\2\u00ba8\3\2\2\2\u00bb\u00bd\t\5\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\b\35\2\2\u00c1:\3\2\2\2\7\2\u0091\u0097\u009d\u00be\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}