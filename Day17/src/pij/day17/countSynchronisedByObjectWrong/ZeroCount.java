package pij.day17.countSynchronisedByObjectWrong;

/**
 * Artificial example of a very much non-thread-safe implementation of
 * a method that would always return 0 if its execution were atomic.
 *
 * Repair attempted by a lock object, but this does not address the issue:
 * the lock object is created locally in the method and is not shared
 * between different threads!
 */
public class ZeroCount {
    private int count;

    private void increment() {
        this.count++;
    }
    private void decrement() {
        this.count--;
    }

    /**
     * Returns the current value of the internal counter after first
     * incrementing it and then decrementing it in a non-atomic way.
     * <p>
     * Not thread-safe!
     *
     * @return the current value of the internal counter
     */
    public int getCount() {
        // each call to getCount() makes a fresh Object and puts
        // a reference to it into obj; not helpful as a lock
        Object obj = new Object();
        synchronized (obj) {
            increment();
            decrement();
            return this.count;
        }
    }
}
