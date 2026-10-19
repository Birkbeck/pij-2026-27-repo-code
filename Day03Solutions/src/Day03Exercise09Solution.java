boolean isPrime(int input) {
    if (input < 2) { // the smallest prime number is 2
        return false;
    }
    // idea: if input is not divisible by any of the integers
    // from 2 to input - 1, then it must be prime; try them all!
    for (int i = 2; i < input; i++) {
        if (input % i == 0) { // i is a divisor of input, so input is not prime
            return false;
        }
    }
    // there is no divisor for input between 2 and input - 1
    // (both inclusive), so input is indeed prime
    return true;

    // The method can be optimised further with "domain knowledge" from
    // mathematics: it suffices to check numbers up to Math.sqrt(input) + 1
    // for being divisors of input -- the /smallest/ divisor of a number
    // among the values that we are checking is at most the square root,
    // so if we cannot find any of those, we can be sure that input is
    // really not prime. For the purpose of the exercise, the provided
    // implementation is sufficient, though.
}

void main() {
    IO.println("Please enter a positive integer to check (0 or a negative number to quit)!");
    int input;
    do {
        input = Integer.parseInt(IO.readln());
        boolean inputIsPrime = isPrime(input);
        IO.println("Your number is " + (inputIsPrime ? "" : "not ") + "prime!");
    } while (input >= 1);

    // Use a do ... while loop: we want to run the loop at least once.
}
