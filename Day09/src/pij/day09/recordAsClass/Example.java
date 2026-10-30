package pij.day09.recordAsClass;

import java.util.List;
import java.util.Objects;

public final class Example {
    private final int foo;
    private final String bar;
    private final List<Integer> baz;

    public Example(int foo, String bar, List<Integer> baz) {
        this.foo = foo;
        this.bar = bar;
        this.baz = baz;
    }

    public int foo() {
        return foo;
    }

    public String bar() {
        return bar;
    }

    public List<Integer> baz() {
        return baz;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Example that = (Example) obj;
        return this.foo == that.foo &&
                Objects.equals(this.bar, that.bar) &&
                Objects.equals(this.baz, that.baz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foo, bar, baz);
    }

    @Override
    public String toString() {
        return "Example[" +
                "foo=" + foo + ", " +
                "bar=" + bar + ", " +
                "baz=" + baz + ']';
    }
}

