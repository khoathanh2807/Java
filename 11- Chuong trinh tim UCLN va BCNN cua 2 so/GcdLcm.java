/* Chương trình sử dụng vòng lặp for và while */
/* Chương trình nhập vào 2 số a, b và in ra UCLN (gcd) và BCNN (lcm) của 2 số này */

import java.util.Scanner;

public class GcdLcm {

    public static void main(String[] args) {
        
        int temp;
        int lcm;

        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap so a: ");
        int a = myScan.nextInt();   // nhập vào số a từ bàn phím
        
        System.out.print("Nhap so b: ");
        int b = myScan.nextInt();   // nhập vào số a từ bàn phím

        int x = a * b;

        while (b != 0) {
                            // vi du a = 21, b = 15
            temp = a % b;   // temp = 21 % 15 = 6
            a = b;          // a = 21 -> a = 15
            b = temp;       // b = 15 -> b = 6

        }

        // vi du a = 12, b = 21
        // loop 1: temp = 15, a = 21, b = 15
        // loop 2: temp = 6, a = 15, b = 6
        // loop 3: temp = 3, a = 6, b = 3
        // loop 4: temp = 0, a = 3, b = 0
        // => UCLN = a = 3

        System.out.println("\nUCLN (gcd) cua a va b la: " + a);

        System.out.println("\nBCNN (lcm) cua a va b la: " + x/a);     // BCNN = (a * b) / UCLN

    }
    
}
