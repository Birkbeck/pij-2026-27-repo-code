package pij.day10solutions.average;

/** Day 10, Exercise 4, part b. */
public class Day10Exercise04b {
    static void main() {
        int count = Day10Exercise04a.getInput("How many numbers do you want to enter?");
        double avg = Day10Exercise04a.readNumbersAndComputeAverage(count);
        IO.println("The average is: " + avg);

    }
}
