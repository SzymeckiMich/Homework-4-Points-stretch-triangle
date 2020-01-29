public class Point {
    private double x, y;

    public Point() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    boolean isPointInI(Point point) {
        return ((this.x > 0) && (this.y > 0));
    }

    boolean isPointInII(Point point) {
        return ((point.x < 0) && (point.y > 0));
    }

    boolean isPointInIII(Point point) {
        return ((point.x < 0) && (point.y < 0));
    }

    boolean isPointInIV(Point point) {
        return ((point.x > 0) && (point.y < 0));
    }

    boolean isPointOnOX(Point point) {
        return (point.y == 0);
    }

    boolean isPointOnOY(Point point) {
        return (point.x == 0);
    }

    boolean isPointOn0(Point point) {
        return ((point.y == 0) && (point.x == 0));
    }
}