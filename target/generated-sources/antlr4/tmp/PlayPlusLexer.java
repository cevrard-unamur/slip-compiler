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
		MAP=1, ROBOT=2, CHEST=3, GRASS=4, PALMTREE=5, BRIDGE=6, BUSH=7, CASK=8, 
		WELL=9, EMPTY=10, SQUELETON=11, COLON=12, NUMBER=13, COMMENT_MULTILINE=14, 
		COMMENT_SINGLELINE=15, NEWLINE=16, WS=17, IMPORT=18, MAPFILE=19, LPAR=20, 
		RPAR=21, COMMA=22, SEMICOLON=23, RBRA=24, LBRA=25, AS=26, EQUAL=27, QUOTE=28, 
		SINGLE_QUOTE=29, ASSIGN=30, MAIN=31, FUNCTION=32, VOID=33, DO=34, END=35, 
		CONST=36, ENUM=37, PLUS=38, MINUS=39, MULTI=40, DIV=41, MOD=42, TRUE=43, 
		FALSE=44, AND=45, OR=46, NOT=47, LESS=48, LESS_EQUAL=49, GREAT=50, GREAT_EQUAL=51, 
		NOT_EQUAL=52, IF=53, WHILE=54, TO=55, UNTIL=56, THEN=57, ELSE=58, REPEAT=59, 
		FOR=60, LEFT=61, RIGHT=62, UP=63, DOWN=64, JUMP=65, FIGHT=66, DIG=67, 
		SCALAR=68, RECORD=69, ID=70, STRING=71, CHAR=72;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", "CASK", 
		"WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "LETTER", "DIGIT", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS", "IMPORT", "MAPFILE", "LPAR", "RPAR", 
		"COMMA", "SEMICOLON", "RBRA", "LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", 
		"ASSIGN", "MAIN", "FUNCTION", "VOID", "DO", "END", "CONST", "ENUM", "PLUS", 
		"MINUS", "MULTI", "DIV", "MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", 
		"LESS_EQUAL", "GREAT", "GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", 
		"UNTIL", "THEN", "ELSE", "REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", 
		"JUMP", "FIGHT", "DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", "'S'", 
		"'_'", "'Q'", "':'", null, null, null, null, null, null, null, "'('", 
		"')'", "','", "';'", "']'", "'['", "'as'", "'='", "'\"'", "'''", "':='", 
		"'main'", "'function'", "'void'", "'do'", "'end'", "'const'", "'enum'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", "'and'", "'or'", 
		"'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'if'", "'while'", "'to'", 
		"'until'", "'then'", "'else'", "'repeat'", "'for'", "'left'", "'right'", 
		"'up'", "'down'", "'jump'", "'fight'", "'dig'", null, "'record'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", 
		"CASK", "WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS", "IMPORT", "MAPFILE", "LPAR", "RPAR", 
		"COMMA", "SEMICOLON", "RBRA", "LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", 
		"ASSIGN", "MAIN", "FUNCTION", "VOID", "DO", "END", "CONST", "ENUM", "PLUS", 
		"MINUS", "MULTI", "DIV", "MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", 
		"LESS_EQUAL", "GREAT", "GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", 
		"UNTIL", "THEN", "ELSE", "REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", 
		"JUMP", "FIGHT", "DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2J\u01e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16\u00b3\n"+
		"\16\r\16\16\16\u00b4\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00bf"+
		"\n\21\f\21\16\21\u00c2\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22\3\22\3\22\5\22\u00d4\n\22\3"+
		"\22\5\22\u00d7\n\22\3\22\3\22\3\23\5\23\u00dc\n\23\3\23\3\23\3\23\3\23"+
		"\3\24\6\24\u00e3\n\24\r\24\16\24\u00e4\3\24\3\24\3\25\3\25\7\25\u00eb"+
		"\n\25\f\25\16\25\u00ee\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\38\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3"+
		"D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\5G\u01c2\nG\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\7I\u01ce\n"+
		"I\fI\16I\u01d1\13I\3J\3J\3J\3J\3J\5J\u01d8\nJ\3J\7J\u01db\nJ\fJ\16J\u01de"+
		"\13J\3J\3J\3K\3K\3K\5K\u01e5\nK\3K\3K\4\u00c0\u00ce\2L\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\20#\21%\22"+
		"\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G"+
		"#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<{"+
		"=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008bE\u008dF\u008fG\u0091"+
		"H\u0093I\u0095J\3\2\4\4\2C\\c|\4\2\13\13\"\"\u01f7\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u009b\3\2\2\2\7\u009d\3\2\2\2\t\u009f"+
		"\3\2\2\2\13\u00a1\3\2\2\2\r\u00a3\3\2\2\2\17\u00a5\3\2\2\2\21\u00a7\3"+
		"\2\2\2\23\u00a9\3\2\2\2\25\u00ab\3\2\2\2\27\u00ad\3\2\2\2\31\u00af\3\2"+
		"\2\2\33\u00b2\3\2\2\2\35\u00b6\3\2\2\2\37\u00b8\3\2\2\2!\u00ba\3\2\2\2"+
		"#\u00c8\3\2\2\2%\u00db\3\2\2\2\'\u00e2\3\2\2\2)\u00e8\3\2\2\2+\u00f6\3"+
		"\2\2\2-\u00fc\3\2\2\2/\u00fe\3\2\2\2\61\u0100\3\2\2\2\63\u0102\3\2\2\2"+
		"\65\u0104\3\2\2\2\67\u0106\3\2\2\29\u0108\3\2\2\2;\u010b\3\2\2\2=\u010d"+
		"\3\2\2\2?\u010f\3\2\2\2A\u0111\3\2\2\2C\u0114\3\2\2\2E\u0119\3\2\2\2G"+
		"\u0122\3\2\2\2I\u0127\3\2\2\2K\u012a\3\2\2\2M\u012e\3\2\2\2O\u0134\3\2"+
		"\2\2Q\u0139\3\2\2\2S\u013b\3\2\2\2U\u013d\3\2\2\2W\u013f\3\2\2\2Y\u0141"+
		"\3\2\2\2[\u0143\3\2\2\2]\u0148\3\2\2\2_\u014e\3\2\2\2a\u0152\3\2\2\2c"+
		"\u0155\3\2\2\2e\u0159\3\2\2\2g\u015b\3\2\2\2i\u015e\3\2\2\2k\u0160\3\2"+
		"\2\2m\u0163\3\2\2\2o\u0166\3\2\2\2q\u0169\3\2\2\2s\u016f\3\2\2\2u\u0172"+
		"\3\2\2\2w\u0178\3\2\2\2y\u017d\3\2\2\2{\u0182\3\2\2\2}\u0189\3\2\2\2\177"+
		"\u018d\3\2\2\2\u0081\u0192\3\2\2\2\u0083\u0198\3\2\2\2\u0085\u019b\3\2"+
		"\2\2\u0087\u01a0\3\2\2\2\u0089\u01a5\3\2\2\2\u008b\u01ab\3\2\2\2\u008d"+
		"\u01c1\3\2\2\2\u008f\u01c3\3\2\2\2\u0091\u01ca\3\2\2\2\u0093\u01d2\3\2"+
		"\2\2\u0095\u01e1\3\2\2\2\u0097\u0098\7o\2\2\u0098\u0099\7c\2\2\u0099\u009a"+
		"\7r\2\2\u009a\4\3\2\2\2\u009b\u009c\7B\2\2\u009c\6\3\2\2\2\u009d\u009e"+
		"\7Z\2\2\u009e\b\3\2\2\2\u009f\u00a0\7I\2\2\u00a0\n\3\2\2\2\u00a1\u00a2"+
		"\7R\2\2\u00a2\f\3\2\2\2\u00a3\u00a4\7C\2\2\u00a4\16\3\2\2\2\u00a5\u00a6"+
		"\7D\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7V\2\2\u00a8\22\3\2\2\2\u00a9\u00aa"+
		"\7U\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7a\2\2\u00ac\26\3\2\2\2\u00ad\u00ae"+
		"\7S\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7<\2\2\u00b0\32\3\2\2\2\u00b1\u00b3"+
		"\5\37\20\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\36\3\2"+
		"\2\2\u00b8\u00b9\4\62;\2\u00b9 \3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc"+
		"\7,\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\7\61\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\b\21\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7\61\2"+
		"\2\u00c9\u00ca\7\61\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\13\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\5%\23\2\u00d2"+
		"\u00d4\7\2\2\3\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d7\7\2\2\3\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\b\22\2\2\u00d9$\3\2\2\2\u00da\u00dc\7\17\2"+
		"\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\7\f\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\23\2\2\u00e0&\3\2\2\2\u00e1"+
		"\u00e3\t\3\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\24\2\2\u00e7"+
		"(\3\2\2\2\u00e8\u00ec\7%\2\2\u00e9\u00eb\5\'\24\2\u00ea\u00e9\3\2\2\2"+
		"\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7o\2\2\u00f1"+
		"\u00f2\7r\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5*\3\2\2\2\u00f6\u00f7\5\u0091I\2\u00f7\u00f8\7\60\2\2\u00f8\u00f9"+
		"\7o\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7r\2\2\u00fb,\3\2\2\2\u00fc\u00fd"+
		"\7*\2\2\u00fd.\3\2\2\2\u00fe\u00ff\7+\2\2\u00ff\60\3\2\2\2\u0100\u0101"+
		"\7.\2\2\u0101\62\3\2\2\2\u0102\u0103\7=\2\2\u0103\64\3\2\2\2\u0104\u0105"+
		"\7_\2\2\u0105\66\3\2\2\2\u0106\u0107\7]\2\2\u01078\3\2\2\2\u0108\u0109"+
		"\7c\2\2\u0109\u010a\7u\2\2\u010a:\3\2\2\2\u010b\u010c\7?\2\2\u010c<\3"+
		"\2\2\2\u010d\u010e\7$\2\2\u010e>\3\2\2\2\u010f\u0110\7)\2\2\u0110@\3\2"+
		"\2\2\u0111\u0112\7<\2\2\u0112\u0113\7?\2\2\u0113B\3\2\2\2\u0114\u0115"+
		"\7o\2\2\u0115\u0116\7c\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2\u0118"+
		"D\3\2\2\2\u0119\u011a\7h\2\2\u011a\u011b\7w\2\2\u011b\u011c\7p\2\2\u011c"+
		"\u011d\7e\2\2\u011d\u011e\7v\2\2\u011e\u011f\7k\2\2\u011f\u0120\7q\2\2"+
		"\u0120\u0121\7p\2\2\u0121F\3\2\2\2\u0122\u0123\7x\2\2\u0123\u0124\7q\2"+
		"\2\u0124\u0125\7k\2\2\u0125\u0126\7f\2\2\u0126H\3\2\2\2\u0127\u0128\7"+
		"f\2\2\u0128\u0129\7q\2\2\u0129J\3\2\2\2\u012a\u012b\7g\2\2\u012b\u012c"+
		"\7p\2\2\u012c\u012d\7f\2\2\u012dL\3\2\2\2\u012e\u012f\7e\2\2\u012f\u0130"+
		"\7q\2\2\u0130\u0131\7p\2\2\u0131\u0132\7u\2\2\u0132\u0133\7v\2\2\u0133"+
		"N\3\2\2\2\u0134\u0135\7g\2\2\u0135\u0136\7p\2\2\u0136\u0137\7w\2\2\u0137"+
		"\u0138\7o\2\2\u0138P\3\2\2\2\u0139\u013a\7-\2\2\u013aR\3\2\2\2\u013b\u013c"+
		"\7/\2\2\u013cT\3\2\2\2\u013d\u013e\7,\2\2\u013eV\3\2\2\2\u013f\u0140\7"+
		"\61\2\2\u0140X\3\2\2\2\u0141\u0142\7\'\2\2\u0142Z\3\2\2\2\u0143\u0144"+
		"\7v\2\2\u0144\u0145\7t\2\2\u0145\u0146\7w\2\2\u0146\u0147\7g\2\2\u0147"+
		"\\\3\2\2\2\u0148\u0149\7h\2\2\u0149\u014a\7c\2\2\u014a\u014b\7n\2\2\u014b"+
		"\u014c\7u\2\2\u014c\u014d\7g\2\2\u014d^\3\2\2\2\u014e\u014f\7c\2\2\u014f"+
		"\u0150\7p\2\2\u0150\u0151\7f\2\2\u0151`\3\2\2\2\u0152\u0153\7q\2\2\u0153"+
		"\u0154\7t\2\2\u0154b\3\2\2\2\u0155\u0156\7p\2\2\u0156\u0157\7q\2\2\u0157"+
		"\u0158\7v\2\2\u0158d\3\2\2\2\u0159\u015a\7>\2\2\u015af\3\2\2\2\u015b\u015c"+
		"\7>\2\2\u015c\u015d\7?\2\2\u015dh\3\2\2\2\u015e\u015f\7@\2\2\u015fj\3"+
		"\2\2\2\u0160\u0161\7@\2\2\u0161\u0162\7?\2\2\u0162l\3\2\2\2\u0163\u0164"+
		"\7>\2\2\u0164\u0165\7@\2\2\u0165n\3\2\2\2\u0166\u0167\7k\2\2\u0167\u0168"+
		"\7h\2\2\u0168p\3\2\2\2\u0169\u016a\7y\2\2\u016a\u016b\7j\2\2\u016b\u016c"+
		"\7k\2\2\u016c\u016d\7n\2\2\u016d\u016e\7g\2\2\u016er\3\2\2\2\u016f\u0170"+
		"\7v\2\2\u0170\u0171\7q\2\2\u0171t\3\2\2\2\u0172\u0173\7w\2\2\u0173\u0174"+
		"\7p\2\2\u0174\u0175\7v\2\2\u0175\u0176\7k\2\2\u0176\u0177\7n\2\2\u0177"+
		"v\3\2\2\2\u0178\u0179\7v\2\2\u0179\u017a\7j\2\2\u017a\u017b\7g\2\2\u017b"+
		"\u017c\7p\2\2\u017cx\3\2\2\2\u017d\u017e\7g\2\2\u017e\u017f\7n\2\2\u017f"+
		"\u0180\7u\2\2\u0180\u0181\7g\2\2\u0181z\3\2\2\2\u0182\u0183\7t\2\2\u0183"+
		"\u0184\7g\2\2\u0184\u0185\7r\2\2\u0185\u0186\7g\2\2\u0186\u0187\7c\2\2"+
		"\u0187\u0188\7v\2\2\u0188|\3\2\2\2\u0189\u018a\7h\2\2\u018a\u018b\7q\2"+
		"\2\u018b\u018c\7t\2\2\u018c~\3\2\2\2\u018d\u018e\7n\2\2\u018e\u018f\7"+
		"g\2\2\u018f\u0190\7h\2\2\u0190\u0191\7v\2\2\u0191\u0080\3\2\2\2\u0192"+
		"\u0193\7t\2\2\u0193\u0194\7k\2\2\u0194\u0195\7i\2\2\u0195\u0196\7j\2\2"+
		"\u0196\u0197\7v\2\2\u0197\u0082\3\2\2\2\u0198\u0199\7w\2\2\u0199\u019a"+
		"\7r\2\2\u019a\u0084\3\2\2\2\u019b\u019c\7f\2\2\u019c\u019d\7q\2\2\u019d"+
		"\u019e\7y\2\2\u019e\u019f\7p\2\2\u019f\u0086\3\2\2\2\u01a0\u01a1\7l\2"+
		"\2\u01a1\u01a2\7w\2\2\u01a2\u01a3\7o\2\2\u01a3\u01a4\7r\2\2\u01a4\u0088"+
		"\3\2\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7i\2\2\u01a8"+
		"\u01a9\7j\2\2\u01a9\u01aa\7v\2\2\u01aa\u008a\3\2\2\2\u01ab\u01ac\7f\2"+
		"\2\u01ac\u01ad\7k\2\2\u01ad\u01ae\7i\2\2\u01ae\u008c\3\2\2\2\u01af\u01b0"+
		"\7d\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7n\2\2\u01b3"+
		"\u01b4\7g\2\2\u01b4\u01b5\7c\2\2\u01b5\u01c2\7p\2\2\u01b6\u01b7\7k\2\2"+
		"\u01b7\u01b8\7p\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb"+
		"\7i\2\2\u01bb\u01bc\7g\2\2\u01bc\u01c2\7t\2\2\u01bd\u01be\7e\2\2\u01be"+
		"\u01bf\7j\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c2\7t\2\2\u01c1\u01af\3\2\2"+
		"\2\u01c1\u01b6\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c2\u008e\3\2\2\2\u01c3\u01c4"+
		"\7t\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7e\2\2\u01c6\u01c7\7q\2\2\u01c7"+
		"\u01c8\7t\2\2\u01c8\u01c9\7f\2\2\u01c9\u0090\3\2\2\2\u01ca\u01cf\5\35"+
		"\17\2\u01cb\u01ce\5\35\17\2\u01cc\u01ce\5\37\20\2\u01cd\u01cb\3\2\2\2"+
		"\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u0092\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01dc\7$\2\2\u01d3"+
		"\u01db\5\35\17\2\u01d4\u01db\5\37\20\2\u01d5\u01db\t\3\2\2\u01d6\u01d8"+
		"\7\17\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d9\u01db\7\f\2\2\u01da\u01d3\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d5"+
		"\3\2\2\2\u01da\u01d7\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7$"+
		"\2\2\u01e0\u0094\3\2\2\2\u01e1\u01e4\7)\2\2\u01e2\u01e5\5\35\17\2\u01e3"+
		"\u01e5\5\37\20\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3"+
		"\2\2\2\u01e6\u01e7\7)\2\2\u01e7\u0096\3\2\2\2\22\2\u00b4\u00c0\u00ce\u00d3"+
		"\u00d6\u00db\u00e4\u00ec\u01c1\u01cd\u01cf\u01d7\u01da\u01dc\u01e4\3\b"+
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