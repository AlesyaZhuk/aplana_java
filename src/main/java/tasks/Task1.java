/**
 * 1. Начинаем писать калькулятор:
 * Реализовать сложение дробных чисел, которые пользователь
 * вводит в консоль. Использовать комментарии и JavaDoc при
 * описании метода. Использовать форматирование при выводе
 * результата в консоль. Полученный результат округлять до 4-х
 * знаков после запятой.
 *
 * This is the first task (after downloading jdk etc) (Задание №2).
 * For moving to the other tasks:
 * @see tasks.Task2 (Задание №3)
 * @see tasks.task3.Task3Point1 (Задание №4)
 * @see tasks.task3.Task3Point2 (Задание №4)
 * @see tasks.task4.Task4 (Задание №5)
 * @see tasks.task5.Task5 (Задание №6)
 * @see tasks.task6.Task6 (Задание №7)
 */
package tasks;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double v1 = Double.valueOf(scanner.next());

        System.out.println("Enter the second number:");
        double v2 = Double.valueOf(scanner.next());

        System.out.printf("Sum is %.4f", (v1 + v2));

        scanner.close();
    }
}
