package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class VariableExpression {
    /**
     * Enters in a global variable to generate the NBC code of it.
     * @param context the global variable context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
    public static void enterGlobalVariable(PlayPlusParser.GlobalVariableContext context, Application application, PrintWriter writer) {
        PlayPlusParser.GlobalDeclarationContext ctx = (PlayPlusParser.GlobalDeclarationContext) context;
        ParseTree declarationType = ctx.getChild(0);

        if (declarationType instanceof PlayPlusParser.VariableDeclarationContext) {
            enterVariableDefinition((PlayPlusParser.VariableDefinitionContext) declarationType, application, writer);
        } else if (declarationType instanceof PlayPlusParser.ConstDeclarationContext) {
            PlayPlusParser.ConstantContext constantContext = (PlayPlusParser.ConstantContext) declarationType;

            if (constantContext.initVariable() instanceof PlayPlusParser.RightInitialisationContext) {
                PlayPlusParser.RightInitialisationContext contextSwitch = (PlayPlusParser.RightInitialisationContext) constantContext.initVariable();
                PlayPlusParser.RightExprContext rightExprContext = contextSwitch.rightExpr();
                Variable variable = application.getVariable(constantContext.ID().getText());

                if (variable.getConstant()) {
                    VariableWriter.writeVariableMove(writer, variable.getNameAndContext(),
                            RightExpression.enterRightExpression(rightExprContext, application, writer)
                    );
                }
            } else if (constantContext.initVariable() instanceof PlayPlusParser.ArrayInitialisationContext) {
                PlayPlusParser.ArrayInitialisationContext arrayInitialisationContext =
                        (PlayPlusParser.ArrayInitialisationContext) constantContext.initVariable();
                Array array = application.getArray(constantContext.ID().getText());
                VariableWriter.writeArrayBuild(
                        writer,
                        array.getNameAndContext(),
                        ArrayExpression.enterArrayInitialisation(arrayInitialisationContext, application, writer)
                );
            }
        }
    }

    /**
     * Enters in a variable instruction to generate the NBC code of it.
     * @param context the variable instruction context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
    public static void enterVariableInstruction(
            PlayPlusParser.VariableInstructionContext context,
            Application application,
            PrintWriter writer
    ) {
        PlayPlusParser.VariableDeclarationContext varContext = context.variableDeclaration();
        VariableExpression.enterVariableDefinition((PlayPlusParser.VariableDefinitionContext) varContext, application, writer);
    }

    /**
     * Enters in a variable definition to generate the NBC code of it.
     * @param context the variable definition context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
    private static void enterVariableDefinition(
            PlayPlusParser.VariableDefinitionContext context,
            Application application,
            PrintWriter writer
    ) {
        if (context.initVariable() != null) {
            if (context.initVariable() instanceof PlayPlusParser.RightInitialisationContext) {
                PlayPlusParser.RightInitialisationContext contextSwitch =
                        (PlayPlusParser.RightInitialisationContext) context.initVariable();
                PlayPlusParser.RightExprContext rightExprContext = contextSwitch.rightExpr();

                for (TerminalNode id : context.ID()) {
                    VariableBase variable = application.getVariable(id.getText());

                    VariableWriter.writeVariableMove(
                            writer,
                            variable.getNameAndContext(),
                            RightExpression.enterRightExpression(rightExprContext, application, writer)
                    );
                }
            } else if (context.initVariable() instanceof PlayPlusParser.ArrayInitialisationContext) {
                PlayPlusParser.ArrayInitialisationContext arrayInitialisationContext = (PlayPlusParser.ArrayInitialisationContext) context.initVariable();

                for (TerminalNode id : context.ID()) {
                    Array array = application.getArray(id.getText());
                    VariableWriter.writeArrayBuild(
                            writer,
                            array.getNameAndContext(),
                            ArrayExpression.enterArrayInitialisation(arrayInitialisationContext, application, writer)
                    );
                }
            }
        }
    }
}
