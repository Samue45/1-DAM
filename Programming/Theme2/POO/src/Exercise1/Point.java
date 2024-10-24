package Exercise1;

public class Point {

    //Block instance
    private double x,y;


    // A) Constructor methods
    public Point(double x, double y){
        this.x = x;
        this.y = y;

    }

    public Point(Point copy){
        x = copy.x;
        y = copy.y;
    }

    public Point(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY1(double y) {
        this.y = y;
    }


    //B) Method to can show the coordinates
    public String toString(){
        return "Coordinate (x,y) = (" + x + ", " + y +")";
    }

    //C) Return the distance among the origin and the point
    public double calculateOriginDistance(double x, double y){
        Point originPoint = new Point(0,0);
        return calculateDistance(originPoint);
    }

    //D) Return the distance among the one point and another point
    public double calculateDistance(Point point){

        //Block instance
        double radiant1, radiant2, distance ;
        String message;

        //Preview calculation of the radiant
        radiant1 = (x - point.x) * (x - point.x);
        radiant2 = (y - point.y) * (y - point.y);

        //Show ERROR message in case that radiant = 0
        if (radiant1 == 0 || radiant2 == 0) {
            System.out.println(messageError());
        }

        //We use the special formula
        distance = Math.sqrt(radiant1 + radiant2);

        return distance;
    }

    public String messageError(){
        return "ERROR: The radiant give 0 ";
    }

    //E) We are compare the two point
    public boolean pointComparative(Point point1, Point point2){
        return point1.equals(point2);
    }
}
