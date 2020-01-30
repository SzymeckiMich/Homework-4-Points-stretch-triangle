public class Triangle {
    Stretch stretchMethods = new Stretch();

    public double strLength(Stretch stretch) {
        return stretch.stretchLength(stretch.getA(), stretch.getB());
    }

    boolean isTraingle(Point A, Point B, Point C) {
        return (isGreater(A, B, C) && isGreater(B, C, A) && isGreater(B, A, C));
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