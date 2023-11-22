package ss1_Introduction_to_java;

import java.util.Scanner;

public class BaiTap1_HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = scanner.nextLine();

        System.out.println("Hello "+name);
    }
}
