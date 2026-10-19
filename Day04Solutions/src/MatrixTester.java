void main() {
    // Exercise 8
    int rows = 3;
    int cols = 4;
    Matrix matrix = new Matrix(rows, cols);
    matrix.setElement(0, 0, 10);
    matrix.setRow(1, "2,3,4,5");
    matrix.setColumn(2, "6,7,8");
    matrix.prettyPrint();
    String encodedMatrix = matrix.toString();
    IO.println(encodedMatrix);

    Matrix m2 = new Matrix(rows, cols);
    m2.setMatrix(encodedMatrix); // Exercise 10
    m2.prettyPrint();

    // Exercise 9
    IO.println("Symmetrical: " + m2.isSymmetrical());
    IO.println("Triangular: " + m2.isTriangular());

    Matrix symmetricalMatrix = new Matrix(3, 3);
    symmetricalMatrix.prettyPrint();
    IO.println("Symmetrical: " + symmetricalMatrix.isSymmetrical());
    IO.println("Triangular: " + symmetricalMatrix.isTriangular());

    Matrix triangularMatrix = new Matrix(2, 2);
    triangularMatrix.setElement(1, 0, 0);
    triangularMatrix.prettyPrint();
    IO.println("Symmetrical: " + triangularMatrix.isSymmetrical());
    IO.println("Triangular: " + triangularMatrix.isTriangular());
}
