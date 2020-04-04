package be.unamur.info.b314.compiler.listener;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.helper.ArrayHelper;
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
}
