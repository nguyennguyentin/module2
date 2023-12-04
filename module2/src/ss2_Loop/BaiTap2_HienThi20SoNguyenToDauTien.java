package ss2_Loop;

public class BaiTap2_HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.println("20 so nguyen to dau : ");
        while (count < 20) {
            if (soNgTo(number)) {
                System.out.println(number);
                count++;
            }
            number++;
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


