/* Chuong trinh khai bao va su dung TreeMap */
/* Chuong trinh tra cuu thong tin tu danh sach Sinh vien bang ma Sinh vien hoac ten Sinh vien */

import java.util.Scanner;
import java.util.TreeMap;

public class TraCuuSinhVien {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        TreeMap<Integer, String> studentList = new TreeMap<>(); // khai bao TreeMap luu Danh sach Sinh vien

        studentList.put(1 , "Nguyen Van A");    // Nhap tung phan tu vao TreeMap
        studentList.put(2 , "Nguyen Van B");
        studentList.put(3 , "Nguyen Van C");
        studentList.put(4 , "Nguyen Van D");
        studentList.put(5 , "Tran Thi G");
        studentList.put(6 , "Tran Thi H");
        studentList.put(7 , "Tran Thi I");
        studentList.put(8 , "Tran Thi K");

        System.out.println("\nDanh sach Sinh vien: ");  // in ra Danh sach Sinh vien vua tao

        for (int key : studentList.keySet()) {   // in ra keySet va value cua TreeMap

            System.out.println(key + ". " + studentList.get(key));

        }

        System.out.println("\nChuong trinh Tra cuu thong tin Sinh vien: ");

        System.out.println("\n1. Tra cuu thong tin bang ma Sinh vien. \n2. Tra cuu thong tin bang ten Sinh vien. ");   // hien thị các lựa chon của chương trinh, sẽ có 2 lựa chon để tra cuu thong tin SV

        System.out.print("\nNhap lua chon cua ban: ");
        int selectedNumber = myScan.nextInt();  // nhap lua chon tu ban phim
        myScan.nextLine();

        switch (selectedNumber) {

            case 1: // lua chon tra cuu thong tin Sinh vien bang ma SV

                System.out.println("\nTra cuu thong tin bang ma Sinh vien: ");
                
                System.out.print("\nNhap ID Sinh vien can tra cuu: ");
                int studentId = myScan.nextInt();       // nhap ma SV tu ban phim

                if (studentList.containsKey(studentId)) {       // kiểm tra xem TreeMap có ma SV cần tra cuu hay khong

                    System.out.println("Tra cuu thanh cong thong tin Sinh vien: ");
                    System.out.println(studentId + ". " + studentList.get(studentId));      // in ra thong tin SV can tra cuu

                } else {

                    System.out.println("ID " + studentId + " khong ton tai. ");

                }

                break;

            case 2: // lua chon tra cuu thong tin Sinh vien bang ten SV

                System.out.print("\nNhap ten Sinh vien can tra cuu: ");
                String studentName = myScan.nextLine();     // nhap ten SV tu ban phim

                boolean check = false;
                
                for (Integer key : studentList.keySet()) {  // in ra keySet va value cua TreeMap

                    if (studentList.get(key).contains(studentName)) {       // kiểm tra xem TreeMap có ten SV cần tra cuu hay khong

                        System.out.println("Tra cuu thanh cong thong tin Sinh vien: ");
                        System.out.println(key + ". " + studentList.get(key));      // in ra thong tin SV can tra cuu

                        check = true;

                        break;

                    } 
        
                }

                if (check == false) {

                    System.out.println("Khong tim thay ten " + studentName + " trong danh sach Sinh vien. ");

                }

                break;
        
            default:

                System.out.println("\nLua chon khong hop le! ");
                
                break;

        }

    }

}