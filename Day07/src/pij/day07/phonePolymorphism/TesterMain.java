package pij.day07.phonePolymorphism;

import pij.day06solutions.phones.MobilePhone;
import pij.day06solutions.phones.OldPhone;

/**
 * Exercise 8.
 * DO NOT RUN THIS CODE... YET. Without running it, say what will it print!
 */
public class TesterMain {
    public static void main(String[] args) {
        OldPhone old = new OldPhone("ACME classic");
        MobilePhone mobile = new MobilePhone("ACME");
        OldPhone mobileAsOld = mobile;

        SimpleTester simple = new SimpleTester();
        SpecialTester special = new SpecialTester();
        SimpleTester specialAsSimple = special;

        simple.test(old);
        simple.test(mobile);
        simple.test(mobileAsOld);
        System.out.println();

        special.test(old);
        special.test(mobile);
        special.test(mobileAsOld);
        IO.println();

        specialAsSimple.test(old);
        specialAsSimple.test(mobile);
        specialAsSimple.test(mobileAsOld);
        IO.println();

        simple.ring(old);
        simple.ring(mobile);
        simple.ring(mobileAsOld);
        IO.println();

        special.ring(old);
        special.ring(mobile);
        special.ring(mobileAsOld);
        IO.println();

        specialAsSimple.ring(old);
        specialAsSimple.ring(mobile);
        specialAsSimple.ring(mobileAsOld);
    }
}
