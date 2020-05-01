package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.ActionInterface;
import be.unamur.info.b314.compiler.nbc.writer.ActionWriter;
import be.unamur.info.b314.compiler.nbc.writer.LoopWriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class ActionExpression {
    private static int conditionId = 1;
    private static final String actionTemporaryVariable = "__actionVariable";

    public static void enterActionInstructionContext(PlayPlusParser.ActionInstructionContext context, Application application, PrintWriter writer) {
        if (context.actionType() instanceof PlayPlusParser.DigContext) {
            ActionWriter.writeDig(writer);
        } else {
            PlayPlusParser.ActionContext action = (PlayPlusParser.ActionContext) context.actionType();
            PlayPlusParser.RightExprContext rightExpression = action.rightExpr();
            TerminalNode node = (TerminalNode) action.getChild(0);

            if (node.getSymbol().getType() == PlayPlusParser.LEFT) {
                if (rightExpression == null) {
                    // If we don't have a right expression, it's mean we are only performing the action once
                    ActionWriter.writeTurnLeft(writer);
                } else {
                    // Otherwise, we need to create a loop with this action
                    executeRightExpressionAction(
                            (interfaceWriter) -> ActionWriter.writeTurnLeft(interfaceWriter),
                            rightExpression,
                            application,
                            writer);
                }
            } else if (node.getSymbol().getType() == PlayPlusParser.UP) {
                if (rightExpression == null) {
                    // If we don't have a right expression, it's mean we are only performing the action once
                    ActionWriter.writeGoForward(writer);
                } else {
                    // Otherwise, we need to create a loop with this action
                    executeRightExpressionAction(
                            (interfaceWriter) -> ActionWriter.writeGoForward(interfaceWriter),
                            rightExpression,
                            application,
                            writer);
                }
            }
        }
    }

    private static String getActionName() { return ActionExpression.actionTemporaryVariable + ActionExpression.conditionId; }

    private static void executeRightExpressionAction(
            ActionInterface actionInterface,
            PlayPlusParser.RightExprContext rightExpression,
            Application application,
            PrintWriter writer) {
        String variableName = "--";
        LoopWriter.writeStartLoop(writer, getActionName(), "0");
        actionInterface.execute(writer);

        if (rightExpression instanceof PlayPlusParser.NumberContext) {
            variableName= ((PlayPlusParser.NumberContext) rightExpression).NUMBER().getText();
        } else if (rightExpression instanceof PlayPlusParser.LeftExpressionContext) {
            variableName = LeftExpression.enterLeftExpression(
                    (PlayPlusParser.LeftExpressionContext)rightExpression,
                    application,
                    writer);
        } else if (rightExpression instanceof PlayPlusParser.FunctionCallExpressionContext) {
            variableName = FunctionExpression.enterFunctionCall(
                    ((PlayPlusParser.FunctionCallExpressionContext) rightExpression).functionCall(),
                    application,
                    writer);
        }

        LoopWriter.writeEndLoop(writer, getActionName(), variableName);
        ActionExpression.conditionId++;
    }
}
