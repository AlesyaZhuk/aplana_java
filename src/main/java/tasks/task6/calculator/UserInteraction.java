package tasks.task6.calculator;

import tasks.task6.operation.CheckOperation;

import java.util.Scanner;

public class UserInteraction {
    public static CheckOperation checkOperation = new CheckOperation();
    public double scanDouble(Scanner scanner) {
        return Double.valueOf(scanner.next());
    }
    public double scanDouble(Scanner scanner, String text) {
        System.out.println(text);
        return Double.valueOf(scanner.next());
    }

    public String scanString(Scanner scanner) {
        return scanner.next();
    }
    public String scanString(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.next();
    }

    public String scanOperation(Scanner scanner) {
        String operation = scanString(scanner, "Enter operation");
        if (!checkOperation.isCorrectOperation(operation)) {
            System.out.println("Incorrect operation. Supported values:");
            checkOperation.printSupportedValues();
            return null;
        } else
            return operation;
    }

}
