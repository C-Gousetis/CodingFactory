package gr.aueb.cf.ch15;

public class Point2DNew {

    private Point point;
    private int y;

    public Point2DNew() {}

    public Point2DNew(Point point, int y) {
        this.point = point;
        this.y = y;
    }

    public void movePlus10() {
        point.movePlus10();
        y += 10;
    }

    public void movePlusOne() {
        point.movePlusOne();
        y += 1;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
