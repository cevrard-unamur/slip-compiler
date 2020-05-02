package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;

public class RepeatExpression {
    public static void enterRepeatInstruction(PlayPlusParser.RepeatInstructionContext context, Application application, PrintWriter writer) {
        RepeatExpression.enterRepeat((PlayPlusParser.RepeatContext)context.repeatBlock(), application, writer);
    }

    public static void enterRepeat(PlayPlusParser.RepeatContext context, Application application, PrintWriter writer) {
        // TODO : Handle the right expression
        // TODO : Generate the NBC code for the beginning of the loop
        //   - generate a label
        // TODO : Execute the content of the loop (instruction)
        // TODO : Generate the NBC code for the end of the loop
        //   - check if the values are equals,
        //   - if yes, continue
        //   - otherwise, jump to the beginning
    }
}
