package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.VariableException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

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

    public VariableBase getArgument(int position) { return this.arguments[position]; }

    public List<VariableBase> getArguments() { return Arrays.asList(this.arguments).subList(0, this.argumentHeapIndex); }

    public void addArguments(ArrayList<VariableBase> arguments){
        for (VariableBase argument : arguments) {
            addArgument(argument);
        }
    }

    protected boolean isExistingInArgumentSymbolTables(String name) {
        return this.argumentSymbols.containsKey(name);
    }

    private void addArgument(VariableBase variable) {
        if (!isExistingInSymbolTables(variable.getName())) {
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
