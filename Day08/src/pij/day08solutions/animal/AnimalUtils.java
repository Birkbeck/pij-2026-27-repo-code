package pij.day08solutions.animal;

import pij.day08solutions.box.Box;

/**
 * Provides a helper method for working with Box&lt;Animal&gt; objects.
 */
public class AnimalUtils {

    /**
     * Puts a new Dog into {@code animalBox} as a side effect and returns
     * {@code animalBox}.
     *
     * @param animalBox a new Dog will be put here
     * @return the original reference {@code animalBox}
     */
    public static Animal doSomething(Box<Animal> animalBox) {
        // Ex 1.2: the compiler accepts the following line because an Animal
        // reference is provided where an Animal reference is expected
        animalBox.setData(new Animal());

        // Ex 1.2: the compiler accepts the following line because a Dog
        // reference is provided where an Animal reference is expected, and
        // Dog is a subtype of Animal (-> Liskov's substitution principle)
        animalBox.setData(new Dog());
        return animalBox.getData();
    }
}
