package pij.day08.animals;

import pij.day08.box.Box;

/** Driver class for Exercise 1. */
public class AnimalDriver {
    static void main() {
        Box<Cat> catBox = new Box<>(new Cat()); // Box<Cat>, not Box<Animal>
        //Animal animal = AnimalUtils.doSomething(catBox);
    }
}
