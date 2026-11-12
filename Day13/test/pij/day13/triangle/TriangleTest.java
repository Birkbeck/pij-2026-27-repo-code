package pij.day13.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TriangleTest {

    @Test
    void testConstructor_negative() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    new Triangle(-1);
                });
    }

    @Test
    void testConstructor_zero() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    new Triangle(0);
                });
    }

    @Test
    void testGetArea_one() {
        Triangle input = new Triangle(1);
        int expected = 1;
        int actual = input.getArea();
        assertEquals(expected, actual);
    }

    @Test
    void testGetArea_two() {
        Triangle input = new Triangle(2);
        int expected = 3;
        int actual = input.getArea();
        assertEquals(expected, actual);
    }

    @Test
    void testGetArea_three() {
        Triangle input = new Triangle(3);
        int expected = 6;
        int actual = input.getArea();
        assertEquals(expected, actual);
    }

    @Test
    void testGetArea_oneHundred() {
        Triangle input = new Triangle(100);
        int expected = 5050;
        int actual = input.getArea();
        assertEquals(expected, actual,
                "Carl Friedrich Gauss computed this one in elementary school.");
    }
}