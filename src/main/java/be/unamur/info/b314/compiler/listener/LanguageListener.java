package be.unamur.info.b314.compiler.listener;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class LanguageListener extends PlayPlusBaseListener {
    private Application application;

    public LanguageListener(Application application) {
        this.application = application;
    }

    @Override
    public void enterConstant(PlayPlusParser.ConstantContext ctx) {
        this.application.addVariable("", ctx.ID().getText(), "", true);
        super.enterConstant(ctx);
    }

    @Override
    public void enterVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx) {
        for (TerminalNode id : ctx.ID()) {

            if (ctx.variableType() instanceof  PlayPlusParser.ScalarContext)
            {
                TerminalNode variableType = (TerminalNode)ctx.variableType().children.get(0);

                this.application.addVariable(variableType.getText(), id.getText(), "", false);
            }
            else if (ctx.variableType() instanceof PlayPlusParser.ArrayContext)
            {
                PlayPlusParser.ArrayDefinitionContext arrayType = (PlayPlusParser.ArrayDefinitionContext)ctx.variableType().children.get(0);
                TerminalNode variableType = (TerminalNode)arrayType.children.get(0);

                List<Integer> arraySize = new ArrayList<>();

                for (Object node : arrayType.children) {
                    if (((TerminalNode)node).getSymbol().getType() == PlayPlusParser.NUMBER) {
                        arraySize.add(Integer.parseUnsignedInt(((TerminalNode) node).getText()));
                    }
                }

                Integer size[] = new Integer[arraySize.size()];
                size = arraySize.toArray(size);
                this.application.addArray(variableType.getText(), id.getText(), size);
            } else if (ctx.variableType() instanceof PlayPlusParser.StructureContext) {
                PlayPlusParser.StructureDefinitionContext structureType = (PlayPlusParser.StructureDefinitionContext)ctx.variableType().children.get(0);
                TerminalNode structureName = (TerminalNode) structureType.children.get(0);

                this.application.addVariable(structureName.getText(), id.getText(), "", false);
            }
        }
    }

    @Override
    public void enterStructureDefinition(PlayPlusParser.StructureDefinitionContext ctx) {
        this.application.addRecord(ctx.ID().getText());
    }

    @Override
    public void exitStructureDefinition(PlayPlusParser.StructureDefinitionContext ctx) {
        this.application.leaveContext();
    }

    @Override
    public void enterFunction(PlayPlusParser.FunctionContext ctx) {
        this.application.addFunction(ctx.ID().getText());
    }

    @Override
    public void exitFunction(PlayPlusParser.FunctionContext ctx) {
        this.application.leaveContext();
    }
}
