package pij.day10solutions.unix;

import java.io.File;

/**
 * Day 10, Exercise 10.
 * Creates directories corresponding to the command-line arguments.
 * Will write to your file system, so use with care!
 */
public class Mkdir {
    private static void mkdir(String[] dirNames) {
        for (String dirName : dirNames) {
            File newDirectory = new File(dirName);
            boolean success = newDirectory.mkdir();
            if (! success) {
                IO.println("Unable to create directory: " + dirName);
            }
        }
    }

    static void main(String[] args) {
        mkdir(args);
    }
}
