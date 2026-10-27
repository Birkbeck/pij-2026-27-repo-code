package pij.day07solutions.ark.implementations;

import pij.day07solutions.ark.AbstractAnimal;
import pij.day07solutions.ark.AquaticAnimal;
import pij.day07solutions.ark.EggLayer;

public class Crocodile extends AbstractAnimal implements AquaticAnimal, EggLayer {

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        IO.println("Making crocodile sounds!");
    }
}
