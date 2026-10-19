void main() {
    int[] numbers = { 21, 22, 23, 24 };
    for (int e : numbers) {
        e *= 2;
    }
    IO.println("The last element now is: " + numbers[-1]);

    // This program compiles without problems. However, it has two errors:
    //
    // (1) There is a logic error in line 4. The variable e contains
    //     a /copy/ of a value stored in numbers and modifies this
    //     copy. The original array is not affected. The change to e
    //     has no effect outside the loop. The "now" in the message
    //     to the user in line 6 suggests that some kind of change
    //     was intended. To fix this error, we could change to a
    //     classic for loop with a loop variable i and write
    //       numbers[i] *= 2;
    //     in the loop body.
    //
    // (2) In line 6, the array access numbers[-1] causes an
    //     ArrayIndexOutOfBoundsException, a runtime error. The reason
    //     is that an array numbers has only positions that are at least
    //     0 and at most numbers.length - 1. To fix this error, we could
    //     replace numbers[-1] by the presumably intended
    //     numbers[numbers.length - 1].
}
