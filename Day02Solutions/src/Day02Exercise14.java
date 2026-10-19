void main() {
    // Write a program that reads a text from the user and then enter a
    // loop of requesting letters and counting them. The program stops
    // if the user asks for the same letter twice.
    String input = IO.readln("Please write a text: ");

    // Now we need to keep track of the letters that have already been
    // counted so that we can detect a letter that has been requested
    // more than once. We are going to use a variable for this. Of the
    // data types that we have seen so far, the type String is perhaps the
    // easiest to use: it can store multiple characters, and we can easily
    // add something at the end of a String to make a longer String.

    String lettersCountedSoFar = ""; // nothing counted yet
    boolean repeatedLetterToCount = false;

    while (! repeatedLetterToCount) {
        String letterInput = IO.readln("Which letter would you like to count now? ");
        if (letterInput.isEmpty()) {
            IO.println("Please enter at least one character (the first one will be used)!");
        } else {
            String letterToFindAsString = letterInput.substring(0, 1);
            if (lettersCountedSoFar.contains(letterToFindAsString)) {
                // alternatively to method "contains", use an inner loop,
                // similar to the one in the previous exercise
                repeatedLetterToCount = true;
            } else {
                char letterToFind = letterToFindAsString.charAt(0);
                int numberOfOccurrences = 0;
                for (int i = 0; i < input.length(); i++) {
                    if (letterToFind == input.charAt(i)) {
                        numberOfOccurrences = numberOfOccurrences + 1;
                    }
                }
                IO.println("There are " + numberOfOccurrences + " in your text.");
                lettersCountedSoFar = lettersCountedSoFar + letterToFindAsString;
            }
        }
    }
    IO.println("Repeated character. Exiting the program...\n" +
            "Thank you for your cooperation. Good bye!");
}
