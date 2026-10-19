void main() {
    IO.println("Please choose an option:");
    IO.println("For 'Checking you balance', please enter 1");
    IO.println("For 'Purchases', please enter 2");
    IO.println("For 'Refunds', please enter 3");
    IO.println("For 'Queries about the warranty', please enter 4");
    IO.println("For 'Returning faulty goods', please enter 5");
    IO.println("For any other query, please enter 0");
    int choice = Integer.parseInt(IO.readln());
    if (choice == 1) {
        // go and check balance
    } else if (choice == 2) {
        // go and purchase something
    } else if (choice == 3) {
        // go and process refunds
    } else if (choice == 4) {
        // go and answer queries
    } else if (choice == 5) {
        // return faulty goods
    } else {
        // go and talk with a human operator
    }
}
