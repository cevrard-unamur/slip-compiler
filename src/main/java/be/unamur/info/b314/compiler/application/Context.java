package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.ConstantException;
import be.unamur.info.b314.compiler.exception.VariableException;

import java.util.ArrayList;
import java.util.Hashtable;

public class Context {
    protected static final int defaultStackSize = 1000;

    protected Context parent;

    // The variables and functions information.
    protected VariableBase[] variables;
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

    protected Context() {
        this.parent = null;

        this.variableSymbols = new Hashtable<>();
        this.functionSymbols = new Hashtable<>();
        this.recordSymbols = new Hashtable<>();

        this.variables = new VariableBase[defaultStackSize];
        this.functions = new Function[defaultStackSize];
        this.records = new Record[defaultStackSize];
    }

    public void addVariable(Variable variable) {
        if (!this.variableSymbols.containsKey(variable.getName())) {
            this.variableSymbols.put(variable.getName(), this.variableHeapIndex);
            this.variables[variableHeapIndex++] = variable;
        } else {
            throw new VariableException("A variable with the name " + variable.getName() + " already exist");
        }
    }

    public void addFunction(Function function) {
        if (!this.functionSymbols.containsKey(function.getName())) {
            this.functionSymbols.put(function.getName(), this.functionHeapIndex);
            this.functions[functionHeapIndex++] = function;
        } else {
            throw new VariableException("A function with the name " + function.getName() + " already exist");
        }
    }

    public void addRecord(Record record) {
        if (!this.recordSymbols.containsKey(record.getName())) {
            this.recordSymbols.put(record.getName(), this.functionHeapIndex);
            this.records[recordHeapIndex++] = record;
        } else {
            throw new VariableException("A variable with the name " + record.getName() + " already exist");
        }
    }

    public void addArray(Array array) {
        if (!this.variableSymbols.containsKey(array.getName())) {
            this.variableSymbols.put(array.getName(), this.variableHeapIndex);
            this.variables[variableHeapIndex++] = array;
        } else {
            throw new VariableException("An variable with the name " + array.getName() + " already exist");
        }
    }

    public void updateVariable(String name, String value) {
        try {
            if (this.variableSymbols.containsKey(name)) {
                Integer heapIndex = this.variableSymbols.get(name);
                ((Variable)this.variables[heapIndex]).setValue(value);
            } else {
                throw new VariableException("The variable with the name " + name + " does not exist");
            }
        } catch (ConstantException ex) {
            throw new VariableException(ex.getMessage());
        }
    }
}
