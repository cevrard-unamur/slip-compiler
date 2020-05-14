package be.unamur.info.b314.compiler.nbc;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.*;
import be.unamur.info.b314.compiler.nbc.helper.FunctionExpression;
import be.unamur.info.b314.compiler.nbc.helper.MapExpression;
import be.unamur.info.b314.compiler.nbc.helper.VariableExpression;
import be.unamur.info.b314.compiler.nbc.helper.VariableHelper;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.util.List;

public class NBCVisitor extends PlayPlusBaseVisitor {
    /**
     * The application for which we want to print the NBC code.
     */
    private final Application application;
    /**
     * The path to the folder of the test.
     */
    private final String inputPath;
    /**
     * The NBC printer.
     */
    private final NBCPrinter printer;

    /**
     * Initializes a new instance of a NBCVisitor.
     * @param printer the NBC printer.
     * @param inputPath the path to the folder of the test.
     * @param application the application for which we want to print the NBC code.
     */
    public NBCVisitor(NBCPrinter printer, String inputPath, Application application) {
        this.printer = printer;
        this.inputPath = inputPath;
        this.application = application;
        this.application.goToRootContext();
    }

    /**
     * The ANTRL function call on the program visit node.
     * @param ctx the context of the program.
     * @return the context of the program.
     */
    @Override
    public Object visitProgram(PlayPlusParser.ProgramContext ctx) {
        // We check if the imported map is correct.
        MapExpression.enterMapImportation((PlayPlusParser.MapImportationContext)ctx.mapImport(), this.inputPath, this.application);

        NBCWriter.writeSegmentStart(this.printer.getWriter());

        // We declare all the variables in the nbc files at the beginning.
        NBCWriter.writeComment(this.printer.getWriter(), "Variables");
        for (VariableBase variable : this.application.getAllVariables()) {
            this.printVariableBase(variable);
        }

        NBCWriter.writeComment(this.printer.getWriter(), "Functions parameters");
        for (VariableBase variable : this.application.getAllFunctionsParameters()) {
            this.printVariableBase(variable);
        }

        // Then, we declare all the structure
        NBCWriter.writeComment(this.printer.getWriter(), "Records");
        for (Record record : this.application.getAllRecords()) {
            List<VariableBase> variables = record.getVariables();

            if (variables.size() != 0) {
                this.printer.printStructureSegmentStart(record.getName());
                for (VariableBase variableOfRecord : variables) {
                    this.printVariableBase(variableOfRecord);
                }
                this.printer.printStructureSegmentEnd(record.getName());
            }
        }

        NBCWriter.writeSegmentEnd(this.printer.getWriter());

        for (PlayPlusParser.GlobalVariableContext global : ctx.globalVariable()) {
            VariableExpression.enterGlobalVariable(global, application, this.printer.getWriter());
        }

        for (PlayPlusParser.FunctContext function : ctx.funct()) {
            FunctionExpression.enterFunction((PlayPlusParser.FunctionDefinitionContext)function, this.application, this.printer.getWriter());
        }

        FunctionExpression.enterMain((PlayPlusParser.MainContext)ctx.mainFunction(), this.application, this.printer.getWriter());

        this.printer.close();
        return ctx;
    }

    /**
     * Print a variable in NBC.
     * @param variable the variable to print.
     */
    private void printVariableBase(VariableBase variable) {
        if (variable.getType().equals("void")) {
            return;
        }

        if (variable instanceof Variable) {
            VariableWriter.writeScalarDeclaration(this.printer.getWriter(),
                    VariableHelper.variableToNbcCodeType(variable.getType()),
                    variable.getNameAndContext());
        } else if (variable instanceof Array) {
            VariableWriter.writeArrayDeclaration(this.printer.getWriter(),
                    VariableHelper.variableToNbcCodeType(variable.getType()),
                    variable.getNameAndContext());
        } else {
            int i = 0;
        }
    }
}
