package ss7_Abstract_Class_and_Interface.Implement_Resizeable_interface_for_geometry_classes;

public class square extends Shape implements Resizeable {

    private double side = 1;

    public square() {
    }

    public square(double side) {
        this.side = side;
    }

    public square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * percent / 100);
    }
}
