// Generated from Language.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IMPORT=2, MAPFILE=3, LPAR=4, RPAR=5, COMMA=6, SEMICOLON=7, RBRA=8, 
		LBRA=9, AS=10, EQUAL=11, QUOTE=12, SINGLE_QUOTE=13, ASSIGN=14, MAIN=15, 
		FUNCTION=16, VOID=17, DO=18, END=19, CONST=20, ENUM=21, PLUS=22, MINUS=23, 
		MULTI=24, DIV=25, MOD=26, TRUE=27, FALSE=28, AND=29, OR=30, NOT=31, LESS=32, 
		LESS_EQUAL=33, GREAT=34, GREAT_EQUAL=35, NOT_EQUAL=36, IF=37, WHILE=38, 
		TO=39, UNTIL=40, THEN=41, ELSE=42, REPEAT=43, FOR=44, LEFT=45, RIGHT=46, 
		UP=47, DOWN=48, JUMP=49, FIGHT=50, DIG=51, SCALAR=52, RECORD=53, ID=54, 
		STRING=55, CHAR=56, COLON=57, NUMBER=58, COMMENT_MULTILINE=59, COMMENT_SINGLELINE=60, 
		NEWLINE=61, WS=62;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", 
		"LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
		"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
		"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
		"GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", "UNTIL", "THEN", "ELSE", 
		"REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", 
		"SCALAR", "RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", "LETTER", 
		"DIGIT", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", null, null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", 
		"'='", "'\"'", "'''", "':='", "'main'", "'function'", "'void'", "'do'", 
		"'end'", "'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", 
		"'false'", "'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", 
		"'if'", "'while'", "'to'", "'until'", "'then'", "'else'", "'repeat'", 
		"'for'", "'left'", "'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", 
		null, "'record'", null, null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", 
		"RBRA", "LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", 
		"FUNCTION", "VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", 
		"DIV", "MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", 
		"GREAT", "GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", "UNTIL", "THEN", 
		"ELSE", "REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
		"DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", 
		"COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS"
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


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u01be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\7\3\u0088\n\3\f\3\16\3\u008b"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u015f\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u016b"+
		"\n\67\f\67\16\67\u016e\13\67\38\38\38\38\38\58\u0175\n8\38\78\u0178\n"+
		"8\f8\168\u017b\138\38\38\39\39\39\59\u0182\n9\39\39\3:\3:\3;\6;\u0189"+
		"\n;\r;\16;\u018a\3<\3<\3=\3=\3>\3>\3>\3>\7>\u0195\n>\f>\16>\u0198\13>"+
		"\3>\3>\3>\3>\3>\3?\3?\3?\3?\7?\u01a3\n?\f?\16?\u01a6\13?\3?\3?\5?\u01aa"+
		"\n?\3?\5?\u01ad\n?\3?\3?\3@\5@\u01b2\n@\3@\3@\3@\3@\3A\6A\u01b9\nA\rA"+
		"\16A\u01ba\3A\3A\4\u0196\u01a4\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w\2y\2{=}>\177?\u0081@\3\2\4\4\2"+
		"\13\13\"\"\4\2C\\c|\u01cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5"+
		"\u0085\3\2\2\2\7\u0093\3\2\2\2\t\u0099\3\2\2\2\13\u009b\3\2\2\2\r\u009d"+
		"\3\2\2\2\17\u009f\3\2\2\2\21\u00a1\3\2\2\2\23\u00a3\3\2\2\2\25\u00a5\3"+
		"\2\2\2\27\u00a8\3\2\2\2\31\u00aa\3\2\2\2\33\u00ac\3\2\2\2\35\u00ae\3\2"+
		"\2\2\37\u00b1\3\2\2\2!\u00b6\3\2\2\2#\u00bf\3\2\2\2%\u00c4\3\2\2\2\'\u00c7"+
		"\3\2\2\2)\u00cb\3\2\2\2+\u00d1\3\2\2\2-\u00d6\3\2\2\2/\u00d8\3\2\2\2\61"+
		"\u00da\3\2\2\2\63\u00dc\3\2\2\2\65\u00de\3\2\2\2\67\u00e0\3\2\2\29\u00e5"+
		"\3\2\2\2;\u00eb\3\2\2\2=\u00ef\3\2\2\2?\u00f2\3\2\2\2A\u00f6\3\2\2\2C"+
		"\u00f8\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I\u0100\3\2\2\2K\u0103\3\2"+
		"\2\2M\u0106\3\2\2\2O\u010c\3\2\2\2Q\u010f\3\2\2\2S\u0115\3\2\2\2U\u011a"+
		"\3\2\2\2W\u011f\3\2\2\2Y\u0126\3\2\2\2[\u012a\3\2\2\2]\u012f\3\2\2\2_"+
		"\u0135\3\2\2\2a\u0138\3\2\2\2c\u013d\3\2\2\2e\u0142\3\2\2\2g\u0148\3\2"+
		"\2\2i\u015e\3\2\2\2k\u0160\3\2\2\2m\u0167\3\2\2\2o\u016f\3\2\2\2q\u017e"+
		"\3\2\2\2s\u0185\3\2\2\2u\u0188\3\2\2\2w\u018c\3\2\2\2y\u018e\3\2\2\2{"+
		"\u0190\3\2\2\2}\u019e\3\2\2\2\177\u01b1\3\2\2\2\u0081\u01b8\3\2\2\2\u0083"+
		"\u0084\7\60\2\2\u0084\4\3\2\2\2\u0085\u0089\7%\2\2\u0086\u0088\5\u0081"+
		"A\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7k"+
		"\2\2\u008d\u008e\7o\2\2\u008e\u008f\7r\2\2\u008f\u0090\7q\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7v\2\2\u0092\6\3\2\2\2\u0093\u0094\5m\67\2\u0094\u0095"+
		"\7\60\2\2\u0095\u0096\7o\2\2\u0096\u0097\7c\2\2\u0097\u0098\7r\2\2\u0098"+
		"\b\3\2\2\2\u0099\u009a\7*\2\2\u009a\n\3\2\2\2\u009b\u009c\7+\2\2\u009c"+
		"\f\3\2\2\2\u009d\u009e\7.\2\2\u009e\16\3\2\2\2\u009f\u00a0\7=\2\2\u00a0"+
		"\20\3\2\2\2\u00a1\u00a2\7_\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7]\2\2\u00a4"+
		"\24\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7u\2\2\u00a7\26\3\2\2\2\u00a8"+
		"\u00a9\7?\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\32\3\2\2\2\u00ac"+
		"\u00ad\7)\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7<\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\36\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00b9\7p\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7k\2\2"+
		"\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\"\3\2\2\2\u00bf\u00c0\7x"+
		"\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7f\2\2\u00c3$\3"+
		"\2\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7q\2\2\u00c6&\3\2\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7f\2\2\u00ca(\3\2\2\2\u00cb\u00cc"+
		"\7e\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7u\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7w\2\2\u00d4\u00d5\7o\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7-\2\2\u00d7"+
		".\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9\60\3\2\2\2\u00da\u00db\7,\2\2\u00db"+
		"\62\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\64\3\2\2\2\u00de\u00df\7\'\2\2"+
		"\u00df\66\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7"+
		"w\2\2\u00e3\u00e4\7g\2\2\u00e48\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7"+
		"\7c\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		":\3\2\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7f\2\2\u00ee"+
		"<\3\2\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1>\3\2\2\2\u00f2\u00f3"+
		"\7p\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7v\2\2\u00f5@\3\2\2\2\u00f6\u00f7"+
		"\7>\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa\7?\2\2\u00faD\3"+
		"\2\2\2\u00fb\u00fc\7@\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7@\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ffH\3\2\2\2\u0100\u0101\7>\2\2\u0101\u0102\7@\2\2\u0102J\3"+
		"\2\2\2\u0103\u0104\7k\2\2\u0104\u0105\7h\2\2\u0105L\3\2\2\2\u0106\u0107"+
		"\7y\2\2\u0107\u0108\7j\2\2\u0108\u0109\7k\2\2\u0109\u010a\7n\2\2\u010a"+
		"\u010b\7g\2\2\u010bN\3\2\2\2\u010c\u010d\7v\2\2\u010d\u010e\7q\2\2\u010e"+
		"P\3\2\2\2\u010f\u0110\7w\2\2\u0110\u0111\7p\2\2\u0111\u0112\7v\2\2\u0112"+
		"\u0113\7k\2\2\u0113\u0114\7n\2\2\u0114R\3\2\2\2\u0115\u0116\7v\2\2\u0116"+
		"\u0117\7j\2\2\u0117\u0118\7g\2\2\u0118\u0119\7p\2\2\u0119T\3\2\2\2\u011a"+
		"\u011b\7g\2\2\u011b\u011c\7n\2\2\u011c\u011d\7u\2\2\u011d\u011e\7g\2\2"+
		"\u011eV\3\2\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122\7r\2"+
		"\2\u0122\u0123\7g\2\2\u0123\u0124\7c\2\2\u0124\u0125\7v\2\2\u0125X\3\2"+
		"\2\2\u0126\u0127\7h\2\2\u0127\u0128\7q\2\2\u0128\u0129\7t\2\2\u0129Z\3"+
		"\2\2\2\u012a\u012b\7n\2\2\u012b\u012c\7g\2\2\u012c\u012d\7h\2\2\u012d"+
		"\u012e\7v\2\2\u012e\\\3\2\2\2\u012f\u0130\7t\2\2\u0130\u0131\7k\2\2\u0131"+
		"\u0132\7i\2\2\u0132\u0133\7j\2\2\u0133\u0134\7v\2\2\u0134^\3\2\2\2\u0135"+
		"\u0136\7w\2\2\u0136\u0137\7r\2\2\u0137`\3\2\2\2\u0138\u0139\7f\2\2\u0139"+
		"\u013a\7q\2\2\u013a\u013b\7y\2\2\u013b\u013c\7p\2\2\u013cb\3\2\2\2\u013d"+
		"\u013e\7l\2\2\u013e\u013f\7w\2\2\u013f\u0140\7o\2\2\u0140\u0141\7r\2\2"+
		"\u0141d\3\2\2\2\u0142\u0143\7h\2\2\u0143\u0144\7k\2\2\u0144\u0145\7i\2"+
		"\2\u0145\u0146\7j\2\2\u0146\u0147\7v\2\2\u0147f\3\2\2\2\u0148\u0149\7"+
		"f\2\2\u0149\u014a\7k\2\2\u014a\u014b\7i\2\2\u014bh\3\2\2\2\u014c\u014d"+
		"\7d\2\2\u014d\u014e\7q\2\2\u014e\u014f\7q\2\2\u014f\u0150\7n\2\2\u0150"+
		"\u0151\7g\2\2\u0151\u0152\7c\2\2\u0152\u015f\7p\2\2\u0153\u0154\7k\2\2"+
		"\u0154\u0155\7p\2\2\u0155\u0156\7v\2\2\u0156\u0157\7g\2\2\u0157\u0158"+
		"\7i\2\2\u0158\u0159\7g\2\2\u0159\u015f\7t\2\2\u015a\u015b\7e\2\2\u015b"+
		"\u015c\7j\2\2\u015c\u015d\7c\2\2\u015d\u015f\7t\2\2\u015e\u014c\3\2\2"+
		"\2\u015e\u0153\3\2\2\2\u015e\u015a\3\2\2\2\u015fj\3\2\2\2\u0160\u0161"+
		"\7t\2\2\u0161\u0162\7g\2\2\u0162\u0163\7e\2\2\u0163\u0164\7q\2\2\u0164"+
		"\u0165\7t\2\2\u0165\u0166\7f\2\2\u0166l\3\2\2\2\u0167\u016c\5w<\2\u0168"+
		"\u016b\5w<\2\u0169\u016b\5y=\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2"+
		"\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dn\3"+
		"\2\2\2\u016e\u016c\3\2\2\2\u016f\u0179\7$\2\2\u0170\u0178\5w<\2\u0171"+
		"\u0178\5y=\2\u0172\u0178\t\2\2\2\u0173\u0175\7\17\2\2\u0174\u0173\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\7\f\2\2\u0177"+
		"\u0170\3\2\2\2\u0177\u0171\3\2\2\2\u0177\u0172\3\2\2\2\u0177\u0174\3\2"+
		"\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7$\2\2\u017dp\3\2\2\2\u017e"+
		"\u0181\7)\2\2\u017f\u0182\5w<\2\u0180\u0182\5y=\2\u0181\u017f\3\2\2\2"+
		"\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7)\2\2\u0184r\3\2"+
		"\2\2\u0185\u0186\7<\2\2\u0186t\3\2\2\2\u0187\u0189\5y=\2\u0188\u0187\3"+
		"\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"v\3\2\2\2\u018c\u018d\t\3\2\2\u018dx\3\2\2\2\u018e\u018f\4\62;\2\u018f"+
		"z\3\2\2\2\u0190\u0191\7\61\2\2\u0191\u0192\7,\2\2\u0192\u0196\3\2\2\2"+
		"\u0193\u0195\13\2\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019a\7,\2\2\u019a\u019b\7\61\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b>"+
		"\2\2\u019d|\3\2\2\2\u019e\u019f\7\61\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a4"+
		"\3\2\2\2\u01a1\u01a3\13\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01aa\5\177@\2\u01a8\u01aa\7\2\2\3\u01a9\u01a7\3\2\2\2"+
		"\u01a9\u01a8\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\7\2\2\3\u01ac\u01ab"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\b?\2\2\u01af"+
		"~\3\2\2\2\u01b0\u01b2\7\17\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2"+
		"\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\f\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6"+
		"\b@\2\2\u01b6\u0080\3\2\2\2\u01b7\u01b9\t\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\bA\2\2\u01bd\u0082\3\2\2\2\22\2\u0089\u015e\u016a\u016c"+
		"\u0174\u0177\u0179\u0181\u018a\u0196\u01a4\u01a9\u01ac\u01b1\u01ba\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}