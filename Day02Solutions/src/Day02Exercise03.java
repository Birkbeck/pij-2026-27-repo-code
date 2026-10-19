void main() {
    IO.println("Please enter two numbers!");
    int x = Integer.parseInt(IO.readln());
    int y = Integer.parseInt(IO.readln());

    int integerDivisionResult = x / y;
    int integerDivisionRemainder = x % y;

    // cast one of the variables to double to make Java use division
    // for type double
    double doubleDivisionResult = x / (double) y;

    IO.println("Integer division result: " + integerDivisionResult);
    IO.println("Integer division remainder: " + integerDivisionRemainder);
    IO.println("Double division result: " + doubleDivisionResult);
}
