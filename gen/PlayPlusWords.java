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
		IMPORT=1, MAPFILE=2, LPAR=3, RPAR=4, COLON=5, COMMA=6, SEMICOLON=7, RBRA=8, 
		LBRA=9, AS=10, EQUAL=11, QUOTE=12, SINGLE_QUOTE=13, ASSIGN=14, MAIN=15, 
		FUNCTION=16, VOID=17, DO=18, END=19, CONST=20, ENUM=21, PLUS=22, MINUS=23, 
		MULTI=24, DIV=25, MOD=26, TRUE=27, FALSE=28, AND=29, OR=30, NOT=31, LESS=32, 
		LESS_EQUAL=33, GREAT=34, GREAT_EQUAL=35, NOT_EQUAL=36, LEFT=37, RIGHT=38, 
		UP=39, DOWN=40, JUMP=41, FIGHT=42, DIG=43, SCALAR=44, RECORD=45, ID=46, 
		STRING=47, CHAR=48, NUMBER=49, COMMENT_MULTILINE=50, COMMENT_SINGLELINE=51, 
		NEWLINE=52, WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "MAPFILE", "LPAR", "RPAR", "COLON", "COMMA", "SEMICOLON", "RBRA", 
			"LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
			"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
			"GREAT_EQUAL", "NOT_EQUAL", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
			"DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR", "NUMBER", "LETTER", 
			"DIGIT", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#import'", null, "'('", "')'", "':'", "','", "';'", "']'", "'['", 
			"'as'", "'='", "'\"'", "'''", "':='", "'main'", "'function'", "'void'", 
			"'do'", "'end'", "'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'true'", "'false'", "'and'", "'or'", "'not'", "'<'", "'<='", "'>'", 
			"'>='", "'<>'", "'left'", "'right'", "'up'", "'down'", "'jump'", "'fight'", 
			"'dig'", null, "'record'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COLON", "COMMA", "SEMICOLON", 
			"RBRA", "LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", 
			"FUNCTION", "VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", 
			"DIV", "MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", 
			"GREAT", "GREAT_EQUAL", "NOT_EQUAL", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", 
			"FIGHT", "DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR", "NUMBER", 
			"COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0178\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0120\n-\3."+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\7/\u012c\n/\f/\16/\u012f\13/\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u0136\n\60\3\60\7\60\u0139\n\60\f\60\16\60\u013c\13\60"+
		"\3\60\3\60\3\61\3\61\3\61\5\61\u0143\n\61\3\61\3\61\3\62\6\62\u0148\n"+
		"\62\r\62\16\62\u0149\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0154"+
		"\n\65\f\65\16\65\u0157\13\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\7\66\u0162\n\66\f\66\16\66\u0165\13\66\3\66\3\66\3\66\3\66\3\67\5"+
		"\67\u016c\n\67\3\67\3\67\3\67\3\67\38\68\u0173\n8\r8\168\u0174\38\38\4"+
		"\u0155\u0163\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2"+
		"g\2i\64k\65m\66o\67\3\2\4\4\2\13\13\"\"\4\2C\\c|\2\u0184\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5y\3\2\2\2\7"+
		"\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u0087"+
		"\3\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2\2\27\u0090\3"+
		"\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2\35\u0096\3\2\2\2\37\u0099\3\2"+
		"\2\2!\u009e\3\2\2\2#\u00a7\3\2\2\2%\u00ac\3\2\2\2\'\u00af\3\2\2\2)\u00b3"+
		"\3\2\2\2+\u00b9\3\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2"+
		"\63\u00c4\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00cd\3\2\2\2;\u00d3"+
		"\3\2\2\2=\u00d7\3\2\2\2?\u00da\3\2\2\2A\u00de\3\2\2\2C\u00e0\3\2\2\2E"+
		"\u00e3\3\2\2\2G\u00e5\3\2\2\2I\u00e8\3\2\2\2K\u00eb\3\2\2\2M\u00f0\3\2"+
		"\2\2O\u00f6\3\2\2\2Q\u00f9\3\2\2\2S\u00fe\3\2\2\2U\u0103\3\2\2\2W\u0109"+
		"\3\2\2\2Y\u011f\3\2\2\2[\u0121\3\2\2\2]\u0128\3\2\2\2_\u0130\3\2\2\2a"+
		"\u013f\3\2\2\2c\u0147\3\2\2\2e\u014b\3\2\2\2g\u014d\3\2\2\2i\u014f\3\2"+
		"\2\2k\u015d\3\2\2\2m\u016b\3\2\2\2o\u0172\3\2\2\2qr\7%\2\2rs\7k\2\2st"+
		"\7o\2\2tu\7r\2\2uv\7q\2\2vw\7t\2\2wx\7v\2\2x\4\3\2\2\2yz\5]/\2z{\7\60"+
		"\2\2{|\7o\2\2|}\7c\2\2}~\7r\2\2~\6\3\2\2\2\177\u0080\7*\2\2\u0080\b\3"+
		"\2\2\2\u0081\u0082\7+\2\2\u0082\n\3\2\2\2\u0083\u0084\7<\2\2\u0084\f\3"+
		"\2\2\2\u0085\u0086\7.\2\2\u0086\16\3\2\2\2\u0087\u0088\7=\2\2\u0088\20"+
		"\3\2\2\2\u0089\u008a\7_\2\2\u008a\22\3\2\2\2\u008b\u008c\7]\2\2\u008c"+
		"\24\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f\7u\2\2\u008f\26\3\2\2\2\u0090"+
		"\u0091\7?\2\2\u0091\30\3\2\2\2\u0092\u0093\7$\2\2\u0093\32\3\2\2\2\u0094"+
		"\u0095\7)\2\2\u0095\34\3\2\2\2\u0096\u0097\7<\2\2\u0097\u0098\7?\2\2\u0098"+
		"\36\3\2\2\2\u0099\u009a\7o\2\2\u009a\u009b\7c\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7p\2\2\u009d \3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7q\2\2\u00a5\u00a6\7p\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7x"+
		"\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7f\2\2\u00ab$\3"+
		"\2\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7q\2\2\u00ae&\3\2\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7f\2\2\u00b2(\3\2\2\2\u00b3\u00b4"+
		"\7e\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7u\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7w\2\2\u00bc\u00bd\7o\2\2\u00bd,\3\2\2\2\u00be\u00bf\7-\2\2\u00bf"+
		".\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3"+
		"\62\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7\'\2\2"+
		"\u00c7\66\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7"+
		"w\2\2\u00cb\u00cc\7g\2\2\u00cc8\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		":\3\2\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7f\2\2\u00d6"+
		"<\3\2\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9>\3\2\2\2\u00da\u00db"+
		"\7p\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7v\2\2\u00dd@\3\2\2\2\u00de\u00df"+
		"\7>\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e2\7?\2\2\u00e2D\3"+
		"\2\2\2\u00e3\u00e4\7@\2\2\u00e4F\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6\u00e7"+
		"\7?\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7@\2\2\u00eaJ\3"+
		"\2\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7h\2\2\u00ee"+
		"\u00ef\7v\2\2\u00efL\3\2\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7i\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f5\7v\2\2\u00f5N\3\2\2\2\u00f6"+
		"\u00f7\7w\2\2\u00f7\u00f8\7r\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7f\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb\u00fc\7y\2\2\u00fc\u00fd\7p\2\2\u00fdR\3\2\2\2\u00fe"+
		"\u00ff\7l\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7o\2\2\u0101\u0102\7r\2\2"+
		"\u0102T\3\2\2\2\u0103\u0104\7h\2\2\u0104\u0105\7k\2\2\u0105\u0106\7i\2"+
		"\2\u0106\u0107\7j\2\2\u0107\u0108\7v\2\2\u0108V\3\2\2\2\u0109\u010a\7"+
		"f\2\2\u010a\u010b\7k\2\2\u010b\u010c\7i\2\2\u010cX\3\2\2\2\u010d\u010e"+
		"\7d\2\2\u010e\u010f\7q\2\2\u010f\u0110\7q\2\2\u0110\u0111\7n\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0113\7c\2\2\u0113\u0120\7p\2\2\u0114\u0115\7k\2\2"+
		"\u0115\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117\u0118\7g\2\2\u0118\u0119"+
		"\7i\2\2\u0119\u011a\7g\2\2\u011a\u0120\7t\2\2\u011b\u011c\7e\2\2\u011c"+
		"\u011d\7j\2\2\u011d\u011e\7c\2\2\u011e\u0120\7t\2\2\u011f\u010d\3\2\2"+
		"\2\u011f\u0114\3\2\2\2\u011f\u011b\3\2\2\2\u0120Z\3\2\2\2\u0121\u0122"+
		"\7t\2\2\u0122\u0123\7g\2\2\u0123\u0124\7e\2\2\u0124\u0125\7q\2\2\u0125"+
		"\u0126\7t\2\2\u0126\u0127\7f\2\2\u0127\\\3\2\2\2\u0128\u012d\5e\63\2\u0129"+
		"\u012c\5e\63\2\u012a\u012c\5g\64\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"^\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u013a\7$\2\2\u0131\u0139\5e\63\2\u0132"+
		"\u0139\5g\64\2\u0133\u0139\t\2\2\2\u0134\u0136\7\17\2\2\u0135\u0134\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\7\f\2\2\u0138"+
		"\u0131\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0135\3\2"+
		"\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7$\2\2\u013e`\3\2\2\2\u013f"+
		"\u0142\7)\2\2\u0140\u0143\5e\63\2\u0141\u0143\5g\64\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7)\2\2\u0145"+
		"b\3\2\2\2\u0146\u0148\5g\64\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014ad\3\2\2\2\u014b\u014c\t"+
		"\3\2\2\u014cf\3\2\2\2\u014d\u014e\4\62;\2\u014eh\3\2\2\2\u014f\u0150\7"+
		"\61\2\2\u0150\u0151\7,\2\2\u0151\u0155\3\2\2\2\u0152\u0154\13\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7,\2\2\u0159"+
		"\u015a\7\61\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\65\2\2\u015cj\3\2\2"+
		"\2\u015d\u015e\7\61\2\2\u015e\u015f\7\61\2\2\u015f\u0163\3\2\2\2\u0160"+
		"\u0162\13\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\5m\67\2\u0167\u0168\3\2\2\2\u0168\u0169\b\66\2\2\u0169l\3\2\2\2"+
		"\u016a\u016c\7\17\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016e\7\f\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b\67\2\2"+
		"\u0170n\3\2\2\2\u0171\u0173\t\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3"+
		"\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\b8\2\2\u0177p\3\2\2\2\17\2\u011f\u012b\u012d\u0135\u0138\u013a"+
		"\u0142\u0149\u0155\u0163\u016b\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}