package pij.day07solutions.guitar;

/**
 * A Guitar is both a MusicalInstrument and a WoodenObject (Ex 7).
 * Here represented by implementing two corresponding interfaces.
 *
 * Alternatively, we could make at most one of MusicalInstrument
 * or WoodenObject a class (but not both, as multiple inheritance
 * of classes is not supported in Java).
 *
 * Finally, we could consider delegation to a field of type
 * MusicalInstrument or WoodenObject.
 */
public class Guitar implements MusicalInstrument, WoodenObject {
    @Override
    public void play() {
        IO.println("Playing the guitar!");
    }

    @Override
    public void burn() {
        IO.println("Burning the guitar!");
    }
}
