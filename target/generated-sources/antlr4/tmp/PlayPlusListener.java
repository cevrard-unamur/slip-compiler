// Generated from tmp/PlayPlus.g4 by ANTLR 4.6
package tmp;
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
	 * Enter a parse tree produced by {@link PlayPlusParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(PlayPlusParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(PlayPlusParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mapDescription}.
	 * @param ctx the parse tree
	 */
	void enterMapDescription(PlayPlusParser.MapDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mapDescription}.
	 * @param ctx the parse tree
	 */
	void exitMapDescription(PlayPlusParser.MapDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void enterMapSymbols(PlayPlusParser.MapSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mapSymbols}.
	 * @param ctx the parse tree
	 */
	void exitMapSymbols(PlayPlusParser.MapSymbolsContext ctx);
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
	 * Enter a parse tree produced by {@link PlayPlusParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PlayPlusParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PlayPlusParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PlayPlusParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PlayPlusParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PlayPlusParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PlayPlusParser.ArgumentContext ctx);
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
	 * Enter a parse tree produced by {@link PlayPlusParser#functionInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#functionInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariable(PlayPlusParser.GlobalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariable(PlayPlusParser.GlobalVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PlayPlusParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link PlayPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PlayPlusParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structure}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structure}
	 * labeled alternative in {@link PlayPlusParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitStructure(PlayPlusParser.StructureContext ctx);
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
	 * Enter a parse tree produced by {@link PlayPlusParser#structureType}.
	 * @param ctx the parse tree
	 */
	void enterStructureType(PlayPlusParser.StructureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#structureType}.
	 * @param ctx the parse tree
	 */
	void exitStructureType(PlayPlusParser.StructureTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterTrueInitialisation(PlayPlusParser.TrueInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitTrueInitialisation(PlayPlusParser.TrueInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterFalseInitialisation(PlayPlusParser.FalseInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitFalseInitialisation(PlayPlusParser.FalseInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterNumberInitialisation(PlayPlusParser.NumberInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitNumberInitialisation(PlayPlusParser.NumberInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterStringInitialisation(PlayPlusParser.StringInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitStringInitialisation(PlayPlusParser.StringInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterCharInitialisation(PlayPlusParser.CharInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitCharInitialisation(PlayPlusParser.CharInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitialisation(PlayPlusParser.ArrayInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitialisation(PlayPlusParser.ArrayInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initArray}.
	 * @param ctx the parse tree
	 */
	void enterInitArray(PlayPlusParser.InitArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initArray}.
	 * @param ctx the parse tree
	 */
	void exitInitArray(PlayPlusParser.InitArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link PlayPlusParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PlayPlusParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link PlayPlusParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PlayPlusParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link PlayPlusParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(PlayPlusParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link PlayPlusParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(PlayPlusParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterRightExpr(PlayPlusParser.RightExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitRightExpr(PlayPlusParser.RightExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftProperty(PlayPlusParser.LeftPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftProperty(PlayPlusParser.LeftPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftId(PlayPlusParser.LeftIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftId(PlayPlusParser.LeftIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftArray(PlayPlusParser.LeftArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link PlayPlusParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftArray(PlayPlusParser.LeftArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(PlayPlusParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(PlayPlusParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterLeft(PlayPlusParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitLeft(PlayPlusParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterRight(PlayPlusParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitRight(PlayPlusParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterUp(PlayPlusParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitUp(PlayPlusParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDown(PlayPlusParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDown(PlayPlusParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jump}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterJump(PlayPlusParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jump}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitJump(PlayPlusParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fight}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterFight(PlayPlusParser.FightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fight}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitFight(PlayPlusParser.FightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dig}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDig(PlayPlusParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDig(PlayPlusParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void enterDigInstruction(PlayPlusParser.DigInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void exitDigInstruction(PlayPlusParser.DigInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFightInstruction(PlayPlusParser.FightInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFightInstruction(PlayPlusParser.FightInstructionContext ctx);
}