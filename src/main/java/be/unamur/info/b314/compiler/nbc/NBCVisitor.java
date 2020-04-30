package be.unamur.info.b314.compiler.nbc;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.*;
import be.unamur.info.b314.compiler.nbc.helper.Function;
import be.unamur.info.b314.compiler.nbc.helper.Map;
import be.unamur.info.b314.compiler.nbc.helper.VariableHelper;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.util.List;

public class NBCVisitor extends PlayPlusBaseVisitor {
    private final Application application;
    private final String inputFile;
    private final NBCPrinter printer;

    public NBCVisitor(NBCPrinter printer, String inputFile, Application application) {
        this.printer = printer;
        this.inputFile = inputFile;
        this.application = application;
        this.application.goToRootContext();
    }

    @Override
    public Object visitProgramme(PlayPlusParser.ProgrammeContext ctx) {
        // We check if the imported map is correct.
        Map.enterMapImportation((PlayPlusParser.MapImportationContext)ctx.mapImport(), this.inputFile, this.application);

        this.printer.printDataSegmentStart();

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

        this.printer.printDataSegmentEnd();

        for (PlayPlusParser.FunctContext function : ctx.funct()) {
            Function.enterFunction((PlayPlusParser.FunctionDefinitionContext)function, this.application, this.printer.getWriter());
        }

        Function.enterMain((PlayPlusParser.MainContext)ctx.mainFunction(), this.application, this.printer.getWriter());

        this.printer.close();
        return ctx;
    }

    private void printVariableBase(VariableBase variable) {
        if (variable.getType().equals("void")) {
            return;
        }

        if (variable instanceof Variable) {
            VariableWriter.printScalarInitialisation(this.printer.getWriter(),
                    VariableHelper.variableToNbcCodeType(variable.getType()),
                    variable.getName());
        } else if (variable instanceof Array) {
            VariableWriter.printArrayInitialisation(this.printer.getWriter(),
                    VariableHelper.variableToNbcCodeType(variable.getType()),
                    variable.getName());
        }
    }
}
