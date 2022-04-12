import java.util.ArrayList;

/**
 * DO NOT CHANGE ANYTHING IN THIS CLASS
 * @author Kelvin
 */
public class GiangVien extends Person {
    
    private int soLopGiangDay;
    private ArrayList<MonHoc> gvTKB;

    public GiangVien()
    {
        super();
        this.soLopGiangDay = 0;
        this.gvTKB = new ArrayList<>();
    }
    
    public GiangVien(String id, String name, char gender)
    {
        super(id, name, gender);
        this.soLopGiangDay = 0;
        this.gvTKB = new ArrayList<>();
    }

    public int getSoLopGiangDay()
    {
        return soLopGiangDay;
    }

    public void setSoLopGiangDay(int soLopGiangDay)
    {
        this.soLopGiangDay = soLopGiangDay;
    }

    public ArrayList<MonHoc> getGvTKB()
    {
        return gvTKB;
    }

    public void addMonHoc(MonHoc m)
    {
        if(this.gvTKB != null)
        {
            this.gvTKB.add(m);
        }
    }
    
}
