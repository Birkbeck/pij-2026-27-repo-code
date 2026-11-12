package pij.day10solutions.myFirstExceptions;

/**
 * Day 10, Exercise 6.
 * MyCheckedException is a *checked* exception. We enforce this by
 * making the class a subclass of Exception, but not of RuntimeException.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException() {
        // do nothing beyond the implicit super() call
    }

    public MyCheckedException(String message) {
        super(message);
    }

    public MyCheckedException(Throwable cause) {
        super(cause);
    }
}
