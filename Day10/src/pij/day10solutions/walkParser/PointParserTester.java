package pij.day10solutions.walkParser;

import pij.day10.walkParser.Point;

/**
 * Day 10, Exercise 7.
 * Driver class for PointParser. Tries to parse legal and illegal inputs.
 */
public class PointParserTester {

    /**
     * Parses and prints the given String that presumably represents a Point.
     * If parsing fails, prints an error message indicating the location at
     * which parsing failed.
     *
     * @param pointParser the parser to use
     * @param s the String that we try to parse
     */
    public static void tryToParse(PointParser pointParser, String s) {
        try {
            Point p = pointParser.parse(s);
            IO.println("Point parsed: " + p);
        } catch (PointParseException e) {
            IO.println("Parsing " + s + " failed at index " + e.getErrorIndex());
        }
    }

    static void main() {
        PointParser pointParser = new PointParser();
        tryToParse(pointParser, "(42,-523)"); // legal
        tryToParse(pointParser, "(1,2))"); // illegal
        tryToParse(pointParser, "(1,)"); // illegal
    }
}
