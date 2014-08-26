package main.java;

public class StringCalc {
    int res = 0;

    public int add(String numbers) {
        addEmptyString(numbers);
        try {
            return addOneNumber(numbers);
        } catch (Exception e1) {
            String[] array = numbers.split("\\D");
            for (String s : array) {
                try {
                    res += Integer.parseInt(s.trim());
                } catch (Exception e2) {
                }
            }
            return res;
        }
    }

    private int addEmptyString(String numbers) {
        if (numbers.isEmpty()) {
            return res;
        }
        return -1;
    }

    private int addOneNumber(String numbers) {
        res = Integer.parseInt(numbers);
        return res;
    }
}