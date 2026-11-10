package pij.day12.stringMaker;

/** Exercise 3. */
public class StringMaker {
    public static String build(int max) {
        String s = "";
        for (int i = 0; i < max; i++) {
            s += i;
        }
        return s;
    }
}
