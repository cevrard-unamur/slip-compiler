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
		IMPORT=1, MAPFILE=2, LPAR=3, RPAR=4, COLON=5, COMMA=6, SEMICOLON=7, RBRA=8, 
		LBRA=9, AS=10, EQUAL=11, QUOTE=12, SINGLE_QUOTE=13, ASSIGN=14, MAIN=15, 
		FUNCTION=16, VOID=17, DO=18, END=19, CONST=20, ENUM=21, PLUS=22, MINUS=23, 
		MULTI=24, DIV=25, MOD=26, TRUE=27, FALSE=28, AND=29, OR=30, NOT=31, LESS=32, 
		LESS_EQUAL=33, GREAT=34, GREAT_EQUAL=35, NOT_EQUAL=36, LEFT=37, RIGHT=38, 
		UP=39, DOWN=40, JUMP=41, FIGHT=42, DIG=43, SCALAR=44, RECORD=45, ID=46, 
		STRING=47, CHAR=48, NUMBER=49, COMMENT_MULTILINE=50, COMMENT_SINGLELINE=51, 
		NEWLINE=52, WS=53, MAP=54, ROBOT=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IMPORT", "MAPFILE", "LPAR", "RPAR", "COLON", "COMMA", "SEMICOLON", "RBRA", 
		"LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
		"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
		"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
		"GREAT_EQUAL", "NOT_EQUAL", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
		"DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR", "NUMBER", "LETTER", 
		"DIGIT", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS", "MAP", 
		"ROBOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#import'", null, "'('", "')'", "':'", "','", "';'", "']'", "'['", 
		"'as'", "'='", "'\"'", "'''", "':='", "'main'", "'function'", "'void'", 
		"'do'", "'end'", "'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'true'", "'false'", "'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", 
		"'<>'", "'left'", "'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", 
		null, "'record'", null, null, null, null, null, null, null, null, "'map'", 
		"'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COLON", "COMMA", "SEMICOLON", 
		"RBRA", "LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", 
		"FUNCTION", "VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", 
		"DIV", "MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", 
		"GREAT", "GREAT_EQUAL", "NOT_EQUAL", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", 
		"FIGHT", "DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR", "NUMBER", 
		"COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS", "MAP", "ROBOT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u0182\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0124"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\7/\u0130\n/\f/\16/\u0133\13/\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u013a\n\60\3\60\7\60\u013d\n\60\f\60\16\60\u0140"+
		"\13\60\3\60\3\60\3\61\3\61\3\61\5\61\u0147\n\61\3\61\3\61\3\62\6\62\u014c"+
		"\n\62\r\62\16\62\u014d\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0158"+
		"\n\65\f\65\16\65\u015b\13\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\7\66\u0166\n\66\f\66\16\66\u0169\13\66\3\66\3\66\3\66\3\66\3\67\5"+
		"\67\u0170\n\67\3\67\3\67\3\67\3\67\38\68\u0177\n8\r8\168\u0178\38\38\3"+
		"9\39\39\39\3:\3:\4\u0159\u0167\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\2g\2i\64k\65m\66o\67q8s9\3\2\4\4\2\13\13\"\"\4\2C\\c|\u018e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\3u\3\2\2\2\5}\3\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13"+
		"\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2\21\u008d\3\2\2\2\23\u008f"+
		"\3\2\2\2\25\u0091\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u0098\3"+
		"\2\2\2\35\u009a\3\2\2\2\37\u009d\3\2\2\2!\u00a2\3\2\2\2#\u00ab\3\2\2\2"+
		"%\u00b0\3\2\2\2\'\u00b3\3\2\2\2)\u00b7\3\2\2\2+\u00bd\3\2\2\2-\u00c2\3"+
		"\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2\2\65\u00ca\3\2\2"+
		"\2\67\u00cc\3\2\2\29\u00d1\3\2\2\2;\u00d7\3\2\2\2=\u00db\3\2\2\2?\u00de"+
		"\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E\u00e7\3\2\2\2G\u00e9\3\2\2\2I"+
		"\u00ec\3\2\2\2K\u00ef\3\2\2\2M\u00f4\3\2\2\2O\u00fa\3\2\2\2Q\u00fd\3\2"+
		"\2\2S\u0102\3\2\2\2U\u0107\3\2\2\2W\u010d\3\2\2\2Y\u0123\3\2\2\2[\u0125"+
		"\3\2\2\2]\u012c\3\2\2\2_\u0134\3\2\2\2a\u0143\3\2\2\2c\u014b\3\2\2\2e"+
		"\u014f\3\2\2\2g\u0151\3\2\2\2i\u0153\3\2\2\2k\u0161\3\2\2\2m\u016f\3\2"+
		"\2\2o\u0176\3\2\2\2q\u017c\3\2\2\2s\u0180\3\2\2\2uv\7%\2\2vw\7k\2\2wx"+
		"\7o\2\2xy\7r\2\2yz\7q\2\2z{\7t\2\2{|\7v\2\2|\4\3\2\2\2}~\5]/\2~\177\7"+
		"\60\2\2\177\u0080\7o\2\2\u0080\u0081\7c\2\2\u0081\u0082\7r\2\2\u0082\6"+
		"\3\2\2\2\u0083\u0084\7*\2\2\u0084\b\3\2\2\2\u0085\u0086\7+\2\2\u0086\n"+
		"\3\2\2\2\u0087\u0088\7<\2\2\u0088\f\3\2\2\2\u0089\u008a\7.\2\2\u008a\16"+
		"\3\2\2\2\u008b\u008c\7=\2\2\u008c\20\3\2\2\2\u008d\u008e\7_\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\7]\2\2\u0090\24\3\2\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7u\2\2\u0093\26\3\2\2\2\u0094\u0095\7?\2\2\u0095\30\3\2\2\2\u0096"+
		"\u0097\7$\2\2\u0097\32\3\2\2\2\u0098\u0099\7)\2\2\u0099\34\3\2\2\2\u009a"+
		"\u009b\7<\2\2\u009b\u009c\7?\2\2\u009c\36\3\2\2\2\u009d\u009e\7o\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1 \3\2\2\2\u00a2"+
		"\u00a3\7h\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7e\2\2"+
		"\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7f\2\2\u00af$\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2"+
		"\7q\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6"+
		"\7f\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc*\3\2\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7o\2\2\u00c1"+
		",\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\60"+
		"\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9"+
		"\64\3\2\2\2\u00ca\u00cb\7\'\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7g\2\2\u00d08\3\2\2\2\u00d1"+
		"\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2"+
		"\u00d5\u00d6\7g\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7p\2"+
		"\2\u00d9\u00da\7f\2\2\u00da<\3\2\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7"+
		"t\2\2\u00dd>\3\2\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7"+
		">\2\2\u00e5\u00e6\7?\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8F\3\2"+
		"\2\2\u00e9\u00ea\7@\2\2\u00ea\u00eb\7?\2\2\u00ebH\3\2\2\2\u00ec\u00ed"+
		"\7>\2\2\u00ed\u00ee\7@\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1"+
		"\7g\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7v\2\2\u00f3L\3\2\2\2\u00f4\u00f5"+
		"\7t\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8\7j\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7r\2\2\u00fc"+
		"P\3\2\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7y\2\2\u0100"+
		"\u0101\7p\2\2\u0101R\3\2\2\2\u0102\u0103\7l\2\2\u0103\u0104\7w\2\2\u0104"+
		"\u0105\7o\2\2\u0105\u0106\7r\2\2\u0106T\3\2\2\2\u0107\u0108\7h\2\2\u0108"+
		"\u0109\7k\2\2\u0109\u010a\7i\2\2\u010a\u010b\7j\2\2\u010b\u010c\7v\2\2"+
		"\u010cV\3\2\2\2\u010d\u010e\7f\2\2\u010e\u010f\7k\2\2\u010f\u0110\7i\2"+
		"\2\u0110X\3\2\2\2\u0111\u0112\7d\2\2\u0112\u0113\7q\2\2\u0113\u0114\7"+
		"q\2\2\u0114\u0115\7n\2\2\u0115\u0116\7g\2\2\u0116\u0117\7c\2\2\u0117\u0124"+
		"\7p\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7v\2\2\u011b"+
		"\u011c\7g\2\2\u011c\u011d\7i\2\2\u011d\u011e\7g\2\2\u011e\u0124\7t\2\2"+
		"\u011f\u0120\7e\2\2\u0120\u0121\7j\2\2\u0121\u0122\7c\2\2\u0122\u0124"+
		"\7t\2\2\u0123\u0111\3\2\2\2\u0123\u0118\3\2\2\2\u0123\u011f\3\2\2\2\u0124"+
		"Z\3\2\2\2\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127\u0128\7e\2\2\u0128"+
		"\u0129\7q\2\2\u0129\u012a\7t\2\2\u012a\u012b\7f\2\2\u012b\\\3\2\2\2\u012c"+
		"\u0131\5e\63\2\u012d\u0130\5e\63\2\u012e\u0130\5g\64\2\u012f\u012d\3\2"+
		"\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132^\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u013e\7$\2\2\u0135"+
		"\u013d\5e\63\2\u0136\u013d\5g\64\2\u0137\u013d\t\2\2\2\u0138\u013a\7\17"+
		"\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\7\f\2\2\u013c\u0135\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0137\3\2"+
		"\2\2\u013c\u0139\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7$"+
		"\2\2\u0142`\3\2\2\2\u0143\u0146\7)\2\2\u0144\u0147\5e\63\2\u0145\u0147"+
		"\5g\64\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\7)\2\2\u0149b\3\2\2\2\u014a\u014c\5g\64\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014ed\3\2\2\2"+
		"\u014f\u0150\t\3\2\2\u0150f\3\2\2\2\u0151\u0152\4\62;\2\u0152h\3\2\2\2"+
		"\u0153\u0154\7\61\2\2\u0154\u0155\7,\2\2\u0155\u0159\3\2\2\2\u0156\u0158"+
		"\13\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u015a\3\2\2\2"+
		"\u0159\u0157\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d"+
		"\7,\2\2\u015d\u015e\7\61\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\65\2\2"+
		"\u0160j\3\2\2\2\u0161\u0162\7\61\2\2\u0162\u0163\7\61\2\2\u0163\u0167"+
		"\3\2\2\2\u0164\u0166\13\2\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u016a\u016b\5m\67\2\u016b\u016c\3\2\2\2\u016c\u016d\b\66\2\2"+
		"\u016dl\3\2\2\2\u016e\u0170\7\17\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7\f\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\b\67\2\2\u0174n\3\2\2\2\u0175\u0177\t\2\2\2\u0176\u0175\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017b\b8\2\2\u017bp\3\2\2\2\u017c\u017d\7o\2\2\u017d\u017e"+
		"\7c\2\2\u017e\u017f\7r\2\2\u017fr\3\2\2\2\u0180\u0181\7B\2\2\u0181t\3"+
		"\2\2\2\17\2\u0123\u012f\u0131\u0139\u013c\u013e\u0146\u014d\u0159\u0167"+
		"\u016f\u0178\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}