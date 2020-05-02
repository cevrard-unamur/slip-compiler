package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.language.helper.VariableExpression;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class AssignationExpression {
    private static int conditionId = 1;
    private static final String assignationTemporaryVariable = "__assignationVariable";

    public static void enterAssignationContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        // WE give each time the full context to the children functions because we need some information from it.
        if (context.leftExpr() instanceof PlayPlusParser.LeftIdContext) {
            AssignationExpression.enterLeftIdContext(context, application, writer);
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftArrayContext) {
            AssignationExpression.enterLeftArrayContext(context, application, writer);
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftPropertyContext) {
            // TODO
        } else if (context.leftExpr() instanceof PlayPlusParser.LeftPropertyArrayContext) {
            // TODO
        }
    }

    private static String getAssignationName() { return AssignationExpression.assignationTemporaryVariable + AssignationExpression.conditionId; }

    private static void enterLeftIdContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        // We get the id of the target variable (the left expression) by retrieving the matching variable in the context
        Variable variableTarget = application.getVariable(((PlayPlusParser.LeftIdContext) context.leftExpr()).ID().getText());

        // This call generate a temporary variable that we use to move it result into our left variable
        String variableSource = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        VariableWriter.writeVariableMove(
                writer,
                variableTarget.getName(),
                variableSource
        );
    }

    private static void enterLeftArrayContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        PlayPlusParser.LeftArrayContext targetArray = (PlayPlusParser.LeftArrayContext)context.leftExpr();
        Array array = application.getArray(targetArray.ID().getText());

        String variableName = "--";
        String targetName = AssignationExpression.getAssignationName();

        // We get the variable which hold the targeted index in the array.
        for (PlayPlusParser.RightExprContext rightExpr : targetArray.rightExpr()) {
            variableName = RightExpression.enterRightExpression(rightExpr, application, writer);
        }

        // We get the value we want to set in the array.
        if (context.rightExpr() instanceof PlayPlusParser.NumberContext) {
            String setValue = ((PlayPlusParser.NumberContext) context.rightExpr()).NUMBER().getText();
            VariableWriter.writeTemporaryScalarInitialisation(writer,
                    NBCCodeTypes.Int,
                    targetName,
                    setValue);
            VariableWriter.writeSetToArray(writer,
                    targetName,
                    array.getName(),
                    variableName);
        }

        AssignationExpression.conditionId++;
    }
}
