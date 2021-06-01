import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    public Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertEquals("Sum of two numbers is not correct", 15.2,
                calculator.add(5.0, 10.2), 0);
    }

    @Test
    public void subtractTest() {
        assertEquals("Subtraction of two numbers are not correct", 10.0, calculator.subtract(15.0, 5.0), 0);
    }

    @Test
    public void multiplyTest() {
        assertEquals("Multiplying of two numbers are not correct", 8.0, calculator.multiply(4.0, 2.0), 0);
    }

    @Test
    public void divideTest() {
        assertEquals("Division of two numbers are not correct", 3.0, calculator.divide(6.0, 2.0), 0);
    }
}


