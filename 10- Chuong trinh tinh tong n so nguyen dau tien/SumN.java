/* Chương trình sử dụng vòng lặp for */
/* Chương trình nhập vào số n và tính tổng các số từ 1 đến n */

import java.util.Scanner;

public class SumN {

    public static void main(String[] args) {
    
        int sum = 0;

        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap so n: ");
        int n = myScan.nextInt();   // nhập vào số n từ bàn phím

        System.out.println("sum = " + sum);

        for (int i = 1; i <= n; i++) {

            sum += i;   // sum = sum + i;

            System.out.println("sum = sum + i = " + (sum-i) + " + " + i + " = " + sum);

        }

        System.out.println("\nTong cac so tu 1 den n: " + sum);

    }

}
