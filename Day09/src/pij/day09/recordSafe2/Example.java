package pij.day09.recordSafe2;

import java.util.List;

public record Example(int foo, String bar, List<Integer> baz) {
    public Example {
        baz = List.copyOf(baz);
    }
}

