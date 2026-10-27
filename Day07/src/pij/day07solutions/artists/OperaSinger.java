package pij.day07solutions.artists;

/**
 * Exercise 11.2 (aka Part B).
 * An OperaSinger is a SimpleSinger who can sing an aria.
 */
public class OperaSinger extends SimpleSinger {

    /**
     * Creates an OperaSinger with a given name.
     *
     * @param name the OperaSinger's name
     */
    public OperaSinger(String name) {
        super(name);
    }

    @Override
    public void sing(String song) {
        // override to ensure the words "opera singer" in the output
        IO.println("The opera singer " + getName() + " is singing " + song);
    }

    /**
     * Prints whether an aria is in progress.
     *
     * @param aria true if an aria is in progress, false otherwise
     */
    public void ariaInProgress(boolean aria) {
        IO.println(getName() + " is " + ((aria) ? "singing an aria!"
                : "currently not singing an aria, sorry."));
    }
}
