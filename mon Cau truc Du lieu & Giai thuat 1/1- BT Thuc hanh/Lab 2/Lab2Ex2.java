/* Chuong trinh nhap vao so mile va in ra so km tuong ung */

import java.util.*;

class Lab2Ex2{

	public static void main(String[] args){
		
		double m;
		double km;
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("\n\t Enter miles: ");
		m = myScan.nextDouble();
		
		km = m * 1609;
		
		System.out.println("\n\t Convert miles to kilometers: " + km);
		
	}

}