package ss3_Array_and_Method;

import java.util.Scanner;

public class BaiTap1_RemoveElementsFromTheArray {
    public static void main(String[] args) {
        int soNguyen[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("mang chua xoa : ");
        for (int x :soNguyen){
            System.out.print(x+"  ");
        }
        // duyet xoa phan tu
        System.out.println("\nnhap gia tri muon xoa : ");
        Scanner scanner = new Scanner(System.in);
        int element = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < soNguyen.length; i++) {
            if(soNguyen[i]==element){
                for (int j = i; j < soNguyen.length -1 ; j++) {
                    if(i< soNguyen.length - 1){
                        soNguyen[i]=soNguyen[i+1];
                    }else {
                        soNguyen[i]=0;
                    }
                }
            }
        }
        System.out.println("mang da xoa : ");
        for (int x :soNguyen){
            System.out.print(x+"  ");
        }
    }
}
