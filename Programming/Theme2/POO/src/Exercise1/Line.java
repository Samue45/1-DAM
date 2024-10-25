package Exercise1;

public class Line {


    // Block instance
    private Point point1;
    private Point point2;

    // Constructor method
    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    // Getters and Setters
    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    // Method to show the points of the line
    public String toString() {
        return "Point 1 = " + getPoint1() + ", Point 2 = " + getPoint2();
    }

    // Calculate the length of the line
    public double calculateLength(Point point2) {
        return point1.calculateDistance(point2);
    }
}
