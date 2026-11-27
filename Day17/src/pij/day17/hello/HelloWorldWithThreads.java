package pij.day17.hello;

/**
 * Driver class for Java's threads with very simple functionality.
 */
public class HelloWorldWithThreads {

    static void main() {
        // Run this code several times -- there are different outcomes!
        final int NUMBER_OF_THREADS = 10;
        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            String s = "Thread " + i + " says: Hello, World!";
            Thread t = new Thread(() -> IO.println(s));
            t.start();
        }
        IO.println("The original thread says hi!");
    }
}
