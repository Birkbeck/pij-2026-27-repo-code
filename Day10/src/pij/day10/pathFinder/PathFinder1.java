package pij.day10.pathFinder;

import java.nio.file.Path;

/**
 * Small example program to demonstrate how we can open a file using
 * a relative path, which will also work on someone else's computer.
 */
public class PathFinder1 {
    static void main() {

        // Our goal is to open the following file:
        // pij-2026-27-repo-code/src/Day10/pij/day10/temperatures/temperaturesOk1.csv

        // STEP 1:
        // Find out the absolute path of the current directory.
        // This is where a relative path would begin.
        Path absoluteCurrentPath = Path.of("").toAbsolutePath();
        IO.println(absoluteCurrentPath);

        // ... continued in class PathFinder2 ...
    }
}
