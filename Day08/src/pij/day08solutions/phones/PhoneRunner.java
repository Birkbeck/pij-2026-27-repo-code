package pij.day08solutions.phones;

import java.util.LinkedHashSet;
import java.util.Set;

// Exercises 5.1 - 5.4.
public class PhoneRunner {
    static void main() {
        final String brand = "ACME";

        OldPhone old1 = new OldPhone(brand);
        OldPhone old2 = new OldPhone(brand);

        MobilePhone mobile1 = new MobilePhone(brand);
        MobilePhone mobile2 = new MobilePhone(brand);

        SmartPhone smart1 = new SmartPhone(brand);
        SmartPhone smart2 = new SmartPhone(brand);

        Set<OldPhone> set = new LinkedHashSet<>();
        set.add(old1);
        set.add(mobile1);
        set.add(smart1);

        IO.println("set.contains(old2): " + set.contains(old2));
        IO.println("set.contains(mobile2): " + set.contains(mobile2));
        IO.println("set.contains(smart2): " + set.contains(smart2));
    }
}
