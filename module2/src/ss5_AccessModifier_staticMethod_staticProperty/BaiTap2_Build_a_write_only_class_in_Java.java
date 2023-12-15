package ss5_AccessModifier_staticMethod_staticProperty;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BaiTap2_Build_a_write_only_class_in_Java {
    private String name = "Join";
    private String classes = "C02";

    public BaiTap2_Build_a_write_only_class_in_Java() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "BaiTap2_Build_a_write_only_class_in_Java{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {

        BaiTap2_Build_a_write_only_class_in_Java Student = new BaiTap2_Build_a_write_only_class_in_Java();
        BaiTap2_Build_a_write_only_class_in_Java Student1 = new BaiTap2_Build_a_write_only_class_in_Java();
        BaiTap2_Build_a_write_only_class_in_Java Student2 = new BaiTap2_Build_a_write_only_class_in_Java();
        System.out.println(Student);
        System.out.println(Student1);
        System.out.println(Student2);
        System.out.println("\n");

        Student1.setName("Jame"); Student1.setClasses("C03");
        Student2.setName("bod"); Student2.setClasses("C04");
        System.out.println(Student);
        System.out.println(Student1);
        System.out.println(Student2);

    }

}
