/* Chuong trinh nhap vao so ngay, tinh va in ra so nam, tuan, ngay */

import java.util.*;

class Input{

	int day, year, week, d2;

	Input(){	// constructor khong tham so

		year = 0;
		week = 0;
		d2 = 0;

	}

	Input(int day){		// constructor co tham so

		this.day = day;
		
	}

	void inputDay(){	// ham nhap vao so ngay

		Scanner myScan = new Scanner(System.in);

		System.out.print("\n Enter number of days :");
		day = myScan.nextInt();

	}

	void calculate(){	// ham tinh toan va in ra ket qua

		year = day / 365;			// tinh so nam
		week = (day % 365) / 7;		// tinh so tuan
		d2 = (day % 365) % 7;		// tinh so ngay

		System.out.println(year + " years, " + week + " weeks, " + d2 + " days.");

	}
	
}

class Lab3Ex2{

	public static void main(String[] args){

		Input khoa1= new Input();
		
		khoa1.inputDay();
		khoa1.calculate();

	}

}