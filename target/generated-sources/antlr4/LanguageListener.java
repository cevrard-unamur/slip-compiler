// Generated from Language.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programme}
	 * labeled alternative in {@link LanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(LanguageParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programme}
	 * labeled alternative in {@link LanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(LanguageParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapImportation}
	 * labeled alternative in {@link LanguageParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void enterMapImportation(LanguageParser.MapImportationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapImportation}
	 * labeled alternative in {@link LanguageParser#mapImport}.
	 * @param ctx the parse tree
	 */
	void exitMapImportation(LanguageParser.MapImportationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code main}
	 * labeled alternative in {@link LanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMain(LanguageParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code main}
	 * labeled alternative in {@link LanguageParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMain(LanguageParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link LanguageParser#funct}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link LanguageParser#funct}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionParameters}
	 * labeled alternative in {@link LanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(LanguageParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionParameters}
	 * labeled alternative in {@link LanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(LanguageParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link LanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(LanguageParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link LanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(LanguageParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterVariableInstruction(LanguageParser.VariableInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitVariableInstruction(LanguageParser.VariableInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignationInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterAssignationInstruction(LanguageParser.AssignationInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignationInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitAssignationInstruction(LanguageParser.AssignationInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterActionInstruction(LanguageParser.ActionInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitActionInstruction(LanguageParser.ActionInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterIfInstruction(LanguageParser.IfInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitIfInstruction(LanguageParser.IfInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterWhileInstruction(LanguageParser.WhileInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitWhileInstruction(LanguageParser.WhileInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterRepeatInstruction(LanguageParser.RepeatInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitRepeatInstruction(LanguageParser.RepeatInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterForInstruction(LanguageParser.ForInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInstruction}
	 * labeled alternative in {@link LanguageParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitForInstruction(LanguageParser.ForInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionInstruction}
	 * labeled alternative in {@link LanguageParser#functionInst}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInstruction(LanguageParser.FunctionInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionInstruction}
	 * labeled alternative in {@link LanguageParser#functionInst}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInstruction(LanguageParser.FunctionInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalVariableDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclaration(LanguageParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalVariableDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclaration(LanguageParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalConstantDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalConstantDeclaration(LanguageParser.GlobalConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalConstantDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalConstantDeclaration(LanguageParser.GlobalConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalEnumDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalEnumDeclaration(LanguageParser.GlobalEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalEnumDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalEnumDeclaration(LanguageParser.GlobalEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalStructureDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStructureDeclaration(LanguageParser.GlobalStructureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalStructureDeclaration}
	 * labeled alternative in {@link LanguageParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStructureDeclaration(LanguageParser.GlobalStructureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDefinition}
	 * labeled alternative in {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(LanguageParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDefinition}
	 * labeled alternative in {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(LanguageParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterScalar(LanguageParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalar}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitScalar(LanguageParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterArray(LanguageParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitArray(LanguageParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structure}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterStructure(LanguageParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structure}
	 * labeled alternative in {@link LanguageParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitStructure(LanguageParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDefinition}
	 * labeled alternative in {@link LanguageParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefinition(LanguageParser.ArrayDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDefinition}
	 * labeled alternative in {@link LanguageParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefinition(LanguageParser.ArrayDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structureDefinition}
	 * labeled alternative in {@link LanguageParser#structureType}.
	 * @param ctx the parse tree
	 */
	void enterStructureDefinition(LanguageParser.StructureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structureDefinition}
	 * labeled alternative in {@link LanguageParser#structureType}.
	 * @param ctx the parse tree
	 */
	void exitStructureDefinition(LanguageParser.StructureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitialisation(LanguageParser.ArrayInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitialisation(LanguageParser.ArrayInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterRightInitialisation(LanguageParser.RightInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightInitialisation}
	 * labeled alternative in {@link LanguageParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitRightInitialisation(LanguageParser.RightInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#initArray}.
	 * @param ctx the parse tree
	 */
	void enterInitArray(LanguageParser.InitArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#initArray}.
	 * @param ctx the parse tree
	 */
	void exitInitArray(LanguageParser.InitArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link LanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant(LanguageParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link LanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant(LanguageParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link LanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(LanguageParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link LanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(LanguageParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterString(LanguageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitString(LanguageParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusNumbersExpression(LanguageParser.MinusNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusNumbersExpression(LanguageParser.MinusNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftExpression(LanguageParser.LeftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftExpression(LanguageParser.LeftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivideNumbersExpression(LanguageParser.DivideNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivideNumbersExpression(LanguageParser.DivideNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFalse(LanguageParser.BooleanFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFalse(LanguageParser.BooleanFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanEqualExpression(LanguageParser.BooleanEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanEqualExpression(LanguageParser.BooleanEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(LanguageParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(LanguageParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOrExpression(LanguageParser.BooleanOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOrExpression(LanguageParser.BooleanOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanGreatExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanGreatExpression(LanguageParser.BooleanGreatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanGreatExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanGreatExpression(LanguageParser.BooleanGreatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLessExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLessExpression(LanguageParser.BooleanLessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLessExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLessExpression(LanguageParser.BooleanLessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusNumberExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusNumberExpression(LanguageParser.MinusNumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusNumberExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusNumberExpression(LanguageParser.MinusNumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanNotEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNotEqualExpression(LanguageParser.BooleanNotEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanNotEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNotEqualExpression(LanguageParser.BooleanNotEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLessEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLessEqualExpression(LanguageParser.BooleanLessEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLessEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLessEqualExpression(LanguageParser.BooleanLessEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LanguageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LanguageParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(LanguageParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(LanguageParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddNumbersExpression(LanguageParser.AddNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddNumbersExpression(LanguageParser.AddNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTrue(LanguageParser.BooleanTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTrue(LanguageParser.BooleanTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterChar(LanguageParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitChar(LanguageParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(LanguageParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(LanguageParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanGreatEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanGreatEqualExpression(LanguageParser.BooleanGreatEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanGreatEqualExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanGreatEqualExpression(LanguageParser.BooleanGreatEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterModNumbersExpression(LanguageParser.ModNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitModNumbersExpression(LanguageParser.ModNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyNumbersExpression(LanguageParser.MultiplyNumbersExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyNumbersExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyNumbersExpression(LanguageParser.MultiplyNumbersExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAndExpression(LanguageParser.BooleanAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link LanguageParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAndExpression(LanguageParser.BooleanAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftProperty(LanguageParser.LeftPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftProperty}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftProperty(LanguageParser.LeftPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftId(LanguageParser.LeftIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftId}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftId(LanguageParser.LeftIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftArray(LanguageParser.LeftArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArray}
	 * labeled alternative in {@link LanguageParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftArray(LanguageParser.LeftArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(LanguageParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(LanguageParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterLeft(LanguageParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitLeft(LanguageParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterRight(LanguageParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitRight(LanguageParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterUp(LanguageParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitUp(LanguageParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDown(LanguageParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDown(LanguageParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jump}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterJump(LanguageParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jump}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitJump(LanguageParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fightType}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterFightType(LanguageParser.FightTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fightType}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitFightType(LanguageParser.FightTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digType}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterDigType(LanguageParser.DigTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digType}
	 * labeled alternative in {@link LanguageParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitDigType(LanguageParser.DigTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dig}
	 * labeled alternative in {@link LanguageParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void enterDig(LanguageParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link LanguageParser#digInstruction}.
	 * @param ctx the parse tree
	 */
	void exitDig(LanguageParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fight}
	 * labeled alternative in {@link LanguageParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFight(LanguageParser.FightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fight}
	 * labeled alternative in {@link LanguageParser#fightInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFight(LanguageParser.FightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link LanguageParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIf(LanguageParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LanguageParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIf(LanguageParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link LanguageParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LanguageParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LanguageParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LanguageParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link LanguageParser#repeatBlock}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(LanguageParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link LanguageParser#repeatBlock}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(LanguageParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link LanguageParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterFor(LanguageParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link LanguageParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitFor(LanguageParser.ForContext ctx);
}