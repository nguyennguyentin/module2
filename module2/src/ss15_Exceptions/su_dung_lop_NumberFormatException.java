package ss15_Exceptions;

import java.util.Scanner;

public class su_dung_lop_NumberFormatException {

    public static void inputCal() {
        Scanner scanner = new Scanner(System.in);
        int y = 0;
        int x = 0;
        try {
            System.out.println("nhap du lieu: ");
            System.out.print("x= ");
            x = Integer.parseInt(scanner.nextLine());
            System.out.print("y= ");
            y = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("bạn đã nhập vào ký tự ko phải số !");
            System.out.println("=========================================================");
            System.out.println("Vui lòng nhập lại !");
            inputCal();
        }
        cal(x, y);
    }

    public static void cal(int x , int y) {
        try{
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("x+y = " + x + "+" +y + "=" + a);
            System.out.println("x-y = " + x + "-" +y + "=" + b);
            System.out.println("x*y = " + x + "*" +y + "=" + c);
            System.out.println("x/y = " + x + "/" +y + "=" + d);
        }catch (Exception e){
            System.out.println("sảy ra ngoại lệ : "+ e.getMessage());
        }

    }

    public static void main(String[] args) {
        inputCal();
    }
}
