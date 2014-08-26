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
        assertEquals(sc.add("1, 2"), 3);
    }

    @Test
    public void testAddTwoNumbers2() throws Exception {
        assertEquals(sc.add("1,2"), 3);
    }

    @Test
    public void testAddManyNumbers() throws Exception {
        assertEquals(sc.add("1,2,4, 17, 34, 1"), 59);
    }

    @Test
    public void testAddWithNewLines() throws Exception {
        assertEquals(sc.add("1\n2, 3"), 6);
    }

    @Test
    public void testAddDifferentDelimiters1() throws Exception {
        assertEquals(sc.add("//;\n1;2"), 3);
    }

    @Test
    public void testAddDifferentDelimiters2() throws Exception {
        assertEquals(sc.add("//]\n1]2"), 3);
    }
}
