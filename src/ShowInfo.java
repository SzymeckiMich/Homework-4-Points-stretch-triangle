public class ShowInfo {
    Point pointMethods = new Point();

    void showInfo(Point point) {
        System.out.println("Is point on OX: " + point.isPointOnOX(point) + "\n" +
                "Is point on OY: " + point.isPointOnOY(point) + "\n" +
                "Is point in the center: " + point.isPointOn0(point) + "\n" +
                "Is point on first quarter: " + point.isPointInI(point) + "\n" +
                "Is point on second quarter: " + point.isPointInII(point) + "\n" +
                "Is point on third quarter: " + point.isPointInIII(point) + "\n" +
                "Is point on fourth quarter: " + point.isPointInIV(point) + "\n"
        );

    }

}
