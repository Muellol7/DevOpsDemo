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
        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(5, calculator.add("//;\n2;3"));
    }
}
