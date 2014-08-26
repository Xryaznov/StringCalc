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
    public void testAddEmptyString() throws Exception {
        assertEquals(sc.add(""), 0);
    }

    @Test
    public void testAddOneNumber() throws Exception {
        assertEquals(sc.add("1"), 1);
    }

    @Test
    public void testAddNumbersComma() throws Exception {
        assertEquals(sc.add("1,2"), 3);
    }

    @Test
    public void testAddNumbersCommaSpace() throws Exception {
        assertEquals(sc.add("1, 2"), 3);
    }

    @Test
    public void testAddManyNumbers() throws Exception {
        assertEquals(sc.add("1, 333, 4,44, 18, 2"), 402);
    }

    @Test
    public void testAddNewLine() throws Exception {
        assertEquals(sc.add("1\n2, 3"), 6);
    }
}
