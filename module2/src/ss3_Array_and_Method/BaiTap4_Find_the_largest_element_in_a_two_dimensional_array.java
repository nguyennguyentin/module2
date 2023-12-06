package ss3_Array_and_Method;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class BaiTap4_Find_the_largest_element_in_a_two_dimensional_array {


//    tim số lớn nhất trong mảng 2 chiều
public static void main(String[] args) {

    int row=4;
    int cold=4;


    int[][] array2D = new int[row][cold];
    array2D[0][0]=1;
    array2D[0][1]=2;
    array2D[0][2]=3;
    array2D[0][3]=4;

    array2D[1][0]=5;
    array2D[1][1]=6;
    array2D[1][2]=7;
    array2D[1][3]=8;

    array2D[2][0]=9;
    array2D[2][1]=10;
    array2D[2][2]=11;
    array2D[2][3]=12;

    array2D[3][0]=13;
    array2D[3][1]=14;
    array2D[3][2]=15;
    array2D[3][3]=16;

//    in mang
    for (int [] x :array2D) {
        for (int y : x ) {
            System.out.print(y+ " ");
        }
        System.out.println();
    }

//    tìm số lớn nhất
    System.out.println();
    System.out.print("số lớn nhất trong mảng là : ");
    int max = array2D[0][0];
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < cold; j++) {
            if(array2D[i][j] > max){
                max=array2D[i][j];
            }
        }
    }
    System.out.print(max);
}
}
