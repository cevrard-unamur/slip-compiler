package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.VariableException;

import java.util.ArrayList;
import java.util.Hashtable;

public class Function extends Context {
    private static final int defaultStackSize = 10;

    private String name;
    private String returnType;

    private Hashtable<String, Integer> argumentSymbols;
    private VariableBase[] arguments;
    private int argumentHeapIndex = 0;

    public Function(String name, String returnType, Context parent) {
        this.argumentSymbols = new Hashtable<>();

        this.arguments = new VariableBase[defaultStackSize];

        this.name = name;
        this.returnType = returnType;
        super.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getReturnType() { return returnType; }

    public int getNumberOfArguments() { return argumentHeapIndex; }

    public String getArgumentType(int i) { return arguments[i].getType(); }

    public VariableBase getArgument(String name) { return this.arguments[this.argumentSymbols.get(name).intValue()]; }

    public void addArguments(ArrayList<VariableBase> arguments){
        for (VariableBase argument : arguments) {
            addArgument(argument);
        }
    }
    private void addArgument(VariableBase variable) {
        if (variable.getName().equals(this.name))
        {
            throw new VariableException("An argument's name cannot match his function's name");
        }else if (!isExistingInSymbolTables(variable.getName())) {
            this.argumentSymbols.put(variable.getName(), this.argumentHeapIndex);
            this.arguments[argumentHeapIndex++] = variable;
        } else {
            throw new VariableException("An argument with the name " + variable.getName() + " already exist");
        }
    }

    private boolean isExistingInSymbolTables(String name) {
        return this.variableSymbols.containsKey(name) || this.functionSymbols.containsKey(name);
    }
}
