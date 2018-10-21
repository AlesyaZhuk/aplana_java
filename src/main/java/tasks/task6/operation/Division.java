package tasks.task6.operation;

public class Division extends BaseOperation {

    public Division(double first, double second, String operation) {
        super(first, second, operation);
    }

    public boolean isCorrectOperation() {
        return new CheckOperation().isDivision(operation) && second != 0;
    }

    public double apply() throws DivisionByZeroException {
        if (second != 0)
            return first / second;
        else
            throw new DivisionByZeroException();
    }
}
