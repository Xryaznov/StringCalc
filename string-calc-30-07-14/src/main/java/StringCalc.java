package main.java;

public class StringCalc {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] array = numbers.split("\\D");
        int sum = 0;
        for (String s : array) {
            try {
                sum += Integer.valueOf(s);
            } catch (Exception e) {
            }
        }
        return sum;
    }
}
