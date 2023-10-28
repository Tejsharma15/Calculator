import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp(){
        calculator = new Main();
    }
    @Test
    public void test_add_positive(){
        int a=1;
        int b=2;
        int expected = 3;
        Assert.assertEquals(expected, calculator.add(a, b));
    }
    @Test
    public void test_add_negative(){
        int a = 1;
        int b = 2;
        int expected = 0;
        Assert.assertNotEquals(expected, calculator.add(a, b));
    }
}
