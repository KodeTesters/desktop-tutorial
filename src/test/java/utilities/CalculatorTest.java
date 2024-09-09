package utilities;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Setting up resources...");
    }

    @Test(priority = 1, description = "Test addition of two numbers")
    public void testAddition() {
        int result = add(2, 3);
        Assert.assertEquals(result, 5, "Addition result is incorrect!");
    }

    @Test(priority = 2, description = "Test subtraction of two numbers")
    public void testSubtraction() {
        int result = subtract(5, 3);
        Assert.assertEquals(result, 2, "Subtraction result is incorrect!");
    }

    @Test(priority = 3, description = "Test multiplication of two numbers")
    public void testMultiplication() {
        int result = multiply(2, 3);
        Assert.assertEquals(result, 6, "Multiplication result is incorrect!");
    }

    @Test(priority = 4, description = "Test division of two numbers", expectedExceptions = ArithmeticException.class)
    public void testDivision() {
        int result = divide(6, 0); // This will throw ArithmeticException
        Assert.assertEquals(result, 2, "Division result is incorrect!");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Cleaning up resources...");
    }

    // Basic calculator methods
    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }
}
