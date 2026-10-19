// This method makes and returns a copy of the given array.
// This is deliberately done manually rather than by using
// System.arraycopy() or java.util.Arrays.copyOf() (which
// are otherwise the more suitable solutions).
int[] copy(int[] copyMe) {
    if (copyMe == null) { // Escape clause: handle special case first
        return null;
    }
    // From here on, we *know* that copyMe is not null.
    int resultLength = copyMe.length;
    int[] result = new int[resultLength];
    for (int i = 0; i < resultLength; i++) {
        result[i] = copyMe[i];
    }
    return result;
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
