void main() {
    // The program requests and reads a line from the user.
    // It then prints a version of that String where the
    // 1st, 4th, 7th, ... character is replaced by a "_".
    String s = IO.readln("Please enter a line: ");
    int i = 0;
    while (i < s.length()) {
        if (i % 3 == 0) {
            IO.print("_");
        } else {
            String t = s.substring(i, i+1);
            IO.print(t);
        }
        i = i + 1;
    }
    IO.println();
}
