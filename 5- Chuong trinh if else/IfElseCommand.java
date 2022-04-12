/* Chương trình sử dụng câu lệnh if else */

import java.util.Scanner;

public class IfElseCommand {

    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap x: ");
        int x = myScan.nextInt();   //nhập vào số x từ bàn phím

        if (x > 5) {

            System.out.println("x > 5");
            x++;

        } else if (x < 5) {

            System.out.println("x < 5");
            x--;

        } else {

            System.out.println("x = 5");

        }

        System.out.println("x = " + x);

    }
    
}
