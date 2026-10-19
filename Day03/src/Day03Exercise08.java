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
