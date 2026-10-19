void main() {
    IO.println("Please enter zero or more positive integers, -1 finishes.");
    int input = 0; // initially not -1
    int maxi = -1;
    while (input != -1) {
        input = Integer.parseInt(IO.readln());
        if (input > maxi) { // -1 is never greater than maxi
            maxi = input;
        }
    }
    IO.println("Your highest number was " + maxi);
}
