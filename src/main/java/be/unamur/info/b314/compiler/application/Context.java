package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.PlayPlusException;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Context {
    /**
     * The default stack size.
     */
    protected final int defaultStackSize = 1000;

    /**
     * The parent context.
     */
    protected Context parent;

    // The dictionary with the variables and functions symbols for a quick access.
    /**
     * The symbol hashtable for the variables of the context.
     * Key : The name of the variable.
     * Value : The index in the variables table.
     */
    protected Hashtable<String, Integer> variableSymbols;
    /**
     * The symbol hashtable for the functions of the context.
     * Key : The name of the function.
     * Value : The index in the functions table.
     */
    protected Hashtable<String, Integer> functionSymbols;
    /**
     * The symbol hashtable for the records of the context.
     * Key : The name of the record.
     * Value : The index in the records table.
     */
    protected Hashtable<String, Integer> recordSymbols;
    /**
     * The symbol hashtable for the enumerations of the context.
     * Key : The name of the enumeration.
     * Value : The index in the enumerations table.
     */
    protected Hashtable<String, Integer> enumSymbols;

    // The variables and functions information.
    /**
     * The variable heap, contains all the information of each variable of the context.
     */
    protected VariableBase[] variables;
    /**
     * The function heap, contains all the information of each function of the context.
     */
    protected Function[] functions;
    /**
     * The record heap, contains all the information of each record of the context.
     */
    protected Record[] records;
    /**
     * The enumeration heap, contains all the information of each enumeration of the context.
     */
    protected Enumeration[] enums;

    // The functions current index in the stack.
    /**
     * The variable heap index.
     */
    protected int variableHeapIndex = 0;
    /**
     * The function heap index.
     */
    protected int functionHeapIndex = 0;
    /**
     * The record heap index.
     */
    protected int recordHeapIndex = 0;
    /**
     * The enumeration heap index.
     */
    protected int enumHeapIndex = 0;

    /**
     * Initializes a new instance of a context.
     */
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

    /**
     * Gets all the variable of the context.
     * @return
     */
    public List<VariableBase> getVariables() { return Arrays.asList(this.variables).subList(0, this.variableHeapIndex); }

    /**
     * Adds a variable to the context.
     * @param variable the variable to add to the context.
     */
    public void addVariable(Variable variable) { this.addVariableBase(variable); }

    /**
     * Adds an array to the context.
     * @param array the array to add to the context.
     */
    public void addArray(Array array) {
        this.addVariableBase(array);
    }

    /**
     * Adds an enumeration to the context.
     * @param enumeration the enumeration to add to the context.
     */
    public void addEnum(Enumeration enumeration) {
        if (!this.enumSymbols.containsKey(enumeration.getName())) {
            this.enumSymbols.put(enumeration.getName(), this.enumHeapIndex);
            this.enums[enumHeapIndex++] = enumeration;
        } else {
            throw new PlayPlusException("An enumeration with the name " + enumeration.getName() + " already exist");
        }
    }

    /**
     * Adds a function to the context.
     * @param function the function to add to the context.
     */
    public void addFunction(Function function) {
        if (!isExistingInSymbolTables(function.getName())) {
            this.functionSymbols.put(function.getName(), this.functionHeapIndex);
            this.functions[functionHeapIndex++] = function;
        } else {
            throw new PlayPlusException("A function with the name " + function.getName() + " already exist");
        }
    }

    /**
     * Adds a record to the context.
     * @param record the record to add to the context.
     */
    public void addRecord(Record record) {
        if (!this.recordSymbols.containsKey(record.getName())) {
            this.recordSymbols.put(record.getName(), this.recordHeapIndex);
            this.records[recordHeapIndex++] = record;
        } else {
            throw new PlayPlusException("A record with the name " + record.getName() + " already exist");
        }
    }

    /**
     * Gets a variable from the context or from the argument if it's a function.
     * @param name the name of the variable to get.
     * @return the variable with the specified name (null if no variable or argument of the function with this name is existing).
     */
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

    /**
     * Gets a function from the context.
     * @param name the name of the function to get.
     * @return the function with the specified name (null if no function with this name is existing).
     */
    public Function getFunction(String name) {
        try {
            return this.functions[this.functionSymbols.get(name).intValue()];
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Gets a record from the context.
     * @param name the name of the record to get.
     * @return the record with the specified name (null if no record with this name is existing).
     */
    public Record getRecord(String name) {
        try {
            return this.records[this.recordSymbols.get(name).intValue()];
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Adds a variable to the context.
     * @param variable the variable to add to the context.
     */
    private void addVariableBase(VariableBase variable) {
        if (!isExistingInSymbolTables(variable.getName())) {
            this.variableSymbols.put(variable.getName(), this.variableHeapIndex);
            this.variables[variableHeapIndex++] = variable;
        } else {
            throw new PlayPlusException("A variable with the name " + variable.getName() + " already exist");
        }
    }

    /**
     * Check if an name is existing in the variable table or the function table.
     * @param name the name of the variable or function to check.
     * @return true if an element with this name already exist; false otherwise
     */
    private boolean isExistingInSymbolTables(String name) {
        if (this instanceof Function && ((Function) this).isExistingInArgumentSymbolTables(name)) {
            return true;
        }

        return this.variableSymbols.containsKey(name) || this.functionSymbols.containsKey(name);
    }
}
