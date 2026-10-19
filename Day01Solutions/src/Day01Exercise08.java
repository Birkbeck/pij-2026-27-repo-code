void main() {
    IO.println("Please enter two positive integers to divide!");
    int x = Integer.parseInt(IO.readln());
    int y = Integer.parseInt(IO.readln());
    int xOrig = x; // the initial value of x will be needed
                   // at the end for output to the user

    // Division can be expressed as repeated subtraction:
    //   x / y = 1 + ((x-y) / y)
    // If x is smaller than y, we are done.
    int result = 0;
    while (x >= y) {
        result = result + 1;
        x = x - y;
    }
    int remainder = x;
    IO.println(xOrig + " divided by " + y + " gives " + result
            + ", remainder " + remainder);
}
