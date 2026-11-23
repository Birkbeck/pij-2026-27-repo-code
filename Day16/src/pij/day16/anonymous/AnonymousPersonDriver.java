package pij.day16.anonymous;

import pij.day16.pipeline.Person;

/** Runner class to show how to work with anonymous classes. */
public class AnonymousPersonDriver {
    static void main() {
        runAnonymousClasses();
    }

    public static void runAnonymousClasses() {
        Person person1 = new Person() {
            @Override
            public String getName() {
                return "Some Name";
            }

            @Override
            public int getAge() {
                return 42;
            }
        };
        int someNumber = 43; // effectively final local variable
        String someText = "J Doe"; // effectively final local variable
        Person person2 = new Person() {

            // initialise field with value from effectively final variable from outside
            private int age = someNumber;

            @Override
            public String getName() {
                // method can access effectively final variable from outside
                return someText;
            }

            @Override
            public int getAge() {
                return this.age;
            }
        };
        printPerson(person1);
        printPerson(person2);
    }

    public static void printPerson(Person p) {
        IO.println("Name: " + p.getName() + ", age: " + p.getAge());
    }
}
