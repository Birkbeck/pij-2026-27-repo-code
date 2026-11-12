package pij.day13.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {

    @Test
    void testFib_negative() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    int input = -1;
                    Fibonacci.fib(input);
                });
    }

    @Test
    void testFib_zero() {
        int input = 0;
        long expected = 0;
        long actual = Fibonacci.fib(input);
        assertEquals(expected, actual, "first base case");
    }

    @Test
    void testFib_one() {
        int input = 1;
        long expected = 1;
        long actual = Fibonacci.fib(input);
        assertEquals(expected, actual, "second base case");
    }

    @Test
    void testFib_two() {
        int input = 2;
        long expected = 1;
        long actual = Fibonacci.fib(input);
        assertEquals(expected, actual, "smallest recursive case");
    }
    @Test
    void testFib_six() {
        int input = 6;
        long expected = 8;
        long actual = Fibonacci.fib(input);
        assertEquals(expected, actual, "smallest recursive case");
    }
}