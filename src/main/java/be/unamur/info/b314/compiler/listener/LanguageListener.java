package be.unamur.info.b314.compiler.listener;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class LanguageListener extends PlayPlusBaseListener {
    private List<String> errors = new ArrayList();
    private Application application = new Application();

    public List<String> getErrors() {
        return errors;
    }

    public Application getApplication() {
        return application;
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
                this.application.addVariable(ctx.variableType().getText(), id.getText(), "", false);
            }
            if (ctx.variableType() instanceof PlayPlusParser.ArrayContext)
            {
                String size;
                size = ctx.variableType().getText().replaceAll("[^\\d]","");
                size = size.trim();
                if (ctx.variableType().getText().contains("boolean"))
                {
                    this.application.addArray("boolean",id.getText(),Integer.parseUnsignedInt(size));
                }
                if (ctx.variableType().getText().contains("char"))
                {
                    this.application.addArray("char",id.getText(),Integer.parseUnsignedInt(size));
                }
                if (ctx.variableType().getText().contains("integer"))
                {
                    this.application.addArray("integer",id.getText(),Integer.parseUnsignedInt(size));
                }
            }
        }

        super.enterVariableDefinition(ctx);
    }

    @Override
    public void enterStructureDefinition(PlayPlusParser.StructureDefinitionContext ctx) {
        this.application.addRecord(ctx.ID().getText());
        super.enterStructureDefinition(ctx);
    }

    @Override
    public void exitStructureDefinition(PlayPlusParser.StructureDefinitionContext ctx) {
        this.application.leaveContext();
        super.exitStructureDefinition(ctx);
    }
}
