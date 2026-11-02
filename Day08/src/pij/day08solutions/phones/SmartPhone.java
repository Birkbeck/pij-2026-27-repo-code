package pij.day08solutions.phones;

public class SmartPhone extends MobilePhone {
    private static final String INTERNATIONAL_PREFIX = "00";

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String address) {
        IO.println("Browsing " + address + "...");
    }

    public void findPosition() {
        IO.println("Coordinates TO DO");
    }

    @Override
    public void call(String number) {
        if (number.startsWith(INTERNATIONAL_PREFIX)) {
            IO.println("Calling " + number + " through the internet to save money");
        } else {
            super.call(number);
        }
    }

    // Exercise 5.4
    // No explicit implementation for equals and hashCode in SmartPhone!
    // The inherited methods from superclass MobilePhone do a perfect job
    // for the given specification already, and DRY means that we should
    // not write code more than once.
}
