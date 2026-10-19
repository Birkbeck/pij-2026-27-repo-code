void main() {
    String input = IO.readln("Please enter a line: ");

    // Alternative solution:
    // First collect the strings to be printed, print only at the end.
    
    // construct horizontal edge; can be used as the top /and/ the bottom line
    String horizontalEdge = "+";
    int i = 0;
    while (i < input.length() + 2) {
        if (i % 2 == 0) {
            horizontalEdge = horizontalEdge + "-";
        } else {
            horizontalEdge = horizontalEdge + "=";
        }
        i = i + 1;
    }
    horizontalEdge = horizontalEdge + "+";

    // construct centre line
    String centreLine = "| " + input + " |";

    // print!
    IO.println(horizontalEdge);
    IO.println(centreLine);
    IO.println(horizontalEdge);
}
