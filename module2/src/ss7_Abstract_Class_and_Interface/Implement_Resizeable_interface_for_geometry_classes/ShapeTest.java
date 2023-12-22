package ss7_Abstract_Class_and_Interface.Implement_Resizeable_interface_for_geometry_classes;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
