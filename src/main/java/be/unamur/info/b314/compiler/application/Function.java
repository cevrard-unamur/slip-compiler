package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.PlayPlusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Function extends Context {
    /**
     * The name of the function.
     */
    private String name;
    /**
     * The return type of the function.
     */
    private String returnType;

    /**
     * The symbol hashtable for the argument of the function.
     * Key : The name of the argument.
     * Value : The index in the arguments table.
     */
    private Hashtable<String, Integer> argumentSymbols;
    /**
     * The argument heap, contains all the information of each argument of the function.
     */
    private VariableBase[] arguments;
    /**
     * The argument heap index.
     */
    private int argumentHeapIndex = 0;

    /**
     * Initialize a new instance of a function.
     * @param name the name of the function
     * @param returnType the return type of the function.
     * @param parent the parent context of the function (In which context the function has been created).
     */
    public Function(String name, String returnType, Context parent) {
        this.argumentSymbols = new Hashtable<>();

        this.arguments = new VariableBase[defaultStackSize];

        this.name = name;
        this.returnType = returnType;
        super.parent = parent;
    }

    /**
     * Gets the name of the function.
     * @return the name of the function.
     */
    public String getName() { return name; }

    /**
     * Gets the return type of the function.
     * @return the return type of the function.
     */
    public String getReturnType() { return returnType; }

    /**
     * Gets the number of arguments of the function.
     * @return the number of arguments of the function.
     */
    public int getNumberOfArguments() { return argumentHeapIndex; }

    /**
     * Gets the type of an argument of the function.
     * @param i the index of the argument.
     * @return the type of the argument.
     */
    public String getArgumentType(int i) { return arguments[i].getType(); }

    /**
     * Gets an argument of the function based on the name of it.
     * @param name the name of the argument to get.
     * @return the argument of the function.
     */
    public VariableBase getArgument(String name) { return this.arguments[this.argumentSymbols.get(name).intValue()]; }

    /**
     * Gets an argument of the function based on the position of it.
     * @param position the position of the argument to get.
     * @return the argument of the function.
     */
    public VariableBase getArgument(int position) { return this.arguments[position]; }

    /**
     * Gets all arguments of the function.
     * @return a list of the arguments of the function.
     */
    public List<VariableBase> getArguments() { return Arrays.asList(this.arguments).subList(0, this.argumentHeapIndex); }

    /**
     * Add arguments to the function.
     * @param arguments the list of arguments to add.
     */
    public void addArguments(ArrayList<VariableBase> arguments){
        for (VariableBase argument : arguments) {
            addArgument(argument);
        }
    }

    /**
     * Check if an argument with this name is already existing.
     * @param name the name of the argument to check.
     * @return true if an argument with this name already exist; false otherwise
     */
    protected boolean isExistingInArgumentSymbolTables(String name) {
        return this.argumentSymbols.containsKey(name);
    }

    /**
     * Add an argument to the function.
     * @param variable the argument to add to the function.
     */
    private void addArgument(VariableBase variable) {
        if (!isExistingInSymbolTables(variable.getName())) {
            this.argumentSymbols.put(variable.getName(), this.argumentHeapIndex);
            this.arguments[argumentHeapIndex++] = variable;
        } else {
            throw new PlayPlusException("An argument with the name " + variable.getName() + " already exist");
        }
    }

    /**
     * Check if an name is existing in the variable table or the function table.
     * @param name the name of the variable or function to check.
     * @return true if an element with this name already exist; false otherwise
     */
    private boolean isExistingInSymbolTables(String name) {
        return this.variableSymbols.containsKey(name) || this.functionSymbols.containsKey(name);
    }
}
