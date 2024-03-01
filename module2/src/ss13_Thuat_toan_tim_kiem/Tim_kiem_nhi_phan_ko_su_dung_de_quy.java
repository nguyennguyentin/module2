package ss13_Thuat_toan_tim_kiem;

import java.util.*;

public class Tim_kiem_nhi_phan_ko_su_dung_de_quy {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập số nguyên vào mảng (nhập '-1' để kết thúc) : ");
            Integer input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }
            list.add(input);
        }

        System.out.println("Mảng bạn đã nhập : " + list);
        Collections.sort(list);
        System.out.println("Mảng bạn đã sắp xếp : " + list);

        System.out.println("nhập số bạn cần tìm : ");
        int searchInput = Integer.parseInt(scanner.nextLine());
        int search = Collections.binarySearch(list, searchInput);
        int index=-1;
        if(search>0) {
            index = search + 1;
            System.out.println("kết quả : " + index);
        }else {
            System.out.println("không tồn tại kết quả bạn cần tìm !");
        }
    }
}
