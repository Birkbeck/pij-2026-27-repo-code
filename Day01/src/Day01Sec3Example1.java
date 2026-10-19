void main() {
    String s1 = IO.readln("Please key in a number: ");
    int num1 = Integer.parseInt(s1);
    String s2 = IO.readln("And another: ");
    int num2 = Integer.parseInt(s2);
    if (num1 == num2) {
        IO.println("They are the same.");
    }
}
