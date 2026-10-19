void main() {
    int numberToGuess = (int) Math.round(1000 * Math.random());
    IO.println("Try to guess my number!");
    int numberOfGuesses = 0;
    boolean correct = false; // initially no guess yet, so no correct guess
    while (! correct) {
        int guessedNumber = Integer.parseInt(IO.readln("Tell me a number: "));
        numberOfGuesses = numberOfGuesses + 1;
        if (guessedNumber < numberToGuess) {
            IO.println("No! My number is higher.");
        } else if (guessedNumber > numberToGuess) {
            IO.println("No! My number is lower.");
        } else {
            correct = true;
            IO.println("CORRECT!");
        }
    }
    IO.println("You needed " + numberOfGuesses + " guesses.");
}
