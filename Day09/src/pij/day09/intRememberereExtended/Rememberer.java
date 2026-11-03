package pij.day09.intRememberereExtended;

/**
 * An interface for classes that remember int values.
 */
public interface Rememberer  {

    /**
     * Make the given int known to this intRememberer.IntRememberer.
     *
     * @param number the int to remember
     */
    void makeKnown(int number);

    /**
     * Returns whether this intRememberer.IntRememberer knows the provided int.
     *
     * @param number the int to be checked
     * @return whether this intRememberer.IntRememberer knows the provided int
     */
    boolean knows(int number);

    /**
     * Returns the number of int values that this intRememberer.IntRememberer knows.
     *
     * @return the number of int values that this intRememberer.IntRememberer knows
     */
    int size();

}
