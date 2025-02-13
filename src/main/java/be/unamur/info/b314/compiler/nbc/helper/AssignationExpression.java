package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.*;

import java.io.PrintWriter;

public class AssignationExpression {
    /**
     * The assignation identifier for the temporary variable.
     */
    private static int assignationId = 1;
    /**
     * The prefix name of the temporary variable
     */
    private static final String assignationTemporaryVariable = "__assignationVariable";

    /**
     * Gets the name of the temporary variable use for the assignation.
     * @return the name of the temporary variable use for the assignation.
     */
    private static String getActionName() {
        return AssignationExpression.assignationTemporaryVariable + AssignationExpression.assignationId;
    }

    /**
     * Enters in an assignation context to write the NBC code of it.
     * @param context the assignation assignation context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the assignation.
     */
    public static String enterAssignationContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        // We give each time the full context to the children functions because we need some information from it.
        if (context.leftExpr() instanceof PlayPlusParser.LeftIdContext) {
            return AssignationExpression.enterLeftIdContext(context, application, writer);
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftArrayContext) {
            return AssignationExpression.enterLeftArrayContext(context, application, writer);
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftPropertyContext) {
            return AssignationExpression.enterLeftPropertyContext(context, application, writer);
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftPropertyArrayContext) {
            return AssignationExpression.enterLeftPropertyArrayContext(context, application, writer);
        } else {
            throw new PlayPlusException("Not implemented");
        }
    }

    /**
     * Enters in a left identifier context to write the NBC code of it.
     * @param context the assignation context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the assignation
     */
    private static String enterLeftIdContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        // We get the id of the target variable (the left expression) by retrieving the matching variable in the context
        Variable variableTarget = application.getVariable(((PlayPlusParser.LeftIdContext) context.leftExpr()).ID().getText());

        // This call generate a temporary variable that we use to move it result into our left variable
        String variableSource = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        VariableWriter.writeVariableMove(
                writer,
                variableTarget.getNameAndContext(),
                variableSource
        );

        return variableTarget.getNameAndContext();
    }

    /**
     * Enters in a left array context to write the NBC code of it.
     * @param context the assignation context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the assignation
     */
    private static String enterLeftArrayContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        PlayPlusParser.LeftArrayContext targetArray = (PlayPlusParser.LeftArrayContext) context.leftExpr();
        Array array = application.getArray(targetArray.ID().getText());

        String indexVariable = "--";

        // We get the variable which hold the targeted index in the array.
        if (array.getDimension() == 1) {
            indexVariable = RightExpression.enterRightExpression(targetArray.rightExpr(0), application, writer);
        } else {
            String rowVariable = RightExpression.enterRightExpression(targetArray.rightExpr(0), application, writer);
            String columnVariable = RightExpression.enterRightExpression(targetArray.rightExpr(1), application, writer);

            String rowSizeVariable = AssignationExpression.getActionName();
            AssignationExpression.assignationId++;
            indexVariable = AssignationExpression.getActionName();

            VariableWriter.writeTemporaryScalarDeclaration(
                    writer,
                    NBCCodeTypes.Int,
                    rowSizeVariable,
                    array.getSize()[0].toString()
            );

            VariableWriter.writeTemporaryScalarDeclaration(
                    writer,
                    NBCCodeTypes.Int,
                    indexVariable
            );

            OperatorWriter.writeMathCondition(
                    writer,
                    NBCIntCodeTypes.Multiplication,
                    indexVariable,
                    rowVariable,
                    rowSizeVariable);

            OperatorWriter.writeMathCondition(
                    writer,
                    NBCIntCodeTypes.Addition,
                    indexVariable,
                    indexVariable,
                    columnVariable
            );

            AssignationExpression.assignationId++;
        }

        String variableSource = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        // We get the value we want to set in the array.
        VariableWriter.writeSetToArray(
                writer,
                variableSource,
                array.getNameAndContext(),
                indexVariable
        );

        return array.getNameAndContext();
    }

    /**
     * Enters in a left property context to write the NBC code of it.
     * @param context the assignation context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the assignation
     */
    private static String enterLeftPropertyContext(
            PlayPlusParser.AssignationContext context,
            Application application,
            PrintWriter writer) {
        // We get the structure information
        PlayPlusParser.LeftPropertyContext leftExpression = (PlayPlusParser.LeftPropertyContext) context.leftExpr();
        String structureVariable = LeftExpression.enterLeftExpression(
                leftExpression.leftExpr(),
                application,
                writer
        );

        // We get the id of the target variable (the left expression) by retrieving the matching variable in the context
        Variable variableTarget = application.getVariableOfRecord(
                structureVariable,
                ((PlayPlusParser.LeftPropertyContext) context.leftExpr()).ID().getText()
        );

        // This call generate a temporary variable that we use to move it result into our left variable
        String variableSource = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        VariableWriter.writeVariableMove(
                writer,
                String.format("%s.%s", structureVariable, variableTarget.getNameAndContext()),
                variableSource
        );

        return String.format("%s.%s", structureVariable, variableTarget.getNameAndContext());
    }

    /**
     * Enters in a left property array context to write the NBC code of it.
     * @param context the assignation context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the assignation
     */
    private static String enterLeftPropertyArrayContext(
            PlayPlusParser.AssignationContext context,
            Application application,
            PrintWriter writer) {
        PlayPlusParser.LeftPropertyArrayContext targetArray = (PlayPlusParser.LeftPropertyArrayContext) context.leftExpr();
        String structureVariable = LeftExpression.enterLeftExpression(
                targetArray.leftExpr(),
                application,
                writer
        );

        // We get the id of the target variable (the left expression) by retrieving the matching variable in the context
        Array array = application.getArrayOfRecord(
                structureVariable,
                targetArray.ID().getText()
        );

        // This call generate a temporary variable that we use to move it result into our left variable
        String variableSource = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        String indexVariable = "--";

        // We get the variable which hold the targeted index in the array.
        if (array.getDimension() == 1) {
            indexVariable = RightExpression.enterRightExpression(targetArray.rightExpr(0), application, writer);
        } else {
            String rowVariable = RightExpression.enterRightExpression(targetArray.rightExpr(0), application, writer);
            String columnVariable = RightExpression.enterRightExpression(targetArray.rightExpr(1), application, writer);

            String rowSizeVariable = AssignationExpression.getActionName();
            AssignationExpression.assignationId++;
            indexVariable = AssignationExpression.getActionName();

            VariableWriter.writeTemporaryScalarDeclaration(
                    writer,
                    NBCCodeTypes.Int,
                    rowSizeVariable,
                    array.getSize()[0].toString()
            );

            VariableWriter.writeTemporaryScalarDeclaration(
                    writer,
                    NBCCodeTypes.Int,
                    indexVariable
            );

            OperatorWriter.writeMathCondition(
                    writer,
                    NBCIntCodeTypes.Multiplication,
                    indexVariable,
                    rowVariable,
                    rowSizeVariable);

            OperatorWriter.writeMathCondition(
                    writer,
                    NBCIntCodeTypes.Addition,
                    indexVariable,
                    indexVariable,
                    columnVariable
            );
            
            AssignationExpression.assignationId++;
        }

        // We get the value we want to set in the array.
        VariableWriter.writeSetToArray(
                writer,
                variableSource,
                String.format("%s.%s", structureVariable, array.getNameAndContext()),
                indexVariable
        );

        return String.format("%s.%s", structureVariable, array.getNameAndContext());
    }
}
