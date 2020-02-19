// Generated from tmp/PlayPlus.g4 by ANTLR 4.6
package tmp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, QUOTE=2, MAPFILE=3, MAIN=4, AS=5, FUNCTION=6, LPAR=7, RPAR=8, 
		COLON=9, VOID=10, DO=11, END=12, ID=13, NUMBER=14, COMMENT=15, NEWLINE=16, 
		WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IMPORT", "QUOTE", "MAPFILE", "MAIN", "AS", "FUNCTION", "LPAR", "RPAR", 
		"COLON", "VOID", "DO", "END", "ID", "NUMBER", "LETTER", "DIGIT", "COMMENT", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#import'", "'\"'", null, "'main'", "'as'", "'function'", "'('", 
		"')'", "':'", "'void'", "'do'", "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "QUOTE", "MAPFILE", "MAIN", "AS", "FUNCTION", "LPAR", 
		"RPAR", "COLON", "VOID", "DO", "END", "ID", "NUMBER", "COMMENT", "NEWLINE", 
		"WS"
	};
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


	public PlayPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\6\4\65\n\4\r\4\16\4\66\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16d"+
		"\n\16\f\16\16\16g\13\16\3\17\6\17j\n\17\r\17\16\17k\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\7\22v\n\22\f\22\16\22y\13\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\5\23\u0081\n\23\3\23\3\23\3\23\3\23\3\24\6\24\u0088\n\24\r"+
		"\24\16\24\u0089\3\24\3\24\3w\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\21%\22\'\23\3\2\4\4\2C\\c|\4"+
		"\2\13\13\"\"\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\61\3\2\2\2\7\64\3\2\2\2\t=\3\2\2\2\13"+
		"B\3\2\2\2\rE\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27"+
		"Y\3\2\2\2\31\\\3\2\2\2\33`\3\2\2\2\35i\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#"+
		"q\3\2\2\2%\u0080\3\2\2\2\'\u0087\3\2\2\2)*\7%\2\2*+\7k\2\2+,\7o\2\2,-"+
		"\7r\2\2-.\7q\2\2./\7t\2\2/\60\7v\2\2\60\4\3\2\2\2\61\62\7$\2\2\62\6\3"+
		"\2\2\2\63\65\5\33\16\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\678\3\2\2\289\7\60\2\29:\7o\2\2:;\7c\2\2;<\7r\2\2<\b\3\2\2\2"+
		"=>\7o\2\2>?\7c\2\2?@\7k\2\2@A\7p\2\2A\n\3\2\2\2BC\7c\2\2CD\7u\2\2D\f\3"+
		"\2\2\2EF\7h\2\2FG\7w\2\2GH\7p\2\2HI\7e\2\2IJ\7v\2\2JK\7k\2\2KL\7q\2\2"+
		"LM\7p\2\2M\16\3\2\2\2NO\7*\2\2O\20\3\2\2\2PQ\7+\2\2Q\22\3\2\2\2RS\7<\2"+
		"\2S\24\3\2\2\2TU\7x\2\2UV\7q\2\2VW\7k\2\2WX\7f\2\2X\26\3\2\2\2YZ\7f\2"+
		"\2Z[\7q\2\2[\30\3\2\2\2\\]\7g\2\2]^\7p\2\2^_\7f\2\2_\32\3\2\2\2`e\5\37"+
		"\20\2ad\5\37\20\2bd\5!\21\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef"+
		"\3\2\2\2f\34\3\2\2\2ge\3\2\2\2hj\5!\21\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\36\3\2\2\2mn\t\2\2\2n \3\2\2\2op\4\62;\2p\"\3\2\2\2qr\7\61"+
		"\2\2rs\7,\2\2sw\3\2\2\2tv\13\2\2\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2"+
		"\2\2xz\3\2\2\2yw\3\2\2\2z{\7,\2\2{|\7\61\2\2|}\3\2\2\2}~\b\22\2\2~$\3"+
		"\2\2\2\177\u0081\7\17\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\23"+
		"\2\2\u0085&\3\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\24\2\2\u008c(\3\2\2\2\n\2\66cekw\u0080\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}