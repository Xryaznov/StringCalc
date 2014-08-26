package main.java;

public class StringCalc {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String numbers2 = numbers.replaceAll(",", "\n");
        String[] array = numbers2.split("\n");
        int sum = 0;
        for (String s : array) {
            sum += Integer.valueOf(s.trim());
        }
        return sum;
    }
}
