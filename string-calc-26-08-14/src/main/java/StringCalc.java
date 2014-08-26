package main.java;

public class StringCalc {
    int res;

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return res;
        }
        String[] array = numbers.split(",");
        for (String s: array) {
            res += Integer.parseInt(s.trim());
        }
        return res;
    }
}
