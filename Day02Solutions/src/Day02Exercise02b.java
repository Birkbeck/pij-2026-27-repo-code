void main() {
    String input = IO.readln("Please enter a line: ");
    int x = 0;
    if (input != "Java") {
        x = 1;
    }
    IO.println("Result of division: " + 100 / x);

    // This program has a logic error in line 4. Here two Strings are
    // compared using the "!=" operator, which for Strings compares
    // memory addresses, but not String contents. The effect is that
    // the condition is always true, even if the user types in the
    // String "Java". A corrected version of the code is given on
    // the worksheet as part c).
}
