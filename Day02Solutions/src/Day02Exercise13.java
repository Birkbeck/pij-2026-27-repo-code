void main() {
    // Write a program that reads a text representing a mathematical
    // operation (one of the four basic ones) with two operands, and
    // then executes it. For example, if the user enters “3/5” the
    // program outputs “0.6”; if the user enters “23 * 4” the program
    // outputs “92” (or “92.0”).
    IO.println("Please enter a mathematical operation (+, -, *, /) with its arguments)!");
    IO.println("Examples: 3/5 or 23 * 4");
    String input = IO.readln();

    // we got the input... now find the operator
    final char PLUS = '+';
    final char MINUS = '-';
    final char TIMES = '*';
    final char DIVIDE = '/';
    final char NONE = 'n'; // initially none of the supported operators
    char operator = NONE;

    // find the position of the operator symbol to "split" the input
    int operatorPosition = -1;
    int i = 0;
    boolean foundAnOperator = false;
    while (i < input.length() && ! foundAnOperator) {
        char ch = input.charAt(i);
        if (ch == PLUS || ch == MINUS || ch == TIMES || ch == DIVIDE) {
            operatorPosition = i;
            operator = ch;
            foundAnOperator = true;
        } else {
            i++;
        }
    }

    if (! foundAnOperator) {
        IO.println("Unable to proceed, found no operator in input: " + input);
    } else {
        // We have the operator, and we know where it is. So if the input
        // is legitimate, the rest before and after the operator's position
        // must be the two numbers to process.
        String first = input.substring(0, operatorPosition);
        String second = input.substring(operatorPosition + 1);
        double x = Double.parseDouble(first);
        double y = Double.parseDouble(second);

        double result = -1;
        if (operator == PLUS) {
            // NOTE: here operator has type char, so == is the right approach for
            // comparison; for a String, we would need the `equals` method
            result = x + y;
        } else if (operator == MINUS) {
            result = x - y;
        } else if (operator == TIMES) {
            result = x * y;
        } else { // operator == DIVIDE
            result = x / y;
        }

        // alternative implementation using a switch statement
        /*
        switch (operator) {
            case PLUS -> {
                result = x + y;
            }
            case MINUS -> {
                result = x - y;
            }
            case TIMES -> {
                result = x * y;
            }
            case DIVIDE -> {
                result = x / y;
            }
            default -> {
                // this case should not be reachable due to the earlier
                // checks on the operator; we will later learn how we
                // can check this at runtime (using exceptions)
            }
        }
        */
        IO.println(result);
    }
}
