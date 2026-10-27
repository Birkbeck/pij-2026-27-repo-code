package pij.day07solutions.ark;

public interface FlyingAnimal extends Animal {
    default void call() {
        IO.println(getName() + " now flying, will come later when tired...");
    }
}
