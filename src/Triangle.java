public class Triangle {
    Stretch stretchMethods = new Stretch();
    public double strLength(Stretch stretch) {
        return stretch.stretchLength(stretch.getA(), stretch.getB());
    }

    boolean isTraingle(Point A, Point B, Point C) {
        return (sum(A, B, C) && sum(B, C, A) && sum(B, A, C));
    }

    boolean sum(Point A, Point B, Point C) {
        return (stretchMethods.stretchLength(stretchMethods.getA(), B) + stretchMethods.stretchLength(B, C) > stretchMethods.stretchLength(C, B));
    }
}