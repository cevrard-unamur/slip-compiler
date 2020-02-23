// Generated from tmp/CommonWords.g4 by ANTLR 4.6
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
public class CommonWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, NUMBER=2, COMMENT_MULTILINE=3, COMMENT_SINGLELINE=4, NEWLINE=5, 
		WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COLON", "NUMBER", "LETTER", "DIGIT", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COLON", "NUMBER", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", 
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


	public CommonWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonWords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bR\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\6\3"+
		"\27\n\3\r\3\16\3\30\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6#\n\6\f\6\16\6"+
		"&\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\5\7A\n\7\3\7\3\7\3\b"+
		"\5\bF\n\b\3\b\3\b\3\b\3\b\3\t\6\tM\n\t\r\t\16\tN\3\t\3\t\5$\62<\2\n\3"+
		"\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\3\2\4\4\2C\\c|\4\2\13\13\"\"V\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\3\23\3\2\2\2\5\26\3\2\2\2\7\32\3\2\2\2\t\34\3\2\2\2\13\36\3\2\2\2\r@"+
		"\3\2\2\2\17E\3\2\2\2\21L\3\2\2\2\23\24\7<\2\2\24\4\3\2\2\2\25\27\5\t\5"+
		"\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\6\3\2\2"+
		"\2\32\33\t\2\2\2\33\b\3\2\2\2\34\35\4\62;\2\35\n\3\2\2\2\36\37\7\61\2"+
		"\2\37 \7,\2\2 $\3\2\2\2!#\13\2\2\2\"!\3\2\2\2#&\3\2\2\2$%\3\2\2\2$\"\3"+
		"\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7,\2\2()\7\61\2\2)*\3\2\2\2*+\b\6\2\2+"+
		"\f\3\2\2\2,-\7\61\2\2-.\7\61\2\2.\62\3\2\2\2/\61\13\2\2\2\60/\3\2\2\2"+
		"\61\64\3\2\2\2\62\63\3\2\2\2\62\60\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2"+
		"\65A\5\17\b\2\66\67\7\61\2\2\678\7\61\2\28<\3\2\2\29;\13\2\2\2:9\3\2\2"+
		"\2;>\3\2\2\2<=\3\2\2\2<:\3\2\2\2=?\3\2\2\2><\3\2\2\2?A\7\17\2\2@,\3\2"+
		"\2\2@\66\3\2\2\2AB\3\2\2\2BC\b\7\2\2C\16\3\2\2\2DF\7\17\2\2ED\3\2\2\2"+
		"EF\3\2\2\2FG\3\2\2\2GH\7\f\2\2HI\3\2\2\2IJ\b\b\2\2J\20\3\2\2\2KM\t\3\2"+
		"\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\t\2\2Q\22\3\2"+
		"\2\2\n\2\30$\62<@EN\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}