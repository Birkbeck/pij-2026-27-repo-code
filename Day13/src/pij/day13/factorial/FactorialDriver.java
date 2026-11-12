package pij.day13.factorial;

/**
 * Driver class for class Factorial.
 */
public class FactorialDriver {
    static void main() {
        int input = 4;
        int result = Factorial.factorial(input);
        IO.println("The factorial of " + input + " is " + result + ".");
    }
}
