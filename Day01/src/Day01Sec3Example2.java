void main() {
    String s = IO.readln("Please key in your exam marks: ");
    int examMarks = Integer.parseInt(s);
    if (examMarks >= 50) {
        IO.println("A satisfactory result!");
    }
}
