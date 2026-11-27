package pij.day17.countSynchronisedByObject;

/**
 * Artificial example of an originally very much non-thread-safe implementation
 * of a method that would always return 0 if its execution were atomic.
 *
 * Repaired by using an explicit field as a lock.
 */
public class ZeroCount {
    private int count;
    private Object obj = new Object();

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
     * Thread-safe thanks to synchronisation over a lock object.
     *
     * @return the current value of the internal counter
     */
    public int getCount() {
        synchronized (obj) {
            increment();
            decrement();
            return this.count;
        }
    }
}
