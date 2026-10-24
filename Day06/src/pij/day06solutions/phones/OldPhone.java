package pij.day06solutions.phones;

/**
 * Exercises 2 - 6.
 * An OldPhone models a classic telephone from the mid-20th century.
 * It can make a phone call, and that's all it can do!
 */
public class OldPhone {

    /** OldPhones for which no brand is chosen shall have this brand. */
    public static final String NO_BRAND = "No Name";

    /** The brand of this OldPhone. */
    private String brand;

    /**
     * Constructs an OldPhone without a brand.
     * Needed for Exercise 3 because introducing an explicit constructor
     * removes the implicit "no-args" constructor (constructor that
     * does not take any arguments).
     * Alternatively, the script for Exercise 2 would need to call the
     * constructor that expects a String as a parameter (then the script
     * would have to be modified).
     */
    public OldPhone() {
        this(OldPhone.NO_BRAND);
    }

    /**
     * Exercise 3.
     * Constructs an OldPhone with a given brand.
     *
     * @param brand the brand of this OldPhone
     */
    public OldPhone(String brand) {
        this.brand = brand;
    }

    /**
     * @return the brand of this OldPhone
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Make a (simulated) phone call to a given number.
     *
     * @param number the number to call
     */
    public void call(String number) {
        IO.println("Calling " + number + "...");
    }
}
