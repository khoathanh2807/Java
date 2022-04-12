import java.util.ArrayList;

/*
 * DO NOT CHANGE ANYTHING IN THIS CLASS
 * @author Thanh Dai Khoa [517H0008]
 */

public class GiangVien extends Person {
    
    private int soLopGiangDay;          // so luong lop giang day
    private ArrayList<MonHoc> gvTKB;    // TKB cua GV

    public GiangVien() {        // Constructor khong tham so

        super();
        this.soLopGiangDay = 0;
        this.gvTKB = new ArrayList<>();

    }
    
    public GiangVien(String id, String name, char gender) {      // Constructor co tham so

        super(id, name, gender);
        this.soLopGiangDay = 0;
        this.gvTKB = new ArrayList<>();

    }

    public int getSoLopGiangDay() {

        return soLopGiangDay;

    }

    public void setSoLopGiangDay(int soLopGiangDay) {

        this.soLopGiangDay = soLopGiangDay;

    }

    public ArrayList<MonHoc> getGvTKB() {

        return gvTKB;

    }

    public void addMonHoc(MonHoc m) {

        if(this.gvTKB != null) {

            this.gvTKB.add(m);

        }

    }
    
}
