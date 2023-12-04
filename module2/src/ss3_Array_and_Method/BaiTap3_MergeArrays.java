package ss3_Array_and_Method;

public class BaiTap3_MergeArrays {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1[0]=1;
        array1[1]=3;
        array1[2]=5;
        array1[3]=7;
        array1[4]=9;
        array1[5]=11;
        array1[6]=13;
        array1[7]=15;
        array1[8]=17;
        array1[9]=19;
        System.out.println("kick thuoc array1 : "+array1.length);
        for (int x:array1) {
            System.out.print(x+"  ");
        }
        System.out.println("\n");

        int[] array2 = new int[10];
        array2[0]=2;
        array2[1]=4;
        array2[2]=6;
        array2[3]=8;
        array2[4]=10;
        array2[5]=12;
        array2[6]=14;
        array2[7]=16;
        array2[8]=18;
        array2[9]=20;
        System.out.println("kick thuoc array2 : "+array2.length);
        for (int x:array2) {
            System.out.print(x+"  ");
        }
        System.out.println("\n");


        int[] array3 = new int[array1.length+ array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        for (int i = array1.length; i < array1.length+ array2.length ; i++) {
            array3[i]=array2[i- array1.length];
        }
        System.out.println("kick thuoc array3 : "+array3.length);
        for (int x:array3) {
            System.out.print(x+"  ");
        }
        System.out.println("\n");

    }

}
