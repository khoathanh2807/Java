public class MyInvoice {

    private String id;          // Mã hóa đơn
	private String desc;        // Mô tả chi tiết hóa đơn
    private int qty;            // Số lượng sản phẩm
    private double unitPrice;   // Dơn giá sản phẩm
	private static int quantity = 0;    // Số lượng hóa đơn
    
    public MyInvoice(){	    // constructor không tham số

        this.id = "";
        this.desc = "";
        this.qty = 0;
        this.unitPrice = 0;

        quantity++;

    }

    public MyInvoice(String id, String desc, int qty, double unitPrice){	  // constructor có tham số

        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;

        quantity++;

    }

    public void setID(String id){

		this.id = id;

	}
	
	public String getID(){

		return id;

	}

    public void setDesc(String desc){

		this.desc = desc;

	}
	
	public String getDesc(){

		return desc;

	}

    public void setQty(int qty){

		this.qty = qty;

	}
	
	public int getQty(){

		return qty;

	}

    public void setUnitPrice(double unitPrice){

		this.unitPrice = unitPrice;

	}
	
	public double getUnitPrice(){

		return unitPrice;

	}

    public static int getQuantity(){

		return quantity;

	}

    public double getTotal(){     // hàm tính tổng tien hóa đơn

        return qty * unitPrice;

    }

    //@Override
	public boolean equals(MyInvoice obj){

		if( this.id == obj.id && this.desc == obj.desc && this.qty == obj.qty && this.unitPrice == obj.unitPrice ){

			return true;

		} else{

			return false;

		}

	}

}