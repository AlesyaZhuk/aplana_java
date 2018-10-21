package tasks.task4.operation;

public class Division extends BaseOperation {

    public Division(double first, double second, String operation) {
        super(first, second, operation);
    }

    public boolean isCorrectOperation() {
        return new CheckOperation().isDivision(operation) && second != 0;
    }

    public double apply() {
        return first / second;
    }
}
