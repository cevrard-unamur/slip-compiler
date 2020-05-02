package be.unamur.info.b314.compiler.application;

import be.unamur.info.b314.compiler.exception.PlayPlusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    private List<String> forbiddenVariableNames = Arrays.asList("main", "import");
    private List<String> forbiddenFunctionNames = Arrays.asList("main");

    private List<String> errors = new ArrayList();

    private Context currentContext;

    public Application() {
        this.currentContext = new Context();
    }

    public void addError(String error) {
        this.errors.add(error);
    }

    public List<String> getErrors() {
        return this.errors;
    }

    public void addVariable(String type, String name, Boolean isConstant) {
        this.checkVariableName(name);

        this.currentContext.addVariable(new Variable(type, name, isConstant));
    }

    public void addArray(String type, String name, Integer[] size){
        this.checkVariableName(name);

        this.currentContext.addArray(new Array(name, type, size));
    }

    public void addEnum(String name, List<String> values) {
        this.checkVariableName(name);

        this.currentContext.addEnum(new Enumeration(name, values));
    }

    public void addFunction(String name, String returnType) {
        this.checkFunctionName(name);

        Function function = new Function(name, returnType, this.currentContext);
        this.currentContext.addFunction(function);
        this.currentContext = function;
        // We add a first variable in the function context for the return of it
        if (returnType != "void") {
            this.currentContext.addVariable(new Variable(returnType, name, false));
        }
    }

    public void addRecord(String name) {
        Record record = new Record(name, this.currentContext);
        this.currentContext.addRecord(record);
        this.currentContext = record;
    }

    public void addMap(String[][] map){
        this.currentContext.addMap(map);
    }

    public void leaveContext() {
        if (this.currentContext.parent == null) {
            throw new PlayPlusException("Trying to leave context without parent");
        }

        this.currentContext = this.currentContext.parent;
    }

    public void enterContext(String name) {
        this.currentContext = this.currentContext.getFunction(name);
    }

    public void goToRootContext() {
        while (this.currentContext.parent != null) {
            this.leaveContext();
        }
    }

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

    public List<VariableBase> getAllVariables() {
        return this.getAllVariables(this.currentContext);
    }

    public List<VariableBase> getAllFunctionsParameters() {
        return this.getAllFunctionsParameters(this.currentContext);
    }

    public List<Record> getAllRecords() {
        return this.getAllRecords(this.currentContext);
    }

    private boolean checkVariableName(String name) {
        if (this.forbiddenVariableNames.contains(name)) {
            throw new PlayPlusException("The name " + name + " is not allowed as a variable name");
        }

        return  true;
    }

    private boolean checkFunctionName(String name) {
        if (this.forbiddenFunctionNames.contains(name)) {
            throw new PlayPlusException("The function " + name + " is not allowed as a variable name");
        }

        return  true;
    }

    private List<VariableBase> getAllVariables(Context context) {
        if (context == null) { return new ArrayList<>(); }

        List<VariableBase> variables = new ArrayList<>();

        variables.addAll(Arrays.asList(context.variables).subList(0, context.variableHeapIndex));

        for (int i = 0; i < context.functionHeapIndex; i++) {
            variables.addAll(this.getAllVariables(context.functions[i]));
        }

        return variables;
    }

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
