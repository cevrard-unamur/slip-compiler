// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/PlayPlusWords.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, QUOTE=2, MAPFILE=3, MAIN=4, AS=5, FUNCTION=6, LPAR=7, RPAR=8, 
		COLON=9, VOID=10, DO=11, END=12, ID=13, NUMBER=14, COMMENT_MULTILINE=15, 
		COMMENT_SINGLELINE=16, NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "QUOTE", "MAPFILE", "MAIN", "AS", "FUNCTION", "LPAR", "RPAR", 
			"COLON", "VOID", "DO", "END", "ID", "NUMBER", "LETTER", "DIGIT", "COMMENT_MULTILINE", 
			"COMMENT_SINGLELINE", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#import'", "'\"'", null, "'main'", "'as'", "'function'", "'('", 
			"')'", "':'", "'void'", "'do'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "QUOTE", "MAPFILE", "MAIN", "AS", "FUNCTION", "LPAR", 
			"RPAR", "COLON", "VOID", "DO", "END", "ID", "NUMBER", "COMMENT_MULTILINE", 
			"COMMENT_SINGLELINE", "NEWLINE", "WS"
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


	public PlayPlusWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlusWords.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\6\4\67\n\4\r\4\16\48\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\7\16f\n\16\f\16\16\16i\13\16\3\17\6\17l\n\17\r\17\16\17m\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\7\22x\n\22\f\22\16\22{\13\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0086\n\23\f\23\16\23\u0089\13"+
		"\23\3\23\3\23\3\23\3\23\3\24\5\24\u0090\n\24\3\24\3\24\3\24\3\24\3\25"+
		"\6\25\u0097\n\25\r\25\16\25\u0098\3\25\3\25\4y\u0087\2\26\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\21"+
		"%\22\'\23)\24\3\2\4\4\2C\\c|\4\2\13\13\"\"\2\u00a1\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2"+
		"\2\2\5\63\3\2\2\2\7\66\3\2\2\2\t?\3\2\2\2\13D\3\2\2\2\rG\3\2\2\2\17P\3"+
		"\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27[\3\2\2\2\31^\3\2\2\2\33"+
		"b\3\2\2\2\35k\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%\u0081\3\2\2\2\'"+
		"\u008f\3\2\2\2)\u0096\3\2\2\2+,\7%\2\2,-\7k\2\2-.\7o\2\2./\7r\2\2/\60"+
		"\7q\2\2\60\61\7t\2\2\61\62\7v\2\2\62\4\3\2\2\2\63\64\7$\2\2\64\6\3\2\2"+
		"\2\65\67\5\33\16\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3"+
		"\2\2\2:;\7\60\2\2;<\7o\2\2<=\7c\2\2=>\7r\2\2>\b\3\2\2\2?@\7o\2\2@A\7c"+
		"\2\2AB\7k\2\2BC\7p\2\2C\n\3\2\2\2DE\7c\2\2EF\7u\2\2F\f\3\2\2\2GH\7h\2"+
		"\2HI\7w\2\2IJ\7p\2\2JK\7e\2\2KL\7v\2\2LM\7k\2\2MN\7q\2\2NO\7p\2\2O\16"+
		"\3\2\2\2PQ\7*\2\2Q\20\3\2\2\2RS\7+\2\2S\22\3\2\2\2TU\7<\2\2U\24\3\2\2"+
		"\2VW\7x\2\2WX\7q\2\2XY\7k\2\2YZ\7f\2\2Z\26\3\2\2\2[\\\7f\2\2\\]\7q\2\2"+
		"]\30\3\2\2\2^_\7g\2\2_`\7p\2\2`a\7f\2\2a\32\3\2\2\2bg\5\37\20\2cf\5\37"+
		"\20\2df\5!\21\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\34"+
		"\3\2\2\2ig\3\2\2\2jl\5!\21\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n"+
		"\36\3\2\2\2op\t\2\2\2p \3\2\2\2qr\4\62;\2r\"\3\2\2\2st\7\61\2\2tu\7,\2"+
		"\2uy\3\2\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3\2\2\2z|\3\2"+
		"\2\2{y\3\2\2\2|}\7,\2\2}~\7\61\2\2~\177\3\2\2\2\177\u0080\b\22\2\2\u0080"+
		"$\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7\61\2\2\u0083\u0087\3\2\2"+
		"\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008b\5\'\24\2\u008b\u008c\3\2\2\2\u008c\u008d\b\23\2\2\u008d"+
		"&\3\2\2\2\u008e\u0090\7\17\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\7\f\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\b\24\2\2\u0094(\3\2\2\2\u0095\u0097\t\3\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\b\25\2\2\u009b*\3\2\2\2\13\28egmy\u0087\u008f\u0098\3"+
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