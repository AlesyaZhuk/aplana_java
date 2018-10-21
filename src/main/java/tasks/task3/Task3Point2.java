/**
 * 2. Формируется новогодний подарок. Он может включать в себя
 * разные сладости (Candy, Jellybean, etc.) У каждой сладости есть
 * название, вес, цена и свой уникальный параметр. Необходимо
 * собрать подарок из сладостей. Найти общий вес подарка, общую
 * стоимость подарка и вывести на консоль информацию о всех
 * сладостях в подарке.
 */
package tasks.task3;

import java.util.Random;
import java.util.Scanner;

public class Task3Point2 {
    public static void main(String[] args) {
        Gift gift = new Gift();
        String name = "";
        double cost = 0;
        double wieght = 0;
        int amount = 0;
        String  colour = "";

        Scanner scanner = new Scanner(System.in);

        Candi1 candi1 = new Candi1();
        candi1.setName("BELOCHKA");
        System.out.println("Enter amount of \nDetailed information:\nname\t\tweight\tcost\tcolour");

        candi1.printInfo();
        amount = scanner.nextInt();
        if (amount < 0) {
            System.out.println("Are you a Grinch?");
            amount = 0;
        }
        candi1.setAmount(amount);
        gift.addCandy(candi1);

        Candi2 candi2 = new Candi2();
        candi2.setName("GLADOSTI");
        System.out.println("Enter amount of \nDetailed information:\nname\t\tweight\tcost\tcolour");
        candi2.printInfo();
        amount = scanner.nextInt();
        if (amount < 0) {
            System.out.println("Are you a Grinch?");
            amount = 0;
        }
        candi2.setAmount(amount);
        gift.addCandy(candi2);

        Candi3 candi3 = new Candi3();
        candi3.setName("MORECANDY");
        System.out.println("Enter amount of \nDetailed information:\nname\t\tweight\tcost\tcolour");
        candi3.printInfo();
        amount = scanner.nextInt();
        if (amount < 0) {
            System.out.println("Are you a Grinch?");
            amount = 0;
        }
        candi3.setAmount(amount);
        gift.addCandy(candi3);

        gift.printInfo();

        scanner.close();
    }
}
