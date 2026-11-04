package pij.day09solutions.naming;

/**
 * Exercise 1
 *
 * In this file, several of the names of classes, methods, variables,
 * constants, ... do not follow Java naming conventions for their roles.
 * Your task is to keep the intended names "as is", but to rename them
 * such that they follow Java naming conventions. Recall that depending
 * on the role of the identifier name, exactly one of "anExample",
 * "AnExample", or "AN_EXAMPLE" may be the appropriate way of writing
 * "an example" in Java.
 */
public class WeirdName {
    public static final int CLASSIC_EXAMPLE = 42;

    private final int justAField;
    private int runningCount;

    public WeirdName(int someStuff) {
        justAField = someStuff;
    }

    public void doSomething(int strangeName, int anotherValue) {
        int sum = strangeName + anotherValue + CLASSIC_EXAMPLE + runningCount;
        IO.println(sum);
    }

    public static void doMore(String anotherName) {
        IO.println("Your string is: " + anotherName);
    }

    public void doEvenMore() {
        WeirdName weirdName = new WeirdName(1);
        weirdName.doALot();
        pij.day09solutions.naming.WeirdName.doMore("Birkbeck");
    }

    public void doALot() {
        runningCount++;
        IO.println("Increased count to " + runningCount);
    }
}
