package pij.day17.countSynchronisedByMethod;

public class ZeroCountRunnable implements Runnable {
    private final ZeroCount counter;
    private final String outputPrefix;

    public ZeroCountRunnable(ZeroCount counter, String prefix) {
        this.counter = counter;
        this.outputPrefix = prefix;
    }

    @Override
    public void run() {
        countMany();
    }

    public void countMany() {
        final int LIMIT = 1000; // increase value if needed
        for (int i = 0; i < LIMIT; i++) {
            countOne();
        }
    }

    public void countOne() {
        int count = this.counter.getCount();
        if (count != 0) { // report only "unexpected" values
            IO.println(this.outputPrefix + " thread says: " + count);
        }
    }
}
