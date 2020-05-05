package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import com.sun.org.apache.xerces.internal.dom.ChildNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class VariableExpression {
    public static void enterGlobalVariable(PlayPlusParser.GlobalVariableContext context, Application application, PrintWriter writer) {
        // TODO Matthias
        //  Pour info, les variables sont déjà créé dans NBC, il faut "juste"
        //    récupérer le resultat de l'expression droite et l'assigner à la variable existante
        //  Toutes les variables de l'application (définie dans le code SLIP) sont créés au début du programme NBC
        //  Créer des tests slip pour la fonctionnalité sur laquelle je travail

        PlayPlusParser.GlobalDeclarationContext ctx = (PlayPlusParser.GlobalDeclarationContext)context;

        ParseTree declarationType = ctx.getChild(0);

        if (declarationType instanceof PlayPlusParser.VariableDeclarationContext){
            PlayPlusParser.VariableDeclarationContext var = (PlayPlusParser.VariableDeclarationContext) declarationType;

        }
    }

    public static void enterVariable(PlayPlusParser.VariableInstructionContext context, Application application, PrintWriter writer) {
        // TODO Matthias
        //  Pour info, les variables sont déjà créé dans NBC, il faut "juste"
        //    récupérer le resultat de l'expression droite et l'assigner à la variable existante
        //  Toutes les variables de l'application (définie dans le code SLIP) sont créés au début du programme NBC
    }
}
