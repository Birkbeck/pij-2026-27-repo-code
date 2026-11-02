package pij.day08solutions.animal;

import pij.day08solutions.box.Box;

/** Exercise 9. */
public class AnimalUtilsWithWildcard {

    /**
     * Returns the Animal reference in {@code animalBox}.
     *
     * @param animalBox the object from which to retrieve the Animal
     *                  reference
     * @return the Animal reference in {@code animalBox}
     */
    public static Animal doSomething(Box<? extends Animal> animalBox) {
        // Ex 9: The method works as desired. It can now take also a Box<Dog>
        // or a Box<Cat> as parameter. However, now we cannot add the following
        // lines:
        //animalBox.setData(new Dog());
        //animalBox.setData(new Animal());
        // The reason is that animalBox may now also be a reference to a
        // Box<Cat>, which is not allowed to contain a reference to an object
        // that is not a Cat! (Hence the hint: Mind the cats!) So while we
        // have made the method more flexible in what it accepts, we lose some
        // flexibility as to what we are allowed to do with the reference.
        //
        // So: use wildcards for the generic type parameters of your methods
        // when you are able to (so that the method is as broadly applicable
        // as possible), but you may not always be able to do so because of
        // what the method needs to do.

        return animalBox.getData();
    }

}
