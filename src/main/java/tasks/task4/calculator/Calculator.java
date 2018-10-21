package tasks.task4.calculator;

import java.util.Scanner;
import tasks.task4.operation.Addition;
import tasks.task4.operation.Subtraction;
import tasks.task4.operation.Multiplication;
import tasks.task4.operation.Division;

public class Calculator extends UserInteraction{
    double first;
    double second;
    String operation;
    public Calculator() {
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

    public void apply() {
        double result = 0;
        if (checkOperation.isAddition(operation))
            result = new Addition(first, second, operation).apply();
        else if (checkOperation.isSubtraction(operation))
            result = new Subtraction(first, second, operation).apply();
        else if (checkOperation.isMultiplication(operation))
            result = new Multiplication(first, second, operation).apply();
        else if (checkOperation.isDivision(operation)) {
            Division division = new Division(first, second, operation);
            if (division.isCorrectOperation())
                result = new Division(first, second, operation).apply();
            else {
                System.out.println("Division by zero!");
                return;
            }
        }
        System.out.printf("Result = %.4f", result);
    }
}
