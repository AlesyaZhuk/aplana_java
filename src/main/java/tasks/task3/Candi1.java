package tasks.task3;

public class Candi1 extends Candy {

    public Candi1() {
    }

    public Candi1(String name, double cost, double weight) {
        super(name, cost, weight);
    }

    public Candi1(double cost, double weight) {
        this.setCost(cost);
        this.setWeight(weight);
    }

    public String wrapperColor = getRundomColour();
}
