int[] copy(int[] copyMe) {
    // The following statement is there exclusively so that the given code
    // compiles. It is not yet a correct implementation of the method.
    // You will need to replace the statement by the real implementation.
    return null; // TODO Auto-generated method stub
}

boolean testReferencesDifferent(int[] xs, int[] ys) {
    return xs != ys;
}

boolean testLengthSame(int[] xs, int[] ys) {
    return xs.length == ys.length;
}

boolean testAllValuesSame(int[] xs, int[] ys) {
    for (int i = 0; i < xs.length; i++) {
        if (xs[i] != ys[i]) {
            return false;
        }
    }
    return true;
}

boolean testBothNull(int[] xs, int[] ys) {
    return xs == null && ys == null;
}

void main() {
    int[] xs = { 1, 2, 3 };
    int[] ys = copy(xs); // you must still write the code for method copy!
    IO.println("testReferencesDifferent ok? "
                + testReferencesDifferent(xs, ys));
    IO.println("testLengthSame ok? " + testLengthSame(xs, ys));
    IO.println("testAllValuesSame ok? " + testAllValuesSame(xs, ys));

    int[] as = null;
    int[] bs = copy(as);
    IO.println("testBothNull ok? " + testBothNull(as, bs));
}
