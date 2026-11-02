package pij.day08solutions.pairExercise2;

/** Exercise 2. Runner for class Pair, exercising all constructors and methods. */
public class PairRunner {
    static void main() {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 1);
        IO.println("pair1.x: " + pair1.getX());
        IO.println("pair1.y: " + pair1.getY());

        Pair<String, Integer> pair2 = new Pair<>(pair1);
        IO.println("pair2.x: " + pair2.getX());
        IO.println("pair2.y: " + pair2.getY());

        Pair<Integer, String> swappedPair = pair2.swap();
        IO.println("swappedPair.x: " + swappedPair.getX());
        IO.println("swappedPair.y: " + swappedPair.getY());
    }
}
