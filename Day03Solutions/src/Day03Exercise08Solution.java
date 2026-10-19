int compute(int input) {
    int result = 1;
    for (int i = 0;
         i < input;
         i++) { // slightly unusual layout of a for loop
        if (i % 2 == 1) {
            result++;
        } else {
            result += helper(i);
        }
    }
    return result;
}

int helper(int x) {
    int r = 2*x + 1;
    return r;
}

void main() {
    String input = IO.readln("Hello! Please enter an int value: ");
    int inputNumber = Integer.parseInt(input);
    int res = compute(inputNumber);
    IO.println("Result: " + res);
}

// a) For input 2, the code visits the following locations:
//    20, 21, 22, 23, 1, 2, 3, 4, 6, 9, 15, 16, 17, 9, 5, 4, 8, 7, 5, 4, 12, 23, 24.

// b) For input 3, the code visits the following locations:
//    20, 21, 22, 23, 1, 2, 3, 4, 6, 9, 15, 16, 17, 9, 5, 4, 8, 7, 5, 4, 6, 9, 15, 16, 17, 9, 5, 4, 12, 23, 24.
