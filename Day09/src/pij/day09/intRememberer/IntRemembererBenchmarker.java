package pij.day09.intRememberer;

public class IntRemembererBenchmarker {
    static void main() {
        // Java lets us put '_' into number literals for readability
        final int SIZE = 10_000_000;
        IntRememberer rememberer = new IntRememberer();
        for (int i = 0; i < SIZE; i++) { // fill with SIZE different elements
            rememberer.makeKnown(12 * i);
        }
        final int FIND_ME = -1;
        long nanos1 = System.nanoTime();
        boolean isKnown = rememberer.knows(FIND_ME);
        long nanos2 = System.nanoTime();
        long microsDiff = (nanos2 - nanos1) / 1000;
        IO.println("Is " + FIND_ME + " one of the " + rememberer.size()
                + " known values?");
        IO.println("Check took " + microsDiff + " microseconds. Result: " + isKnown);
    }
}
