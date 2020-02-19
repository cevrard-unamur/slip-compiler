// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/PlayPlus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayPlusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(PlayPlusParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpr(PlayPlusParser.PlusMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link PlayPlusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(PlayPlusParser.ConstantExprContext ctx);
}