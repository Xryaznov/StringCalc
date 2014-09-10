package test.java;

import main.java.StringCalc;
import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StringCalcTest {
    private StringCalc sc;

    @Before
    public void init() {
        sc = new StringCalc();
    }

    @Test
    public void testAddEmptyString() {
        assertEquals(sc.add(""), 0);
    }

    @Test
    public void testOneNumber1() {
        assertEquals(sc.add("1"), 1);
    }

    @Test
    public void testOneNumber2() {
        assertEquals(sc.add("1 "), 1);
    }

    @Test
    public void testTwoNumbers1() {
        assertEquals(sc.add("1,2 "), 3);
    }

    @Test
    public void testTwoNumbers2() {
        assertEquals(sc.add("1, 2"), 3);
    }

    @Test
    public void testManyNumbers() {
        assertEquals(sc.add("1, 2, 3, 4,5,6,7"), 28);
    }

    @Test
    public void testWithNewLine() {
        assertEquals(sc.add("1\n2,3"), 6);
    }

    @Test
    public void testWithNewDelimiter1() {
        assertEquals(sc.add("//;\n1;2"), 3);
    }

    @Test
    public void testWithNewDelimiter2() {
        assertEquals(sc.add("//:\n1:2"), 3);
    }
}
