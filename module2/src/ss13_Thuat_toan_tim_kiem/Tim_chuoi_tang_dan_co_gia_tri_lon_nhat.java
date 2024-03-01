package ss13_Thuat_toan_tim_kiem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tim_chuoi_tang_dan_co_gia_tri_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chuoi : ");
        String string = scanner.nextLine();

        List<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            List<Character> temp = new LinkedList<>();

            temp.add(string.charAt(i));

            for (int j = i+1; j < string.length() ; j++) {
                if(string.charAt(j)>temp.getLast()){
                    temp.add(string.charAt(j));
                }
            }
            if(temp.size()>max.size()){
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }

        System.out.println("chuoi lon nhat la : " );
        for(Character i : max){
            System.out.print(i);
        }
    }
}
