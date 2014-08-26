package test.java;

import main.java.StringCalc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalcTest {
    private StringCalc sc;

    @Before
    public void init() {
        sc = new StringCalc();
    }

    @Test
    public void testAddNone() {
        assertEquals(sc.add(""), 0);
    }

    @Test
    public void testAddOne() {
        assertEquals(sc.add("2"), 2);
    }

    @Test
    public void testAddTwo() {
        assertEquals(sc.add("2, 4"), 6);
    }

    @Test
    public void testAddInfinite() {
        assertEquals(sc.add("1, 2, 3, 4, 5"), 15);
    }

    @Test
    public void testAddDelimiters1() {
        assertEquals(sc.add("1\\n2,3"), 6);
    }
}
