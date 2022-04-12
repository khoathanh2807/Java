/* Chuong trinh tinh Chu vi va Dien tich hinh tam giac */

import java.util.*;

class Input{

	int length, height;			// bien luu chieu dai, chieu cao
	float perimeter, area;		// bien luu chu vi, dien tich
	
	Input(){		// constructor khong tham so

		perimeter = 0;
		area = 0;

	}

	Input(int length,int height){		// constructor co tham so

		this.length = length;
		this.height = height;

	}
	
	void inputNum(){	// ham nhap vai chieu dai. chieu cao cua tam giac

		Scanner myScan= new Scanner(System.in);

		System.out.print("\n\t Enter the length: ");
		length = myScan.nextInt();

		System.out.print("\t Enter the height: ");
		height = myScan.nextInt();

	}
	
	void calculate(){	// ham tinh toan va in ra ket qua

		perimeter = 2 * (length + height);		// tinh chu vi tam giac
		area = length * height;					// tinh dien tich tam giac

		System.out.println("\n\t Perimeter is: " + perimeter + ", Area is: " + area);

	}

}

class Lab3Ex3{

	public static void main(String[] args){

		Input khoa1 = new Input();

		khoa1.inputNum();
		khoa1.calculate();

	}

}