package pij.day10solutions.myFirstExceptions;

/**
 * Day 10, Exercise 6.
 * MyUncheckedException is an *unchecked* exception. We enforce this by
 * making the class a subclass of RuntimeException.
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException() {
        // do nothing beyond the implicit super() call
    }

    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(Throwable cause) {
        super(cause);
    }
}
