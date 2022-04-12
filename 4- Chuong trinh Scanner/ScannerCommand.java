/* Chương trình sử dụng câu lệnh Scanner */
/* Chương trình nhập vào giá trị biến bằng câu lệnh Scanner và in ra mình hình giá trị các phép tính */

import java.util.Scanner;

public class ScannerCommand {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.println("\nNhap vao 2 so a va b: ");

        System.out.print("a: ");
        int a = myScan.nextInt();   //nhập vào số a từ bàn phím

        System.out.print("b: ");
        int b = myScan.nextInt();   //nhập vào số b từ bàn phím

        System.out.println("\nHai so vua nhap la: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int tong = a + b;
        System.out.println("\na + b = " + tong);

        int hieu = a - b;
        System.out.println("a - b = " + hieu);

        int tich = a * b;
        System.out.println("a * b = " + tich);

        int thuong = a / b;
        System.out.println("a / b = " + thuong);

        int chiaLayDu = a % b;
        System.out.println("a % b = " + chiaLayDu);


        boolean check = a == b;
        System.out.println("\na == b: " + check);

        check = a != b;
        System.out.println("a != b: " + check);

        check = a > b;
        System.out.println("a > b: " + check);

        check = a < b;
        System.out.println("a < b: " + check);

        check = a >= b;
        System.out.println("a >= b: " + check);

        check = a <= b;
        System.out.println("a <= b: " + check);

    }
    
}
