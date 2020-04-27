package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

public class ConstantExpression {
    public static Object parseConstantDeclaration(PlayPlusParser.ConstDeclarationContext ctx, Application application) {
        ConstantExpression.parseConstant((PlayPlusParser.ConstantContext)ctx, application);

        return ctx;
    }

    public static Object parseConstant(PlayPlusParser.ConstantContext ctx, Application application) {
        if (ctx.variableType() instanceof PlayPlusParser.ScalarTypeContext)
        {
            VariableHelper.addVariable((PlayPlusParser.ScalarTypeContext)ctx.variableType(), ctx.ID(), true, application);
        }
        else if (ctx.variableType() instanceof PlayPlusParser.ArrayTypeContext)
        {
            VariableHelper.addArray((PlayPlusParser.ArrayTypeContext)ctx.variableType(), ctx.ID(), application);

        } else if (ctx.variableType() instanceof PlayPlusParser.StructureTypeContext) {
            VariableHelper.addStructure(ctx.ID(), application);
        }

        return ctx;
    }
}
