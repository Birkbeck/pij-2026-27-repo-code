package pij.day10.exceptionThrower;

/**
 * Some practice with Exceptions. Enter a String that cannot be parsed to
 * an int and see what happens!
 */
public class ExceptionThrower2 {
    static void main() {
        ExceptionThrower2 et = new ExceptionThrower2();
        et.launch();
    }
    private void launch() {
        int n = getNumber();
        String isOdd = (n % 2 == 0) ? "even" : "odd";
        IO.println("You entered " + n + ", it is " + isOdd + ".");
    }
    private int getNumber() {
        int result = -1; // default, so we have /some/ value to return in all cases
        try {
            String str = IO.readln("Write a number: ");
            result = Integer.parseInt(str);
            IO.println("You entered " + result + ".");
        } catch (NumberFormatException ex) {
            IO.println("What you entered is not an integer number!");
        }
        return result;
    }
}
