package ss7_Abstract_Class_and_Interface.Implement_Resizeable_interface_for_geometry_classes;

public class squareTest {
    public static void main(String[] args) {
        square square = new square();
        square square1 = new square(3.5);
        square square2 = new square("red",true,2.5);

        System.out.println(square);
        System.out.println(square1);
        System.out.println(square2);
    }



}
