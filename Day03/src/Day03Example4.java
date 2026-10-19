// This method increments both the int parameter and
// the first element of the array by 1
void increment(int[] array, int n) {
    n = n + 1;
    array[0] = array[0] + 1;
    array = null;
    IO.println("  At the end of the method...");
    IO.println("  The integer is " + n);
    IO.println("  The array is " + array);
}

// Program execution starts here
void main() {
    int[] myArray = { 0 };
    int myInt = 0;
    IO.println("The integer is now " + myInt);
    IO.println("The array element is now " + myArray[0]);
    IO.println("Calling method increment(int[], int)...");
    increment(myArray, myInt);
    IO.println("The integer is now " + myInt);
    IO.println("The array element is now " + myArray[0]);
}
