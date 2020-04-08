package be.unamur.info.b314.compiler.visitor;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.*;
import be.unamur.info.b314.compiler.exception.BooleanRightExpressionException;
import be.unamur.info.b314.compiler.exception.IncorrectTypeException;
import be.unamur.info.b314.compiler.exception.IntegerRightExpressionException;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.helper.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import sun.reflect.generics.tree.VoidDescriptor;
import tmp.LanguageParser;

import java.util.ArrayList;
import java.util.List;

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
