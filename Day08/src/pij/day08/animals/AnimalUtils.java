package pij.day08.animals;

import pij.day08.box.Box;

/**
 * Provides a helper method for working with Box&lt;Animal&gt; objects.
 */
public class AnimalUtils {

    /**
     * Returns the Animal reference in {@code animalBox}.
     *
     * @param animalBox the object from which to retrieve the Animal
     *                  reference
     * @return the Animal reference in {@code animalBox}
     */
    public static Animal doSomething(Box<Animal> animalBox) {
        return animalBox.getData();
    }
}
