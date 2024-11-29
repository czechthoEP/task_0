package org.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    void testSingleElement() {
        int[] nums = {5};
        assertEquals(5, Main.getClosestValueToZero(nums));
    }

    @Test
    void testPositiveNumbers() {
        int[] nums = {10, 5, 3, 1, 8};
        assertEquals(1, Main.getClosestValueToZero(nums));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-10, -5, -3, -1, -8};
        assertEquals(-1, Main.getClosestValueToZero(nums));
    }

    @Test
    void testMixedPositiveAndNegative() {
        int[] nums = {-4, 2, -1, 1, -3, 3};
        assertEquals(1, Main.getClosestValueToZero(nums));
    }

    @Test
    void testTieWithPositiveLarger() {
        int[] nums = {-5, 5};
        assertEquals(5, Main.getClosestValueToZero(nums));
    }

    @Test
    void testZeroInArray() {
        int[] nums = {0, -5, 5, 3, -3};
        assertEquals(0, Main.getClosestValueToZero(nums));
    }

    @Test
    void testAllZeros() {
        int[] nums = {0, 0, 0};
        assertEquals(0, Main.getClosestValueToZero(nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> Main.getClosestValueToZero(nums));
    }

    @Test
    void testNullArray() {
        int[] nums = null;
        assertThrows(IllegalArgumentException.class, () -> Main.getClosestValueToZero(nums));
    }

    @Test
    void testLargeNumbers() {
        int[] nums = {Integer.MAX_VALUE, Integer.MIN_VALUE, -1, 1};
        assertEquals(1, Main.getClosestValueToZero(nums));
    }

    @Test
    void testExtremeValueNumbers() {
        int[] nums = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        assertEquals(Integer.MIN_VALUE, Main.getClosestValueToZero(nums));
    }

    @Test
    void testDuplicateNumbers() {
        int[] nums = {-2, -2, 2, 2};
        assertEquals(2, Main.getClosestValueToZero(nums));
    }

}