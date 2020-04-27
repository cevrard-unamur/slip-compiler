package be.unamur.info.b314.compiler.language;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.*;
import be.unamur.info.b314.compiler.language.helper.*;

public class LanguageVisitor extends PlayPlusBaseVisitor {
    private Application application;

    public LanguageVisitor(Application application) {
        this.application = application;
    }

    @Override
    public Object visitGlobalDeclaration(PlayPlusParser.GlobalDeclarationContext ctx) {
        try {
            return DeclarationExpression.parseGlobalDeclaration(ctx, this.application);
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    @Override
    public Object visitFunctionDefinition(PlayPlusParser.FunctionDefinitionContext ctx) {
        try {
            return FunctionExpression.parseFunctionDefinition(ctx, this.application);
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }

    @Override
    public Object visitMain(PlayPlusParser.MainContext ctx) {
        try {
            PlayPlusParser.MainInstructionContext instructions = (PlayPlusParser.MainInstructionContext)ctx.mainFunctionInstruction();

            DeclarationExpression.parseMainInstructionContext(instructions, this.application);

            return super.visitMain(ctx);
        } catch (Exception ex) {
            this.application.addError(ex.getMessage());
            return null;
        }
    }
}
