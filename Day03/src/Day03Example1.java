boolean containsOnlyLowerCaseLetters(String login) {
    for (int i = 0; i < login.length(); i++) {
        char c = login.charAt(i);
        if (!Character.isLetter(c) || !Character.isLowerCase(c)) {
            return false;
        }
    }
    return true;
}

// The program starts from here, as usual.
void main() {
    String input = IO.readln("Please enter a line: ");
    IO.print("Your input is ");
    if (! containsOnlyLowerCaseLetters(input)) {
        IO.print("NOT ");
    }
    IO.println("a valid login with only lower-case letters.");
}
