package pij.day07solutions.ark;

public interface AquaticAnimal extends Animal {
    default void call() {
        IO.println(getName() + " will not come...");
    }
}
