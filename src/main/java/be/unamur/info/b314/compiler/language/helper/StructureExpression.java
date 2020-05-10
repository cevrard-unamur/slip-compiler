package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import org.antlr.v4.runtime.tree.ParseTree;

public class StructureExpression {
    /**
     * Method that parse a structure declaration
     * @param ctx current structure declaration context
     * @param application current application
     * @return the structure declaration context
     */
    public static Object parseStructureDeclaration(PlayPlusParser.StructureDeclarationContext ctx, Application application) {
        StructureExpression.parseStructure((PlayPlusParser.StructureContext)ctx, application);

        return ctx;
    }

    /**
     * Method that parse a structure
     * @param ctx current structure context
     * @param application current application
     * @return the structure context
     */
    public static Object parseStructure(PlayPlusParser.StructureContext ctx, Application application) {
        application.addRecord(ctx.ID().getText());

        for (ParseTree node : ctx.children) {
            if (node instanceof PlayPlusParser.VariableDefinitionContext) {
                VariableExpression.parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)node, application);
            } else if (node instanceof PlayPlusParser.StructureDeclarationContext) {
                StructureExpression.parseStructureDeclaration((PlayPlusParser.StructureDeclarationContext)node, application);
            }
        }

        application.leaveContext();

        return  ctx;
    }
}
