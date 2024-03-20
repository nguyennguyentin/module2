package ss15_Exceptions;

import java.util.Random;
import java.util.Scanner;

public class su_dung_lop_ArrayIndexOutOfBoundsException {
    public static Integer [] arrayRandom = new Integer[100];

    static {
        Random random = new Random();
        System.out.println("Random Number Array :" );
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i]= random.nextInt();
            System.out.println("array["+i+"] = "+ arrayRandom[i]);
        }
    }
    public static void search (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap index ban muon tra : ");
        int index = scanner.nextInt();

        try{
                    System.out.println("phần tử ở vị trí "+index+" bạn muốn tìm là => "+arrayRandom[index]);


        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("không tồn tại phần tử bạn muốn tìm \n chỉ số vượt quá giới hạn của mảng");
            System.out.println("YÊU CẦU NHẬP LẠI !");
            search();
        }
    }

    public static void main(String[] args) {
        search();
    }
}
