void main() {
    IO.println("Please key in four numbers: ");
    String input = IO.readln("> ");
    int num1 = Integer.parseInt(input);
    input = IO.readln("> ");
    int num2 = Integer.parseInt(input);
    input = IO.readln("> ");
    int num3 = Integer.parseInt(input);
    input = IO.readln("> ");
    int num4 = Integer.parseInt(input);
    int total = num1 + num2 + num3 + num4;
    IO.println("Total: " + total);
}
