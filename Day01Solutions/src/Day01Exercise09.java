void main() {
    IO.println("Please enter three integers!");
    int x = Integer.parseInt(IO.readln());
    int y = Integer.parseInt(IO.readln());
    int z = Integer.parseInt(IO.readln());

    // Specifically for this exercise, there are many different correct
    // solutions (there are many different ways to sort numbers!).
    // Do not worry if your code looks different!

    // the three results with initial values that may need changing
    int biggest = x;
    int middle = x;
    int smallest = x;

    // check all remaining candidates for biggest...
    if (y > biggest) {
        biggest = y;
    }
    if (z > biggest) {
        biggest = z;
    }

    // check all remaining candidates for smallest...
    if (y < smallest) {
        smallest = y;
    }
    if (z < smallest) {
        smallest = z;
    }

    // middle is a bit trickier because two or three of the numbers may be the same
    if ((x >= y && y >= z) || (z >= y && y >= x)) { // is y in the middle?
        middle = y;
    } else if ((x >= z && z >= y) || (y >= z && z >= x)) { // is z in the middle?
        middle = z;
    }
    // else, x as middle was correct after all

    IO.println("Your numbers from smaller to bigger: " + smallest
                + ", " + middle + ", " + biggest);
}
