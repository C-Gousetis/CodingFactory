package gr.aueb.cf.ch15;

public class Point {

    private  int x;

    public Point() {}

    public int getX() {
        return x;
    }

    public Point(int x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

//    public String covertToString() {
//        return "(" + x + ")";
//    }

//    public String convertToString() {
//        return null;
//    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }

    protected void movePlusOne() {
        x += 1;
    }

    public void movePlus10() {
//        x += 10;

        // self-use
        for (int i = 1; i <= 10; i++) {
            movePlusOne();
        }
    }

    private void reset() {
        x = 0;
    }
}
