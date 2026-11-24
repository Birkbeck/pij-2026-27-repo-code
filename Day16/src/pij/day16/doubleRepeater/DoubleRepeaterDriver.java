package pij.day16.doubleRepeater;

/**
 * Exercise 1.
 * Driver class for DoubleRepeater.
 */
public class DoubleRepeaterDriver {
    static void main() {
        final double INPUT = 256;
        final int TIMES = 3;

        // lambda expression for two times the number
        IO.println(DoubleRepeater.repeat(null/* TODO */, INPUT, TIMES));

        // Math.sqrt via lambda
        IO.println(DoubleRepeater.repeat(null/* TODO */, INPUT, TIMES));

        // Math.sqrt via method reference (no ->)
        IO.println(DoubleRepeater.repeat(null/* TODO */, INPUT, TIMES));
    }
}
