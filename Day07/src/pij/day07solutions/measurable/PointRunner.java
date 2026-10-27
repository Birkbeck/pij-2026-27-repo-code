package pij.day07solutions.measurable;

/**
 * Exercise 5.
 */
public class PointRunner {
    static void main() {
        Point p = new Point(3, 4);

        // ok, method getMeasure() exists in class Point
        IO.println( p.getMeasure() );

        // ok, method getX() exists in class Point
        IO.println( p.getX() );

        // ok, implicit upcasting from Point to Measurable
        Measurable m = p;

        // ok, method getMeasure() exists in type Measurable
        IO.println( m.getMeasure() );

        // The following line is commented out because method getX() does
        // *not* exist in type Measurable (the compiler looks at the type
        // of the reference m; it does not know the content it might have
        // at runtime).
        //IO.println( m.getX() );

    }
}
