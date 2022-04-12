// To check for a valid/correct triangle
// sum of 3 angles in triangle = 180
// =============================
// ENCAPSULATION IS A WAY TO WRAP UP (PUT TOGETHER) 
// DATA-VARIABLES AND CODE-METHODS TOGETHER AS A SINGLE UNIT.

class triangle{

// State/Data
//==========
	private int angle1, angle2, angle3;		//60
	static int side1, side2, side3;
	int sumOfAngles;	// instance - COPY
	
	// Behavior/Methods
	triangle(){		 // constructor ko tham so 
	
		//to initialize-(put a starting value) the member variables
		sumOfAngles = 0;

	}
	
	triangle(int angle){	 // constructor truyen tham so, khoi tao tam giac deu 3 canh bang nhau

		angle1 = angle2 = angle3 = angle;

	}
	
	void enterAngles(){ 	// nhap 3 goc tam giac
	
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.print("\n\tEnter the first angle: ");
		angle1=sc.nextInt();//90
		
		System.out.print("\tEnter the second angle: ");
		angle2=sc.nextInt();//60
		
		System.out.print("\tEnter the third angle: ");
		angle3=sc.nextInt();//30

	}
	
	boolean isCorrectTriangle(){	 // kiem tra 3 goc nhap vao co tao thanh tam giac hay khong

		sumOfAngles = angle1 + angle2 + angle3;
		
		if(sumOfAngles == 180)

			return true;

		else

			return false;

	}
	
	void showAngle1(){		// ham in ra goc thu nhat cua tam giac
		
		System.out.print("\n\tThe first angle is: " + angle1);

	}
	
	void showAngle2(){

		System.out.print("\n\tThe second angle is: " + angle2);

	}
	
	void showAngle3(){

		System.out.print("\n\tThe third angle is: " + angle3);

	}

}

class doTriangle{	

	public static void main(String[] args){
		
		triangle tr = new triangle();
		tr.enterAngles();
		tr.showAngle1();//60,90,30--60
		tr.showAngle2();
		tr.showAngle3();
		
		//triangle tr1=new triangle(100);
		//tr1.showAngle1();//75
		
		//System.out.print("\n\tThe first angle is: "+tr.angle1);
		if(tr.isCorrectTriangle() == true)

			System.out.println("\n\n\tIt is a correct triangle");

		else

			System.out.println("\n\n\tIt is NOT a correct triangle");

	}

}