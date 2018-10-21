/**
 * Покрыть Unit тестами последний проект с калькулятором
 * quite a few unit-tests
 */

import org.junit.Assert;
import org.junit.Test;
import tasks.task6.calculator.Calculator;

public class CalculatorTests {

    @Test
    public void divisionByZero() {
        Calculator calculator = new Calculator(241, 0, "/");
        calculator.runCalculatorForTask7();
        Assert.assertFalse("Division by Zero should fail", calculator.isSuccsess());
        Assert.assertTrue("Message should contain information about division by Zero", calculator.getResultMessage().contains("Zero"));

    }

    @Test
    public void incorrectOperation() {
        Calculator calculator = new Calculator(241, 44, "meow");
        calculator.runCalculatorForTask7();
        Assert.assertFalse("Incorrect input operation must fail", calculator.isSuccsess());
        Assert.assertTrue("Message should contain information incorrect operation", calculator.getResultMessage().contains("Incorrect operation"));
    }

    @Test
    public void additionNegative() {
        double v1 = 232;
        double v2 = -3.22;
        Calculator calculator = new Calculator(v1, v2, "+");
        calculator.runCalculatorForTask7();
        Assert.assertTrue("Unexpected operation status", calculator.isSuccsess());
        Assert.assertTrue("Result should be a sum\nExpected: " + v1 + " + " + v2 + " = " + (v1 + v2) +
                "\nBut was: " + calculator.getResult(), calculator.getResult() == v1 + v2);
    }
}
