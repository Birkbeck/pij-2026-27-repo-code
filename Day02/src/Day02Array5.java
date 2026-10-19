void main() {
    int[][] matrix;
    matrix = new int[3][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    matrix[2][0] = 7;
    matrix[2][1] = 8;
    matrix[2][2] = 9;

    int[][] matrix3 = {{1,2,3},{4,5,6},{7,8,9}};

    int[][] matrix3a = { { 1, 2, 3 },
                         { 4, 5, 6 },
                         { 7, 8, 9 } };

    String[][] teams =  { { "Alice", "Bob" },
                          { "Marge", "Homer", "Bart", "Lisa", "Maggie" },
                          { "Wolverine" } };

    // method java.util.Arrays.deepToString(someArray) produces
    // a String representation of an array someArray that also
    // works as expected if the array has arrays as entries
    // (which may in turn have arrays as entries, and so on)
    IO.println(java.util.Arrays.deepToString(matrix));
    IO.println(java.util.Arrays.deepToString(matrix3));
    IO.println(java.util.Arrays.deepToString(matrix3a));
    IO.println(java.util.Arrays.deepToString(teams));
}
