void main() {
    // First tell the user what they are supposed to do and read their input
    IO.println("Please enter some text!");
    String input = IO.readln();

    IO.println("*** Your input, one character per line ***");
    // Now we can print the input, one character at a time
    for (int i = 0; i < input.length(); i++) {
        IO.println(input.charAt(i));
    }

    IO.println("*** Your input, one word per line ***");
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (ch == ' ') {
            IO.println(); // just go to a new line
        } else {
            IO.print(ch);
        }
    }
    IO.println(); // after the last word, go to a new line
}
