package pij.day13.mergeSorter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MergeSorterTest {

    @Test
    void testSort_null() {
        assertThrows(NullPointerException.class,
                () -> {
                    MergeSorter.sort(null);
                });
    }

    @Test
    void testSort_length0() {
        int[] actual = {}; // will be sorted in-place
        int[] expected = {};
        MergeSorter.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSort_length1() {
        int[] actual = { 3 }; // will be sorted in-place
        int[] expected = { 3 };
        MergeSorter.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSort_length2_sorted() {
        int[] actual = { 3, 4 }; // will be sorted in-place
        int[] expected = { 3, 4 };
        MergeSorter.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSort_length2_unsorted() {
        int[] actual = { 4, 3 }; // will be sorted in-place
        int[] expected = { 3, 4 };
        MergeSorter.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSort_length5_unsorted() {
        int[] actual = { 4, 3, 7, 1, 2 }; // will be sorted in-place
        int[] expected = { 1, 2, 3, 4, 7 };
        MergeSorter.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSort_length5_sorted() {
        int[] actual = { 1, 2, 3, 4, 7 }; // will be sorted in-place
        int[] expected = { 1, 2, 3, 4, 7 };
        MergeSorter.sort(actual);
        assertArrayEquals(expected, actual);
    }
}