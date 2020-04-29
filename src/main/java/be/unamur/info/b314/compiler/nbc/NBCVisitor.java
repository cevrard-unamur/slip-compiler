package be.unamur.info.b314.compiler.nbc;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.main.ANTLRParser;
import be.unamur.info.b314.compiler.nbc.helper.GlobalDeclaration;
import be.unamur.info.b314.compiler.nbc.helper.Map;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class NBCVisitor extends PlayPlusBaseVisitor {
    private final Application application;
    private final String inputFile;
    private final NBCPrinter printer;

    public NBCVisitor(NBCPrinter printer, String inputFile, Application application) {
        this.printer = printer;
        this.inputFile = inputFile;
        this.application = application;
    }

    @Override
    public Object visitProgramme(PlayPlusParser.ProgrammeContext ctx) {
        Map.enterMapImportation((PlayPlusParser.MapImportationContext)ctx.mapImport(), this.inputFile, this.application);

        for (PlayPlusParser.GlobalVariableContext declaration : ctx.globalVariable()) {
            GlobalDeclaration.globalDeclaration(declaration, this.application, this.printer.getWriter());
        }

        this.printer.close();
        return ctx;
    }
}
