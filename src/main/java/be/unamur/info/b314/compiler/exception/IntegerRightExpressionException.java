package be.unamur.info.b314.compiler.exception;

public class IntegerRightExpressionException extends RuntimeException {

    public IntegerRightExpressionException(String message, Exception e) {
        super(message, e);
    }

    public IntegerRightExpressionException(String message){
        super(message);
    }

}
