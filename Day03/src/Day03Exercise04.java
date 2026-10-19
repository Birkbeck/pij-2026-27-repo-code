void main() {
    int a = 3;
    int b = 4;
    int aTimesB = 0;
    for (int i = 0; i < a; i++) {
        aTimesB += b;
    }
    IO.println(a + " * " + b + " = " + aTimesB);

    int c = 5;
    int d = 6;
    int cTimesD = 0;
    for (int i = 0; i < c; i++) {
        cTimesD += d;
    }
    IO.println(c + " * " + d + " = " + cTimesD);

    int product = 0;
    for (int i = 0; i < 7; i++) {
        product += 8;
    }
    IO.println("7 * 8 = " + product);
}
