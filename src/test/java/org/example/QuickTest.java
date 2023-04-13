package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickTest {

    // Test case for Quick,sort with an empty array.
    @Test
    void testSortEmptyArray() {
        Comparable[] array = new Comparable[0];
        Quick.sort(array);
        assertEquals(0, array.length);
    }

    // Test case for Quick,sort with an array of size 1.
    @Test
    void testSortArraySize1() {
        Comparable[] array = new Comparable[1];
        array[0] = 1;
        Quick.sort(array);
        assertEquals(1, array.length);
        assertEquals(1, array[0]);
    }

    // Test case for Quick.sort with an array containing repeated elements.
    @Test
    void testSortArrayRepeatedElements() {
        Comparable[] array = {1, 1, 1, 1, 1};
        Quick.sort(array);
        assertArrayEquals(new Comparable[]{1, 1, 1, 1, 1}, array);
    }

    // Test case with array containing both equal and unequal elements.
    @Test
    void testSortArrayEqualAndUnequalElements() {
        Comparable[] array = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2};
        Quick.sort(array);
        assertArrayEquals(new Comparable[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, array);
    }

    // Test case with a sorted array
    @Test
    void testSortArraySorted() {
        Comparable[] array = {1, 2, 3, 4, 5};
        Quick.sort(array);
        assertArrayEquals(new Comparable[]{1, 2, 3, 4, 5}, array);
    }

    // Test case with a reverse sorted array
    @Test
    void testSortArrayReverseSorted() {
        Comparable[] array = {5, 4, 3, 2, 1};
        Quick.sort(array);
        assertArrayEquals(new Comparable[]{1, 2, 3, 4, 5}, array);
    }

    // Test case with a random array of 20 elements
    @Test
    void testSortArrayRandom() {
        Comparable[] array = {5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5};
        Quick.sort(array);
        assertArrayEquals(new Comparable[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5}, array);
    }

}