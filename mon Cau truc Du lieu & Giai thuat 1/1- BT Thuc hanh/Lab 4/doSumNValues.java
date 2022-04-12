// Chuong tinh tinh tong N so nguyen lan luot duoc nhap vao tu ban phim

class arith{

	int no1, no2;
	int sum, sub, mul, rem;
	float div;

	java.util.Scanner myScan = new java.util.Scanner(System.in);
	
	arith(){	// constructor ko tham so

		sum = sub = mul = rem = 0;
		div = 0;

	}
	
	void getNum(){	  // ham nhap vao 2 so

		System.out.print("\n\tEnter number 1:");
		no1 = myScan.nextInt();
		
		System.out.print("\n\tEnter number 2:");
		no2 = myScan.nextInt();

	}
	
	int doSum(){	  // cong 2 so

		sum = no1 + no2;
		return sum;

	}

	int doSub(){	  // tru 2 so

		sub = no1 - no2;
		return sub;
	
	}

	int doMul(){	  // chia 2 so

		mul = no1 * no2;
		return mul;

	}

	float doDiv(){	  // nhan 2 so

		div = (float) no1 / no2;
		return div;
	
	}

	int doRem(){	  // chia lay du 2 so

		rem = no1 % no2;
		return rem;

	}

}


class sumNValues extends arith{
//class sub/childclassName extends super/parentClassName

	int values[];
	int howMany;
	
	sumNValues(){	// constructor ko tham so

		System.out.print("\n\tHow many values: ");
		howMany = myScan.nextInt(); 	// nhap so luong so trong chuoi

		values = new int[howMany];
		//super.sum=this.sum=0;

	}
	
	void getNum(){		// ham nhap vao tung so trong chuoi

		//super.getNum();
		for(int i = 0; i < howMany; i++){

			System.out.print("\n\tEnter value [" + i + "] = ");
			values[i] = myScan.nextInt();
		
		}

	}// 12 54 7 6 9 1 2 3 8 
	
	void sumN(){	// ham tinh tong ta ca so trong chuoi so da nhap

		int toAdd = 0;

		for(int i = 0; i < howMany; i = i + 2){

			toAdd = howMany - i;

			if(toAdd <= 2){

				if(howMany % 2 == 0){
					
					no1 = values[i];//7
					no2 = values[i + 1];//6
					
				} else{

					no1 = values[i];
					no2 = 0;

				}

			} else{

				no1 = values[i];//7
				no2 = values[i + 1];//6
				
			}

			sum += doSum();//66+13

		}

	}
	
	void showSum(){		// ham in ra ket qua

		System.out.println("\n\tSum of " + howMany + " values: " + sum);
		//System.out.print("\n\tSum from parent class arith is: "+super.doSum());

	}

}

//This class is to run the above class and see the result.
class doSumNValues{

	public static void main(String[] args){

		sumNValues sv = new sumNValues();

		sv.getNum();
		sv.sumN();
		sv.showSum();

	}

}
