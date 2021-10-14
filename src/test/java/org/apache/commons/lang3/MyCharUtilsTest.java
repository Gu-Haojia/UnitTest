package org.apache.commons.lang3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyCharUtilsTest {

    private static final char CHAR_COPY = '\u00a9';
    private static final Character CHARACTER_A = Character.valueOf('A');
    private static final Character CHARACTER_B = Character.valueOf('B');

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCompare() {
        assertTrue(CharUtils.compare('a', 'b') < 0);
        assertEquals(0, CharUtils.compare('c', 'c'));
        assertTrue(CharUtils.compare('c', 'a') > 0);
    }

    @Test
    public void testIsAscii_char() {
        assertTrue(CharUtils.isAscii('a'));
        assertTrue(CharUtils.isAscii('A'));
        assertTrue(CharUtils.isAscii('3'));
        assertTrue(CharUtils.isAscii('-'));
        assertTrue(CharUtils.isAscii('\n'));
        assertFalse(CharUtils.isAscii(CHAR_COPY));

        for (int i = 0; i < 255; i++) {
            assertEquals(i < 128, CharUtils.isAscii((char) i));
        }
    }

}