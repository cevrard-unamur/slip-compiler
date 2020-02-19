package be.unamur.info.b314.compiler;

import be.unamur.info.b314.compiler.NBCPrinter.NBCCodeTypes;

import java.util.Map;

/**
 * Print PCode for a given tree using provided symbol table and printer. This 
 * class uses ANTLR visitor mechanism.
 */
public class NBCVisitor extends PlayPlusBaseVisitor<Object> {

    private final Map<String, Integer> symTable;

    private final NBCPrinter printer;

    public NBCVisitor(Map<String, Integer> symTable, NBCPrinter printer) {
        this.symTable = symTable;
        this.printer = printer;
    }

    @Override
    public Object visitRoot(PlayPlusParser.RootContext ctx) {
       // printer.printSetStackPointer(symTable.size()); // Reserve space for Syntax.variables
        printer.printComments("Start instructions");
        super.visitRoot(ctx); // Print instructions
        printer.printComments("End instructions");
        printer.printStop(); // Stop execution
        return null;
    }
}
