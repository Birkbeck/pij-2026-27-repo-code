package pij.day10.exceptionThrower;

/**
 * Some practice with Exceptions. Enter a String that cannot be parsed to
 * an int and see what happens!
 */
public class ExceptionThrower {
    static void main() {
        ExceptionThrower et = new ExceptionThrower();
        et.launch();
    }
    private void launch() {
        int n = getNumber();
        String isOdd = (n % 2 == 0) ? "even" : "odd";
        IO.println("You entered " + n + ", it is " + isOdd + ".");
    }

    /**
     * Gets a number as introduced by the user on the console.
     *
     * @return the number introduced by the user
     *
     * @throws NumberFormatException if the user types a non-number
     */
    private int getNumber() {
        String str = IO.readln("Write a number: ");
        int result = Integer.parseInt(str);
        return result;
    }
}
