void main() {
    // n = 4; // commented out this line from the original to avoid compile-time error
    int n = 5;
    IO.println("n is " + n);
    
    // The above code has a compile-time error. In line 2, the variable
    // n is used before it has been declared. To fix the error, we could
    // declare the variable in line 2, by writing "int" before "n".
    // We would need to remove the word "int" in line 3 to avoid a
    // duplicate declaration of the same variable.
}
