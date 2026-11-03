package pij.day10.scanner;

import java.util.Scanner;

/** Driver class for some functionality of class Scanner. */
public class ScannerRunner {
    static void main() {
        Scanner scanner = new Scanner(System.in); // read from the keyboard
        IO.println("Please enter your name!");
        String name = scanner.nextLine();
        IO.println("Hello, " + name);
        IO.println("Please enter a value that can be parsed as an int!");
        // can the next token on the scanner's source be parsed as an int?
        if (scanner.hasNextInt()) {
            // the condition has evaluated to true, so reading an int is safe
            int n = scanner.nextInt();
            IO.println("You entered the following int: " + n);
        } else {
            IO.println("That's no int!");
        }
    }
}
