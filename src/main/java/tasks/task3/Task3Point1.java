/**
 * 1. Массив размерностью 20, заполняется случайными целыми
 * числами от -10 до 10. Найти максимальный отрицательный и
 * минимальный положительный элементы массива. Поменять их
 * местами.
 */
package tasks.task3;

import java.util.Random;

public class Task3Point1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rnd = new Random();
        int minBound = -10;
        int maxBound = 10;

        int maxElementValue = minBound - 1;
        int minElementValue = maxBound + 1;
        int maxElementIndex = -1;
        int minElementIndex = -1;

        for (int i = 0; i < 20; ++i) {
            array[i] = minBound + rnd.nextInt(maxBound - minBound + 1);
            if (array[i] > 0 && array[i] < minElementValue) {
                minElementValue = array[i];
                minElementIndex = i;
            }
            if (array[i] < 0 && array[i] > maxElementValue) {
                maxElementValue = array[i];
                maxElementIndex = i;
            }
        }
        Task3Point1 task3Point1 = new Task3Point1();
        System.out.println("Source array:");
        task3Point1.printArray(array);

        if (maxElementIndex == -1) {
            System.out.println("max element not found");
        } else if (minElementIndex == -1) {
            System.out.println("min element not found");
        } else {
            array[minElementIndex] = maxElementValue;
            array[maxElementIndex] = minElementValue;
            System.out.println("Result array:");
            task3Point1.printArray(array);
            System.out.println("Swapped elements: " + maxElementValue + " [" + maxElementIndex + "], " + minElementValue + " [" + minElementIndex + "]");
        }

    }
    public void printArray(int[] array) {
        for (int i : array)
            System.out.print(" " + i);
        System.out.println();
    }
}
