package pij.day07solutions.overloadingExercise;

/**
 * Exercise 13. The below code uses overloading, but has some DRY issues.
 */
public class SumPrinter {

    public static void printSum(int x, int y, String prefix) {
        int sum = x + y;
        IO.println(prefix + sum);
    }
    public static void printSum(int x, int y) {
        int sum = x + y;
        IO.println(x + " + " + y + " = " + sum);
    }
    public static void printSum(String x, String y) {
        int xInt = Integer.parseInt(x);
        int yInt = Integer.parseInt(y);
        int sum = xInt + yInt;
        IO.println(x + " + " + y + " = " + sum);
    }
}
