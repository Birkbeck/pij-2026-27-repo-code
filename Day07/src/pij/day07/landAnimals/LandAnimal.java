package pij.day07.landAnimals;

/**
 * LandAnimals can breathe air and make sound. This abstract class keeps track
 * of the amount of oxygen in this LandAnimal's state and provides an
 * implementation for a method to breathe air.
 */
public abstract class LandAnimal {
    /** The amount of oxygen currently available to this LandAnimal. */
    private int oxygen;

    /** The initial oxygen level of a LandAnimal. */
    public static final int INITIAL_OXYGEN_LEVEL = 50;

    /**
     * Creates a new LandAnimal with oxygen level INITIAL_OXYGEN_LEVEL.
     */
    public LandAnimal() {
        this.oxygen = INITIAL_OXYGEN_LEVEL;
    }

    /**
     * Assumes a (more or less) standard atmosphere where air consists
     * to about 20% of oxygen, inspired by Earth. May not work correctly
     * for breathing in other atmospheres.
     *
     * @param air the amount of air to breathe in
     */
    public void breathe(int air) {
        this.oxygen += air / 5;
    }

    /**
     * Provides a String representation of the sound this LandAnimal makes.
     *
     * @return a String representation of the sound this LandAnimal makes
     */
    public abstract String makeSound();

}
