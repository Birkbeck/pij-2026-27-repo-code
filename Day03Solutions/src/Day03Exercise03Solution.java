// makes a horizontalEdge +----- .... ----+
// with the indicated number of dashes (0 if negative)
String makeHorizontalEdge(int numberOfDashes) {
    String result = "+";
    for (int i = 0; i < numberOfDashes; i++) {
        // The use of + in the next line to build Strings in a loop is not
        // ideal, and your IDE will likely suggest a better solution using
        // an object of class StringBuilder.
        result += "-";
    }
    result += "+";
    return result;
}

// makes the centreLine for our box
String makeCentreLine(String input) {
    return "| " + input + " |";
}

// prints line in a box
void printInBox(String line) {
    String horizontalEdge = makeHorizontalEdge(line.length() + 2);
    String centreLine = makeCentreLine(line);
    IO.println(horizontalEdge);
    IO.println(centreLine);
    IO.println(horizontalEdge);
}

void main() {
    String input = IO.readln("Please enter a line: ");
    printInBox(input);
}
