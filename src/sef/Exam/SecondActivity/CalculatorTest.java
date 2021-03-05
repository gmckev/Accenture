package SecondActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testGetSum() {
        int a = 5;
        int b = 10;
        assertEquals(15, (calculator.getSum(a,b)));
        assertEquals(15, (calculator.getSum(b,a)));

        a = -5;
        b = 10;
        assertEquals(5, (calculator.getSum(a,b)));
        assertEquals(5, (calculator.getSum(b,a)));

        a = -5;
        b = -10;
        assertEquals(-15, (calculator.getSum(a,b)));
        assertEquals(-15, (calculator.getSum(b,a)));
    }

    @Test
    public void testGetSubtraction() {
        int a = 3;
        int b = 2;
        assertEquals(1, (calculator.getSubtraction(a,b)));
        assertEquals(-1, (calculator.getSubtraction(b,a)));

        a = 5;
        b = -4;
        assertEquals(9, (calculator.getSubtraction(a,b)));
        assertEquals(-9, (calculator.getSubtraction(b,a)));

        a = -10;
        b = -5;
        assertEquals(-5, (calculator.getSubtraction(a,b)));
        assertEquals(5, (calculator.getSubtraction(b,a)));
    }

    @Test
    public void testGetMultiplication() {
        double a = 5;
        double b = 10;
        assertEquals(50, (calculator.getMultiplication(a,b)),0);
        assertEquals(50, (calculator.getMultiplication(b,a)),0);

        a = -5;
        b = 10;
        assertEquals(-50, (calculator.getMultiplication(a,b)),0);
        assertEquals(-50, (calculator.getMultiplication(b,a)),0);

        a = -3;
        b = -10;
        assertEquals(30, (calculator.getMultiplication(a,b)),0);
        assertEquals(30, (calculator.getMultiplication(b,a)),0);
    }

    @Test
    public void testGetDivision() {
        double a = 10;
        double b = 5;
        assertEquals(2, (calculator.getDivision(a,b)),0);
        assertEquals(0.5, (calculator.getDivision(b,a)),0);

        a = 9;
        b = -3;
        assertEquals(-3, (calculator.getDivision(a,b)),0);
        assertEquals(-0.33, (calculator.getDivision(b,a)),0.007);

        a = -10;
        b = -5;
        assertEquals(2, (calculator.getDivision(a,b)),0);
        assertEquals(0.5, (calculator.getDivision(b,a)),0);
    }
}
