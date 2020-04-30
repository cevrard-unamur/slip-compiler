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
            } else if (child instanceof PlayPlusParser.AssignationInstructionContext) {
                Assignation.enterAssignationContext(((PlayPlusParser.AssignationInstructionContext) child).assignation(), application, writer);
            } else if (child instanceof PlayPlusParser.IfInstructionContext) {
                If.enterIfInstructionContext((PlayPlusParser.IfInstructionContext)child, application, writer);
            }
        }

        FunctionWriter.writeMainThreadEnd(writer);
    }

    public static void enterFunction(PlayPlusParser.FunctionDefinitionContext context, Application application, PrintWriter writer) {
        application.enterContext(context.ID().getText());
        FunctionWriter.writeFunctionSubroutinesStart(writer, context.ID().getText());

        for (PlayPlusParser.FunctionInstContext functionContext : context.functionInst()) {
            Function.enterFunctionInstructionContext((PlayPlusParser.FunctionInstructionContext)functionContext, application, writer);
        }

        FunctionWriter.writeFunctionSubroutinesEnd(writer);
        application.leaveContext();
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

    private static void enterFunctionInstructionContext(PlayPlusParser.FunctionInstructionContext context, Application application, PrintWriter writer) {
        for (PlayPlusParser.InstContext instruction : context.inst()) {
            if (instruction instanceof PlayPlusParser.AssignationInstructionContext) {
                Assignation.enterAssignationContext(((PlayPlusParser.AssignationInstructionContext) instruction).assignation(), application, writer);
            }
        }
    }
}
