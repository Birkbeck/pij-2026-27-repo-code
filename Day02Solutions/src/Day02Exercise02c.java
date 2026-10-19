void main() {
    String input = IO.readln("Please read a line: ");
    int x = 0;
    if (! input.equals("Java")) {
        x = 1;
    }
    IO.println("Result of division: " + 100 / x);

    // This program has a runtime error when the user types in the String
    // "Java". Then the condition of the if statement becomes false, and
    // the variable x stays set to 0. This leads to a division by zero in
    // line 7 of the code. For type int, dividing by 0 causes an
    // ArithmeticException: there is no reasonably possible result of type int.
}
