package pij.day10solutions.unix;

import java.io.File;

/**
 * Day 10, Exercise 9.
 * Implementation of (the most basic version of) the Unix utility "ls".
 */
public class Ls {
    public static void ls() {
        File currentDirectory = new File(".");
        String[] fileNames = currentDirectory.list();
        for (String fileName : fileNames) {
            IO.println(fileName);
        }
    }

    static void main() {
        ls();
    }
}
