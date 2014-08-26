package main.java;

public class StringCalc {
    public static void main(String[] args) {
        StringCalc sc = new StringCalc();
        sc.add("//2");
    }

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        if (numbers.startsWith("//")) {
            String[] array = numbers.substring(2, numbers.length()).split(numbers.substring(2, 3));
            sum = 0;
            for (String s : array) {
                if (!s.trim().isEmpty()) {
                    sum += Integer.valueOf(s.trim());
                }
            }
        } else {
            sum = splitAndAdd(numbers);
        }
        return sum;
    }

    private int splitAndAdd(String numbers) {
        int sum;
        String[] array = numbers.split("\\D");
        sum = 0;
        for (String s : array) {
            if (!s.trim().isEmpty()) {
                sum += Integer.valueOf(s.trim());
            }
        }
        return sum;
    }
}
