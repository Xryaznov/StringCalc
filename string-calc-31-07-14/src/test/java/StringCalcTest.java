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
        assertEquals(sc.add("42"), 42);
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(sc.add("42, 42"), 84);
    }

    @Test
    public void testAddRandomNumbers() {
        Random random = new Random();
        String[] array = new String[random.nextInt(100)];
        StringBuilder numbers = new StringBuilder();

        int i = 0;
        int sum = 0;

        for (String s : array) {
            i = random.nextInt(100);
            sum += i;
            s = String.valueOf(i);
            numbers.append(s).append(", ");
        }

        assertEquals(sc.add(numbers.toString()), sum);
    }

    @Test
    public void testAddWithLines() {
        assertEquals("1\n2,3", 6);
    }

}
