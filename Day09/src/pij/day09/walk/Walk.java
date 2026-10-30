package pij.day09.walk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** A Walk object corresponds to a sequence of Point objects. */
public class Walk {
    /** Stores the Points on this Walk in the order that they occur on the Walk. */
    private final List<Point> points;

    /** Constructs a Walk without any Points. */
    public Walk() {
        points = new ArrayList<>();
    }

    /**
     * Extends this Walk by a Point at the coordinates of the given Point.
     *
     * @param p point with the coordinates of the new end point of this Walk
     */
    public void extend(Point p) {
        points.add(new Point(p.getX(), p.getY())); // add a fresh copy of p
    }

    /**
     * Returns the total length of this Walk, as given by the sum of the
     * Euclidean distances from the first Point to the second, the second to
     * the third, ..., and the second-to-last to the last.
     *
     * @return the total length of this Walk
     */
    public double length() {
        if (points.size() < 2) { // escape clause: take care of the easy case(s) first
            return 0;
        }
        // For an ArrayList, we could also use a classic for-loop without
        // losing efficiency, but the approach with an Iterator is more general.
        Iterator<Point> iter = points.iterator();
        double runningTotalDistance = 0;
        // no iter.hasNext() needed here: we know that points has at least 2 elements
        Point previous = iter.next();
        while (iter.hasNext()) {
            Point current = iter.next();
            runningTotalDistance += previous.distance(current);
            previous = current; // current will be previous in the next iteration
        }
        return runningTotalDistance;
    }

    @Override
    public String toString() {
        final String SEPARATOR = " -> "; // goes between the points
        // use a StringBuilder for efficiency
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (Point p : points) {
            // standard idiom for doing something only /between/ two elements
            if (first) {
                first = false;
            } else {
                result.append(SEPARATOR);
            }
            result.append(p); // implicitly calls p.toString()
        }
        return result.toString();
    }
}
