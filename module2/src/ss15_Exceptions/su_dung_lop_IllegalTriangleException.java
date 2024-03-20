package ss15_Exceptions;

import java.util.Scanner;

class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String masseger){
        super(masseger);
    }
}
public class    su_dung_lop_IllegalTriangleException {
    public static void main(String[] args) {
        input();
    }
    public static void input()  {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhập 3 cạnh tam giác :");
            System.out.print("a= ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("b= ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.print("c= ");
            int c = Integer.parseInt(scanner.nextLine());

            tamgiac(a,b,c);

            System.out.println("có thể tạo tam giac thanh công");
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai dữ liệu truyền vào! \ndữ liệu bạn nhập không phải sô!");
            System.out.println("==================================================================");
            System.out.println("mời bạn nhập lại !");
            input();
        }catch (IllegalTriangleException e){
            System.out.println("lỗi sảy ra : " + e.getMessage());
            System.out.println("==================================================================");
            System.out.println("mời bạn nhập lại !");
            input();
        }

    }

    public static void tamgiac(int a, int b,int c) throws IllegalTriangleException{
        if (a<=0 || b<=0 || c<=0) {
            throw new IllegalTriangleException("độ dài cạnh không đc bé hơn hoặc bằng 0 !");

        }

        if(a+b<=c || a+c<=b || c+b<=a ){
            throw new IllegalTriangleException("không thể tạo tam giác với các cạnh đã cho!\nTổng 2 cạnh bắt buộc phải lớn hơn cạnh còn lại");
        }

    }

}

