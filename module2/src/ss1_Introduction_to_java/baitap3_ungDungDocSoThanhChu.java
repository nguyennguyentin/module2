package ss1_Introduction_to_java;

import java.util.Scanner;

public class baitap3_ungDungDocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("nhap so nguyen khong am (0-999) :");
        Scanner scanner = new Scanner(System.in);
        int soNguyen = Integer.parseInt(scanner.nextLine());

        if (soNguyen<0 || soNguyen>999){
            System.out.println("khong nam trong kha nang doc");
        }else {
            String doc = hamDoc(soNguyen);
            System.out.println("thanh chu : " +
                    doc);
        }
    }

    // ham doc
    public static String hamDoc(int so) {
        if(so==0){
            return "Zero";
        }

        String chu = "";

        //hang tram
        if (so>99){
            chu += tu1Den9(so/100)+" hundred";
            so %= 100;

            if(so>0){
                chu += " and ";
            }
        }

        // hang chuc va hang don vi
        if (so>9 && so<20){
            chu += soTeen(so);
        }else {
            chu += soHangChuc(so/10);
            so %= 10;

            if(so>0){
                chu += " " +
                        tu1Den9(so);
            }
        }
        return chu;

    }


    public static String tu1Den9(int donVi) {
        switch (donVi) {
            case 1:
                return ("One");
            case 2:
                return ("Two");
            case 3:
                return ("Three");
            case 4:
                return ("Four");
            case 5:
                return ("Five");
            case 6:
                return ("Six");
            case 7:
                return ("Seven");
            case 8:
                return ("Eight");
            case 9:
                return ("Nine");
            default:
                return (" ");
        }

    }
    public static String soTeen (int teen){
        switch (teen){
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            default:
                return " ";
        }
    }

    public static String soHangChuc(int hangChuc) {
        switch (hangChuc) {
            case 2:
                return ("Twety");
            case 3:
                return ("Thirty");
            case 4:
                return ("Forty");
            case 5:
                return ("Fifty");
            case 6:
                return ("Sixty");
            case 7:
                return ("Seventy");
            case 8:
                return ("Eighty");
            case 9:
                return ("Ninety");
            default:
                return (" ");
        }

    }

}


