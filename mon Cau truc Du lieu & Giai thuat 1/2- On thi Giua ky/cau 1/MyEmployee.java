// class quản lý Nhân viên

public class MyEmployee {

	private String name;		// tên NV
	private char gender;		// giới tính
	private double hour, salary;		// so gio lam viec va tien cong moi gio
	private static int quantity = 0;	// số lượng nhân viên

	public MyEmployee(){	// constructor không tham số
	
		name = " ";
		gender = 'M';
		hour = 0.0;
		salary = 0.0;

		quantity++;

	}

	public MyEmployee(String name, char gender, double hour, double salary){	// constructor có tham số
	
		this.name = name;
		this.gender = gender;
		this.hour = hour;
		this.salary = salary;

		quantity++;

	}

	public String getName(){

		return name;

	}

	public char getGender(){

		return gender;

	}
	
	public double getHour(){

		return hour;

	}
	
	public double getSalary(){

		return salary;

	}
	
	public static int getQuantity(){

		return quantity;

	}
	
	public void setName(String name){

		this.name = name;

	}
	
	public void setGender(char gender){

		this.gender = gender;

	}
	
	public void setHour(double hour){

		this.hour = hour;

	}
	
	public void setSalary(double salary){

		this.salary = salary;

	}
	
	public double computeSalary(){	// hàm tính lương

		if(hour <= 48){

			return salary * hour;

		} else{

			return salary * hour * 1.35;

		}

	}

	//@Override
	public boolean equals(MyEmployee obj){
		
		if( this.name != null && obj.name != null &&  (this.name).equals(obj.name) && this.gender == obj.gender && this.hour == obj.hour && this.salary == obj.salary){
		
			return true;
		
		} else{
		
			return false;
		
		}
	
	}

}