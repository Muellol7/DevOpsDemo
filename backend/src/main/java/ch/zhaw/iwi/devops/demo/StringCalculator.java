package ch.zhaw.iwi.devops.demo;

public class StringCalculator {
    public int add (String numbers) {
        
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] numberArray = numbers.split(",|\n");
        int sum = 0;
        
        for (String number : numberArray) {
            sum += Integer.parseInt(number);
        }
        
        return sum;    
    }
    
}
