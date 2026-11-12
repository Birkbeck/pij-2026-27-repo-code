package pij.day13.lineByLine;

public class LineByLine {
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        IO.println(n);
        printNumbers(n-2);
        printNumbers(n-3);
        IO.println(n);
    }
}
