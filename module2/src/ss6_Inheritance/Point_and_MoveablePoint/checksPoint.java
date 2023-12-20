package ss6_Inheritance.Point_and_MoveablePoint;

public class checksPoint {
    public static void main(String[] args) {
        Point point = new Point();
        Point point1 = new Point(9.0f,5.4f);

        MoveablePoint moveablePoint = new MoveablePoint();
        MoveablePoint moveablePoint1 = new MoveablePoint(1,2,0.4f,5.5f);
        MoveablePoint moveablePoint2 = new MoveablePoint(1,2);

        System.out.println(point);
        System.out.println(point1);

        System.out.println(moveablePoint);
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint2);

        moveablePoint1.move();
        System.out.println(moveablePoint1.getX()+", "+moveablePoint1.getY());


    }
}
