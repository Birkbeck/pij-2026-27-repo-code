void main() {
    // Write a program that reads two floating-point numbers
    // from the user and then offers a menu with the four basic
    // operations: addition, subtraction, multiplication, and
    // division. Once the user has selected an operation from
    // the menu, the calculator performs the operation.

    IO.println("Please enter two floating-point numbers!");
    double x = Double.parseDouble(IO.readln());
    double y = Double.parseDouble(IO.readln());
    IO.println("Please enter the operation symbol: +, -, *, or /");

    String operation = IO.readln();
    double result = -1;
    // What if the real result is -1?
    // What if the user types the wrong symbol?
    boolean inputOkay = true;

    // We had not talked about "final" by Day 2, but by the time you read this
    // code, you will have seen it.
    final String ADDITION_SYMBOL = "+"; // avoid "magic String"!
    final String SUBTRACTION_SYMBOL = "-";
    final String MULTIPLICATION_SYMBOL = "*";
    final String DIVISION_SYMBOL = "/";

    // Remark: if you wrote operation.equals("+") and did not introduce
    // extra variables/constants for the symbols, this is okay for Day 2:
    // we had not talked about "magic numbers/values" yet. Here I am using
    // named constants instead, as a best practice.
    if (operation.equals(ADDITION_SYMBOL)) {
        result = x + y;
    } else if (operation.equals(SUBTRACTION_SYMBOL)) {
        result = x - y;
    } else if (operation.equals(MULTIPLICATION_SYMBOL)) {
        result = x * y;
    } else if (operation.equals(DIVISION_SYMBOL)) {
        result = x / y;
    } else {
        inputOkay = false;
    }

    // Possible alternative with a switch statement
    // (which we saw only on Day 3):

    /*
    switch (operation) {
        case ADDITION_SYMBOL -> {
            result = x + y;
        }
        case SUBTRACTION_SYMBOL -> {
            result = x - y;
        }
        case MULTIPLICATION_SYMBOL -> {
            result = x * y;
        }
        case DIVISION_SYMBOL -> {
            result = x / y;
        }
        default -> {
            inputOkay = false;
        }
    }
    */
    if (inputOkay) {
        IO.println(result);
    } else {
        IO.println("I don't know the operation " + operation);
    }

    // Possible alternative to the if-else (from Day 3): use conditional
    // operator for the expression to print instead of the if-else
    // statement with two println instructions

    //IO.println(inputOkay ? result : "I don't know the operation " + operation);
}
