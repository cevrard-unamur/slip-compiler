package be.unamur.info.b314.compiler.application;

import java.util.ArrayList;

public class Environment {
    private ArrayList<Variable> variables;
    private ArrayList<Function> functions;

    public Environment() {
        this.variables = new ArrayList<>();
        this.functions = new ArrayList<>();
    }

    public void addFunction(Function function) {
        this.functions.add(function);
    }

    public void addVariable(Variable variable) {
        this.variables.add(variable);
    }
}
