import java.util.ArrayList;

/**
 * DO NOT CHANGE ANYTHING IN THIS CLASS
 * @author Kelvin
 */
public class SinhVien extends Person {
    
    private int soTinChiTichLuy;
    private ArrayList<MonHoc> svTKB;

    public SinhVien()
    {
        super();
        this.soTinChiTichLuy = 0;
        this.svTKB = new ArrayList<>();
    }
    
    public SinhVien(String id, String name, char gender)
    {
        super(id, name, gender);
        this.soTinChiTichLuy = 0;
        this.svTKB = new ArrayList<>();
    }

    public int getSoTinChiTichLuy()
    {
        return soTinChiTichLuy;
    }

    public void setSoTinChiTichLuy(int soTinChiTichLuy)
    {
        this.soTinChiTichLuy = soTinChiTichLuy;
    }

    public ArrayList<MonHoc> getSvTKB()
    {
        return svTKB;
    }

    public void addMonHoc(MonHoc m)
    {
        if(this.svTKB != null)
        {
            this.svTKB.add(m);
        }
    }
    
}
