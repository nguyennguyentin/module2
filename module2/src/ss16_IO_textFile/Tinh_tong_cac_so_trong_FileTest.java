package ss16_IO_textFile;

import java.io.*;

public class Tinh_tong_cac_so_trong_FileTest {
    static final String FILE_PATH = "E:\\module2\\module2\\src\\ss16_IO_textFile\\file1.csv";

    static void fileW() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH));
        bufferedWriter.write(Integer.toString(1));
        bufferedWriter.newLine();
        bufferedWriter.write(Integer.toString(2));
        bufferedWriter.newLine();
        bufferedWriter.write(Integer.toString(3));
        bufferedWriter.newLine();
        bufferedWriter.write(Integer.toString(4));
        bufferedWriter.newLine();
        bufferedWriter.write(Integer.toString(5 ));
        bufferedWriter.close();
    }
    static void fileR() throws IOException {
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            System.out.println("tong = " + sum);
        } catch (IOException e) {
            System.out.println("lỗi nhập xuất file!");
        }catch (Exception e){
            System.out.println("sảy ra lỗi ko xác định!");
        }

    }

    public static void main(String[] args) throws IOException {
//        fileW();
        fileR();
    }
}
