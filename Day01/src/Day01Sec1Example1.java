void main() {
    IO.println("Given a series of words, each on a separate line,");
    IO.println("this program finds the length of the longest word.");
    IO.println("Please enter several sentences, one per line.");
    IO.println("Finish with a blank line.");
    int maxi = 0;
    String word = ".";
    while (word.length() > 0) {
        word = IO.readln();
        if (word.length() > maxi) {
            maxi = word.length();
        }
    }
    if (maxi == 0) {
        IO.println("There were no words.");
    } else {
        IO.println("The longest sentence was " + maxi + " characters long.");
    }
}
