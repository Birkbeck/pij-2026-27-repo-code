package pij.day10solutions.temperatures;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Day 10, Exercise 8.
 * Driver class for IntCSVParser.
 */
public class IntCSVParserTester {

    static void main() {
        //IO.println(f.getAbsolutePath());
        File f = new File("Day10/src/pij/day10/temperatures/temperaturesOk1.csv");
        //File f = new File("Day10/src/pij/day10/temperatures/temperaturesOk2.csv");
        //File f = new File("Day10/src/pij/day10/temperatures/temperaturesNotOk1.csv");
        //File f = new File("Day10/src/pij/day10/temperatures/temperaturesNotOk2.csv");
        IntCSVParser intCSVParser = new IntCSVParser();
        try {
            List<List<Integer>> matrix = intCSVParser.parse(f);
            IO.println(matrix);
        } catch (IntCSVParseException e) {
            IO.println("Parse error in line " + e.getErrorRow() +
                    " and column " + e.getErrorCol());
        } catch (IOException e) {
            IO.println("Something went wrong when reading the file.");
            IO.println(e.getMessage());
        }
    }
}