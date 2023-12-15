package ss4_Class_and_Object_in_java;

public class BaiTap3_Build_the_Fan_class {
//    xây dựng lớp quạt
    final int SLOW=1 , MEDIUM=2 , FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public BaiTap3_Build_the_Fan_class(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return on
                ?("\nspeed : " +speed+
                "\nradius : " +radius+
                "\ncolor : " +color+
                "\nFan is ON ! ")

                :("\nradius : " +radius+
                "\ncolor : " +color+
                "\nFan is OFF ! ");
    }

}

class testFan {
    public static void main(String[] args) {
        BaiTap3_Build_the_Fan_class fan1 = new BaiTap3_Build_the_Fan_class(3,false,30,"red");
        BaiTap3_Build_the_Fan_class fan2 = new BaiTap3_Build_the_Fan_class(1,true,30,"blue");
        BaiTap3_Build_the_Fan_class fan3 = new BaiTap3_Build_the_Fan_class(2,false,30,"green");
        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);
    }
}

