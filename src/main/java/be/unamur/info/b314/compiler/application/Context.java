package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.ConstantException;

import java.util.ArrayList;
import java.util.Hashtable;

public class Context {
    protected static final int defaultStackSize = 1000;

    protected Context parent;

    // The variables and functions information.
    protected Variable[] variables;
    protected Function[] functions;
    protected Record[] records;

    // The functions current index in the stack.
    protected int variableHeapIndex = 0;
    protected int functionHeapIndex = 0;
    protected int recordHeapIndex = 0;

    // The dictionary with the variables and functions symbols for a quick access.
    protected Hashtable<String, Integer> variableSymbols;
    protected Hashtable<String, Integer> functionSymbols;
    protected Hashtable<String, Integer> recordSymbols;

    // The list of errors in the environment
    protected ArrayList<String> errors;

    protected Context() {
        this.parent = null;
        
        this.errors = new ArrayList<>();

        this.variableSymbols = new Hashtable<>();
        this.functionSymbols = new Hashtable<>();
        this.recordSymbols = new Hashtable<>();

        this.variables = new Variable[defaultStackSize];
        this.functions = new Function[defaultStackSize];
        this.records = new Record[defaultStackSize];
    }

    public void addVariable(Variable variable) {
        if (!this.variableSymbols.containsKey(variable.getName())) {
            this.variableSymbols.put(variable.getName(), this.variableHeapIndex);
            this.variables[variableHeapIndex++] = variable;
        } else {
            this.errors.add("A variable with the name " + variable.getName() + " already exist");
        }
    }

    public void addFunction(Function function) {
        if (!this.functionSymbols.containsKey(function.getName())) {
            this.functionSymbols.put(function.getName(), this.functionHeapIndex);
            this.functions[functionHeapIndex++] = function;
        } else {
            this.errors.add("A function with the name " + function.getName() + " already exist");
        }
    }

    public void addRecord(Record record) {
        if (!this.recordSymbols.containsKey(record.getName())) {
            this.recordSymbols.put(record.getName(), this.functionHeapIndex);
            this.records[recordHeapIndex++] = record;
        } else {
            this.errors.add("A record with the name " + record.getName() + " already exist");
        }
    }

    public void updateVariable(String name, String value) {
        try {
            if (this.variableSymbols.containsKey(name)) {
                Integer heapIndex = this.variableSymbols.get(name);
                this.variables[heapIndex].setValue(value);
            } else {
                this.errors.add("The variable with the name " + name + " does not exist");
            }
        } catch (ConstantException ex) {
            this.errors.add(ex.getMessage());
        }
    }
}
