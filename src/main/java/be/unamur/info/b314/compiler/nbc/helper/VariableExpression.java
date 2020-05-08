package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.nbc.helper.RightExpression;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;
import com.sun.org.apache.xerces.internal.dom.ChildNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class VariableExpression {
    public static void enterGlobalVariable(PlayPlusParser.GlobalVariableContext context, Application application, PrintWriter writer) {

        PlayPlusParser.GlobalDeclarationContext ctx = (PlayPlusParser.GlobalDeclarationContext)context;

        ParseTree declarationType = ctx.getChild(0);

        if (declarationType instanceof PlayPlusParser.VariableDeclarationContext){

            moveVariable((PlayPlusParser.VariableDefinitionContext)declarationType,application,writer);

        }else if(declarationType instanceof PlayPlusParser.ConstDeclarationContext){

            PlayPlusParser.ConstantContext constantContext = (PlayPlusParser.ConstantContext) declarationType;

            if (constantContext.initVariable() instanceof PlayPlusParser.RightInitialisationContext) {

                PlayPlusParser.RightInitialisationContext contextSwitch = (PlayPlusParser.RightInitialisationContext)constantContext.initVariable();
                PlayPlusParser.RightExprContext rightExprContext = contextSwitch.rightExpr();

                Variable variable = application.getVariable(constantContext.ID().getText());

                if (variable.getConstant()){
                    VariableWriter.writeVariableMove(writer, variable.getName(),
                            RightExpression.enterRightExpression(rightExprContext, application, writer)
                    );
                }
            }else if (constantContext.initVariable() instanceof PlayPlusParser.ArrayInitialisationContext) {
                PlayPlusParser.ArrayInitialisationContext arrayInitialisationContext = (PlayPlusParser.ArrayInitialisationContext)constantContext.initVariable();

                Array array = application.getArray(constantContext.ID().getText());

                VariableWriter.writeArrayBuild(writer, array.getName(), ArrayExpression.enterInit(arrayInitialisationContext, application, writer));

            }
        }
    }

    public static void enterVariable(PlayPlusParser.VariableInstructionContext context, Application application, PrintWriter writer) {

        PlayPlusParser.VariableDeclarationContext varContext = context.variableDeclaration();

        moveVariable((PlayPlusParser.VariableDefinitionContext)varContext,application,writer);
    }

    private static void moveVariable(PlayPlusParser.VariableDefinitionContext context, Application application, PrintWriter writer) {
        if (context.initVariable() != null){
            if (context.initVariable() instanceof PlayPlusParser.RightInitialisationContext){

                PlayPlusParser.RightInitialisationContext contextSwitch = (PlayPlusParser.RightInitialisationContext)context.initVariable();
                PlayPlusParser.RightExprContext rightExprContext = contextSwitch.rightExpr();

                for (TerminalNode id : context.ID()){
                    VariableBase variable = application.getVariable(id.getText());

                    VariableWriter.writeVariableMove(writer, variable.getName(),
                            RightExpression.enterRightExpression(rightExprContext, application, writer)
                    );
                }
            }else if (context.initVariable() instanceof PlayPlusParser.ArrayInitialisationContext) {

                PlayPlusParser.ArrayInitialisationContext arrayInitialisationContext = (PlayPlusParser.ArrayInitialisationContext)context.initVariable();

                for (TerminalNode id : context.ID()){
                    Array array = application.getArray(id.getText());

                    VariableWriter.writeArrayBuild(writer, array.getName(), ArrayExpression.enterInit(arrayInitialisationContext, application, writer));
                }
            }
        }
    }
}
