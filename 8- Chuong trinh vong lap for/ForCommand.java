/* Chương trình sử dụng vòng lặp for */

import java.util.Scanner;

public class ForCommand {
    
    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap so lan chay vong lap: ");
        int n = myScan.nextInt();   // nhập vào số lần lặp của vòng lặp từ bàn phím

        for (int i = 0; i < n; i++) {

            System.out.println("i = " + i);     // mỗi lần lặp in ra kết quả của i

        }

    }

}