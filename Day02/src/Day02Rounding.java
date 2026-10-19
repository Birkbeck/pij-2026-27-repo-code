void main() {
    double d1 = 0.3;
    double d2 = 0.1 + 0.2;
    // WRONG!
    if (d1 == d2) {
        // this is not printed due to rounding errors
        IO.println("They are exactly the same (wrong comparison)");
    } 
    // RIGHT!
    double delta = 10E-6;
    if (Math.abs(d1 - d2) < delta) {
        IO.println("They are about the same (right comparison)");
    }
}
