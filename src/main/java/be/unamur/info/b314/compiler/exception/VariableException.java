package be.unamur.info.b314.compiler.exception;

public class VariableException extends RuntimeException {

    public VariableException(String message, Exception e) {
        super(message, e);
    }

    public VariableException(String message){
        super(message);
    }
}
