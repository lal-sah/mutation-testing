package com.lal.mutationtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    public void testPositive() {
        assertTrue(NumberUtils.isPositive(10));
        assertTrue(NumberUtils.isPositive(0));
        assertFalse(NumberUtils.isPositive(-1));
    }
}