void main() {
    IO.println("Please enter a non-negative integer!");
    int n = Integer.parseInt(IO.readln());
    int[] array = new int[n];
    IO.println("Please enter " + n + " integer values!");
    for (int i = 0; i < array.length; i++) {
        array[i] = Integer.parseInt(IO.readln());
    }

    final String SEPARATOR = "; "; // to print between entries

    // Print array content from first to last position
    for (int i = 0; i < array.length; i++) {
        if (i > 0) { // make sure that SEPARATOR goes only /between/ values
            IO.print(SEPARATOR);
        }
        IO.print(array[i]);
    }
    IO.println();

    // Print array content from last to first position
    for (int i = array.length - 1; i >= 0; i--) {
        IO.print(array[i]);
        if (i > 0) {
            IO.print(SEPARATOR);
        }
    }
    IO.println();

    // Print array content at even positions (if any), then at odd positions
    // - first the even positions
    for (int i = 0; i < array.length; i += 2) { // note the increment!
        if (i > 0) {
            IO.print(SEPARATOR);
        }
        IO.print(array[i]);
    }
    // - then maybe a separator
    if (array.length >= 2) {
        // odd positions exist only from length 2 upward
        IO.print(SEPARATOR);
    }
    // - finally the odd positions
    for (int i = 1; i < array.length; i += 2) {
        if (i > 1) {
            IO.print(SEPARATOR);
        }
        IO.print(array[i]);
    }
    IO.println();
}
