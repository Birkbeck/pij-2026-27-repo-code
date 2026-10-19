void main() {
    IO.println("Please enter a non-negative number!");
    int n = Integer.parseInt(IO.readln());
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
        // read value from user
        if (i == array.length - 1) { // last iteration
            IO.println("Please enter " + n + " number!");
        } else {
            IO.println("Please enter " + n + " numbers!");
        }
        n--; // one fewer number to read
        int nextValue = Integer.parseInt(IO.readln());

        // now we need to find where nextValue should be inserted
        // in the array
        boolean foundInsertPosition = false;
        int insertPosition = 0; // candidate position for insertion
        while (!foundInsertPosition && insertPosition < i) {
            if (array[insertPosition] > nextValue) {
                foundInsertPosition = true;
            } else {
                insertPosition++;
            }
        }

        // VERSION 1 (commented out)
        /*
        if (! foundInsertPosition) {
            // all values that are already in the array are at the
            // right place for now, so insert at i
            array[i] = nextValue;
        } else {
            // we need to "shift" at least one value that is already
            // in the array to the right; we start at i and go downwards

            for (int j = i; j > insertPosition; j--) {
                array[j] = array[j-1]; // note: index j, not i!
            }
            array[insertPosition] = nextValue;
        }
        */

        // VERSION 2 (after refactoring to simplify the code)

        // if insertPositionFound is false, then insertPosition == i and
        // the following loop to shift the bigger numbers to the right
        // does nothing (which is what we want), otherwise we are in the
        // "else" case of VERSION 1
        for (int j = i; j > insertPosition; j--) {
            array[j] = array[j-1]; // note: index j, not i!
        }
        array[insertPosition] = nextValue;

        // print array up to and including position i
        for (int j = 0; j <= i; j++) {
            final String SEPARATOR = " ";
            if (j > 0) {
                IO.print(SEPARATOR);
            }
            IO.print(array[j]);
        }
        IO.println();
    }
}
