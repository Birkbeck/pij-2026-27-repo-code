package pij.day10.scannerWeirdness;

import java.util.Scanner;

public class Day10Exercise11 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        IO.println("Please enter an integer number and press Return!");
        int num = scan.nextInt();
        IO.println("Please enter a String and press Return!");
        String word1 = scan.nextLine();
        IO.println("Please enter another String and press Return!");
        String word2 = scan.nextLine();
        IO.println("Your number was " + num
                 + ", your first String was \"" + word1
                 + "\", and your second String was \"" + word2 + "\".");
    }
}
