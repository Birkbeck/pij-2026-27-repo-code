void runCopier(ArrayCopier copier, int[] src, int[] dst) {
    IO.println("src before copy: " + Arrays.toString(src));
    IO.println("dst before copy: " + Arrays.toString(dst));
    copier.copy(src, dst);
    IO.println("src after copy: " + Arrays.toString(src));
    IO.println("dst after copy: " + Arrays.toString(dst));
}

void main() {
    ArrayCopier copier = new ArrayCopier();

    int[] src1Shorter = {1, 2, 3, 4};
    int[] dst1Longer = new int[10];
    dst1Longer[8] = 9; // for testing whether overwriting with 0 works
    runCopier(copier, src1Shorter, dst1Longer);

    int[] src2Same = {5, 6, 7, 8};
    int[] dst2Same = new int[4];
    runCopier(copier, src2Same, dst2Same);

    int[] src3Longer = {9, 10, 11, 12};
    int[] dst3Shorter = new int[2];
    runCopier(copier, src3Longer, dst3Shorter);
}
