/* Chương trình sử dụng câu lệnh switch case */

import java.util.Scanner;

public class SwitchCaseCommand {

    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap x (1 - 10): ");
        int x = myScan.nextInt();   //nhập vào số a từ bàn phím

        switch (x) {
            
            case 1:

                System.out.println("A");
                break;

            case 2:

                System.out.println("B");
                break;

            case 3:

                System.out.println("C");
                break;

            case 4:

                System.out.println("D");
                break;

            case 5:

                System.out.println("E");
                break;

            case 6:

                System.out.println("F");
                break;

            case 7:

                System.out.println("G");
                break;

            case 8:

                System.out.println("H");
                break;

            case 9:

                System.out.println("I");
                break;

            case 10:

                System.out.println("K");
                break;

            default:
                System.out.println("x < 1 || x > 10");
                break;

        }

    }
    
}
