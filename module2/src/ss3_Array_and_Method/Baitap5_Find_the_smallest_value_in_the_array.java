package ss3_Array_and_Method;

public class Baitap5_Find_the_smallest_value_in_the_array {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=6;
        array[6]=7;
        array[7]=8;
        array[8]=9;
        array[9]=0;

//        in mang
        for (int x : array
             ) {
            System.out.println(array[x]);
        }

//        tim so nho nhat
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.print("phan tu nho nhat la: "+min);
    }
}
