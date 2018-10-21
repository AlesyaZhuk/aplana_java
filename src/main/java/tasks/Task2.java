/**
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего
 * задания
 * 2. Поиск максимального элемента в массиве.
 * Для начала задать массив слов.Размерность массива произвольна,
 * задается в консоли. После чего в консоли вводятся слова в количестве
 * равном заданной длине массива. В полученном массиве необходимо
 * найти самое длинное слово. Результат вывести на консоль
 * 3. Программа должна выполнять одно из заданий на выбор. Если в
 * консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск
 * максимального слова в массиве.
 */
package tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of task:");
        Task2 task = new Task2();
        int taskNumber = scanner.nextInt();
        if (taskNumber == 1) {
            task.runCalculator(scanner);
        } else if (taskNumber == 2) {
            task.runFindMaxElement(scanner);
        } else
            System.out.println("Incorrect number of task. Expected 1 or 2");

        scanner.close();
    }

    public void runCalculator(Scanner scanner) {

        System.out.println("Enter the first number, operation and the second number:");
        double v1 = Double.valueOf(scanner.next());
        boolean succsess = false;

        double result;
        int attemtsNumber = 5;
        for (int i = attemtsNumber; i > 0; --i) {
            String operation = scanner.next();
            if (operation.length() == 1)
                succsess = performOperation(scanner, v1, operation.charAt(0));
            if (succsess)
                break;
            if (i > 0)
                System.out.println("Incorrect operation. Expected '+', '-', '*' or '/'\nPlease, try again. You have " + i + " attempts left.");
        }

        if (succsess)
            System.out.println("Congratulations! You have successfully used the calculator.");
        else
            System.out.println("Sorry, no attempts left.");
    }

    public double add(Scanner scanner, double v1) {
        double v2 = Double.valueOf(scanner.next());
        return (v1 + v2);
    }

    public double subtruct(Scanner scanner, double v1) {
        double v2 = Double.valueOf(scanner.next());
        return (v1 - v2);
    }

    public double multiply(Scanner scanner, double v1) {
        double v2 = Double.valueOf(scanner.next());
        return (v1 * v2);
    }

    public double divide(Scanner scanner, double v1) {
        double v2 = Double.valueOf(scanner.next());
        return (v1 / v2);
    }

    public boolean performOperation(Scanner scanner, double v1, char operation) {
        double result = 0;
        boolean correctOperation = true;
        switch (operation) {
            case '+':
                result = add(scanner, v1);
                break;
            case '-':
                result = subtruct(scanner, v1);
                break;
            case '*':
                result = multiply(scanner, v1);
                break;
            case '/':
                result = divide(scanner, v1);
                break;
            default:
                correctOperation = false;
        }

        if (correctOperation) {
            System.out.printf("Result = %.4f", result);
            System.out.println();
        }
        return correctOperation;
    }

    public void runFindMaxElement(Scanner scanner) {
        System.out.println("Enter array length");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("Incorrect array length");
        } else {
            String[] array = new String[length];
            for (int i = 0; i < length; ++i) {
                array[i] = scanner.next();
            }
            int maxLen = 0;
            String result = "";
            for (String word : array) {
                if (word.length() > maxLen) {
                    maxLen = word.length();
                    result = word;
                }
            }
            System.out.println("The longest word is: " + result + "\nlength: " + maxLen);
        }
    }

    public void jistFindMaxElement(Scanner scanner) {
        System.out.println("Enter array length");
        int length = scanner.nextInt();

        String result = "";
        int maxLen = 0;
        for (int i = 0; i < length; ++i) {
            String nextString = scanner.next();
            if (nextString.length() > maxLen) {
                maxLen = nextString.length();
                result = nextString;
            }
        }

        System.out.println("The longest word is: " + result + "\nlength: " + maxLen);
    }
}


