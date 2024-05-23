package ch.zhaw.iwi.devops.demo;

public class StringCalculator {
    public int add (String numbers) {
        
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n";
        
        if (numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterEnd);
            numbers = numbers.substring(delimiterEnd + 1);
        }
        
        String[] numberArray = numbers.split(delimiter);
        int sum = 0;
        
        
        for (String number : numberArray) {
            sum += Integer.parseInt(number);
        }
        
        return sum;    
    }
    
}
