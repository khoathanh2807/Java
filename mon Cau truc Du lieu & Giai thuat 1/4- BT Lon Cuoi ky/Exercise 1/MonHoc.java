/*
 * DO NOT CHANGE ANYTHING IN THIS CLASS
 * @author Thanh Dai Khoa [517H0008]
 */

public class MonHoc {
    
    private String maMH;    // Ma mon hoc
    private String tenMH;   // Ten mon hoc
    private int tinChi;     // So tin chi

    public MonHoc() {       // Constructor khong tham so

        this.maMH = "";
        this.tenMH = "";
        this.tinChi = 0;

    }
    
    public MonHoc(String maMH, String tenMH, int tinChi) {      // Constructor co tham so

        this.maMH = maMH;
        this.tenMH = tenMH;
        this.tinChi = tinChi;

    }

    public String getMaMH() {

        return maMH;

    }

    public void setMaMH(String maMH) {

        this.maMH = maMH;

    }

    public String getTenMH() {

        return tenMH;

    }

    public void setTenMH(String tenMH) {

        this.tenMH = tenMH;
        
    }

    public int getTinChi() {

        return tinChi;

    }

    public void setTinChi(int tinChi) {

        this.tinChi = tinChi;

    }
    
}