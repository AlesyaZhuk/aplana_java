package tasks.task4.operation;

import java.util.ArrayList;
import java.util.List;

public class CheckOperation {

    private static String PLUS = "+";
    private static String MINUS = "-";
    private static String MULTIPLY = "*";
    private static String DIVIDE = "/";
    private static String PLUS_STR = "add";
    private static String MINUS_STR = "subtruct";
    private static String MULTIPLY_STR = "multiply";
    private static String DIVIDE_STR = "divide";
    private static List<String> operationList = new ArrayList(){{
        add(PLUS);
        add(MINUS);
        add(MULTIPLY);
        add(DIVIDE);
        add(PLUS_STR);
        add(MINUS_STR);
        add(MULTIPLY_STR);
        add(DIVIDE_STR);
    }};

    public CheckOperation() {
    }

    public boolean isCorrectOperation(String operation) {
        return operationList.contains(operation);
    }

    public boolean isAddition(String operation) {
        return (operation.equals(PLUS) || operation.equals(PLUS_STR));
    }

    public boolean isSubtraction(String operation) {
        return (operation.equals(MINUS) || operation.equals(MINUS_STR));
    }

    public boolean isMultiplication(String operation) {
        return (operation.equals(MULTIPLY) || operation.equals(MULTIPLY_STR));
    }

    public boolean isDivision(String operation) {
        return (operation.equals(DIVIDE) || operation.equals(DIVIDE_STR));
    }

    public void printSupportedValues() {
        for (String operation : operationList)
            System.out.println(operation);
    }
}
