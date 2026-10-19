void main() {
    MatrixChecker checker = new MatrixChecker();
    int[][] symmetricMatrix = {{1, 2}, {2, 1}};
    int[][] triangularMatrix = {{3, 4}, {0, 5}};
    int[][] wildSquareMatrix = {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}};
    int[][] nonSquareMatrix = {{1, 2, 3}, {2, 1, 3}};

    int[][][] matrices = {symmetricMatrix, triangularMatrix, wildSquareMatrix,
            nonSquareMatrix};

    for (int[][] matrix : matrices) {
        IO.println("Analysing " + Arrays.deepToString(matrix) + " ...");
        IO.println("Is it symmetrical? " + checker.isSymmetrical(matrix));

        // matrix may have been modified sneakily by isSymmetrical (although it
        // shouldn't), so print it again with its current content
        IO.println("Analysing " + Arrays.deepToString(matrix) + " ...");
        IO.println("Is it triangular? " + checker.isTriangular(matrix));
        IO.println(); // just add an empty line
    }
}
