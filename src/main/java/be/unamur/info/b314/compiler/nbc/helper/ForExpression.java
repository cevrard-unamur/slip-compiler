package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class ForExpression {
    private static int forId = 1;
    private static final String forTemporaryVariable = "__forVariable";

    private static String getJumpName() { return ForExpression.forTemporaryVariable + ForExpression.forId; }
    private static String getJumpNameEnd() { return ForExpression.forTemporaryVariable + ForExpression.forId + "End"; }

    public static void enterForInstruction(PlayPlusParser.ForInstructionContext context, Application application, PrintWriter writer) {
        ForExpression.enterFor((PlayPlusParser.ForContext)context.forBlock(), application, writer);
    }

    public static void enterFor(PlayPlusParser.ForContext context, Application application, PrintWriter writer) {
        String incrementLoopVariableName = context.ID().getText();

        // Calculate the right expression for the initialisation
        String rightExpressionInitialisation = RightExpression.enterRightExpression(
                context.rightExpr(0),
                application,
                writer
        );
        // Move this expression to the loop variable
        VariableWriter.writeVariableMove(
                writer,
                incrementLoopVariableName,
                rightExpressionInitialisation
        );

        // Calculate the right expression for the end of the loop
        String rightExpressionEndOfLoop = RightExpression.enterRightExpression(
                context.rightExpr(1),
                application,
                writer
        );

        // Write the label to restart the loop
        NBCWriter.writeLabel(writer, ForExpression.getJumpName());
        // Write the compare condition, if the condition is false, we jump to the end
        IfWriter.writeBreakIfCondition(
                writer,
                NBCOpCodeTypes.Equal,
                ForExpression.getJumpNameEnd(),
                incrementLoopVariableName,
                rightExpressionEndOfLoop
        );

        // Content of the loop
        for (PlayPlusParser.InstContext instruction : context.inst()) {
            DeclarationExpression.enterInstruction(instruction, application, writer);
        }

        // Jump to the beginning of the loop
        IfWriter.writeJump(writer, ForExpression.getJumpName());
        // End of the condition label
        NBCWriter.writeLabel(writer, ForExpression.getJumpNameEnd());
        ForExpression.forId++;
    }
}
