void main() {
    int total = 0;
    boolean finished = false;
    while (!finished) {
        String input = IO.readln("Please enter a number (end with 0): ");
        int num = Integer.parseInt(input);
        if (num != 0) {
            total = total + num;
            IO.println("Total is " + total);
        } else {
            finished = true;
        }
    }
}
