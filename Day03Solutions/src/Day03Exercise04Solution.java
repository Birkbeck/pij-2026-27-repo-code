// method that just does the computation, but does not print on the screen
// (useful on its own)
int multiply(int a, int b) {
    int aTimesB = 0;
    for (int i = 0; i < a; i++) {
        aTimesB += b;
    }
    return aTimesB;
}

// keep the actual computation of the product and the printing separate
// so that the computation can be done also without the printing
void multiplyAndPrintProduct(int a, int b) {
    int aTimesB = multiply(a, b);
    IO.println(a + " * " + b + " = " + aTimesB);
}

// instead of writing three copies of almost the same code,
// just call method multiplyAndPrintProduct three times
void main() {
    multiplyAndPrintProduct(3, 4);
    multiplyAndPrintProduct(5, 6);
    multiplyAndPrintProduct(7, 8);
}
