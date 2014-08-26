package test.java;

import main.java.StringCalc;
import org.junit.Before;
import org.junit.Test;

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
        assertEquals(sc.add("1"), 1);
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(sc.add("1, 2"), 3);
    }

    @Test
    public void testAddUnknownAmount() {
        assertEquals(sc.add("1, 2, 3, 4, 5"), 15);
    }

    @Test
    public void testAddLinesDelimiter() {
        assertEquals(sc.add("1\n2,3"), 6);
    }

    @Test
    public void testAddSupportDelimiters() {
        assertEquals(sc.add("//;\n1;2"), 3);
    }
}
