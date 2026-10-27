package pij.day07.phonePolymorphism;

import pij.day06solutions.phones.MobilePhone;
import pij.day06solutions.phones.OldPhone;

public class SpecialTester extends SimpleTester {
    public void test(OldPhone p) {
        IO.println("special test old");
    }
    public void test(MobilePhone m) {
        IO.println("special test mobile");
    }
    public void ring(MobilePhone m) {
        IO.println("special ring mobile");
    }
}
