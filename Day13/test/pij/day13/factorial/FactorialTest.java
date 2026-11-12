package pij.day13.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    void testFactorial_baseCase() {
        int input = 1;
        int expected = 1;
        int actual = Factorial.factorial(input);
        assertEquals(expected, actual, "base case");
    }

    @Test
    void testFactorial_two() {
        int input = 2;
        int expected = 2;
        int actual = Factorial.factorial(input);
        assertEquals(expected, actual, "first recursive case");
    }

    @Test
    void testFactorial_five() {
        int input = 5;
        int expected = 120;
        int actual = Factorial.factorial(input);
        assertEquals(expected, actual, "higher value");
    }

}