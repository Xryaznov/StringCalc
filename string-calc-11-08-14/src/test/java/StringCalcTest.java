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
    public void testAdd() throws Exception {
        assertEquals(sc.add(""), 0);
    }

    @Test
    public void testAddOneNumber() throws Exception {
        assertEquals(sc.add("2 "), 2);
    }

    @Test
    public void testAddTwoNumbers() throws Exception {
        assertEquals(sc.add("3, 3"), 6);
    }

    @Test
    public void testAddManyNumbers() throws Exception {
        assertEquals(sc.add("3, 3, 3, 7, 3"), 19);
    }

    @Test
    public void testAddNewLines() throws Exception {
        assertEquals(sc.add("1\n2, 3"), 6);
    }


    @Test
    public void testAddChangeDelimiter() throws Exception {
        assertEquals(sc.add("//;\n1;2"), 3);
    }






}
