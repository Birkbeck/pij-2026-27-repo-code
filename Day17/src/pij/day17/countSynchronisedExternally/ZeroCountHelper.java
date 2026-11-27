package pij.day17.countSynchronisedExternally;

public class ZeroCountHelper {

    /**
     * Uses zc in a thread-safe way by wrapping call to get
     *
     * @param zc object with non-thread-safe method to be used
     * @param prefix for output on the screen
     */
    public static void countOne(ZeroCount zc, String prefix) {
        int count;
        synchronized (zc) { // lock object must be *shared* between threads
            // now we can be sure that no other thread can call getCount()
            count = zc.getCount();
        }
        if (count != 0) { // report only "unexpected" values
            IO.println(prefix + " thread says: " + count);
        }
    }

    public static void countMany(ZeroCount zc, String prefix) {
        final int LIMIT = 1000; // increase value if needed
        for (int i = 0; i < LIMIT; i++) {
            countOne(zc, prefix);
        }
    }
}
