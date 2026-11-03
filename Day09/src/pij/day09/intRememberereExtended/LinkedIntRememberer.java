package pij.day09.intRememberereExtended;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * An LinkedIntRememberer remembers int values that are passed to it and maintains the order in which they were added.
 * It maintains the order in which the values were added.
 */
public class LinkedIntRememberer implements Rememberer{
    private final Set<Integer> knownInts;

    /**
     * Constructs an intRememberer.IntRememberer that knows no int values yet.
     * */
    public LinkedIntRememberer() {
        // Use a LinkedHashSet to maintain insertion order of known integers. However, this is slower than Hashset.
        knownInts = new LinkedHashSet<>();
    }

    /**
     * Make the given int known to this intRememberer.IntRememberer.
     *
     * @param number the int to remember
     */
    @Override
    public void makeKnown(int number) {
        knownInts.add(number);
    }

    /**
     * Returns whether this intRememberer.IntRememberer knows the provided int.
     *
     * @param number the int to be checked
     * @return whether this intRememberer.IntRememberer knows the provided int
     */
    @Override
    public boolean knows(int number) {
        return knownInts.contains(number);
    }

    /**
     * Returns the number of int values that this intRememberer.IntRememberer knows.
     *
     * @return the number of int values that this intRememberer.IntRememberer knows
     */
    @Override
    public int size() {
        return knownInts.size();
    }

    @Override
    public String toString() {
        return knownInts.toString();
    }
}
