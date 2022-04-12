/* Chuong trinh tim hieu Lap trinh Huong doi tuong */
/* Chuong trinh khoi tao, gan thuoc tinh cho doi tuong Student va viet ham / phuong thuc tim kiem, in ra thong tin cua doi tuong nay */

import java.util.List;
import java.util.ArrayList;

public class QuanLySinhVien {

    public static void main(String[] args) {
        
        Student student = new Student();   // khoi tao doi tuong Student bang Constructor khong tham so
        student.setStudentID(1);                
        student.setStudentName("Nguyen Van A");     // dung cac phong thuc (method) set de gan thuoc tinh cho doi tuong
        student.setStudentAddress("Ha Noi");
        student.setStudentScore(8.6f);

        Student student2 = new Student(2, "Tran Van M", "TP. Ho Chi Minh", 9.8f);   // khoi tao doi tuong Student bang Constructor co truyen vao tham so

        //System.out.println(student.getStudentID() + ". " + student.getStudentName());

        System.out.println();

        showStudentInfor(student);     // goi ham in thong tin SV
        showStudentInfor(student2);

        List<Student> studentList = new ArrayList<>();  // tạo ArrayList lưu hàng loạt thông tin SV

        studentList.add(student);       // add cac doi tuong Student vao ArrayList
        studentList.add(student2);

        Student student3 = findStudent(3, studentList);     // goi ham tim thong tin SV bang ma SV

        System.out.println("\nfindStudent(3, studentList): ");

        showStudentInfor(student3);     // goi ham de in ra thong tin SV vua tim


    }

    private static void showStudentInfor (Student s) {  // tao ham / phuong thuc (method) in thong tin SV ra man hinh

        if (s == null) {

            System.out.println("Khong tim thay thong tin SV! ");

        } else {

            System.out.println(s.getStudentID() + ". " + s.getStudentName() + " - Dia chi: " + s.getStudentAddress() + " - DTB: " + s.getStudentScore());

        }

    }

    private static Student findStudent (int maSV, List<Student> danhsachSV) {   // tao ham / phuong thuc (method) tim kiem SV trong List SV bang ma SV

        for (Student s : danhsachSV) {  // chạy vòng lặp quét thông tin từng SV trong List thông tin SV

            if (s.getStudentID() == maSV) {      // kiem tra xem cac ma SV trong List thong tin SV co trung voi ma SV dang can tim hay khong

                return s;

            }

        }

        return null;
        
    }
    
}