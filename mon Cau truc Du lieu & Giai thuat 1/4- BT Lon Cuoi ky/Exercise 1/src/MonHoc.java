/**
 * DO NOT CHANGE ANYTHING IN THIS CLASS
 * @author Kelvin
 */
public class MonHoc {
    
    private String maMH;
    private String tenMH;
    private int tinChi;

    public MonHoc()
    {
        this.maMH = "";
        this.tenMH = "";
        this.tinChi = 0;
    }
    
    public MonHoc(String maMH, String tenMH, int tinChi)
    {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.tinChi = tinChi;
    }

    public String getMaMH()
    {
        return maMH;
    }

    public void setMaMH(String maMH)
    {
        this.maMH = maMH;
    }

    public String getTenMH()
    {
        return tenMH;
    }

    public void setTenMH(String tenMH)
    {
        this.tenMH = tenMH;
    }

    public int getTinChi()
    {
        return tinChi;
    }

    public void setTinChi(int tinChi)
    {
        this.tinChi = tinChi;
    }
    
    
}
