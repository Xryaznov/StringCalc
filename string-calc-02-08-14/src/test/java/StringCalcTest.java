package test.java;

import main.java.StringCalc;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StringCalcTest {
    StringCalc sc;

    @Before
    public void init() {
        sc = new StringCalc();
    }

    @Test
    public void testAddEmptyString() {
        assertEquals(sc.add(""), 0);
    }

    @Test
    public void testAddOneNumber() {
        assertEquals(sc.add("2"), 2);
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(sc.add("2, 2"), 4);
    }

    @Test
    public void testAddUnknownAmount() {
        Random random = new Random();
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < random.nextInt(100) ; i++) {
            numbers.append(String.valueOf(random.nextInt(100))).append(", ");
        }
        String[] array = numbers.toString().split(", ");
        int sum = 0;
        for (String s: array) {
            sum += Integer.valueOf(s);
        }
        assertEquals(sc.add(numbers.toString()), sum);
    }

    @Test
    public void testAddNewDelimiters1() {
        assertEquals(sc.add("1\n2,3"), 6);
    }

    @Test
    public void testAddNewDelimiters2() {
        assertEquals(sc.add("//;\n1;2"), 3);
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(sc.add("-1, -3"), "Negatives are not allowed");
    }

}
