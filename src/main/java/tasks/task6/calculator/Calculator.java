package tasks.task6.calculator;

import tasks.task6.operation.*;

import java.util.Scanner;

public class Calculator extends UserInteraction {
    double first;
    double second;
    double result = 0;
    String resultMessage = "";
    boolean succsess;
    String operation;

    public Calculator() {
    }

    public Calculator(double first, double second, String operation) {
        this.first = first;
        this.second = second;
        this.operation = operation;
        this.succsess = true;
    }

    public boolean isSuccsess() {
        return succsess;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void runCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        first = scanDouble(scanner);
        System.out.println("Enter second number");
        second = scanDouble(scanner);
        operation = scanOperation(scanner);
        scanner.close();
        if (operation == null)
            return;
        apply();
    }

    public void runCalculatorForTask7() {
        if (!checkOperation.isCorrectOperation(operation)) {
            succsess = false;
            resultMessage = "Incorrect operation.";
        } else
            apply();
    }

    public void apply() {
        if (checkOperation.isAddition(operation))
            result = new Addition(first, second, operation).apply();
        else if (checkOperation.isSubtraction(operation))
            result = new Subtraction(first, second, operation).apply();
        else if (checkOperation.isMultiplication(operation))
            result = new Multiplication(first, second, operation).apply();
        else if (checkOperation.isDivision(operation)) {
            Division division = new Division(first, second, operation);
            //if (division.isCorrectOperation())
            try {
                result = new Division(first, second, operation).apply();
            } catch (DivisionByZeroException e) {
                resultMessage = "Division by Zero!";
                System.out.println(resultMessage);
                succsess = false;
            }
        } else
            succsess = false;
        if (succsess) {
            System.out.printf("Result = %.4f", result);
        }
    }
}
