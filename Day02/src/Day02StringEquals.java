void main() {
    String str1 = IO.readln("Enter a string: ");
    String str2 = IO.readln("Enter another string: ");
    IO.println("Are ’" + str1 + "’ and ’" + str2 + "’ the same?");
    IO.println("Using ==: " + (str1 == str2));
    IO.println("Using .equals(): " + (str1.equals(str2)));
}
