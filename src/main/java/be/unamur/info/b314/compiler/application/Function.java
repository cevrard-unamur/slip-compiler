package be.unamur.info.b314.compiler.application;

import java.util.ArrayList;

public class Function extends Context {
    private String name;
    private String returnType;

    private ArrayList<VariableBase> arguments;

    public String getName() {
        return name;
    }

    public String getReturnType() { return returnType; }

    public void addArguments(ArrayList<VariableBase> arguments){
        this.arguments = arguments;
    }

    public Function(String name, String returnType, Context parent) {
        this.name = name;
        this.returnType = returnType;
        this.arguments = new ArrayList<>();
        super.parent = parent;
    }
}
