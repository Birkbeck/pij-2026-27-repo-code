void main() {
    String originalInput = IO.readln("Please enter some text: ");

    // generate input for the strict palindrome check from the
    // original input for the relaxed palindrome check, so
    // "Rise to vote, sir" becomes "risetovotesir".
    String input = "";
    for (int i = 0; i < originalInput.length(); i++) {
        char ch = originalInput.charAt(i);
        if (Character.isLetter(ch)) {
            input = input + Character.toLowerCase(ch);
        }
    }

    // Now we can reuse the code for the strict palindromes (with copy & paste
    // as a simple way of reuse; we will see better ways with methods soon).

    // as long as we have no evidence to the contrary, assume that
    // the input is in fact a palindrome
    boolean isPalindrome = true;

    // idea for the check:
    // - "ABBA" is a palindrom because the first letter (at index 0) and
    // the last letter (at index 3 == length() - 1) are the same and
    // the second letter (at index 1) and the second-to-last letter
    // (at index 2 == length() - 2) are the same. We can stop incrementing
    // the index when we reach the middle of the word.
    // - words of odd length like "mum" have a "middle letter", but it
    // cannot affect the palindrome property

    // the loop would also work correctly as
    //   for (int i = 0; i < input.length() / 2; i++) {
    //   for (int i = 0; i < input.length(); i++) {
    // the version here avoids extra checks that do not change the result
    for (int i = 0; isPalindrome && i < input.length() / 2; i++) {
        if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
            isPalindrome = false;
        }
    }

    // the output message is adapted to relaxed palindromes
    IO.println("Your input \"" + originalInput + "\" is " +
            (isPalindrome ? "" : "not ") + "a relaxed palindrome!");
}
