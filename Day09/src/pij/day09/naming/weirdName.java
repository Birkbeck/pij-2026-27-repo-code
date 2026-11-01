package pij.day09.naming;

/**
 * In this file, several of the names of classes, methods, variables,
 * constants, ... do not follow Java naming conventions for their roles.
 * Your task is to keep the intended names "as is", but to rename them
 * such that they follow Java naming conventions. Recall that depending
 * on the role of the identifier name, exactly one of "anExample",
 * "AnExample", or "AN_EXAMPLE" may be the appropriate way of writing
 * "an example" in Java.
 */
public class weirdName {
    public static final int classicExample = 42;

    private final int JUST_A_FIELD;
    private int running_count;

    public weirdName(int someStuff) {
        JUST_A_FIELD = someStuff;
    }

    public void do_something(int STRANGE_NAME, int AnotherValue) {
        int sum = STRANGE_NAME + AnotherValue + classicExample + running_count;
        IO.println(sum);
    }

    public static void DoMore(String anotherName) {
        IO.println("Your string is: " + anotherName);
    }

    public void DO_EVEN_MORE() {
        weirdName WeirdName = new weirdName(1);
        WeirdName.doALot();
        weirdName.DoMore("Birkbeck");
    }

    public void doALot() {
        running_count++;
        IO.println("Increased count to " + running_count);
    }
}
