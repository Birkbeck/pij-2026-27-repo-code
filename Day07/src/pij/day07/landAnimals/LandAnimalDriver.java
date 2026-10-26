package pij.day07.landAnimals;

/**
 * LandAnimalDriver class will test LandAnimal, Cat and Dog classes.
 */
public class LandAnimalDriver {
    
    void main() {
        Dog dog = new Dog();
        dog.breathe(80);
        IO.println(dog.makeSound()); // Woof

        Cat cat = new Cat();
        cat.breathe(70);
        IO.println(cat.makeSound()); // Meeouw

        LandAnimal animal1 = new Dog();
        animal1.breathe(85);
        IO.println(animal1.makeSound()); // Woof

        LandAnimal animal2 = new Cat();
        animal2.breathe(75);
        IO.println(animal2.makeSound()); // Meeouw
    }
}

