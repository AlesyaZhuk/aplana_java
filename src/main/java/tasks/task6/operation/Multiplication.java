package tasks.task6.operation;

public class Multiplication extends BaseOperation {

    public Multiplication(double first, double second, String operation) {
        super(first, second, operation);
    }

    public boolean isCorrectOperation() {
        return new CheckOperation().isMultiplication(operation);
    }

    public double apply() {
        return first * second;
    }
}
