package pij.day13.triangle;

/**
 * Driver class to exercise class Triangle.
 */
public class TriangleDriver {

    /**
     * Creates a Triangle, computes its area, and prints the area
     * on the screen.
     */
    static void main() {
        Triangle t = new Triangle(4);
        int area = t.getArea();
        IO.println("Triangle has area " + area);
    }
}
