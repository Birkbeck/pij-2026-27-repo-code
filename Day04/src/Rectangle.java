public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width  = width;
    }

    // This constructor creates a square, all sides equal
    public Rectangle(int length) {
        this(length, length);
    }
}
