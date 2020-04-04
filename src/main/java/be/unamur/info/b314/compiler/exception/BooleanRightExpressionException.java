package be.unamur.info.b314.compiler.exception;

public class BooleanRightExpressionException extends RuntimeException {

    public BooleanRightExpressionException(String message, Exception e) {
        super(message, e);
    }

    public BooleanRightExpressionException(String message){
        super(message);
    }
}
