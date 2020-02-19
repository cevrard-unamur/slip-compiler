// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/PlayPlus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayPlusParser}.
 */
public interface PlayPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(PlayPlusParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(PlayPlusParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(PlayPlusParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(PlayPlusParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(PlayPlusParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(PlayPlusParser.ConstantExprContext ctx);
}