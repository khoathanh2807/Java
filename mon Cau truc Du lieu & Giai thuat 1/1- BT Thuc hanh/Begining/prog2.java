/* Chuong trinh in ra so lon nhat tu 2 so nhap vao */

import java.util.*;

class prog2{

	public static void main(String[] khoa){

		int a;
		float b;
		String c;
		float sum, max;

		Scanner myScan = new Scanner(System.in);
		
		System.out.print("\n\t Enter an integer: ");
		a = myScan.nextInt();

		System.out.print("\n\t Enter a float number: ");
		b = myScan.nextFloat();

		System.out.print("\n\t Enter a string: ");
		c = myScan.next();
	
		System.out.print("\n\t Integer = " + a);
		System.out.print("\n\t Float = " + b);
		System.out.print("\n\t String = " + c);
		
		sum = a + b;
		System.out.print("\n\n\t Sum of integer and float: " + sum);
		
		if(a > b){	// kiem tra so lon nhat giua 2 so a va b

			max = a;

		} else{

			max = b;

		}

		System.out.println("\n\t Max number is: " + max);

	}

}