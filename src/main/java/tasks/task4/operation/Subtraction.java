package tasks.task4.operation;

public class Subtraction extends BaseOperation{
    public Subtraction(double first, double second, String operation) {
        super(first, second, operation);
    }

    public boolean isCorrectOperation() {
        return new CheckOperation().isSubtraction(operation);
    }

    public double apply() {
        return first - second;
    }
}
