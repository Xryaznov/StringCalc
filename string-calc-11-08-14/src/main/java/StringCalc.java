package main.java;

import java.util.Arrays;

public class StringCalc {
    private int sum;
    private String[] array;

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        try {
            numbers = numbers.replace("\n", ",");

            array = numbers.split(",");
            for (String s : array) {
                sum += Integer.parseInt(s.trim());
            }
        } catch (Exception e) {
            try {
                sum = Integer.valueOf(numbers.trim());
                return sum;
            } catch (Exception e1) {
                numbers = numbers.replace("\n", numbers.substring(2, 3));
                System.out.println(numbers);
                numbers = numbers.replace("//", numbers.substring(2, 3));
                System.out.println(numbers);
                numbers = numbers.replace(String.valueOf(numbers.charAt(0)), ",");
                array = numbers.split(",");
                System.out.println(Arrays.asList(array));
                for (String s : array) {
                    try {
                        sum += Integer.parseInt(s.trim());
                    } catch (Exception e3) {
                    }
                }
            }
        }
        return sum;
    }
}
