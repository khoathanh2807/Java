/* Chuong trinh tim ra so lon nhat trong 2 so va so lon nhat trong chuoi cac so */

import java.util.*;

class ex1{		// ham tim va in ra so lon hon trong 2 so
	
	int num1, num2;
	int larger;

	Scanner myScan = new Scanner(System.in);
	
	ex1(){		// constructor khong tham so

		num1 = 0;
		num2 = 0;

	}
	
	void setNum(){		// ham nhap vao 2 so
		
		System.out.print("\n\tFind the larger of two numbers");
		
		System.out.print("\n\n\tEnter a first number: ");
		num1 = myScan.nextInt();
		
		System.out.print("\n\tEnter a second number: ");
		num2 = myScan.nextInt();
		
	}
	
	void findLarger(){		// ham tim so lon hon trong 2 so
		
		if (num1 > num2){

			larger = num1;

		} else{

			larger = num2;

		}
		
	}
	
	void printResult(){		// ham in ket qua so nao lon hon
		
		System.out.print("\n\t >>> The larger number is: " + larger);
		
	}

}

class ex2 extends ex1{		// ham tim va in ra so lon nhat trong chuoi
	
	int[] n;
	int size;
	
	ex2(){		// constructor khong tham so

		System.out.print("\n\n\t----------------------");
		
		System.out.print("\n\n\tFind the largest of N-numbers ");
		System.out.print("\n\n\tHow many values: ");
		size = myScan.nextInt(); 	// nhap vao so luong so cua chuoi

		n = new int[size];

	}
	
	void setValue(){		// ham nhap vao tung so trong chuoi

		for (int i = 0; i < size; i++){

			System.out.print("\n\tEnter value [" + i + "] = ");
			n[i] = myScan.nextInt();

		}
		
	}
	
	void findLargest(){		// ham tim va in ra so lon nhat trong chuoi
		
		num1 = n[0];
		
		for (int i = 1; i < size; i++){

			num2 = n[i];
			
			findLarger();
			
			num1 = larger;

		}

		System.out.println("\n\t >>> The largest number is: " + larger);

	}

}

class myExercise{

	public static void main(String[] args){
		
		ex1 a = new ex1();
		a.setNum();
		a.findLarger();
		a.printResult();
		
		ex2 b = new ex2();
		b.setValue();
		b.findLargest();

	}

}