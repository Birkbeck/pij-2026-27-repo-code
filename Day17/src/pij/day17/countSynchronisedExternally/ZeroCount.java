package pij.day17.countSynchronisedExternally;

/**
 * Artificial example of a very much non-thread-safe implementation of
 * a method that would always return 0 if its execution were atomic.
 * Synchronisation must be taken care of externally!
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
     * Not thread-safe on its own!
     *
     * @return the current value of the internal counter
     */
    public int getCount() {
        increment();
        decrement();
        return this.count;
    }
}
