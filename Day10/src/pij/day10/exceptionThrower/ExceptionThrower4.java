package pij.day10.exceptionThrower;

import java.util.Optional;

/**
 * Some practice with Exceptions. Enter a String that cannot be parsed to
 * an int or has length less than 3 and see what happens!
 */
public class ExceptionThrower4 {
    static void main() {
        ExceptionThrower4 et = new ExceptionThrower4();
        et.launch();
    }
    private void launch() {
        Optional<Integer> numberOrNothing = getNumber();
        if (! numberOrNothing.isPresent()) {
            IO.println("Hey, that's no number!");
            return;
        }
        int n = numberOrNothing.get();
        String isOdd = (n % 2 == 0) ? "even" : "odd";
        IO.println("You entered " + n + ", it is " + isOdd + ".");
    }
    private Optional<Integer> getNumber() {
        try {
            String str = IO.readln("Enter a number with at least 3 characters: ");
            int result = Integer.parseInt(str);
            IO.println("You entered " + result + ".");
            char thirdDigit = str.charAt(2);
            IO.println("The third character is " + thirdDigit + ".");
            return Optional.of(result);
        } catch (NumberFormatException ex) {
            IO.println("ERROR 1: You did not enter an integer.");
        } catch (IndexOutOfBoundsException ex) {
            IO.println("ERROR 2: Your integer had fewer than three characters.");
        }
        return Optional.empty();
    }
}
