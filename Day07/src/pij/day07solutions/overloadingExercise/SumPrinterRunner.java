package pij.day07solutions.overloadingExercise;

/**
 * Exercise 13. Runner for SumPrinter and SumPrinterSolution.
 */
public class SumPrinterRunner {

    static void main() {
        int x = 2;
        int y = 3;
        String a = "4";
        String b = "5";
        String prefix = "Hello!";
        SumPrinter.printSum(x, y);
        SumPrinterSolution.printSum(x, y);
        SumPrinter.printSum(x, y, prefix);
        SumPrinterSolution.printSum(x, y, prefix);
        SumPrinter.printSum(a, b);
        SumPrinterSolution.printSum(a, b);

    }
}
