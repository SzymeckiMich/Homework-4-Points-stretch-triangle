public class Test {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        point1.setXY(0, 0);
        point2.setXY(-1, 1);
        point3.setXY(0,3);
        Triangle triangle = new Triangle();
        Stretch stretch = new Stretch();
        stretch.setA(point1);
        stretch.setB(point2);


        System.out.println(triangle.strLength(stretch));
        System.out.println(triangle.stretchLength2(point1, point2));
        System.out.println(triangle.isTraingle(point1, point2, point3)); }
}
