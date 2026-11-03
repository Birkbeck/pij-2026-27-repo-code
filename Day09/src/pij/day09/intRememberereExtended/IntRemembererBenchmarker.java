package pij.day09.intRememberereExtended;

/**
 * IntRemembererBenchmarker is a class that benchmarks the performance of the IntRememberer class by measuring the time
 * it takes to check if a specific integer is known after populating the IntRememberer with a large number of integers.
 */
public class IntRemembererBenchmarker {

    void main() {
        // Java lets us put '_' into number literals for readability
        final int SIZE = 10_000_000;
        final int FIND_ME = -1; // This number is not in the range of numbers added to the Rememberer, so it will not be found

        // Benchmarking IntRememberer which uses HashSet for storing known integers
        runBenchmarker(new IntRememberer(), SIZE, FIND_ME);

        // Benchmarking LinkedIntRememberer which uses LinkedHashSet for storing known integers
        runBenchmarker(new LinkedIntRememberer(), SIZE, FIND_ME);

        // When examining the results we see that the LinkedIntRememberer is slower than the IntRememberer. This is
        // because LinkedHashSet maintains the order of insertion, which adds overhead compared to HashSet. While
        // this overhead is not significant for small sizes, it becomes more pronounced as the size of the data structure
        // increases such as a SIZE = 10_000_000.

    }

    /**
     * Runs the benchmark for a given Rememberer implementation.
     *
     * @param rememberer the Rememberer implementation to benchmark
     * @param size       the number of integers to populate in the Rememberer
     * @param findMe     the integer to check for existence in the Rememberer
     */
    public static void runBenchmarker(Rememberer rememberer, int size, int findMe) {
        for (int i = 0; i < size; i++) {
            // fill with SIZE different elements
            rememberer.makeKnown(12 * i);
        }
        long nanos1 = System.nanoTime();
        boolean isKnown = rememberer.knows(findMe);
        long nanos2 = System.nanoTime();
        long microsDiff = (nanos2 - nanos1) / 1000;
        IO.println("Is " + findMe + " one of the " + rememberer.size() + " known values?");
        IO.println("Check took " + microsDiff + " microseconds. Result: " + isKnown);
    }
}
