// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/PlayPlus.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AFFECT=1, LPAR=2, RPAR=3, COMMA=4, PLUS=5, MINUS=6, ID=7, NUMBER=8, COMMENT=9, 
		NEWLINE=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "ID", "NUMBER", "LETTER", 
			"DIGIT", "COMMENT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'affect'", "'('", "')'", "','", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "ID", "NUMBER", 
			"COMMENT", "NEWLINE", "WS"
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b\62\n\b\f\b\16\b\65\13\b\3"+
		"\t\6\t8\n\t\r\t\16\t9\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fD\n\f\f\f\16"+
		"\fG\13\f\3\f\3\f\3\f\3\f\3\f\3\r\5\rO\n\r\3\r\3\r\3\r\3\r\3\16\6\16V\n"+
		"\16\r\16\16\16W\3\16\3\16\3E\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\2\25\2\27\13\31\f\33\r\3\2\4\4\2C\\c|\4\2\13\13\"\"\2^\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5"+
		"$\3\2\2\2\7&\3\2\2\2\t(\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21"+
		"\67\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31N\3\2\2\2\33U\3\2\2"+
		"\2\35\36\7c\2\2\36\37\7h\2\2\37 \7h\2\2 !\7g\2\2!\"\7e\2\2\"#\7v\2\2#"+
		"\4\3\2\2\2$%\7*\2\2%\6\3\2\2\2&\'\7+\2\2\'\b\3\2\2\2()\7.\2\2)\n\3\2\2"+
		"\2*+\7-\2\2+\f\3\2\2\2,-\7/\2\2-\16\3\2\2\2.\63\5\23\n\2/\62\5\23\n\2"+
		"\60\62\5\25\13\2\61/\3\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\20\3\2\2\2\65\63\3\2\2\2\668\5\25\13\2\67\66\3\2\2\2"+
		"89\3\2\2\29\67\3\2\2\29:\3\2\2\2:\22\3\2\2\2;<\t\2\2\2<\24\3\2\2\2=>\4"+
		"\62;\2>\26\3\2\2\2?@\7\61\2\2@A\7,\2\2AE\3\2\2\2BD\13\2\2\2CB\3\2\2\2"+
		"DG\3\2\2\2EF\3\2\2\2EC\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7,\2\2IJ\7\61\2\2"+
		"JK\3\2\2\2KL\b\f\2\2L\30\3\2\2\2MO\7\17\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2"+
		"\2\2PQ\7\f\2\2QR\3\2\2\2RS\b\r\2\2S\32\3\2\2\2TV\t\3\2\2UT\3\2\2\2VW\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\16\2\2Z\34\3\2\2\2\t\2\61\63"+
		"9ENW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}