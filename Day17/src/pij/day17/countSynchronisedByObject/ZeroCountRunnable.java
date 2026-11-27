package pij.day17.countSynchronisedByObject;

public class ZeroCountRunnable implements Runnable {
    private final ZeroCount counter;
    private final String outputPrefix;

    public ZeroCountRunnable(ZeroCount counter, String prefix) {
        this.counter = counter;
        this.outputPrefix = prefix;
    }

    @Override
    public void run() {
        ZeroCountHelper.countMany(this.counter, this.outputPrefix);
    }

    public void countOne(String prefix) {
        int count = this.counter.getCount();
        if (count != 0) { // report only "unexpected" values
            IO.println(prefix + " thread says: " + count);
        }
    }

    public void countMany(String prefix) {
        final int LIMIT = 1000; // increase value if needed
        for (int i = 0; i < LIMIT; i++) {
            countOne(prefix);
        }
    }
}
