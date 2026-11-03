package pij.day09.intRememberereExtended;

import java.util.HashSet;
import java.util.Set;

/**
 * An implementation of the Rememberer interface that remembers prime int values that are passed to it.
 */
public class PrimeIntRememberer implements Rememberer {

    private final Set<Integer> knownPrimes;


    /**
     * Constructs a PrimeIntRememberer that knows no prime int values yet.
     */
    public PrimeIntRememberer() {
        knownPrimes = new HashSet<>();
    }

    /**
     * Adds the provided prime int to the set of known prime ints.
     *
     * @param number the prime int to be added
     */
    @Override
    public void makeKnown(int number) {
        if (isPrime(number)) {
            // Store the prime number in a data structure (e.g., a Set)
            // For simplicity, we can use a HashSet to store known prime numbers
            knownPrimes.add(number);
        }
    }

    /**
     * Returns whether this PrimeIntRememberer knows the provided prime int.
     *
     * @param number the int to be checked
     * @return whether this PrimeIntRememberer knows the provided prime int
     */
    @Override
    public boolean knows(int number) {
        // Check if the number is prime and if it is known
        return knownPrimes.contains(number);
    }

    /**
     * Returns the number of prime int values that this PrimeIntRememberer knows.
     *
     * @return the number of prime int values that this PrimeIntRememberer knows
     */
    @Override
    public int size() {
        return knownPrimes.size();
    }

    @Override
    public String toString() {
        return knownPrimes.toString();
    }

    /**
     * Checks if a number is prime.
     *
     * @param number the int to be checked
     * @return true if the number is prime, false otherwise
     */
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
