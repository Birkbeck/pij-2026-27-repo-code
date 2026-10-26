package pij.day08.oldBox;

/**
 * A driver class (aka script, aka tester class) for the IntegerBox and
 * StringBox types.
 */
public class OldBoxDriver {
    static void main() {
        OldBox intBox = new OldBox(42);
        int x = (Integer) intBox.getData(); // ok
        OldBox strBox = new OldBox("Hello");
        String s = (String) strBox.getData(); // ok
        intBox = strBox; // (!)
        int y = (Integer) strBox.getData(); // (!)
    }
}
