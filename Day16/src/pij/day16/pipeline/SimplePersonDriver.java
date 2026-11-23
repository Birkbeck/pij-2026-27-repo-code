package pij.day16.pipeline;

import java.util.List;

public class SimplePersonDriver {
    static void main() {
        List<Person> persons = List.of(
                new SimplePerson("Alice", 20),
                new SimplePerson("Bob", 15),
                new SimplePerson("Carol", 42));
        long count = PersonUtils.getAdultCount(persons);
        List<String> adults = PersonUtils.getAdultNames(persons);
        IO.println("There are " + count + " adults: " + adults);
        IO.println("Printing them one per line:");
        PersonUtils.printAdultNames(persons);
    }
}
