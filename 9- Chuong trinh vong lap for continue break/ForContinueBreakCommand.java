/* Chương trình sử dụng vòng lặp for và lệnh break - continue */

import java.util.Scanner;

public class ForContinueBreakCommand {

    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap so lan chay vong lap: ");
        int n = myScan.nextInt();   // nhập vào số lần lặp của vòng lặp từ bàn phím

        System.out.println("\nVi du lenh break: ");

        for (int i = 0; i < n; i++) {

            System.out.println("i = " + i);

            if (i == 5) {

                System.out.println("Break. ");
                break;      // lệnh break dừng hoàn toàn vòng lặp

            }

        }

        System.out.println("\nVi du lenh continue: ");

        for (int i = 0; i < n; i++) {

            if (i == 5) {

                System.out.println("Continue. ");
                continue;       // lệnh continue bỏ qua lần lặp hiện tại, tiếp tục thực hiện lần lặp kế tiếp

            }

            System.out.println("i = " + i);

        }

    }
    
}
