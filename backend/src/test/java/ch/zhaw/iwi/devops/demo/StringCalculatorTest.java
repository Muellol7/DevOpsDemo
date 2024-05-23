package ch.zhaw.iwi.devops.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
   
    @Test
    public void StringCalculatorAdd() {
        StringCalculator calculator = new StringCalculator();

        assertEquals(0, calculator.add(""));
        assertEquals(1, calculator.add("1"));
        assertEquals(3, calculator.add("1,2"));
        assertEquals(15, calculator.add("1,2,3,4,5"));
    }
}
