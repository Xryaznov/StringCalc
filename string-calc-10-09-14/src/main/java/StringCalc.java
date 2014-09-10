package main.java;

public class StringCalc {
    private int sum;
    private String delimiter;

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            this.delimiter = numbers.substring(2, 3);
        } else {
            this.delimiter = ",";
        }

        String[] array = divideByDelimiter(numbers, delimiter);


        for (String s : array) {
            try {
                sum += Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
            }
        }

        return sum;
    }

    private String[] divideByDelimiter(String numbers, String delimiter) {
        return numbers
                    .replace("\n", delimiter)
                    .split(delimiter);
    }
}
