/* Chuong trinh tinh tong tat ca cac so tu 1 den n */

import java.util.*;

class Lab2Ex1{

	public static void main(String[] args){

		int n;
		int sum = 0;
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("\n\t Enter n: ");
		n = myScan.nextInt();
		
		for(int i = 1; i <= n; i++){

			sum = sum + i;
		
		}
		
		System.out.println("\n\t Sum of positive integers up to n : " + sum);
		
	}

}