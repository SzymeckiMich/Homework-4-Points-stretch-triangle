public class Test {
    public static void main(String[] args) {
        ShowInfo showInfo = new ShowInfo();
        Triangle triangle = new Triangle();
        Stretch stretch = new Stretch();
        Stretch stretch1 = new Stretch();
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        point1.setXY(0, 0);
        point2.setXY(20, 0);
        point3.setXY(0, 8);
        stretch.setA(point1);
        stretch.setB(point2);
        stretch1.setA(point1);
        stretch1.setB(point3);

//        showInfo.showInfo(point2);
        System.out.println("Length of the stretch formed from point2 and poind3 = " + triangle.strLength(stretch));
        System.out.println(triangle.strLength(stretch1));
//        triangle.isTraingle(point1, point2, point3);

    }
}

