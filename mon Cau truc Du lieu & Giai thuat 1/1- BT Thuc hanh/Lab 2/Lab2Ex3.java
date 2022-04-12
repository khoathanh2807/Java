/* Chuong trinh tinh trung binh so tuoi va ti le tiem chung cua cac con trong gia dinh */

import java.util.*;

class Lab2Ex3{

	public static void main(String[] args){

		String temp;
		
		int numChild;				// so luong con cai
		String childName;			// ten con
		int age;					// tuoi con
		boolean vaccinated;			// chich vaccine: true / false

		double sumAge = 0;			// tong so tuoi cua tat ca cac con
		double sumVaccinated = 0;	// tong so con chich vaccine
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("\n\t Enter Number of children: ");
		numChild = myScan.nextInt();		// nhap vao so luong con cai
		System.out.print("\t Number of children is: " + numChild);
		
		for(int i = 0; i < numChild; i++){

			temp = myScan.nextLine();
			
			System.out.print("\n\n\t Name: ");
			childName = myScan.nextLine();		// nhap ten con
			System.out.print("\t Name is: " + childName);
			
			System.out.print("\n\n\t Age: ");
			age = myScan.nextInt();				// nhap tuoi con
			System.out.print("\t Age is: " + age);

			sumAge = sumAge + age;			// tong so tuoi cua tat ca cac con
			
			System.out.print("\n\n\t Vaccinated for chickenpox? (true/false): ");
			vaccinated = myScan.nextBoolean();		// nhap vao co chich vaccine hay khong: true / false

			if(vaccinated){

				System.out.print("\t Vaccinated for chickenpox");
				sumVaccinated++;		// tinh tong so con chich vaccine, neu o tren nhap true thi sumVaccinated + 1

			} else{

				System.out.print("\t Not vaccinated for chickenpox");

			}

		}
		
		System.out.printf("\n\n\t Average age is: " + sumAge / numChild);
		System.out.printf("\n\n\t Percentage of children vaccinated is: " + (sumVaccinated / numChild * 100) + " %%");

	}
	
}