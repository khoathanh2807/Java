/* Chuong trinh tim hieu Lap trinh Huong doi tuong */
/* Chuong trinh tao class Student gom cac thuoc tinh studentID, studentName, studentAddress, studentScore va cac phuong thuc get, set */


public class Student {  // class Student la tap hop cac doi tuong (object) Sinh Vien, dung de luu thong tin cac doi tuong nay (ID, name, address, score)

    private int studentID;  // day cac la thuoc tinh (Attributes) nam trong Class
    private String studentName;
    private String studentAddress;
    private float studentScore;

    public Student () {     // day la constructor kieu khong co tham so (parameter)

    }

    public Student (int maSV, String tenSV, String diachiSV, float diemSV) {    // day la constructor kieu co tham so (parameter)

        super();

        this.studentID = maSV;
        this.studentName = tenSV;
        this.studentAddress = diachiSV;
        this.studentScore = diemSV;

    }

    public void setStudentID (int maSV) {       // day la phuong thuc (class’s methods) de truyen vao tham so

        if (maSV > 0) {

            this.studentID = maSV;

        }

    }

    public int getStudentID () {        // day la phuong thuc (class’s methods) de tra ve tham so

        return this.studentID;

    }

    public void setStudentName (String tenSV) {

        this.studentName = tenSV;

    }

    public String getStudentName () {

        return this.studentName;

    }

    public void setStudentAddress (String diachiSV) {

        this.studentAddress = diachiSV;

    }

    public String getStudentAddress () {

        return this.studentAddress;

    }

    public void setStudentScore (float diemSV) {

        this.studentScore = diemSV;

    }

    public float getStudentScore () {

        return this.studentScore;

    }

}