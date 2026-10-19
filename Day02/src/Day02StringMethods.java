void main() {
    String str;
    str = new String("This is an example");
    IO.println("Initial string: \"" + str + "\""); // Note the escaped quotes!
    int l = str.length();
    IO.println("The length of the string is " + l);
    char c = str.charAt(0);
    IO.println("The first character is " + c);
    String str2 = str.substring(8,18);
    IO.println("The substring from char 8 to char 17 is \"" + str2 + "\"");
}
