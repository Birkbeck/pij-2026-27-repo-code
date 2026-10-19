void main() {
    int[] numbers = { 2, 5, 1 };
    int runningTotal = 0;
    int i = 0;
    while (i < numbers.length) {
        runningTotal += numbers[i];
        i++;
    }
    IO.println("The sum is: " + runningTotal);
}
