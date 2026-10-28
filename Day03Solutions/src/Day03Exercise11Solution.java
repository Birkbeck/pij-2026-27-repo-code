boolean messageCanBePrinted(String message, int hPos, int vPos) {
    // constants for minimal and maximal horizontal and vertical positions
    final int H_MIN = 0;
    final int H_MAX = 80;
    final int V_MIN = 0;
    final int V_MAX = 40;

    if (hPos < H_MIN || vPos < V_MIN || vPos > V_MAX) {
        return false;
    }
    // special treatment needed for horizontal position:
    // is the last character of the message still in the console?
    int lastCharPos = message.length() - 1 + hPos;
    return lastCharPos <= H_MAX;
}

void printAtPosition(String message, int hPos, int vPos) {
    final String ERROR_MESSAGE = "error";
    final int ERROR_H_POS = 20;
    final int ERROR_V_POS = 20;
    if (! messageCanBePrinted(message, hPos, vPos)) {
        message = ERROR_MESSAGE;
        hPos = ERROR_H_POS;
        vPos = ERROR_V_POS;
    }
    IO.print("\n".repeat(vPos)); // go down
    IO.print(" ".repeat(hPos)); // indent for the line
    IO.println(message);
}

void main() {
    printAtPosition("Hello", 40, 30);
    printAtPosition("World", 77, 10);
}
