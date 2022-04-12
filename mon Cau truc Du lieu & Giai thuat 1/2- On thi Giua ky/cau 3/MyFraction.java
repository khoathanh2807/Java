public class MyFraction {

    private int num;		// tu so
	private int denom;		// mau so
	private static int quantity = 0;	// số lượng phan so
    
    public MyFraction(){	// constructor không tham số

		num = 0;
        denom = 1;

        quantity++;

	}

	public MyFraction(int num, int denom){		// constructor có tham số

		this.num = num;
		this.denom = denom;

		quantity++;

	}
	
	public void setNum(int num){

		this.num = num;

	}
	
	public int getNum(){

		return num;

	}
	
	public void setDenom(int denom){

		this.denom = denom;

	}
	
	public int getDenom(){

		return denom;

	}
	
	public static int getQuantity(){

		return quantity;

	}

    public int GCD(int a, int b){       // ham tim uoc chung lon nhat 2 so

        while (a != b) {

            if (a > b) {

                a -= b;

            } else {

                b -= a;

            }

        }

        return a;

    }

    public void SimplifyFraction(){     // ham co chuc nang lam toi gian phan so

        int gcd = GCD(this.num, this.denom);

        this.num = this.num / gcd;
        this.denom = this.denom / gcd;

    }

    public MyFraction tinhTong(MyFraction f){       // hàm tính phép cộng 2 phân số

        int tuso = this.getNum() * f.getDenom() + f.getNum() * this.getDenom();
        int mauso = this.getDenom() * f.getDenom();

        MyFraction result = new MyFraction(tuso, mauso);
        result.SimplifyFraction();

        return result;

    }

    public MyFraction tinhHieu(MyFraction f){       // hàm tính phép trừ 2 phân số

        float a = this.getNum() * f.getDenom() - f.getNum() * this.getDenom();
        float b = this.getDenom() * f.getDenom();

        int tuso = (int)a;
        int mauso = (int)b;

        MyFraction result = new MyFraction(tuso, mauso);
        result.SimplifyFraction();

        return result;

    }

    public MyFraction tinhTich(MyFraction f){       // hàm tính phép nhân 2 phân số

        int tuso = this.getNum() * f.getNum();
        int mauso = this.getDenom() * f.getDenom();

        MyFraction result = new MyFraction(tuso, mauso);
        result.SimplifyFraction();

        return result;

    }

    public MyFraction tinhThuong(MyFraction f){       // hàm tính phép chia 2 phân số

        int tuso = this.getNum() * f.getDenom();
        int mauso = this.getDenom() * f.getNum();

        MyFraction result = new MyFraction(tuso, mauso);
        result.SimplifyFraction();

        return result;

    }
    
    //@Override
	public boolean equals(MyFraction obj){

		if( this.num == obj.num && this.denom == obj.denom ){

			return true;

		} else{

			return false;

		}

	}

}
