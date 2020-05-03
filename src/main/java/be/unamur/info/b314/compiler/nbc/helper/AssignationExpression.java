package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class AssignationExpression {
    public static String enterAssignationContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        // WE give each time the full context to the children functions because we need some information from it.
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

    private static String enterLeftIdContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        // We get the id of the target variable (the left expression) by retrieving the matching variable in the context
        Variable variableTarget = application.getVariable(((PlayPlusParser.LeftIdContext) context.leftExpr()).ID().getText());

        // This call generate a temporary variable that we use to move it result into our left variable
        String variableSource = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        VariableWriter.writeVariableMove(
                writer,
                variableTarget.getName(),
                variableSource
        );

        return variableTarget.getName();
    }

    private static String enterLeftArrayContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        PlayPlusParser.LeftArrayContext targetArray = (PlayPlusParser.LeftArrayContext)context.leftExpr();
        Array array = application.getArray(targetArray.ID().getText());

        String indexVariable = "--";

        // We get the variable which hold the targeted index in the array.
        if (array.getLength() == 1) {
            indexVariable = RightExpression.enterRightExpression(targetArray.rightExpr(0), application, writer);
        } else {
            // TODO Handle 2D array
        }

        String variableSource = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        // We get the value we want to set in the array.
        VariableWriter.writeSetToArray(
                writer,
                variableSource,
                array.getName(),
                indexVariable
        );

        return array.getName();
    }

    private static String enterLeftPropertyContext(
            PlayPlusParser.AssignationContext context,
            Application application,
            PrintWriter writer) {
        // We get the structure information
        PlayPlusParser.LeftPropertyContext leftExpression = (PlayPlusParser.LeftPropertyContext)context.leftExpr();
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
                String.format("%s.%s", structureVariable, variableTarget.getName()),
                variableSource
        );

        return String.format("%s.%s", structureVariable, variableTarget.getName());
    }

    private static String enterLeftPropertyArrayContext(
            PlayPlusParser.AssignationContext context,
            Application application,
            PrintWriter writer) {
        PlayPlusParser.LeftPropertyArrayContext targetArray = (PlayPlusParser.LeftPropertyArrayContext)context.leftExpr();
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
        if (array.getLength() == 1) {
            indexVariable = RightExpression.enterRightExpression(targetArray.rightExpr(0), application, writer);
        } else {
            // TODO Handle 2D array
        }

        // We get the value we want to set in the array.
        VariableWriter.writeSetToArray(
                writer,
                variableSource,
                String.format("%s.%s", structureVariable, array.getName()),
                indexVariable
        );

        return String.format("%s.%s", structureVariable, array.getName());
    }
}
