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
    public void testAddEmptyString() throws Exception {
        assertEquals(sc.add(""), 0);
    }

    @Test
    public void testAddOneNumber() throws Exception {
        assertEquals(sc.add("2"), 2);
    }

    @Test
    public void testAddTwoNumbers1() throws Exception {
        assertEquals(sc.add("1,2"), 3);
    }

    @Test
    public void testAddTwoNumbers2() throws Exception {
        assertEquals(sc.add("1, 2"), 3);
    }

    @Test
    public void testAddThreeNumbers1() throws Exception {
        assertEquals(sc.add("1,2,3"), 6);
    }

    @Test
    public void testAddThreeNumbers2() throws Exception {
        assertEquals(sc.add("1, 2,3"), 6);
    }

    @Test
    public void testAddNewLines() throws Exception {
        assertEquals(sc.add("1\n2, 3"), 6);
    }
}
