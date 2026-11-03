package pij.day09.intRememberereExtended;

import java.util.HashSet;
import java.util.Set;

/**
 * An intRememberer.IntRememberer remembers int values that are passed to it.
 */
public class IntRememberer implements Rememberer{
    private final Set<Integer> knownInts;

    /**
     * Constructs an intRememberer.IntRememberer that knows no int values yet.
     */
    public IntRememberer() {
        knownInts = new HashSet<>();
    }

    /**
     * Make the given int known to this intRememberer.IntRememberer.
     *
     * @param number the int to remember
     */
    public void makeKnown(int number) {
        knownInts.add(number);
    }

    /**
     * Returns whether this intRememberer.IntRememberer knows the provided int.
     *
     * @param number the int to be checked
     * @return whether this intRememberer.IntRememberer knows the provided int
     */
    public boolean knows(int number) {
        return knownInts.contains(number);
    }

    /**
     * Returns the number of int values that this intRememberer.IntRememberer knows.
     *
     * @return the number of int values that this intRememberer.IntRememberer knows
     */
    public int size() {
        return knownInts.size();
    }

    @Override
    public String toString() {
        return knownInts.toString();
    }
}
