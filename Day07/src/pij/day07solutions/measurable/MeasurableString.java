package pij.day07solutions.measurable;

/**
 * Exercise 6.
 * A MeasurableString has the length of a String passed to its constructor
 * as its measure.
 */
public class MeasurableString implements Measurable {

    private final String data;

    public MeasurableString(String data) {
        this.data = data;
    }

    @Override
    public double getMeasure() {
        return data.length();
    }
}
