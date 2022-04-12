import java.util.ArrayList;

/*
 * DO NOT CHANGE ANYTHING IN THIS CLASS
 * @author Thanh Dai Khoa [517H0008]
 */

public class SinhVien extends Person {
    
    private int soTinChiTichLuy;        // tong so tin chi tich luy cua cac mon SV da hoc
    private ArrayList<MonHoc> svTKB;    // TKB cua SV

    public SinhVien() {     // Constructor khong tham so

        super();
        this.soTinChiTichLuy = 0;
        this.svTKB = new ArrayList<>();

    }
    
    public SinhVien(String id, String name, char gender) {      // Constructor co tham so

        super(id, name, gender);
        this.soTinChiTichLuy = 0;
        this.svTKB = new ArrayList<>();

    }

    public int getSoTinChiTichLuy() {

        return soTinChiTichLuy;

    }

    public void setSoTinChiTichLuy(int soTinChiTichLuy) {

        this.soTinChiTichLuy = soTinChiTichLuy;

    }

    public ArrayList<MonHoc> getSvTKB() {

        return svTKB;

    }

    public void addMonHoc(MonHoc m) {

        if(this.svTKB != null) {

            this.svTKB.add(m);

        }

    }

}