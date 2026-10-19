public class PointTester {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        System.out.println("The point is now at " + point.getX() + "," + point.getY());
        Point remotePoint = new Point(10,20);
        point.moveTo(remotePoint);
        System.out.println("The point is now at " + point.getX() + "," + point.getY());
    }
}
