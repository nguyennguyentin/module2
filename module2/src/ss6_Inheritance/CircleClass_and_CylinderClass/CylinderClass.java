package ss6_Inheritance.CircleClass_and_CylinderClass;

public class CylinderClass extends CircleClass {

    private double height ;

    public CylinderClass() {
        this.radius = 10;
        this.color = "red";
        this.height = 20;

    }

    public CylinderClass(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI*Math.pow(radius,2)*height ;
    }

    @Override
    public String toString() {
        return "CylinderClass{" +
                "height=" + height +
                ", radius=" + radius +
                ", volume=" + getVolume() +
                ", color='" + color + '\'' +
                '}';
    }
}
