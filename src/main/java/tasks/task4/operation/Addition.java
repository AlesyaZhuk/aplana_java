package tasks.task4.operation;

public class Addition extends BaseOperation {
    public Addition(double first, double second, String operation) {
        super(first, second, operation);
    }

    public boolean isCorrectOperation() {
        return new CheckOperation().isAddition(operation);
    }

    public double apply() {
        return first + second;
    }
}
