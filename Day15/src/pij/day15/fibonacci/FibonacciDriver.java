package pij.day15.fibonacci;

/**
 * Driver class for computing the Fibonacci function.
 */
public class FibonacciDriver {

    static void main() {
        final int INPUT = 46;
        runFibonacci(INPUT);
    }

    private static void runFibonacci(int n) {
        long nanos1 = System.nanoTime();
        long result = FibonacciMemoised.fib(n); // version with memoisation, cleaned up
        //long result = FibonacciMemoisedFirstAttempt.fib(n); // version with memoisation, first attempt
        //long result = FibonacciOriginal.fib(n); // version without memoisation
        long nanos2 = System.nanoTime();
        IO.println("fib(" + n + ") = " + result);
        IO.println("The computation took " + (nanos2 - nanos1)/1000 + " microseconds.");
    }
}
