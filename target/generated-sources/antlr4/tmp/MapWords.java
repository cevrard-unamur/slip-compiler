// Generated from tmp/MapWords.g4 by ANTLR 4.6
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
public class MapWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAP=1, ROBOT=2, NUMBER=3, COMMENT_MULTILINE=4, COMMENT_SINGLELINE=5, NEWLINE=6, 
		WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MAP", "ROBOT", "NUMBER", "LETTER", "DIGIT", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAP", "ROBOT", "NUMBER", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", 
		"NEWLINE", "WS"
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


	public MapWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MapWords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tM\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\6\4\35\n\4\r\4\16\4\36\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\7\7)\n\7\f\7\16\7,\13\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b"+
		"\67\n\b\f\b\16\b:\13\b\3\b\3\b\3\b\3\b\3\t\5\tA\n\t\3\t\3\t\3\t\3\t\3"+
		"\n\6\nH\n\n\r\n\16\nI\3\n\3\n\4*8\2\13\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21"+
		"\b\23\t\3\2\4\4\2C\\c|\4\2\13\13\"\"O\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5"+
		"\31\3\2\2\2\7\34\3\2\2\2\t \3\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17\62\3\2"+
		"\2\2\21@\3\2\2\2\23G\3\2\2\2\25\26\7o\2\2\26\27\7c\2\2\27\30\7r\2\2\30"+
		"\4\3\2\2\2\31\32\7B\2\2\32\6\3\2\2\2\33\35\5\13\6\2\34\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\b\3\2\2\2 !\t\2\2\2!\n\3\2\2\2"+
		"\"#\4\62;\2#\f\3\2\2\2$%\7\61\2\2%&\7,\2\2&*\3\2\2\2\')\13\2\2\2(\'\3"+
		"\2\2\2),\3\2\2\2*+\3\2\2\2*(\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7,\2\2./\7"+
		"\61\2\2/\60\3\2\2\2\60\61\b\7\2\2\61\16\3\2\2\2\62\63\7\61\2\2\63\64\7"+
		"\61\2\2\648\3\2\2\2\65\67\13\2\2\2\66\65\3\2\2\2\67:\3\2\2\289\3\2\2\2"+
		"8\66\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\5\21\t\2<=\3\2\2\2=>\b\b\2\2>\20\3"+
		"\2\2\2?A\7\17\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\f\2\2CD\3\2\2\2DE"+
		"\b\t\2\2E\22\3\2\2\2FH\t\3\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"JK\3\2\2\2KL\b\n\2\2L\24\3\2\2\2\b\2\36*8@I\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}