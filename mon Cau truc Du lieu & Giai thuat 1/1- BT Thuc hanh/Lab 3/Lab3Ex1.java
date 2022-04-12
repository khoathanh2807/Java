/* Chuong trinh nhap vao 2 so va tinh cong, tru, nhan, chia, chia lay du 2 so nay */

import java.util.*;

class Input{

	int num1, num2;					// bien luu 2 so nhap vao
	float add, sub, mult, div;		// bien luu ket qua tinh cong, tru, nhan, chia
	float time, remainder;			// bien luu ket qua chia lay du
	
	Input(){	// constructor khong tham so

		add = 0;
		sub = 0;
		mult = 0;
		div = 0;

	}
	
	Input(int num){		// constructor co tham so

		num1 = num2 = num;

	}
	
	void inputNum(){	// ham nhap vao 2 so

		Scanner myScan= new Scanner(System.in);

		System.out.print("\n\t Enter First Number: ");
		num1 = myScan.nextInt();

		System.out.print("\t Enter Second Number: ");
		num2 = myScan.nextInt();

	}
	
	void calculate(){	// ham tinh toan va in ket qua ra man hinh

		add = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		time = num1 / num2;
		remainder = num1 % num2;
		
		System.out.println("\nAddition = num1 + num2 = " + add);
		System.out.println("Subtraction = num1 - num2 = " + sub);
		System.out.println("Multiplication = num1 * num2 = " + mult);
		System.out.println("Division = num1 / num2 = " + div);
		System.out.println(num1 + " % " + num2 + ", time = " + time + " remainder = " + remainder);

	}

}

class Lab3Ex1{

	public static void main(String[] args){

		Input khoa1= new Input();
		
		khoa1.inputNum();
		khoa1.calculate();

	}

}