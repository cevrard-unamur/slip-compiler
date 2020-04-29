package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.PlayPlusLexer;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.language.LanguageVisitor;
import be.unamur.info.b314.compiler.map.MapListener;
import be.unamur.info.b314.compiler.nbc.NBCPrinter;
import be.unamur.info.b314.compiler.nbc.NBCVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.List;

public class ANTLRParser {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private PlayPlusParser parser;
    private Application application;

    public ANTLRParser() {
        this.application = new Application();
    }

    /**
     * Builds the abstract syntax tree from input.
     */
    public PlayPlusParser.RootContext parse(ANTLRInputStream input) throws ParseCancellationException {
        // Create the token stream
        CommonTokenStream tokens = new CommonTokenStream(new PlayPlusLexer(input));
        // Intialise parser
        parser = new PlayPlusParser(tokens);
        // Set error listener to adoc implementation
        parser.removeErrorListeners();
        MyConsoleErrorListener errorListener = new MyConsoleErrorListener();
        parser.addErrorListener(errorListener);
        // Launch parsing
        PlayPlusParser.RootContext tree;
        try {
            tree = parser.root();
        } catch (RecognitionException e) {
            throw new IllegalArgumentException("Error while retrieving parsing tree!", e);
        }
        if (errorListener.errorHasBeenReported()) {
            throw new IllegalArgumentException("Error while parsing input!");
        }
        return tree;
    }

    public void mapParser(PlayPlusParser.RootContext tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        MapListener mapListener = new MapListener();
        walker.walk(mapListener, tree);

        handleErrors(mapListener.getErrors(), "An error occurred with the map file");
    }

    public void languageParser(PlayPlusParser.RootContext tree) {
        LanguageVisitor languageVisitor = new LanguageVisitor(this.application);
        languageVisitor.visit(tree);

        handleErrors(this.application.getErrors(), "An error occurred with the language file");
    }

    public void nbcPrinter(PlayPlusParser.RootContext tree, String inputFile) throws FileNotFoundException {
        NBCPrinter nbcPrinter = new NBCPrinter("nbcCode.nbc");
        NBCVisitor nbcVisitor = new NBCVisitor(nbcPrinter, inputFile, this.application);
        nbcVisitor.visit(tree);

        handleErrors(this.application.getErrors(), "An error occurred with the language file");
    }

    public  void handleErrors(List<String> errors, String errorMessage) {
        if (errors.size() != 0) {
            for (String error : errors) {
                LOG.error(error);
            }

            throw new PlayPlusException(errorMessage);
        }
    }
}