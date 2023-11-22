package ss1_Introduction_to_java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BaiTap2_ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien can chuyen doi (USD) :" );
        usd = Double.parseDouble(scanner.nextLine());
        double quyDoi = usd * 23000 ;
        System.out.println("bang : "+quyDoi+" VND");
    }

}
