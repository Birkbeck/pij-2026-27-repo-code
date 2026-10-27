package pij.day07solutions.phones;

import pij.day06solutions.phones.MobilePhone;
import pij.day06solutions.phones.OldPhone;
import pij.day06solutions.phones.SmartPhone;

/**
 * Exercise 10.
 */
public class PhoneRunner {

    // Ex 10.3
    public static void testPhone(OldPhone phone) {
        // we can call only the methods of OldPhone on phone, regardless
        // of the actual class of the object referenced by phone
        phone.getBrand();
        phone.call("123");
        SmartPhone smart = (SmartPhone) phone; // Ex 10.4: beware, phone might not be a SmartPhone
        smart.playGame("Super Mario Land");
        smart.call("3");
        smart.browseWeb("def");
        smart.findPosition();
        smart.getBrand();
        smart.printLastNumbers();
    }

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("ACME"); // Ex 10.1
        //MobilePhone myPhone = new SmartPhone("ACME"); // Ex 10.2
        myPhone.playGame("Tetris");
        myPhone.call("1234");
        myPhone.browseWeb("abc"); // does not work if myPhone is declared
        myPhone.findPosition();   // with type MobilePhone
        myPhone.getBrand();
        myPhone.printLastNumbers();
        testPhone(myPhone);

        MobilePhone mobilePhone = new MobilePhone("ACME");
        testPhone(mobilePhone); // Ex 10.5: throws ClassCastException
    }
}
