package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.ActionWriter;
import be.unamur.info.b314.compiler.nbc.writer.FunctionWriter;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;

public class Function {
    public static void enterMain(PlayPlusParser.MainContext context, Application application, PrintWriter writer) {
        FunctionWriter.writeMainThreadStart(writer);

        for (ParseTree child : context.mainFunctionInstruction().children) {
            if (child instanceof PlayPlusParser.DigInstructionContext) {
                Function.enterDig((PlayPlusParser.DigInstructionContext)child, writer);
            }
        }

        FunctionWriter.writeMainThreadEnd(writer);
    }

    public static void enterFunction(PlayPlusParser.FunctionDefinitionContext context, Application application, PrintWriter writer) {
        FunctionWriter.writeFunctionSubroutinesStart(writer, context.FUNCTION().getText());

        FunctionWriter.writeFunctionSubroutinesEnd(writer);
    }

    public static void enterDig(PlayPlusParser.DigInstructionContext context, PrintWriter writer) {
        ActionWriter.writeDig(writer);
    }

    public static void enterJump(PlayPlusParser.DigInstructionContext context, PrintWriter writer) {
        // TODO loop on the right expression
    }

    public static void enterFight(PlayPlusParser.DigInstructionContext context, PrintWriter writer) {
        ActionWriter.writeFight(writer);
    }
}
