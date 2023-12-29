package ss7_Abstract_Class_and_Interface.implements_the_Colorable_interface_for_geometry_classes;
import ss7_Abstract_Class_and_Interface.Implement_Resizeable_interface_for_geometry_classes.square;
public class testColorable {
    public static void main(String[] args) {
        square square = new square();
        System.out.println(square+
                "\ncolorable: "+square.howToColor("Color all four sides") );

    }
}
