import Exercise1.Line;
import Exercise1.Point;

public class Main {
    public static void main(String[] args) {


        Point point1 = new Point(8,0);
        Point point2 = new Point(5,0);
        Line line1 = new Line(point1,point2);

        System.out.println(line1.calculateLength(point2));

    }

}