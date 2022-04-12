/* Chuong trinh tim hieu tinh ke thua: extends, super */

class detail{

	String name, address;
	long phone;
	
	detail(){

		name = "";
		address = "";
		phone = 000000000;

	}
	
	void setName(){

		name = "Jitu";
		
	}
	
	void setAddress(){

		address = "Ly Chinh Thang, Dictrict 3";
		
	}
	
	void setPhone(){

		phone = 973695939;
	
	}
	
	void showInfo(){
		
	}

}


class detailInfo extends detail{

	String name;
	
	void getName(){

		java.util.Scanner myScan = new java.util.Scanner(System.in);
		
		System.out.print("\n\tYour name: ");
		this.name = myScan.next();		// gan ten nhap tu ban phim vao bien this.name cua class detailInfo

		super.setName();	// truy cap bien super.name cua class detail
		
		System.out.print("\n\tSuper class name: " + super.name);
		System.out.println("\n\tSub class name: " + this.name);

	}

}


class doDetailInfo{

	public static void main(String[] args){

		detailInfo di = new detailInfo();
		
		di.getName();

	}

}
