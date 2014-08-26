package main.java;

public class StringCalc {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        String[] array = numbers.split("\\D");
        for (String s: array) {
            try {
                sum += Integer.valueOf(s);
            } catch (Exception e) {
                System.out.println(e.getMessage());}
        }
        return sum;
    }
}
