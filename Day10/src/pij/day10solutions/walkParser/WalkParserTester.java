package pij.day10solutions.walkParser;

import pij.day10.walkParser.Walk;

import java.io.File;
import java.io.IOException;

/**
 * Day 10, Exercise 7.
 * Driver class for WalkParser.
 */
public class WalkParserTester {

    static void main() {
        //IO.println(f.getAbsolutePath());
        File f = new File("Day10/src/pij/day10/walkParser/walkOk1.txt");
        //File f = new File("Day10/src/pij/day10/walkParser/walkOk2.txt");
        //File f = new File("Day10/src/pij/day10/walkParser/walkNotOk1.txt");
        //File f = new File("Day10/src/pij/day10/walkParser/walkNotOk2.txt");
        WalkParser walkParser = new WalkParser();
        try {
            Walk walk = walkParser.parse(f);
            IO.println(walk);
        } catch (WalkParseException e) {
            IO.println("Parse error in line " + e.getErrorRow() +
                    " and column " + e.getErrorCol());
        } catch (IOException e) {
            IO.println("Something went wrong when reading the file.");
            IO.println(e.getMessage());
        }
    }
}