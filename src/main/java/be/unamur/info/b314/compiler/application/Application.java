package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.PlayPlusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    /**
     * A list of forbidden variable names.
     */
    private List<String> forbiddenVariableNames = Arrays.asList("main", "import");
    /**
     * A list of forbidden function names.
     */
    private List<String> forbiddenFunctionNames = Arrays.asList("main");
    /**
     * Contains all the errors generated during the compilation of the SLIP file.
     */
    private List<String> errors = new ArrayList();

    /**
     * The current context of the application.
     */
    private Context currentContext;

    /**
     * Initializes a new instance of an application with a new context.
     */
    public Application() {
        this.currentContext = new Context();
    }

    /**
     * Adds an error to the application.
     * @param error the error to add.
     */
    public void addError(String error) {
        this.errors.add(error);
    }

    /**
     * Gets the errors of the application.
     * @return the list of all the errors.
     */
    public List<String> getErrors() {
        return this.errors;
    }

    /**
     * Adds a variable to the current context.
     * @param type the type of the variable.
     * @param name the name of the variable.
     * @param isConstant specify if the variable is a constant or not.
     */
    public void addVariable(String type, String name, Boolean isConstant) {
        this.checkVariableName(name);

        this.currentContext.addVariable(new Variable(type, name, isConstant, this.getContextName() ));
    }

    /**
     * Adds an array to the current context.
     * @param type the type of the array.
     * @param name the name of the array.
     * @param size the dimension of the array.
     */
    public void addArray(String type, String name, Integer[] size){
        this.checkVariableName(name);

        this.currentContext.addArray(new Array(name, type, size, this.getContextName()));
    }

    /**
     * Adds an enum to the current context.
     * @param name the name of the enumeration.
     * @param values the values of the enumeration.
     */
    public void addEnum(String name, List<String> values) {
        this.checkVariableName(name);

        this.currentContext.addEnum(new Enumeration(name, values));
    }

    /**
     * Adds a function to the current context and change the current context to this function.
     * A variable with the name of the function is created in the context of the function itself.
     * @param name the name of the function.
     * @param returnType the return type of the function.
     */
    public void addFunction(String name, String returnType) {
        this.checkFunctionName(name);

        Function function = new Function(name, returnType, this.currentContext);
        this.currentContext.addFunction(function);
        this.currentContext = function;
        // We add a first variable in the function context for the return of it
        if (returnType != "void") {
            this.currentContext.addVariable(new Variable(returnType, name, false, this.getContextName()));
        }
    }

    /**
     * Adds a record to the current context and change the current context to this record.
     * @param name
     */
    public void addRecord(String name) {
        Record record = new Record(name, this.currentContext);
        this.currentContext.addRecord(record);
        this.currentContext = record;
    }

    /**
     * Adds the map to the current context.
     * @param map
     */
    public void addMap(String[][] map){
        this.currentContext.addMap(map);
    }

    /**
     * Leaves the current context for the parent of it.
     * @throws PlayPlusException if the current context does not have a parent context.
     */
    public void leaveContext() {
        if (this.currentContext.parent == null) {
            throw new PlayPlusException("Trying to leave context without parent");
        }

        this.currentContext = this.currentContext.parent;
    }

    /**
     * Enters in a specific function context.
     * @param name the name of the function.
     */
    public void enterContext(String name) {
        this.currentContext = this.currentContext.getFunction(name);
    }

    /**
     * Goes to the root context.
     */
    public void goToRootContext() {
        while (this.currentContext.parent != null) {
            this.leaveContext();
        }
    }

    /**
     * Gets a variable in the current context or it's ancestor.
     * @param name the name of the variable to retrieve.
     * @return the variable to get.
     * @throws PlayPlusException if no variable with the specify name is existing.
     */
    public Variable getVariable(String name) {
        Context context = this.currentContext;

        while (context != null) {
            VariableBase variable = context.getVariable(name);

            if (variable != null && variable instanceof Variable) {
                return (Variable)variable;
            }

            context = context.parent;
        }

        throw new PlayPlusException("The variable " + name + " does not exist");
    }

    /**
     * Gets an array in the current context or it's ancestor.
     * @param name the name of the array to retrieve.
     * @return the array to get.
     * @throws PlayPlusException if no array with the specify name is existing.
     */
    public Array getArray(String name) {
        Context context = this.currentContext;

        while (context != null) {
            VariableBase variable = context.getVariable(name);

            if (variable != null && variable instanceof Array) {
                return (Array)variable;
            }

            context = context.parent;
        }

        throw new PlayPlusException("The array " + name + " does not exist");
    }

    /**
     * Gets an array in a specific record.
     * @param name the name of the record.
     * @param propertyName the name of the array to get in the record.
     * @return the array to get in the record.
     * @throws PlayPlusException if no array with the specify name is existing in the specify record.
     */
    public Array getArrayOfRecord(String name, String propertyName) {
        Context context = this.currentContext;

        while (context != null) {
            Record record = context.getRecord(name);

            if (record != null) {
                VariableBase variable = record.getVariable(propertyName);

                if (variable != null && variable instanceof Array) {
                    return (Array)variable;
                }
            }

            context = context.parent;
        }

        throw new PlayPlusException("The array " + propertyName + " does not exist in the record " + name);
    }

    /**
     * Gets a variable in a specific record.
     * @param name the name of the record.
     * @param propertyName the name of the variable to get in the record.
     * @return the variable to get in the record
     * @throws PlayPlusException if no variable with the specify name is existing in the specify record.
     */
    public Variable getVariableOfRecord(String name, String propertyName) {
        Context context = this.currentContext;

        while (context != null) {
            Record record = context.getRecord(name);

            if (record != null) {
                VariableBase variable = record.getVariable(propertyName);

                if (variable != null && variable instanceof Variable) {
                    return (Variable)variable;
                }
            }

            context = context.parent;
        }

        throw new PlayPlusException("The variable " + propertyName + " does not exist in the record " + name);
    }

    /**
     * Gets a function in the current context or it's ancestor.
     * @param name the name of the function to retrieve.
     * @return the function to get.
     * @throws PlayPlusException if no function with the specify name is existing.
     */
    public Function getFunction(String name) {
        Context context = this.currentContext;

        while (context != null) {
            Function function = context.getFunction(name);

            if (function != null) {
                return function;
            }

            context = context.parent;
        }

        throw new PlayPlusException("The function " + name + " does not exist");
    }

    /**
     * Gets all the variables in the current context and all children context.
     * @return
     */
    public List<VariableBase> getAllVariables() {
        return this.getAllVariables(this.currentContext);
    }

    /**
     * Gets all the function parameters in the current context and all children context.
     * @return
     */
    public List<VariableBase> getAllFunctionsParameters() {
        return this.getAllFunctionsParameters(this.currentContext);
    }

    /**
     * Gets all the records in the current context and all children context.
     * @return
     */
    public List<Record> getAllRecords() {
        return this.getAllRecords(this.currentContext);
    }

    /**
     * Gets the name of the context.
     * @return
     */
    public String getContextName() {
        if (this.currentContext instanceof Function) {
            return ((Function) this.currentContext).getName();
        } else if (this.currentContext instanceof Record) {
            return ((Record) this.currentContext).getName();
        } else {
            return "";
        }
    }

    /**
     * Checks if a variable name can be used or not.
     * @param name the name of the variable to check.
     * @return true.
     * @throws PlayPlusException if the name is not allowed.
     */
    private boolean checkVariableName(String name) {
        if (this.forbiddenVariableNames.contains(name)) {
            throw new PlayPlusException("The name " + name + " is not allowed as a variable name");
        }

        return  true;
    }

    /**
     * Checks if a function name can be used or not.
     * @param name the name of the function to check.
     * @return true.
     * @throws PlayPlusException if the name is not allowed.
     */
    private boolean checkFunctionName(String name) {
        if (this.forbiddenFunctionNames.contains(name)) {
            throw new PlayPlusException("The function " + name + " is not allowed as a variable name");
        }

        return  true;
    }

    /**
     * Gets all the variables in the current context.
     * @param context the context in which we want to get the variables.
     * @return a list of all the variable of the context.
     */
    private List<VariableBase> getAllVariables(Context context) {
        if (context == null) { return new ArrayList<>(); }

        List<VariableBase> variables = new ArrayList<>();

        variables.addAll(Arrays.asList(context.variables).subList(0, context.variableHeapIndex));

        for (int i = 0; i < context.functionHeapIndex; i++) {
            variables.addAll(this.getAllVariables(context.functions[i]));
        }

        return variables;
    }

    /**
     * Gets all the function parameters in the current context.
     * @param context the context in which we want to get the function parameters.
     * @return a list of all the function parameters of the context.
     */
    private List<VariableBase> getAllFunctionsParameters(Context context) {
        if (context == null) { return new ArrayList<>(); }

        List<VariableBase> variables = new ArrayList<>();

        if (context instanceof Function) {
            variables.addAll(((Function)context).getArguments());
        }

        for (int i = 0; i < context.functionHeapIndex; i++) {
            variables.addAll(this.getAllFunctionsParameters(context.functions[i]));
        }

        return variables;
    }

    /**
     * Gets all the records in the current context.
     * @param context the context in which we want to get the records.
     * @return a list of all the records of the context.
     */
    private List<Record> getAllRecords(Context context) {
        if (context == null) { return new ArrayList<>(); }

        List<Record> records = new ArrayList<>();

        records.addAll(Arrays.asList(context.records).subList(0, context.recordHeapIndex));

        for (int i = 0; i < context.functionHeapIndex; i++) {
            records.addAll(this.getAllRecords(context.functions[i]));
        }

        for (int i = 0; i < context.recordHeapIndex; i++) {
            records.addAll(this.getAllRecords(context.records[i]));
        }

        return records;
    }
}
