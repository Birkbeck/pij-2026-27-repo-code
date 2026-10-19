void main() {
    // Write a program that reads a short string and then some longer text.
    // The program must say how many times you can find the short string
    // in the text. You cannot use any method of String apart from charAt()
    // and length().
    IO.println("Please enter a short string!");
    String shortString = IO.readln();
    IO.println("Please enter some longer text!");
    String longerText = IO.readln();
    int numberOfOccurrences = 0;

    // strategy: from each of the possible starting points of shortString
    // in longerText, compare the characters of shortString with those
    // in longerText from the starting point
    // example:
    // for longerText = "ababa" (length 5) and shortString = "aba" (length 3),
    // check from starting points 0, 1, and 2 (leads to finding 2 occurrences)

    // loop condition ensures that we do not "overshoot"
    for (int startingPoint = 0; startingPoint + shortString.length() <= longerText.length(); startingPoint++) {
        // now let's compare the chars one by one and see if one pair
        // of them is _not_ equal

        // OPTION 1
        boolean charsSoFarAreEqual = true;

        // the loop would work as intended also without the part of the
        // condition before the "&&" (why?)
        for (int shortStringIndex = 0; charsSoFarAreEqual && shortStringIndex < shortString.length(); shortStringIndex++) {
            if (shortString.charAt(shortStringIndex) != longerText.charAt(startingPoint + shortStringIndex)) {
                charsSoFarAreEqual = false;
            }
        }
        if (charsSoFarAreEqual) { // all chars must have been equal!
            numberOfOccurrences++;
        }


        // OPTION 2 (less writing effort, but uses method equals in class String)
        /*
        String longerStringPrefix = longerText.substring(startingPoint, startingPoint + shortString.length());
        if (shortString.equals(longerStringPrefix)) {
            numberOfOccurrences++;
        }
        */
    }
    IO.println("We found " + numberOfOccurrences +
            " occurrences of \"" + shortString + "\" in your text!");
}
