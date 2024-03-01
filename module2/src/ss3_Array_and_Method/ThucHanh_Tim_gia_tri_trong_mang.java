package ss3_Array_and_Method;

import java.util.Scanner;

public class ThucHanh_Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String students[]= {"Thai", "Tin","Lam","Phuong","Anh","Dao","Tu","Phuc"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten ban muon tim : ");
        String search = scanner.nextLine();
        boolean timThay = false;
        int viTri = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(search) ){
                viTri = i;
                timThay = true;
                break;
            }
        }
        if(viTri!=0) {
            System.out.println("giá trị " + search + " bạn cần tìm nằm ở vị trí thứ " + viTri);
        }else {
            System.out.println("ko tìm thấy giá tri");
    }
}
}
