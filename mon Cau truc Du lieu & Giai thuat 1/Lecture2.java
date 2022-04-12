import java.util.*;

class Student{	// khoi tao class khong bao gom Constructor
		
	public String name;
	public int age;
	public double score;
		
	public void setName(String s){

		name = s;

	}

	public void setAge(int age1){

		age = age1;

	}
	
	public void setScore(double score1){

		score = score1;

	}
		
	public String getName(){

		return name;

	}

	public int getAge(){

		return age;

	}

	public double getScore(){

		return score;

	}
		
	public void In(){

		System.out.println(name+" "+age+" "+score);

	}
	
}


public class Lecture2{

   public static void main(String[] args){

	   Student x = new Student();
	   Student y = new Student();
	   
	   x.setName("Nam");
	   x.setAge(18);
	   x.setScore(9.5);
	   
	   y.setName("Hung");
	   y.setAge(19);
	   y.setScore(8);
	   
	   x.In();
	   y.In();

   } 
   
}