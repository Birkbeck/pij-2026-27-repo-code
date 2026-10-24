package pij.day06solutions.phones;

/**
 * Exercises 2 - 6.
 * Driver class for our different kinds of phones.
 */
public class PhoneLauncher {

    private static final int MIN_PREFIX = 2;
    private static final int MAX_PREFIX = 14;

    public void launch() {
        testOldPhone();
        testMobilePhone();
        testSmartPhone();
    }

    // This method is not ideal wrt DRY: testSmartPhone and testMobilePhone
    // have a lot of similarities. With upcasting of a SmartPhone to a
    // MobilePhone, we will soon be able to avoid this repetition.
    private void testSmartPhone() {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.ringAlarm("Wake up!");
        smartPhone.playGame("Tetris!");
        for (int i = MIN_PREFIX; i <= MAX_PREFIX; i++) {
            smartPhone.call(i + "678");
        }
        smartPhone.printLastNumbers();
        smartPhone.browseWeb("localhost");
        smartPhone.findPosition();
    }

    private void testMobilePhone() {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.ringAlarm("Wake up!");
        mobilePhone.playGame("Tetris!");
        for (int i = MIN_PREFIX; i <= MAX_PREFIX; i++) {
            mobilePhone.call(i + "678");
        }
        mobilePhone.printLastNumbers();
    }

    private void testOldPhone() {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call("555123456");
    }

    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
}
