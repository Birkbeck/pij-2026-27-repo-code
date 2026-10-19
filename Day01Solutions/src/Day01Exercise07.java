void main() {
    IO.println("Please enter two integers to multiply!");
    int x = Integer.parseInt(IO.readln());
    int y = Integer.parseInt(IO.readln());

    // x or y might be negative. Make the problem easier by multiplying
    // their non-negative absolute values and by getting the sign of the
    // result (is it positive or negative?) separately. Splitting a problem
    // into smaller problems is an important approach for problem-solving
    // (and programming).

    // (1) Get the absolute values.
    int xAbs, yAbs;
    if (x >= 0) {
        xAbs = x;
    } else {
        xAbs = -x;
    }
    if (y >= 0) {
        yAbs = y;
    } else {
        yAbs = -y;
    }

    // (2) The loop does the actual multiplication of non-negative numbers
    //     by repeated addition.
    int productAbs = 0;
    while (xAbs > 0) {
        productAbs = productAbs + yAbs;
        xAbs = xAbs - 1;
    }

    // (3) We have the product of the absolute values, now get the
    //     minus sign for the final result if needed.
    int product;
    if ((x < 0 && y < 0) || (x > 0 && y > 0)) {
        // The product of two negative number is positive;
        // the product of two positive numbers is also positive.
        product = productAbs;
    } else {
        // In all other cases, we need the minus sign
        // (-1 * 0 is 0, so this works for productAbs == 0, too)
        product = -productAbs;
    }

    // (4) Now tell the user!
    IO.println("The product is: " + product);
}
