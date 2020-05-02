package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;

public class WhileExpression {
    public static void enterWhileInstruction(PlayPlusParser.WhileInstructionContext context, Application application, PrintWriter writer) {
        WhileExpression.enterFor((PlayPlusParser.WhileContext)context.whileBlock(), application, writer);
    }

    public static void enterFor(PlayPlusParser.WhileContext context, Application application, PrintWriter writer) {
        // TODO : Handle the right expression
        // TODO : Generate the NBC code for the beginning of the loop
        //   - generate a label
        //   - check if the values are equals,
        //   - if yes, jump to the end
        //   - otherwise, continue
        // TODO : Execute the content of the loop (instruction)
        // TODO : Generate the NBC code for the end of the loop
        //   - otherwise, jump to the beginning
    }
}
