import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void addTest(){
        int expectedResults = calc.add(1,3);
        int results = 4;
        Assert.assertEquals(expectedResults,results);
    }
    @Test
    public void multiplyTest(){
        int expectedResults = calc.multiply(1,2,3,4,5);
        int results = 120;
        Assert.assertEquals(expectedResults,results);
    }

}