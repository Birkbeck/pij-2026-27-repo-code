void main() {
    int input = Integer.parseInt(IO.readln("Please enter a positive integer: "));

    // idea: if input is not divisible by any of the integers
    // from 2 to input - 1, then it must be prime; try them all!
    boolean primeRefuted = false;
    int i = 2;
    while (i < input) { // optimisation:    && !primeRefuted
        if (input % i == 0) { // i is a witness that input is not prime
            primeRefuted = true;
        }
        i = i + 1;
    }
    if (primeRefuted) {
        IO.println("Your number is not prime!");
    } else {
        IO.println("Your number is prime!");
    }
}
