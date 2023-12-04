package ss2_Loop;

public class BaiTap3_HienThiSoNguyenToDuoi100 {
    public static void main(String[] args) {
        System.out.println("cac so nguyen to nho hon 100 : ");
        for (int i = 2 ; i<100 ; i++ ){
            if (soNgTo(i)) {
                System.out.println(i);
            }
        }

    }
    public static boolean soNgTo (int number) {
        boolean soNgTo = true;
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number%i==0) {
                soNgTo = false;
                break;
            }
        }
        return  soNgTo;
    }

}
