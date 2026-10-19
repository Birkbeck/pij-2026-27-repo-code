void main() {
    IO.println("Please enter zero or more positive integers, -1 finishes.");
    int input = 0; // initially not -1
    int previous = -1;
    boolean consecutiveAndIncreasing = true; // no counterexample yet
    while (input != -1) {
        input = Integer.parseInt(IO.readln());
        if (previous != -1 // the first value is always okay
                && input != -1 // input is not the end-of-loop signal
                && input != previous + 1) { // not a consecutive increase
            consecutiveAndIncreasing = false; // counterexample found!
        }
        previous = input;
    }
    if (consecutiveAndIncreasing) {
        IO.println("Yes");
    } else {
        IO.println("No");
    }
}
