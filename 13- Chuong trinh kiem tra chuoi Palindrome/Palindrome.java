/* Chương trình sử dụng chuỗi kí tự String và các hàm hỗ trợ xử lý String */

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        boolean flag = true;

        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap chuoi palindrome: ");
        String str = myScan.nextLine();   // nhập vào chuoi palindrome từ bàn phím

        for (int i = 0; i < (str.length() / 2); i++) {

            char c1 = str.charAt(i);
            char c2 = str.charAt((str.length() - 1) - i);

            if (c1 != c2) {

                flag = false;
                break;

            }

        }

        if (flag) {
            
            System.out.print("Chuoi ki tu vua nhap vao la chuoi Palindrome. \n");

        } else {

            System.out.print("Chuoi ki tu vua nhap vao khong phai la chuoi Palindrome. \n");

        }

    }
    
}
