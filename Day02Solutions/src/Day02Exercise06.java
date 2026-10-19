void main() {
    // Write a program that reads some text from the user and then says
    // how many letters ’e’ are there in that text.
    // Then modify the program so that it reads the text from the user
    // and then asks for a letter. The program should then say how many
    // times you can find the letter in the text.
    IO.println("Please enter some text!");
    String input = IO.readln();
    final boolean LET_USER_CHOOSE_LETTER = true; // set it to false for initial version
    char letterToFind = 'e';
    if (LET_USER_CHOOSE_LETTER) {
        IO.println("Please enter the letter to search for!");
        String letterInput = IO.readln();
        if (letterInput.isEmpty()) {
            IO.println("Without a letter as input, we will just use 'e'.");
        } else {
            letterToFind = letterInput.charAt(0);
        }
    }
    int numberOfOccurrences = 0;
    for (int i = 0; i < input.length(); i++) {
        if (letterToFind == input.charAt(i)) {
            numberOfOccurrences++;
        }
    }
    IO.println("We found " + numberOfOccurrences
                + " occurrences of '" + letterToFind + "' in your text!");
}
