package pij.day08.point;

import pij.day06.point.Point;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * This script stores instances of class Points in various Collections
 * and checks whether they are retrieved correctly.
 */
public class PointTester {
    static void main() {
        IO.println("==== Exercise 5.1 ====");

        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        IO.println("p1.equals(p2): expected true; actual " + p1.equals(p2));
        List<Point> list = new ArrayList<>();
        list.add(p1);
        IO.println("list.contains(p2): expected true; actual " + list.contains(p2));

        IO.println("\n==== Exercise 5.2 ====");

        Set<Point> set1 = new LinkedHashSet<>();
        set1.add(p1);
        IO.println("set1.contains(p2): expected true; actual " + set1.contains(p2));

        IO.println("\n==== Exercise 5.3 ====");

        Set<Point> set2 = new TreeSet<>();
        set2.add(p1);
        IO.println("set2.contains(p2): expected true; actual " + set2.contains(p2));

        IO.println("\n==== Exercise 5.4 ====");

        // add some further entries to set2
        set2.add(new Point(7, 8));
        set2.add(new Point(8, 9));

        Point p3 = new Point(11, 12);
        p1.moveTo(p3); // mutates p1 while it is in list/set1/set2

        IO.println("After p1.moveTo(p3): list.contains(p1) is " + list.contains(p1));
        IO.println("After p1.moveTo(p3): list.contains(p2) is " + list.contains(p2));
        IO.println("After p1.moveTo(p3): list.contains(p3) is " + list.contains(p3));

        IO.println("After p1.moveTo(p3): set1.contains(p1) is " + set1.contains(p1));
        IO.println("After p1.moveTo(p3): set1.contains(p2) is " + set1.contains(p2));
        IO.println("After p1.moveTo(p3): set1.contains(p3) is " + set1.contains(p3));

        IO.println("After p1.moveTo(p3): set2.contains(p1) is " + set2.contains(p1));
        IO.println("After p1.moveTo(p3): set2.contains(p2) is " + set2.contains(p2));
        IO.println("After p1.moveTo(p3): set2.contains(p3) is " + set2.contains(p3));
    }
}
