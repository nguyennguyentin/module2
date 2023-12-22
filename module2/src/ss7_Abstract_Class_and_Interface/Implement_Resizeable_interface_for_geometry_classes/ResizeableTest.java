package ss7_Abstract_Class_and_Interface.Implement_Resizeable_interface_for_geometry_classes;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
//        trước khi thay đổi kích thước
        System.out.println("\nradius = " + circle.getRadius() +
                "\narea = "+ circle.getArea()+
                "\nperimeter = "+ circle.getPerimeter());
//        sau khi thay đổi kích thước
        circle.resize(10);
        System.out.println("\nradius = " + circle.getRadius() +
                "\narea = "+ circle.getArea()+
                "\nperimeter = "+ circle.getPerimeter());

        System.out.println("\n======================================================");

        Rectangle rectangle = new Rectangle();
//        trước khi thay đổi kích thước
        System.out.println("\nwidth = " + rectangle.getWidth() +
                "\nlength = "+rectangle.getLength()+
                "\narea = "+ rectangle.getArea()+
                "\nperimeter = "+ rectangle.getPerimeter());
//        sau khi thay đổi kích thước
        rectangle.resize(30);
        System.out.println("\nwidth = " + rectangle.getWidth() +
                "\nlength = "+rectangle.getLength()+
                "\narea = "+ rectangle.getArea()+
                "\nperimeter = "+ rectangle.getPerimeter());

        System.out.println("\n======================================================");

        square square = new square();
//        trước khi thay đổi kích thước
        System.out.println("\nside = " + square.getSide() +
                "\narea = "+ square.getArea()+
                "\nperimeter = "+ square.getPerimeter());
//        sau khi thay đổi kích thước
        square.resize(3.5);
        System.out.println("\nside = " + square.getSide() +
                "\narea = "+ square.getArea()+
                "\nperimeter = "+ square.getPerimeter());
    }
}
