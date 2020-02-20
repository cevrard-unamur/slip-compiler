// Generated from be/unamur/info/b314/compiler/PlayPlus.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
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
	 * Enter a parse tree produced by {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void enterMapImport(PlayPlusParser.MapImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void exitMapImport(PlayPlusParser.MapImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(PlayPlusParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(PlayPlusParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PlayPlusParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PlayPlusParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(PlayPlusParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(PlayPlusParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PlayPlusParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PlayPlusParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(PlayPlusParser.StructureContext ctx);
}