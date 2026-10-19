void main() {
    String s = IO.readln("Please key in your exam marks: ");
    int examMarks = Integer.parseInt(s);
    if (examMarks >= 70) {
        IO.println("An exceptional result!");
        IO.println("We expect a first-class project from you.");
    } else if (examMarks >= 50) {
        IO.println("A satisfactory result!");
        IO.println("You may proceed with your project.");
    } else {
        IO.println("Sorry, you have failed.");
    }
}
