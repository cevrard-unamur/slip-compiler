package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;

public class ForExpression {
    public static void enterForInstruction(PlayPlusParser.ForInstructionContext context, Application application, PrintWriter writer) {
        ForExpression.enterFor((PlayPlusParser.ForContext)context.forBlock(), application, writer);
    }

    public static void enterFor(PlayPlusParser.ForContext context, Application application, PrintWriter writer) {
        // TODO : Handle the right expression
        // TODO : Generate the NBC code for the beginning of the loop
        //   - generate a label
        //   - check if the values are equals,
        //   - if yes, jump to the end
        //   - otherwise, continue
        // TODO : Execute the content of the loop (instruction)
        // TODO : Generate the NBC code for the end of the loop
        //   - jump to the label of the beginning
    }
}
