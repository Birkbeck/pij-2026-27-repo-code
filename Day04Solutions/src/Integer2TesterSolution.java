void main() {
    int i = Integer.parseInt(IO.readln("Enter a number: "));
    Integer2 i2 = new Integer2(i);
    IO.print("The number you entered is ");
    if (i2.isEven()) {
        IO.println("even.");
    } else if (i2.isOdd()) {
        IO.println("odd.");
    } else {
        IO.println("undefined!! Your code is buggy!");
    }
    int parsedInt = Integer.parseInt(i2.toString());
    if (parsedInt == i2.getValue()) {
        IO.println("Your toString() method seems to work fine.");
    }
}
