void main() {
    int x = 8;
    int y = 0;
    if (y != 0 && x / y > 10) {
        IO.println("1: Divided by zero!");
    } else {
        IO.println("1: Crisis averted!"); // this line is run
    }
    if (x / y > 10 && y != 0) { // this does not end well...
        IO.println("2: Divided by zero!");
    } else {
        IO.println("2: Crisis averted!");
    }
    IO.println("After the if ... else ...");
}
