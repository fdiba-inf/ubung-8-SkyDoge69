package exercise8;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
       this.x = x;
       this.y = y;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        this.x = input.nextDouble();
        this.y = input.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        this.x += xDelta;
        this.y += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        Point res = new Point(this.x + xDelta, this.y + yDelta);
        return res;
    }

    public boolean equals(Point otherPoint) {
        return (this.x == otherPoint.x && this.y == otherPoint.y);
    }

    public String toString() {
        String res = "(" + this.x + ", " + this.y + ')';
        return res;
    }
}
