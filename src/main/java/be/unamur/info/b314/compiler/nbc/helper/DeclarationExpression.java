package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;

public class DeclarationExpression {
    public static void enterInstruction(PlayPlusParser.InstContext context, Application application, PrintWriter writer) {
        if (context instanceof PlayPlusParser.ActionInstructionContext) {
            ActionExpression.enterActionInstructionContext(
                    (PlayPlusParser.ActionInstructionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.AssignationInstructionContext) {
            AssignationExpression.enterAssignationContext(
                    ((PlayPlusParser.AssignationInstructionContext) context).assignation(),
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.VariableInstructionContext) {
            VariableExpression.enterVariable(
                    (PlayPlusParser.VariableInstructionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.IfInstructionContext) {
            IfExpression.enterIfInstructionContext(
                    (PlayPlusParser.IfInstructionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.WhileInstructionContext) {
            WhileExpression.enterWhileInstruction(
                    (PlayPlusParser.WhileInstructionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.RepeatInstructionContext) {
            RepeatExpression.enterRepeatInstruction(
                    (PlayPlusParser.RepeatInstructionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.ForInstructionContext) {
            ForExpression.enterForInstruction(
                    (PlayPlusParser.ForInstructionContext)context,
                    application,
                    writer
            );
        }
    }
}
