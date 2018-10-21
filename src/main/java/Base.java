import java.util.Scanner;
import tasks.Task2;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of task:");
        Task2 task = new Task2();
        int taskNumber = scanner.nextInt();
        if (taskNumber == 1) {
            task.runCalculator(scanner);
        } else if (taskNumber == 2) {
            task.runFindMaxElement(scanner);
        }
            scanner.close();
    }
}
