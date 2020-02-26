import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    Calculator calc = new Calculator();
    int num1 = 20;
    int num2 = 30;
    @Test
    public void addTest(){
        int expectedResults = 50;
        int results = calc.add(num1,num2);
        Assert.assertEquals(expectedResults,results);
    }
    @Test
    public void multiplyTest(){
        int expectedResults = 600;
        int results = calc.multiply(num1,num2);
        Assert.assertEquals(expectedResults,results);
    }

}