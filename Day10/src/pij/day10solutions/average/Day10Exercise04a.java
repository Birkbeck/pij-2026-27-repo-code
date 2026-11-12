package pij.day10solutions.average;

import java.util.Scanner;

/** Day 10, Exercise 4, part a. */
public class Day10Exercise04a {

    /**
     * Prints the given {@code message} and repeatedly asks the user for an int
     * until they enter one via the keyboard. Then that value is returned.
     *
     * @param message the message to print
     * @return the int value read from the user
     */
    public static int getInput(String message) {
        while (true) {
            try {
                IO.println(message);
                String s = IO.readln();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                IO.println(e.getMessage() + " is not an int!");
            }
        }
    }

    /**
     * Reads max({@code count}, 0) variables from the user and returns their
     * average.
     *
     * @param count the number of numbers to read from the user
     * @return the average of the entered numbers
     */
    public static double readNumbersAndComputeAverage(int count) {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += getInput("Please enter number " + (i+1) + "!");
        }
        return sum / count;
    }

    static void main() {
        double avg = readNumbersAndComputeAverage(10);
        IO.println("The average is: " + avg);
    }
}
