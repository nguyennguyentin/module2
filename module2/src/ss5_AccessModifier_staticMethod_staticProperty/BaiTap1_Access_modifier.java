package ss5_AccessModifier_staticMethod_staticProperty;

import org.w3c.dom.ls.LSOutput;

public class BaiTap1_Access_modifier {

//-------------CIRCLE----------------
    private double radius = 1.0;
    private String color = "red";

    public BaiTap1_Access_modifier() {
    }

    public BaiTap1_Access_modifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI + Math.pow(radius,2);
    }


}
class testCircle{
    public static void main(String[] args) {
        BaiTap1_Access_modifier Circle = new BaiTap1_Access_modifier();

        System.out.println("radius : "+ Circle.getRadius());
        System.out.println("color : "+Circle.getColor());
        System.out.println("area : "+Circle.getArea());
    }
}