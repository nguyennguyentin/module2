package ss6_Inheritance.CircleClass_and_CylinderClass;

public class testClass {
    public static void main(String[] args) {
        CircleClass circle = new CircleClass(3.5,"blue");
        CircleClass circle1 = new CircleClass();
        CylinderClass cylinder = new CylinderClass(3.5,"yellow",7);
        CylinderClass cylinder1 = new CylinderClass();

        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(cylinder);
        System.out.println(cylinder1);
    }
}
