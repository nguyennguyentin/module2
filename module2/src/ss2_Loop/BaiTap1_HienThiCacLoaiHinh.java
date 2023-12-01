package ss2_Loop;

import java.util.Scanner;

public class BaiTap1_HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nhap;
        do {
            System.out.println("===HELLO===\n" +
                    "Chon hinh ban muon in:\n" +
                    "1. Hinh chu nhat\n" +
                    "2. Hinh tam giac vuong\n" +
                    "3. Hinh tam giac can\n" +
                    "4. THOAT CHUONG TRINH.\n" +
                    "- Nhap so ban chọn : ");
            nhap = Integer.parseInt(scanner.nextLine());
            boolean dieuKien = true;
//      menu in hinh
            switch (nhap) {
                case 1:
//                    HÌNH CHỮ NHẬT
                    System.out.println("nhap chieu dai hinh chu nhat : ");
                    int dai = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap chieu rong hinh chu nhat : ");
                    int rong = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < dai; i++) {
                        for (int j = 0; j < rong; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
//                    TAM GIÁC VUÔNG
                    System.out.println("nhap chieu cao tam giac : ");
                    int cao = Integer.parseInt(scanner.nextLine());
                    System.out.println("--chon vi trí goc vuong--\n" +
                            "1. Trai-tren\n" +
                            "2. Phai-tren\n" +
                            "3. Trai-dươi\n" +
                            "4. Phai-duoi\n" +
                            "=>Chon : ");
                    int chon = Integer.parseInt(scanner.nextLine());
                    switch (chon){
                        case 1:
//                            TRAI - TREN
                            for (int i = 0; i < cao; i++) {
                                for (int j = i; j < cao; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
//                            PHAI - TREN
                            for (int i = 0; i < cao; i++) {
                                for (int j = 0; j < i ; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = i; j < cao ; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
//                            TRAI - DUOI
                            for (int i = 0; i < cao; i++) {
                                for (int j = 0 ; j <i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
//                            PHAI - DUOI
                            for (int i = 0; i < cao; i++) {
                                for (int j = i; j < cao ; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = 0; j < i ; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Error!!!");
                    }
                    break;
                case 3:
//                    TAM GIAC CAN
                    System.out.println("nhap chieu cao tam giac can : ");
                    int caoTGC = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < caoTGC; i++) {
                        for (int j = caoTGC - 1; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < 2 * i + 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Thoát Chương Trình !");
                    break;
                default:
                    System.out.println("nhâp sai. xin mời nhâp lại .\n\n");
            }
            System.out.println("=============================================================================================");
        }while ( nhap != 4);
    }
    }

