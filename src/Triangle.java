public class Triangle {

    public double strLength(Stretch stretch) {
        return stretchLength(stretch.getA(), stretch.getB());
    }
    public double stretchLength(Point pointB, Point pointA) {
        return Math.sqrt(square(pointB.getX() - pointA.getX()) + square(pointB.getY() - pointA.getY()));
    }

    void isTraingle(Point A, Point B, Point C) {
        if ((isGreater(A, B, C) && isGreater(B, C, A) && isGreater(B, A, C))) {
            System.out.println("Points form a triangle");
        } else {
            System.out.println("Points don't form triangle");
        }
    }

    boolean isGreater(Point A, Point B, Point C) {
        return (stretchLength2(A, B) + stretchLength2(B, C) > stretchLength2(C, A));
    }


    public double stretchLength2(Point A, Point B) {
        return Math.sqrt(square(B.getX() - A.getX()) + square(B.getY() - A.getY()));
    }

    double square(double a) {
        return a * a;
    }


}