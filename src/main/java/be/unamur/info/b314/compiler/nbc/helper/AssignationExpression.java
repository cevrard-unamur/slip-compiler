package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class AssignationExpression {
    public static void enterAssignationContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        if (context.leftExpr() instanceof PlayPlusParser.LeftIdContext) {
            AssignationExpression.enterLeftIdContext(context, application, writer);
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftArrayContext) {
            // TODO
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftPropertyContext) {
            // TODO
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftPropertyArrayContext) {
            // TODO
        }
    }

    private static void enterLeftIdContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        // We get the id of the target variable (the left expression) by retrieving the matching variable in the context
        Variable variableTarget = application.getVariable(((PlayPlusParser.LeftIdContext) context.leftExpr()).ID().getText());

        // We check the right expression to write the NBC
        // If we have a char, a number or a boolean we need to 'set' the variable
        // If we have a right expression which is another variable, we need to 'mov' it
        if (context.rightExpr() instanceof PlayPlusParser.CharContext) {
            String setValue = ((PlayPlusParser.CharContext) context.rightExpr()).CHAR().getText();
            VariableWriter.writeVariableSet(writer, variableTarget.getName(), setValue);
        } else if (context.rightExpr() instanceof PlayPlusParser.NumberContext) {
            String setValue = ((PlayPlusParser.NumberContext) context.rightExpr()).NUMBER().getText();
            VariableWriter.writeVariableSet(writer, variableTarget.getName(), setValue);
        } else if (context.rightExpr() instanceof PlayPlusParser.BooleanTrueContext) {
            VariableWriter.writeVariableSet(writer, variableTarget.getName(), "1");
        } else if (context.rightExpr() instanceof PlayPlusParser.BooleanFalseContext) {
            VariableWriter.writeVariableSet(writer, variableTarget.getName(), "0");
        } else if (context.rightExpr() instanceof PlayPlusParser.FunctionCallExpressionContext) {
            // We call the function to get the result of it
            FunctionExpression.enterFunctionCall(((PlayPlusParser.FunctionCallExpressionContext) context.rightExpr()).functionCall(),
                    application,
                    writer);
            // We move the result into the target variable
            VariableWriter.writeVariableMove(writer,
                    variableTarget.getName(),
                    ((PlayPlusParser.FunctionCallExpressionContext) context.rightExpr()).functionCall().ID().getText());
        } else if (context.rightExpr() instanceof PlayPlusParser.LeftExpressionContext) {
            // TODO
        }
    }
}
