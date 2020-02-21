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
		NUMBER=1, COMMENT_MULTILINE=2, COMMENT_SINGLELINE=3, NEWLINE=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUMBER", "LETTER", "DIGIT", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7C\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5\37\n\5\f\5\16\5\"\13\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\6\3\6\3\6\3\6"+
		"\3\7\5\7\67\n\7\3\7\3\7\3\7\3\7\3\b\6\b>\n\b\r\b\16\b?\3\b\3\b\4 .\2\t"+
		"\3\3\5\2\7\2\t\4\13\5\r\6\17\7\3\2\4\4\2C\\c|\4\2\13\13\"\"E\2\3\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\22\3\2\2\2\5\26"+
		"\3\2\2\2\7\30\3\2\2\2\t\32\3\2\2\2\13(\3\2\2\2\r\66\3\2\2\2\17=\3\2\2"+
		"\2\21\23\5\7\4\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2"+
		"\2\25\4\3\2\2\2\26\27\t\2\2\2\27\6\3\2\2\2\30\31\4\62;\2\31\b\3\2\2\2"+
		"\32\33\7\61\2\2\33\34\7,\2\2\34 \3\2\2\2\35\37\13\2\2\2\36\35\3\2\2\2"+
		"\37\"\3\2\2\2 !\3\2\2\2 \36\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7,\2\2$%\7"+
		"\61\2\2%&\3\2\2\2&\'\b\5\2\2\'\n\3\2\2\2()\7\61\2\2)*\7\61\2\2*.\3\2\2"+
		"\2+-\13\2\2\2,+\3\2\2\2-\60\3\2\2\2./\3\2\2\2.,\3\2\2\2/\61\3\2\2\2\60"+
		".\3\2\2\2\61\62\5\r\7\2\62\63\3\2\2\2\63\64\b\6\2\2\64\f\3\2\2\2\65\67"+
		"\7\17\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\f\2\29:\3\2\2\2"+
		":;\b\7\2\2;\16\3\2\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2"+
		"\2@A\3\2\2\2AB\b\b\2\2B\20\3\2\2\2\b\2\24 .\66?\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}