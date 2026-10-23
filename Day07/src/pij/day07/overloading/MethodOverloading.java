package pij.day07.overloading;

/**
 * Some examples on method overloading.
 */
public class MethodOverloading {

    public void printAverage(double d1, double d2, String msg) {
        double result = 0.5 * (d1 + d2);
        IO.println(msg + result);
    }

    public void printAverage(double d1, double d2) {
        printAverage(d1, d2, "The average is: ");
    }
}
