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

// returns whether the given message, split into its lines, can be
// printed at the given position
boolean messageCanBePrinted(String[] splitMessage, int hPos, int vPos) {
    // constants for minimal and maximal horizontal and vertical positions
    final int H_MIN = 0;
    final int H_MAX = 80;
    final int V_MIN = 0;
    final int V_MAX = 40;

    // possible reasons why the message might not fit:
    // - the first row is before V_MIN
    // - the first column is before H_MIN
    if (hPos < H_MIN || vPos < V_MIN) {
        return false;
    }

    // more possible reasons why the message might not fit:
    // - the last row is after V_MAX
    // - the longest line ends after H_MAX
    int maxLineLength = computeMaxLength(splitMessage);
    int hPosMax = hPos + maxLineLength - 1;
    int vPosMax = vPos + splitMessage.length - 1;

    return hPosMax <= H_MAX && vPosMax <= V_MAX;
}

// prints lines at position indicating horizontal and vertical indent
void printLinesAtPosition(String[] lines, int hPos, int vPos) {
    IO.print("\n".repeat(vPos));
    String indent = " ".repeat(hPos);
    for (String line : lines) {
        IO.print(indent);
        IO.println(line);
    }
}

// prints message at position indicating horizontal and vertical indent,
// provided that it fits; prints an error message otherwise
void printAtPosition(String message, int hPos, int vPos) {
    final String ERROR_MESSAGE = "error";
    final int ERROR_H_POS = 20;
    final int ERROR_V_POS = 20;
    String[] split = splitLines(message);
    if (! messageCanBePrinted(split, hPos, vPos)) {
        split = new String[1];
        split[0] = ERROR_MESSAGE;
        // Alternative:
        //split = new String[] { ERROR_MESSAGE };
        hPos = ERROR_H_POS;
        vPos = ERROR_V_POS;
    }
    printLinesAtPosition(split, hPos, vPos);
}

// not required for the exercise, but can be useful
void runInteractively() {
    // first read several lines ...
    int howManyLines = Integer.parseInt(IO.readln("How many lines do you wish to enter? "));
    String input = "";
    for (int i = 0; i < howManyLines; i++) {
        input += IO.readln("Please enter a line: ");
        if (i < howManyLines - 1) {
            input += "\n";
        }
    }

    // ... and the position ...
    int hPos = Integer.parseInt(IO.readln("Please enter the horizontal position: "));
    int vPos = Integer.parseInt(IO.readln("Please enter the vertical position: "));

    // ... and now we can (try to) print
    printAtPosition(input, hPos, vPos);
}

// entry point
void main() {
    String testMessage = "Hello\nWorld\nVery long line\nLast line";
    printAtPosition(testMessage, 3, 4);
    printAtPosition(testMessage, 20, 38);

    // Alternative:
    //runInteractively();
}
