/* Chương trình sử dụng câu lệnh if else và switch case */
/* Chương trình kiểm tra số nhập từ bàn phím là số chẵn hay số lẻ */

import java.util.Scanner;

public class SwitchCaseCommand2 {

    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.println("\n1. Bat dau chuong trinh. ");
        System.out.println("2. Thoat chuong trinh. ");

        System.out.print("\nHay nhap lua chon cua ban: ");
        int x = myScan.nextInt();

        switch (x) {

            case 1:

                System.out.println("Xin chao ban den voi Chuong trinh tim hieu cau lenh Switch Case. ");
                
                System.out.print("\nHay nhap 1 so bat ky: ");
                int n = myScan.nextInt();

                if (n % 2 == 0) {

                    System.out.println(n + " la so chan. ");

                } else {

                    System.out.println(n + " la so le. ");

                }

                break;

            case 2:

                System.out.println("Xac nhan thoat chuong trinh: ");
                System.out.println("1. Co. ");
                System.out.println("0. Khong. ");

                System.out.print("\nHay nhap lua chon cua ban: ");
                int t = myScan.nextInt();
                
                switch (t) {

                    case 1:
                        System.exit(0);
                        break;

                    case 0:

                        System.out.println("Xin chao ban den voi Chuong trinh tim hieu cau lenh If Else - Switch Case. \n");
                    
                        System.out.print("Hay nhap 1 so bat ky: ");
                        int m = myScan.nextInt();
        
                        if (m % 2 == 0) {
        
                            System.out.println(m + " la so chan. ");
        
                        } else {
        
                            System.out.println(m + " la so le. ");
        
                        }

                        break;
                
                    default:

                        System.out.print("Lua cho khong hop le. \n");
                        break;

                }

                break;
            
            default:

                System.out.print("Lua cho khong hop le. \n");
                break;

        }

    }
    
}
