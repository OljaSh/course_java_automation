package Lesson1;

public class Point2 {

    public double x1, y1, x2, y2;

    public Point2(double p1, double p2) {
        x1 = p1;
        y1 = p1;
        x2 = p2;
        y2 = p2;
    }

    public double distance() {
        return Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - this.y1) * (this.y2 - this.y1));
    }
}
