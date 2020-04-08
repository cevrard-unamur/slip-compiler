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
    protected Enumeration[] enums;

    // The functions current index in the stack.
    protected int variableHeapIndex = 0;
    protected int functionHeapIndex = 0;
    protected int recordHeapIndex = 0;
    protected int enumHeapIndex = 0;

    // The dictionary with the variables and functions symbols for a quick access.
    protected Hashtable<String, Integer> variableSymbols;
    protected Hashtable<String, Integer> functionSymbols;
    protected Hashtable<String, Integer> recordSymbols;
    protected Hashtable<String, Integer> enumSymbols;

    protected Context() {
        this.parent = null;

        this.variableSymbols = new Hashtable<>();
        this.functionSymbols = new Hashtable<>();
        this.recordSymbols = new Hashtable<>();
        this.enumSymbols = new Hashtable<>();

        this.variables = new VariableBase[defaultStackSize];
        this.functions = new Function[defaultStackSize];
        this.records = new Record[defaultStackSize];
        this.enums = new Enumeration[defaultStackSize];
    }

    public void addVariable(Variable variable) { this.addVariableBase(variable); }

    public void addArray(Array array) {
        this.addVariableBase(array);
    }

    public void addEnum(Enumeration enumeration) {
        if (!this.enumSymbols.containsKey(enumeration.getName())) {
            this.enumSymbols.put(enumeration.getName(), this.enumHeapIndex);
            this.enums[enumHeapIndex++] = enumeration;
        } else {
            throw new VariableException("An enumeration with the name " + enumeration.getName() + " already exist");
        }
    }

    public void addFunction(Function function) {
        if (!isExistingInSymbolTables(function.getName())) {
            this.functionSymbols.put(function.getName(), this.functionHeapIndex);
            this.functions[functionHeapIndex++] = function;
        } else {
            throw new VariableException("A function with the name " + function.getName() + " already exist");
        }
    }

    public void addRecord(Record record) {
        if (!this.recordSymbols.containsKey(record.getName())) {
            this.recordSymbols.put(record.getName(), this.recordHeapIndex);
            this.records[recordHeapIndex++] = record;
        } else {
            throw new VariableException("A record with the name " + record.getName() + " already exist");
        }
    }

    public VariableBase getVariable(String name) {
        try {
            Integer variableIndex = this.variableSymbols.get(name);

            if (variableIndex != null) {
                return this.variables[variableIndex];
            }

            if (this instanceof Function) {
                return ((Function)this).getArgument(name);
            }

            return null;
        } catch (Exception ex) {
            return null;
        }
    }

    public Function getFunction(String name) {
        try {
            return this.functions[this.functionSymbols.get(name).intValue()];
        } catch (Exception ex) {
            return null;
        }
    }

    public Record getRecord(String name) {
        try {
            return this.records[this.recordSymbols.get(name).intValue()];
        } catch (Exception ex) {
            return null;
        }
    }

    private void addVariableBase(VariableBase variable) {
        if (!isExistingInSymbolTables(variable.getName())) {
            this.variableSymbols.put(variable.getName(), this.variableHeapIndex);
            this.variables[variableHeapIndex++] = variable;
        } else {
            throw new VariableException("A variable with the name " + variable.getName() + " already exist");
        }
    }

    private boolean isExistingInSymbolTables(String name) {
        if (this instanceof Function && ((Function) this).isExistingInArgumentSymbolTables(name)) {
            return true;
        }

        return this.variableSymbols.containsKey(name) || this.functionSymbols.containsKey(name);
    }
}
