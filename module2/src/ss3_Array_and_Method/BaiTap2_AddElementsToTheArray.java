package ss3_Array_and_Method;

import java.util.Scanner;

public class BaiTap2_AddElementsToTheArray {
    public static void main(String[] args) {
        int array[] = new int[10];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=6;
        System.out.println("mang chua chen : ");
        for (int x:array) {
            System.out.println(x+"  ");
        }

//        chen phantu vao mang
        System.out.println("nhap phan tu muon chen : ");
        Scanner scanner = new Scanner(System.in);
        int elament =  Integer.parseInt(scanner.nextLine());

        System.out.println("nhap vi tri phan tu muon chen (-1<index<10) : ");
        int indexElament =  Integer.parseInt(scanner.nextLine());

        if(indexElament<-1 && indexElament>array.length){
            System.out.println("khong the chen phan tu vao vi tri nay!");
        }else {
            for (int i = 0; i < array.length; i++) {
                if(indexElament == i){
                    for (int j = array.length-1; j > i ; j--) {
                        array[j]=array[j-1];
                    }
                    array[i]=elament;
                }
            }
        }

        System.out.println("mang da chen : ");
        for (int x:array) {
            System.out.println(x+"  ");
        }
        }
    }

