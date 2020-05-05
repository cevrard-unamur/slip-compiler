package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;

public class VariableExpression {
    public static void enterGlobalVariable(PlayPlusParser.GlobalVariableContext context, Application application, PrintWriter writer) {
        // TODO Matthias
        //  Pour info, les variables sont déjà créé dans NBC, il faut "juste"
        //    récupérer le resultat de l'expression droite et l'assigner à la variable existante
        //  Toutes les variables de l'application (définie dans le code SLIP) sont créés au début du programme NBC
    }

    public static void enterVariable(PlayPlusParser.VariableInstructionContext context, Application application, PrintWriter writer) {
        // TODO Matthias
        //  Pour info, les variables sont déjà créé dans NBC, il faut "juste"
        //    récupérer le resultat de l'expression droite et l'assigner à la variable existante
        //  Toutes les variables de l'application (définie dans le code SLIP) sont créés au début du programme NBC
    }
}
