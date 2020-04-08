package be.unamur.info.b314.compiler.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariableExpression {
    public static Object parseVariableInstruction(PlayPlusParser.VariableInstructionContext ctx, Application application) {
        VariableExpression.parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)ctx.variableDeclaration(), application);
        return ctx;
    }

    public static Object parseVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx, Application application) {
        for (TerminalNode id : ctx.ID()) {
            if (ctx.variableType() instanceof PlayPlusParser.ScalarTypeContext) {
                VariableHelper.addVariable((PlayPlusParser.ScalarTypeContext)ctx.variableType(), id, false, application);
            } else if (ctx.variableType() instanceof PlayPlusParser.ArrayTypeContext) {
                VariableHelper.addArray((PlayPlusParser.ArrayTypeContext)ctx.variableType(), id, application);
            } else if (ctx.variableType() instanceof PlayPlusParser.StructureTypeContext) {
                VariableHelper.addStructure(id, application);
            }
        }

        return ctx;
    }
}
