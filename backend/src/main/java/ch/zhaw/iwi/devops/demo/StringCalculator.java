package ch.zhaw.iwi.devops.demo;

public class StringCalculator {
    public int add (String numbers) {
      
        String[] numberArray = numbers.split(",");
        int sum = 0;
        
        for (String number : numberArray) {
            sum += Integer.parseInt(number);
        }
        
        return sum;    
    }
    
}
