package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Quick3WayTest {

    // Write the same tests as QuickTest but for Quick3Way
    // Test case for Quick3Way,sort with an empty array.
    @Test
    void testSortEmptyArray() {
        Comparable[] array = new Comparable[0];
        Quick3Way.sort(array);
        assertEquals(0, array.length);
    }

    // Test case for Quick3Way,sort with an array of size 1.
    @Test
    void testSortArraySize1() {
        Comparable[] array = new Comparable[1];
        array[0] = 1;
        Quick3Way.sort(array);
        assertEquals(1, array.length);
        assertEquals(1, array[0]);
    }

    // Test case for Quick3Way.sort with an array containing repeated elements.
    @Test
    void testSortArrayRepeatedElements() {
        Comparable[] array = {1, 1, 1, 1, 1};
        Quick3Way.sort(array);
        assertArrayEquals(new Comparable[]{1, 1, 1, 1, 1}, array);
    }

    // Test case with array containing both equal and unequal elements.
    @Test
    void testSortArrayEqualAndUnequalElements() {
        Comparable[] array = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2};
        Quick3Way.sort(array);
        assertArrayEquals(new Comparable[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, array);
    }

    // Test case with a sorted array
    @Test
    void testSortArraySorted() {
        Comparable[] array = {1, 2, 3, 4, 5};
        Quick3Way.sort(array);
        assertArrayEquals(new Comparable[]{1, 2, 3, 4, 5}, array);
    }

    // Test case with a reverse sorted array
    @Test
    void testSortArrayReverseSorted() {
        Comparable[] array = {5, 4, 3, 2, 1};
        Quick3Way.sort(array);
        assertArrayEquals(new Comparable[]{1, 2, 3, 4, 5}, array);
    }

}
