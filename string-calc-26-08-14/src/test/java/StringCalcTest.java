package test.java;

import main.java.StringCalc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StringCalcTest {
    private StringCalc sc;

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
    public void testAddTwoNumbers() throws Exception {
        assertEquals(sc.add("2, 3"), 5);
        init();
        assertEquals(sc.add("2,3"), 5);
    }

    @Test
    public void testAddManyNumbers() throws Exception {
        assertEquals(sc.add("2,3, 3,4, 8"), 20);
    }





}



