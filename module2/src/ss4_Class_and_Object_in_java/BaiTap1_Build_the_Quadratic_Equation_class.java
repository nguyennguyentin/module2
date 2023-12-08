package ss4_Class_and_Object_in_java;

import java.util.Scanner;

public class BaiTap1_Build_the_Quadratic_Equation_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a : ");
        double A = scanner.nextDouble();
        System.out.println("nhap b : ");
        double B = scanner.nextDouble();
        System.out.println("nhap c : ");
        double C = scanner.nextDouble();

        Quadratic quadratic = new Quadratic(A,B,C);
        double delta = quadratic.getDiscriminamt();
        System.out.println("Delta = "+delta);

        if (delta<0){
            System.out.println("phuong trinh vo nghiem");
    }else {
            if (delta ==0){
                System.out.println("phuong trinh co nghiem kep : " +quadratic.getRoot1());
            }else {
                System.out.println("phuong trinh co 2 nghiem la "+quadratic.getRoot1()+" va "+quadratic.getRoot2());
            }
        }
}

 static class Quadratic {
    double a,b,c;

     public Quadratic(double a, double b, double c) {
         this.a = a;
         this.b = b;
         this.c = c;
     }

     public double getA() {
         return a;
     }

     public void setA(double a) {
         this.a = a;
     }

     public double getB() {
         return b;
     }

     public void setB(double b) {
         this.b = b;
     }

     public double getC() {
         return c;
     }

     public void setC(double c) {
         this.c = c;
     }

     double getDiscriminamt(){
         return (Math.pow(b,2)-4*a*c);
     }

     double getRoot1(){
         if (getDiscriminamt()>=0){
             return (-b+Math.sqrt(getDiscriminamt()))/2/a;
         }else
             return 0;
     }

     double getRoot2(){
         if (getDiscriminamt()>=0){
             return (-b-Math.sqrt(getDiscriminamt()))/2/a;
         }else
             return 0;
     }
     }
 }

