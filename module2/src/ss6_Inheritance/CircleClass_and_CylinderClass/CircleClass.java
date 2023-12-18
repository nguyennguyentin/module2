package ss6_Inheritance.CircleClass_and_CylinderClass;

public class CircleClass {
    public double radius ;
    public String color;

    public CircleClass() {
        this.radius = 10;
        this.color = "red";
    }

    public CircleClass(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2) ;
    }

    @Override
    public String toString() {
        return "CircleClass{" +
                "radius=" + radius +
                ", Area=" + getArea() +
                ", color='" + color + '\'' +
                '}';
    }
}
