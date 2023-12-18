package ss6_Inheritance.Point2D_and_Point3D;

public class checkPointClass {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(2.3F, 4);

        Point3D point3D = new Point3D();
        Point3D point3D1 = new Point3D(3.4F,6, 4.5F);

        System.out.println(point2D);
        System.out.println(point2D1);
        System.out.println(point3D);
        System.out.println(point3D1);
    }
}
