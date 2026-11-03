package pij.day10.exceptionThrower;

/**
 * Some practice with Exceptions. Enter a String that cannot be parsed to
 * an int or has length less than 3 and see what happens!
 */
public class ExceptionThrower3 {
    static void main() {
        ExceptionThrower3 et = new ExceptionThrower3();
        et.launch();
    }
    private void launch() {
        int n = getNumber();
        String isOdd = (n % 2 == 0) ? "even" : "odd";
        IO.println("You entered " + n + ", it is " + isOdd + ".");
    }
    private int getNumber() {
        int result = -1;
        try {
            String str = IO.readln("Enter a number with at least 3 characters: ");
            result = Integer.parseInt(str);
            IO.println("You entered " + result + ".");
            char thirdDigit = str.charAt(2);
            IO.println("The third character is " + thirdDigit + ".");
        } catch (NumberFormatException ex) {
            IO.println("ERROR 1: You did not enter an integer.");
        } catch (IndexOutOfBoundsException ex) {
            IO.println("ERROR 2: Your integer had fewer than three characters.");
        }
        return result;
    }
}
