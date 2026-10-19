void main() {
    int[] numbers = { 2, 5, 1 };
    int runningTotal = 0;
    for (int i = 0; i < numbers.length; i++) {
        runningTotal += numbers[i];
    }
    IO.println("The sum is: " + runningTotal);
}
