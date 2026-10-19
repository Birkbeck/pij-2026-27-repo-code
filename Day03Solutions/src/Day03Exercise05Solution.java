// power(int, int): Takes a base base and an exponent exp from the caller,
// and returns the result of base^exp.
int power(int base, int exp) {
    int result = 1;
    // just multiply b to 1, e times; works only for non-negative e
    for (int i = 0; i < exp; i++) {
        result = result * base;
    }
    return result;
}


// power2(int): Takes an exponent e from the user and returns the result
// of 2^exp. This method must call the previous one to find out the result.
int power2(int exp) {
    // delegate the work
    return power(2, exp);
}

// binary2decimal(String): Takes from the user a binary number (with
// digits 0 and 1) and returns the corresponding number in decimal
// (base-10, with digits between 0 and 9). Hint: in the same way
// that you know that 35 = 3 · 10^1 + 5 · 10^0 , you can find that
// 100011 = 1 · 2^5 + 1 · 2^1 + 1 · 2^0. This method must call the
// previous one to find out the result.
String binary2decimal(String binary) {
    int result = 0;
    for (int i = 0; i < binary.length(); i++) {
        // the _first_ digit has the _highest_ weight!
        int exponent = binary.length() - 1;
        // 100011 has length 6, the first factor is 2^5
        int powerOfTwo = power2(exponent);
        char bit = binary.charAt(i);
        if (bit == '1') {
            result += powerOfTwo;
        }
        // assume for now that all other cases are '0'
    }
    return "" + result; // convert to String
}

// decimal2binary(String): The opposite of the previous one: takes a
// decimal number and returns the corresponding binary number.
// Hint: instead of multiplying by 2, you will need to divide by 2
// this time (the quotients and the last remainder will give you
// the binary number).
String decimal2binary(String decimal) {

    // working on int is easier than looking at all 10 digits
    int decimalAsInt = Integer.parseInt(decimal);
    if (decimalAsInt < 0) {
        // returning a strange result for unsupported method parameter
        // values is not ideal... when we learn about exceptions, we
        // will see a better way
        return "Only non-negative numbers are supported!";
    }

    if (decimalAsInt == 0) {
        // special case: "0" rather than ""
        return "0";
    }

    // still here? then decimal must be > 0

    String result = "";
    // while we haven't transformed everything yet...
    while (decimalAsInt > 0) {
        // is the last bit (binary digit) a 0 or a 1?

        // OPTION 1
        /*
        if (decimal % 2 == 0) {
            result = "0" + result;
        } else {
            result = "1" + result;
        }
        */

        // OPTION 2 (slightly shorter)
        result = ((decimalAsInt % 2 == 0) ? "0" : "1") + result;

        // now remove that last bit from decimal, whatever it was
        decimalAsInt /= 2;
    }

    return result;
}

void main() {
    final String BINARY2DECIMAL = "b";
    IO.println("Please type '" + BINARY2DECIMAL + "' and Return to convert from binary to decimal.");
    IO.println("Please type other input and Return to convert from decimal to binary.");
    String choice = IO.readln();
    if (BINARY2DECIMAL.equals(choice)) {
        IO.print("Please enter a (non-negative) binary number: ");
        String binary = IO.readln();
        String decimal = binary2decimal(binary);
        IO.println("The decimal value is: " + decimal);
    } else {
        IO.print("Please enter a (non-negative) decimal number: ");
        String decimal = IO.readln();
        String binary = decimal2binary(decimal);
        IO.println("The binary value is: " + binary);
    }
}
