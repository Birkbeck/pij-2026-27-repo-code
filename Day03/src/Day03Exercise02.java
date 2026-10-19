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

void main() {
    printUnitMatrix(5);
}
