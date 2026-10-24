package pij.day06solutions.printEven;

public class EvenPrinterRunner {

    private static void testEvenPrinter(String s) {
        IO.println("Input: " + s);
        EvenPrinter ep = new EvenPrinter(s);
        IO.print("Characters at even positions: ");
        ep.printEven();
    }

    void main() {
        testEvenPrinter("abcdefgh");
        testEvenPrinter("abcdefg");
        testEvenPrinter("a");
        testEvenPrinter("");
    }
}
