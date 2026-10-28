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

// splits the lines in s into an array
String[] splitLines(String s) {
    final char NEW_LINE = '\n';
    int newLineCount = countNewLines(s);
    String[] result = new String[newLineCount + 1];
    int lastStartPos = 0;
    int nextIndex = 0;
    for (int i = 0; i < s.length(); i++) {
        if (NEW_LINE == s.charAt(i)) {
            result[nextIndex] = s.substring(lastStartPos, i);
            nextIndex++;
            lastStartPos = i + 1;
        }
    }
    result[result.length - 1] = s.substring(lastStartPos);
    return result;
}

// counts the number of '\n' occurrences in s
int countNewLines(String s) {
    final char NEW_LINE = '\n';
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
        if (NEW_LINE == s.charAt(i)) {
            result++;
        }
    }
    return result;
}

// returns the maximum length of the elements of strings
int computeMaxLength(String[] strings) {
    int result = 0;
    for (String string : strings) {
        if (string.length() > result) {
            result = string.length();
        }
    }
    return result;
}

// prints input in a box
void printInBox(String input) {
    String[] lines = splitLines(input); // or: ... = input.split("\n");
    int maxLength = computeMaxLength(lines);
    String horizontalEdge = makeHorizontalEdge(maxLength + 2);
    IO.println(horizontalEdge);
    for (String line : lines) {
        // use padding to make all lines equally long
        int numberOfSpaces = maxLength - line.length();
        String lineToPrint = "| " + line + " ".repeat(numberOfSpaces) + " |";
        IO.println(lineToPrint);
    }
    IO.println(horizontalEdge);
}

// entry point
void main() {
    // first read several lines ...
    int howManyLines = Integer.parseInt(IO.readln("How many lines do you wish to enter? "));
    String input = "";
    for (int i = 0; i < howManyLines; i++) {
        input += IO.readln("Please enter a line: ");
        if (i < howManyLines - 1) {
            input += "\n";
        }
    }

    // ... then print them in a box
    printInBox(input);
}
