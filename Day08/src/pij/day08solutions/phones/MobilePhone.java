package pij.day08solutions.phones;

import java.util.Arrays;
import java.util.Objects;

public class MobilePhone extends OldPhone {

    private String[] lastCalledNumbers;
    private int firstInvalidNumber; // initially 0

    private static final int NUMBER_MEMORY_SIZE = 10;

    public MobilePhone(String brand) {
        super(brand);
        lastCalledNumbers = new String[NUMBER_MEMORY_SIZE];
    }

    @Override
    public void call(String number) {
        super.call(number);
        // shift all old entries by old (more efficient solution
        // via modulo possible)
        for (int i = lastCalledNumbers.length - 1; i > 0; i--) {
            // possible optimisation: check for null
            lastCalledNumbers[i] = lastCalledNumbers[i-1];
        }
        lastCalledNumbers[0] = number;
        if (firstInvalidNumber < lastCalledNumbers.length) {
            firstInvalidNumber++;
        }
    }

    public void ringAlarm(String message) {
        IO.println("Alarm with: " + message);
    }
    public void playGame(String game) {
        IO.println("Playing " + game + "...");
    }

    /**
     * Prints the last 10 phone numbers that were called on the screen.
     */
    public void printLastNumbers() {
        // The next line would print also the null entries at the end.
        //IO.println(java.util.Arrays.toString(lastCalledNumbers));

        // The next line would lead to printing the null entries at the end.
        //for (int i = 0; i < lastCalledNumbers.length; i++) {
        for (int i = 0; i < firstInvalidNumber; i++) {
            IO.println(lastCalledNumbers[i]);
        }
    }

    // Exercise 4.1
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!super.equals(o)) { // deals with null, different classes, and brand
            return false;
        }
        MobilePhone that = (MobilePhone) o;
        // Objects.deepEquals looks at array contents; we could also use a
        // for loop
        return this.firstInvalidNumber == that.firstInvalidNumber &&
                Objects.deepEquals(this.lastCalledNumbers, that.lastCalledNumbers);
    }

    // Exercise 5.4
    @Override
    public int hashCode() {
        // Objects.hash computes a hash code based on given int parameters
        // via a fixed recipe (saves some implementation work)
        return Objects.hash(super.hashCode(),
                Arrays.hashCode(this.lastCalledNumbers),
                this.firstInvalidNumber);
    }
}
