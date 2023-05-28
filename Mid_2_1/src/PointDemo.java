class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class PointDemo {
    void resetPoint1(Point p) {
        p = new Point(0, 0);

    }

    void resetPoint2(Point p) {
        p.x = 0;
        p.y = 0;
    }

public static void main(String[] args) {
    Point p1 = new Point(3, 5);
    Point p2 = new Point(10, 15);
    PointDemo demo = new PointDemo();
    demo.resetPoint1(p1);
    System.out.println("(" + p1.x + ", " + p1.y + ")");
    demo.resetPoint2(p2);
    System.out.println("(" + p2.x + ", " + p2.y + ")");
    p2 = new Point(9, 9);
}
}
