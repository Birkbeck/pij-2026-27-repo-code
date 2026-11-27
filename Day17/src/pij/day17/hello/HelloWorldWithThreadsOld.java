package pij.day17.hello;

/**
 * Driver class for Java's threads with very simple functionality.
 */
public class HelloWorldWithThreadsOld {
    static void main() {
        // Run this code several times -- there are two different outcomes!
        Runnable myRunnable = () -> IO.println("Hello, World! From the new thread.");
        Thread newThread = new Thread(myRunnable);
        newThread.start();
        IO.println("The original thread says hi!");
    }
}
