package org.apache.commons.lang3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyRangeTest {

    private Range<Byte> byteRange;
    private Range<Byte> byteRange2;
    private Range<Byte> byteRange3;

    private Range<Double> doubleRange;
    private Range<Float> floatRange;
    private Range<Integer> intRange;
    private Range<Long> longRange;

    @Before
    public void setUp() throws Exception {
        byteRange = Range.between((byte) 0, (byte) 5);
        byteRange2 = Range.between((byte) 0, (byte) 5);
        byteRange3 = Range.between((byte) 0, (byte) 10);

        intRange = Range.between(10, 20);
        longRange = Range.between(10L, 20L);
        floatRange = Range.between((float) 10, (float) 20);
        doubleRange = Range.between((double) 10, (double) 20);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testContains() {
        assertFalse(intRange.contains(null));

        assertFalse(intRange.contains(5));
        assertTrue(intRange.contains(10));
        assertTrue(intRange.contains(15));
        assertTrue(intRange.contains(20));
        assertFalse(intRange.contains(25));
    }
}