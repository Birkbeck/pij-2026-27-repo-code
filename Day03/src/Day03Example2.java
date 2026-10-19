void add1000(int number) {
    IO.println("  Starting method, parameter is " + number);
    number = number + 500;
    IO.println("  In the middle of method, parameter is " + number);
    number = number + 500;
    IO.println("  Ending method, parameter is " + number);
}

// program execution starts here
void main() {
    int myNumber = 0;
    IO.println("Starting program, my number is " + myNumber);
    add1000(myNumber);  // method call
    IO.println("After the method is used, my number is " + myNumber);
}
