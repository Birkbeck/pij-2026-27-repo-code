void printUnitMatrix(int size) {
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (j > 0) {
                IO.print(" ");
            }
            String s = (i == j) ? "1" : "0";
            IO.print(s);
        }
        IO.println();
    }
}

// scopes of different variables:
// - i: from line 2 to line 11
// - j: from line 3 to line 9
// - size: from line 1 to line 12
// - s: from line 7 to line 9

void main() {
    printUnitMatrix(5);
}
