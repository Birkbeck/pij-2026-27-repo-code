package pij.day09.record;

import java.util.ArrayList;
import java.util.List;

public class ExampleDriver {
    static void main() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        Example e = new Example(42, "Hello", numbers);
        IO.println(e); // prints: Example[foo=42, bar=Hello, baz=[10, 11]]
    }
}
