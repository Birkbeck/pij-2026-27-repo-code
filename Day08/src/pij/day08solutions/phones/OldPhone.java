package pij.day08solutions.phones;

import java.util.Objects;

public class OldPhone {

    private String brand;

    public OldPhone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void call(String number) {
        IO.println("Calling " + number + "...");
    }

    // Exercise 5.1
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        OldPhone oldPhone = (OldPhone) o;
        // Objects.equals can deal with null
        return Objects.equals(this.brand, oldPhone.brand);
    }

    // Exercise 5.3. Comment out the method to see the "weird" behaviour
    // in Exercise 5.2.
    @Override
    public int hashCode() {
        // Objects.hashCode can deal with null
        return Objects.hashCode(this.brand);
    }
}
