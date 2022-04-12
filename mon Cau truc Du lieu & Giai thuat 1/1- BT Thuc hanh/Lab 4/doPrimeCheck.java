// Program check for Prime number
// Chuong trinh kiem tra so nguyen to

class work{ //10-150

	int no;	   // bien luu so can kiem tra
	boolean isPrime;	// bien luu ket qua kiem tra: true / false
	java.util.Scanner myScan;
	
	work(){	   // constructor khong tham so

		myScan = new java.util.Scanner(System.in);
		System.out.print("\n\tProgram to check for PRIME number");
		isPrime = true;

	}
	
	void getNo(){	 // ham nhap vao so can check

		System.out.print("\n\tEnter a number:");
		no = myScan.nextInt();	// nhap so vao tu ban phim va luu vao bien 'no'
		
	}
	
	void check(){	  // ham kiem tra so nguyen to

		for(int i = 2; i < no/2; i++){

			if(no % i == 0){

				isPrime = false;
				break;

			}

		}

	}

	void result(){	  // ham in ket qua kiem tra

		System.out.println("\t" + no + " is" + ((isPrime) ? " A PRIME NUMBER" : " NOT A PRIME NUMBER"));

	}

}

// Another class to use inheritance, check and print the prime numbers in a range of values.
// INHERITANCE: class child/subclass extends parent/superclass
// Ham su dung tinh ke thua, class 'primeCheck' ke thua tu class 'work'

class primeCheck extends work{	// kiem tra so nguyen to trong khoang tu 'startNo' toi 'endNo'

	int startNo, endNo;

	primeCheck(){	  // constructor khong tham so 

		System.out.print("\n\tEnter starting number:");
		startNo = myScan.nextInt();
		
		System.out.print("\tEnter ending number:");
		endNo = myScan.nextInt();

	}

	void checkPrint(){	  // kiem tra va in ra danh sach so la so nguyen to

		System.out.println();

		for(int i = startNo; i <= endNo; i++){

			no = i;
			
			isPrime = true;
			
			check();
			
			if(isPrime){

				System.out.print("\t" + no);

			} else;

		}

		System.out.println();

	}

}

//One more class to run the program.
class doPrimeCheck{

	public static void main(String[] args){

		work w = new work();
		w.getNo();
		w.check();
		w.result();

		primeCheck pc = new primeCheck();
		pc.checkPrint();

	}

}
