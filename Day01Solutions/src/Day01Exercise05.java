void main() {
    String input = IO.readln("Please enter a line: ");
    
    // print first line
    IO.print("+");
    int i = 0;
    while (i < input.length() + 2) {
        if (i % 2 == 0) {
            IO.print("-");
        } else {
            IO.print("=");
        }
        i = i + 1;
    }
    IO.println("+");
    
    // print second line
    IO.print("| ");
    IO.print(input);
    IO.println(" |");

    // print third line
    IO.print("+");
    i = 0;
    while (i < input.length() + 2) {
        if (i % 2 == 0) {
            IO.print("-");
        } else {
            IO.print("=");
        }
        i = i + 1;
    }
    IO.println("+");
}
