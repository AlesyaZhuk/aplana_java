package tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private double weight;
    private double cost;
    public List<Candy> candies;

    public Gift() {
        candies = new ArrayList<Candy>();
        this.weight = 0;
        this.cost = 0;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public void addCandy(Candy candy) {
        if (candy.getAmount() > 0) {
            candies.add(candy);
            weight += candy.getWeight() * candy.getAmount();
            cost += candy.getCost() * candy.getAmount();
        }
    }

    public void addRandomCandy() {
        Candy candy = new Candy();
        candies.add(candy);
        weight += candy.getWeight();
        cost += candy.getCost();
    }

    public void addRandomCandies(int number) {
        for (int i = 0; i < number; ++i)
            addRandomCandy();
    }

    public void printInfo() {
        System.out.println("\nGift info:");
        if (candies.size() == 0) {
            System.out.println("The gift is empty");
        } else {
            System.out.println("Sweet types number: " + candies.size());
            System.out.printf("Total gift value: %.2f\nTotal gift weight: %.2f\n", cost, weight);
            System.out.println("Detailed information:\nname\t\tweight\tcost\tcolour");
            for (Candy candy : candies)
                candy.printResultInfo();
        }
    }
}
