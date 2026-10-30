package pij.day09.recordSafe1;

import java.util.List;

public record Example(int foo, String bar, List<Integer> baz) {
    public Example(int foo, String bar, List<Integer> baz) {
        baz = List.copyOf(baz);
        this.foo = foo;
        this.bar = bar;
        this.baz = baz;
    }
}

