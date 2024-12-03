package Programming.Unit1.Theme2.POO.src.Exercise1;

public class Point {

    // Block instance
    private double x, y;

    // A) Constructor methods
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point copy) {
        this.x = copy.x;
        this.y = copy.y;
    }

    public Point() {}

    // Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to show the coordinates
    public String toString() {
        return "Coordinate (x,y) = (" + x + ", " + y + ")";
    }

    // Return the distance between two points
    public double calculateDistance(Point other) {
        double radiant1 = (this.x - other.x) * (this.x - other.x);
        double radiant2 = (this.y - other.y) * (this.y - other.y);
        return Math.sqrt(radiant1 + radiant2);
    }

    // Override equals method to compare two points
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return Double.compare(other.x, x) == 0 && Double.compare(other.y, y) == 0;
    }
}
