package pij.day09.intRememberereExtended;

/**
 * Runner class for testing Rememberer implementations.
 */
public class IntRemembererRunner {

    static void main() {
        testRememberer("== Hashset IntRememberer Test ==", new IntRememberer());
        testRememberer("== LinkedHashset IntRememberer Test ==", new LinkedIntRememberer());
        // when examining the results we see that the toString method will print the values in the order they were added
        // for the LinkedIntRememberer, but not for the IntRememberer. This is because the LinkedIntRememberer uses a
        // LinkedHashSet to store known integers, which maintains insertion order, while the IntRememberer uses a HashSet,
        // which does not guarantee any specific order of elements.

        testRememberer("== PrimeIntRememberer Test ==", new PrimeIntRememberer());
        // Showing a different implementation of the Rememberer interface, which only remembers prime numbers.
    }

    /**
     * Checks if the given int is known to the provided Rememberer and prints the result.
     *
     * @param rememberer the Rememberer to check against
     * @param checkMe    the int to check for existence
     */
    public static void check(Rememberer rememberer, int checkMe) {
        boolean isKnown = rememberer.knows(checkMe);
        IO.println(checkMe + " is " + (isKnown ? "" : "NOT ") + "known!");
    }

    /**
     * Tests the provided Rememberer implementation by adding known integers and checking their existence.
     *
     * @param title      the title for the test
     * @param rememberer the Rememberer implementation to test
     */
    private static void testRememberer(String title, Rememberer rememberer) {
        IO.println(title);
        // Adding possible known integers to the Rememberer
        int[] possibleKnownInts = {2, 3, 8, 17};
        for (int number : possibleKnownInts) {
            rememberer.makeKnown(number);
        }

        // Checking if the possible known integers are recognized by the Rememberer
        for (int number : possibleKnownInts) {
            check(rememberer, number);
        }
        // Checking some integers that were not added to the Rememberer
        int[] unknownInts = {9, -10};
        for (int number : unknownInts) {
            check(rememberer, number);
        }

        // rememberer.getClass().getSimpleName() returns the simple name of the class of the rememberer object, which is
        // used to identify the implementation being tested.
        String simpleClassName = rememberer.getClass().getSimpleName();
        IO.println(simpleClassName +  " knows " + rememberer.size() + " values: " + rememberer);
        IO.println("===============================\n");
    }
}
