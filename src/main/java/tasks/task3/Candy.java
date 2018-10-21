package tasks.task3;

import java.util.Random;

public class Candy {
    protected String name;
    private double cost;
    private double weight;
    private int amount = 0;
    private String wrapperColor;

    private static Random random = new Random();
    public static double costBound = 100;
    public static double weightBound = 100;

    public Candy() {
        this.name = getRundomName();
        this.wrapperColor = getRundomColour();
        this.setCost(Math.random() * costBound);
        this.setWeight(Math.random() * weightBound);
    }

    public Candy(String name, double cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.wrapperColor = wrapperColor;
    }

    private static enum candyNames {
        GLADOSTI,
        GNERD,
        BELOCHKA,
        ALYENKA,
        CANDY5,
        CANDY6,
        CANDY7,
        CANDY8,
        CANDY9;
    }

    private static enum colors {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE,
        BROWN,
        MAGENTA,
        TAN,
        CYAN,
        OLIVE,
        MAROON,
        NAVY,
        AQUAMARINE,
        TURQUOISE,
        SILVER,
        LIME,
        TEAL,
        INDIGO,
        VIOLET,
        PINK,
        BLACK,
        WHITE;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRundomName() {
        return candyNames.values()[random.nextInt(candyNames.values().length)].toString();
    }

    public String getRundomColour() {
        return colors.values()[random.nextInt(colors.values().length)].toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWrapperColor() {
        return wrapperColor;
    }

    public void setWrapperColor(String wrapperColor) {
        this.wrapperColor = wrapperColor;
    }

    public void printInfo() {
        System.out.printf("%s\t%.2f\t%.2f\t%s\n", name, weight, cost, wrapperColor);
    }

    public void printInfo(Candy candy) {
        System.out.printf("%s\t%.2f\t%.2f\t%s\n", candy.getName(), candy.getWeight(), candy.getCost(), candy.getWrapperColor());
    }

    public void printResultInfo() {
        System.out.printf("%s\t%.2f\t%.2f\t%s\tX%d\n", getName(), getWeight(), getCost(), getWrapperColor(), getAmount());
    }
}
