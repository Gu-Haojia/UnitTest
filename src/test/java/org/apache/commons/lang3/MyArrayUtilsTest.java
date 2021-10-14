package org.apache.commons.lang3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MyArrayUtilsTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testClone() {
        ArrayUtils arraytest=new ArrayUtils();
        assertNull(arraytest.clone((int[]) null));
        final int[] original = new int[]{5, 8};
        final int[] cloned = arraytest.clone(original);
        assertArrayEquals(original, cloned);
        assertNotSame(original, cloned);
    }


    @Test
    public void testContains() {
        ArrayUtils arraytest=new ArrayUtils();
        final Object[] array = new Object[]{"0", "1", "2", "3", null, "0"};
        assertFalse(arraytest.contains(null, null));
        assertFalse(arraytest.contains(null, "1"));
        assertTrue(arraytest.contains(array, "0"));
        assertTrue(arraytest.contains(array, "3"));
        assertTrue(arraytest.contains(array, null));
        assertFalse(arraytest.contains(array, "Array"));
    }

    @Test
    public void testisSameLength() {
        ArrayUtils arraytest=new ArrayUtils();
        final int[] nullArray = null;
        final int[] emptyArray = new int[0];
        final int[] oneArray = new int[]{1};
        final int[] twoArray = new int[]{2, 3};

        assertTrue(arraytest.isSameLength(nullArray, nullArray));
        assertTrue(arraytest.isSameLength(nullArray, emptyArray));
        assertFalse(arraytest.isSameLength(nullArray, oneArray));
        assertFalse(arraytest.isSameLength(nullArray, twoArray));

        assertTrue(arraytest.isSameLength(emptyArray, nullArray));
        assertTrue(arraytest.isSameLength(emptyArray, emptyArray));
        assertFalse(arraytest.isSameLength(emptyArray, oneArray));
        assertFalse(arraytest.isSameLength(emptyArray, twoArray));

        assertFalse(arraytest.isSameLength(oneArray, nullArray));
        assertFalse(arraytest.isSameLength(oneArray, emptyArray));
        assertTrue(arraytest.isSameLength(oneArray, oneArray));
        assertFalse(arraytest.isSameLength(oneArray, twoArray));

        assertFalse(arraytest.isSameLength(twoArray, nullArray));
        assertFalse(arraytest.isSameLength(twoArray, emptyArray));
        assertFalse(arraytest.isSameLength(twoArray, oneArray));
        assertTrue(arraytest.isSameLength(twoArray, twoArray));
    }

    @Test
    public void testreverse() {
        ArrayUtils arraytest=new ArrayUtils();
        int[] array = new int[]{1, 2, 3};
        // The whole array
        arraytest.reverse(array, 0, 3);
        assertEquals(3, array[0]);
        assertEquals(2, array[1]);
        assertEquals(1, array[2]);
        // a range
        array = new int[]{1, 2, 3};
        arraytest.reverse(array, 0, 2);
        assertEquals(2, array[0]);
        assertEquals(1, array[1]);
        assertEquals(3, array[2]);
        // a range with a large stop index
        array = new int[]{1, 2, 3};
        arraytest.reverse(array, -1, 1000);
        assertEquals(3, array[0]);
        assertEquals(2, array[1]);
        assertEquals(1, array[2]);
        // null
        array = null;
        arraytest.reverse(array, 0, 3);
        assertNull(array);
    }

    @Test
    public void testtoArray() {
        ArrayUtils arraytest=new ArrayUtils();
        final String[] array = arraytest.toArray("Hello", "World");
        assertEquals(2, array.length);
        assertEquals("Hello", array[0]);
        assertEquals("World", array[1]);
    }
}