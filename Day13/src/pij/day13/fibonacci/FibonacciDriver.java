package pij.day13.fibonacci;

/**
 * Driver class for class Fibonacci.
 */
public class FibonacciDriver {
    static void main() {
        int input = 6;
        long result = Fibonacci.fib(input);
        IO.println("fib(" + input + ") = " + result);
    }
}
