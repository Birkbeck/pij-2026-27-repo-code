package pij.day08solutions.pairExercise8;

/** Exercise 8. */
public class PairRunner {
    static void main() {
        Pair<String, Integer> p1 = new Pair<>("Hello", 42);

        // now possible! String is a subclass of Object
        Pair<Object, Integer> p2 = new Pair<>(p1);
    }
}
