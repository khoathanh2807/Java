// Chuong trinh tinh Giai thua n so nguyen

import java.util.*;

public class factorial{
	
	public static int factorial (int n){	// Ham tinh giai thua

		if (n == 0) 

			return 1;

		else 

			return n * factorial(n - 1);

	}

	public static void main(String[] args){

		Scanner myScan = new Scanner(System.in);

		System.out.print("\nNhap n: ");
        int n = myScan.nextInt();	// nhap vao gia tri n tu ban phim

		System.out.printf("Factorial(%d)= %d \n", n, factorial(n));	// in ra ket qua tinh n giai thua

	}
	
}