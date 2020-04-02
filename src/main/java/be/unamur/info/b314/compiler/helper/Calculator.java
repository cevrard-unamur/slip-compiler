package be.unamur.info.b314.compiler.helper;

import be.unamur.info.b314.compiler.visitor.RightExpressionVisitor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculator {
    public static final Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();

    static {
        operations.put("+", Calculator::add);
        operations.put("-", Calculator::minus);
        operations.put("*", Calculator::product);
        operations.put("/", Calculator::div);
        operations.put("%", Calculator::mod);
    }

    public static Integer add(Integer value1, Integer value2) {
        return value1 + value2;
    }

    public static Integer minus(Integer value1, Integer value2) {
        return value1 - value2;
    }

    public static Integer product(Integer value1, Integer value2) {
        return value1 * value2;
    }

    public static Integer div(Integer value1, Integer value2) {
        return value1 / value2;
    }

    public static Integer mod(Integer value1, Integer value2) {
        return value1 % value2;
    }
}
