void main() {
    IO.println("Please enter two non-negative integers to multiply!");
    int x = Integer.parseInt(IO.readln());
    int y = Integer.parseInt(IO.readln());

    // We may assume that x and y are at least 0.

    // The loop does the multiplication of non-negative numbers
    // by repeated addition.
    int product = 0;
    while (x > 0) {
        product = product + y;
        x = x - 1;
    }

    // Now tell the user!
    IO.println("The product is: " + product);
}
