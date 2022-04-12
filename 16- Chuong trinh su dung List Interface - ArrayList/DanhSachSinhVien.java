/* Chuong trinh khai bao va su dung ArrayList */
/* Chương trình them, xoa, sua ten Sinh vien trong Danh sach ten Sinh vien */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {

    public static void main(String[] args) {

        try {   // Try block to check for exceptions

            List<String> studentNameList = new ArrayList<>();   // khai báo ArrayList

            Scanner myScan = new Scanner(System.in);

            System.out.println("\nChuong trinh Quan ly danh sach Sinh vien: ");

            while (true) {

                System.out.println("\n1. Them ten Sinh vien. \n2. Xoa ten Sinh vien. \n3. Sua ten Sinh vien. \n4. In ra danh sach Sinh vien. \n5. Thoat chuong trinh. ");   // hien thị các lựa chon của chương trinh

                System.out.print("\nNhap lua chon cua ban: ");
                int selectedNumber = myScan.nextInt();  // nhap lua chon tu ban phim
                myScan.nextLine();

                if (selectedNumber > 4) {   // nguoi dùng nhập lựa chon từ 5 trở lên sẽ thoát chuong trình

                    break;

                }

                switch (selectedNumber) {

                    case 1:
                    
                        System.out.println("\nNhap ten Sinh vien: ");
                        String name = myScan.nextLine();

                        while (!name.isEmpty()) {   // liên tục nhập tên SV, nếu bo trống và nhấn Enter sẽ thoát nhập
                        
                            studentNameList.add(name);
                            name = myScan.nextLine();

                        }

                        break;

                    case 2:

                        System.out.println("\nXoa ten Sinh vien: ");
                        System.out.println("1. Xoa Sinh vien theo ten. \n2. Xoa Sinh vien theo ID. ");  // sẽ có 2 lựa chon để xóa tên SV khoi danh sách
                        
                        System.out.print("\nNhap lua chon cua ban: ");
                        int selectedNumber2 = myScan.nextInt();  // nhap lua chon tu ban phim
                        myScan.nextLine();

                        switch (selectedNumber2) {

                            case 1:
                                
                                System.out.print("\nNhap ten Sinh vien can xoa: ");
                                String studentNameDelete = myScan.nextLine();    // nhap ten SV can xoa tu ban phim

                                if (studentNameList.contains(studentNameDelete)) {  // kiểm tra xem arrayList có tên SV cần xóa hay không

                                    studentNameList.remove(studentNameDelete);  // xóa tên SV khoi danh sách

                                    System.out.println("Da xoa ten Sinh vien " + studentNameDelete + " khoi danh sach Sinh vien! ");

                                } else {

                                    System.out.println("Khong tim thay ten " + studentNameDelete + " trong danh sach Sinh vien. ");

                                }

                                break;

                            case 2:
                                
                                System.out.print("\nNhap ID Sinh vien can xoa: ");
                                int studentIdDelete = myScan.nextInt();     // nhap ID SV can xoa tu ban phim

                                if (studentIdDelete >= 0 && studentIdDelete < studentNameList.size()) {     // kiểm tra xem arrayList có ID SV cần xóa hay không

                                    studentNameList.remove(studentIdDelete);

                                    System.out.println("Da xoa ten Sinh vien ID " + studentIdDelete + " khoi danh sach Sinh vien! ");

                                } else {

                                    System.out.println("ID " + studentIdDelete + " khong ton tai. ");

                                }

                                break;
                        
                            default:
                                break;

                        }

                        break;

                    case 3:

                        System.out.println("\nSua ten Sinh vien: ");
                        System.out.println("1. Sua ten Sinh vien theo ten. \n2. Sua ten Sinh vien theo ID. ");  // sẽ có 2 lựa chon để sửa tên SV
                            
                        System.out.print("\nNhap lua chon cua ban: ");
                        int selectedNumber3 = myScan.nextInt();  // nhap lua chon tu ban phim
                        myScan.nextLine();

                        switch (selectedNumber3) {

                            case 1:
                                
                                System.out.print("\nNhap ten Sinh vien can sua: ");
                                String studentNameReplace = myScan.nextLine();    // nhap ten SV can sua tu ban phim

                                // cách 1:
                                boolean check = false;

                                for (int i = 0; i < studentNameList.size(); i++) {
                                    
                                    if (studentNameList.get(i).contains(studentNameReplace)) {    // kiểm tra xem arrayList có tên SV cần sửa hay không

                                        System.out.print("Nhap ten Sinh vien moi: ");
                                        String studentNameReplace_Name = myScan.nextLine();     // nhap ten moi cua Sinh vien can sua ten

                                        studentNameList.set(i, studentNameReplace_Name);
                                        System.out.println("Sua ten Sinh vien thanh cong! ");

                                        check = true;

                                        break;
                                        
                                    }   

                                }

                                if (check == false) {

                                    System.out.println("Khong tim thay ten " + studentNameReplace + " trong danh sach Sinh vien. ");

                                }

                                // cách 2:                            
                                // if (studentNameList.contains(studentNameReplace)) {

                                //     System.out.print("Nhap ten Sinh vien moi: ");
                                //     String studentNameReplace_Name = myScan.nextLine();     // nhap ten moi cua Sinh vien can sua ten

                                //     studentNameList.set(studentNameList.indexOf(studentNameReplace), studentNameReplace_Name);
                                //     System.out.println("Sua ten Sinh vien thanh cong! ");

                                // } else {

                                //     System.out.println("Khong tim thay ten " + studentNameReplace + " trong danh sach Sinh vien. ");

                                // }

                                break;

                            case 2:
                                
                                System.out.print("\nNhap ID Sinh vien can sua: ");
                                int studentIdReplace = myScan.nextInt();     // nhap ID SV can sua tu ban phim
                                myScan.nextLine();

                                if (studentIdReplace >= 0 && studentIdReplace < studentNameList.size()) {   // kiểm tra xem arrayList có ID SV cần sửa hay không

                                    System.out.print("Nhap ten Sinh vien moi: ");
                                    String studentNameReplace_Id = myScan.nextLine();     // nhap ten moi cua Sinh vien can sua ten

                                    studentNameList.set(studentIdReplace, studentNameReplace_Id);
                                    System.out.println("Sua ten Sinh vien thanh cong! ");    

                                } else {

                                    System.out.println("ID " + studentIdReplace + " khong ton tai. ");

                                }

                                break;
                        
                            default:
                                break;

                        }
                        
                        break;

                    case 4:

                        System.out.println("\n----- Danh sach Sinh vien ----- ");

                        // for (String studentName : studentNameList) {     // sử dụng cách này để in ra danh sách SV khi không cần in ra ID

                        //     System.out.println(studentName);

                        // }

                        for (int i = 0; i < studentNameList.size(); i++) {    // in ra danh sách tên sinh viên và ID

                            System.out.println(i + ". " + studentNameList.get(i));

                        }

                        break;

                }

            }

            System.out.println("\n----- Ket thuc chuong trinh ----- ");

        } catch (Exception e) { // Catch block to handle the exceptions

            System.out.println(e);  // Display the exception on the console

        }

    }
    
}
