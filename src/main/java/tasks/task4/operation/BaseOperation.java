package tasks.task4.operation;

public class BaseOperation {
    protected double first;
    protected double second;
    protected String operation;

    public BaseOperation() {
    }

    public BaseOperation(double first, double second, String operation) {
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public boolean isCorrectOperation() {
        return new CheckOperation().isCorrectOperation(operation);
    }
}
