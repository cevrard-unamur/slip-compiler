package be.unamur.info.b314.compiler.exception;

public class ConstantException extends RuntimeException {

    public ConstantException(String message, Exception e) {
        super(message, e);
    }

    public ConstantException(String message){
        super(message);
    }

}