package main.java;

import java.util.ArrayList;

public class StringCalc {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] array = numbers.split(",");

        ArrayList<Integer> list = new ArrayList<Integer>();


        for (String s : array) {
            try {
            if (Integer.valueOf(s.trim()) instanceof Integer) {

                list.add(Integer.valueOf(s.trim()));
            }
                } catch (Exception e) {
                    System.out.println(e.getMessage());

            } /*else {
                try {
                    list.add(Integer.valueOf(s.split("\n")[0].trim()));
                    list.add(Integer.valueOf(s.split("\n")[1].trim()));
                    list.add(Integer.valueOf(s.split("\n")[2].trim()));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }*/

        }

        int sum = 0;

        for (Integer s : list) {
            sum += s;
        }
        return sum;
    }
}
