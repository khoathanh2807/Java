// Chuong trinh quan ly Danh sach Sinh vien, diem so

import java.util.*;

class Person{

	String name;
	int age;
	
	Person(){	// constructor ko tham so
		
	}
	
	Person(String name, int age){  	// constructor co tham so

		this.name = name;
		this.age = age;

	}
	
	String getName() {

		return name;

	} 	

	int getAge() {

		return age;
	
	}
	
	void print() {

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);

	}

}

class Student extends Person{

	String studentID;
	String university;
	
	Student(String name, int age, String studentID, String university){

		super(name, age);
		this.studentID = studentID;
		this.university = university;

	}
	
	String getStudentID() {
		
		return studentID;
	
	}

	String getUniversity() {
		
		return university;
	
	}
	
	void print() {

		super.print();
		System.out.println("Student ID: " + studentID);
		System.out.println("University: " + university);

	}

}

class Result extends Person{

	String student_ID;
	double grade;		// diem so cua SV
	
	Result(String name, int age, String student_ID, double grade){

		super(name, age);
		this.student_ID = student_ID;
		this.grade = grade;

	}
	
	String getStudent_ID() {
		
		return student_ID;
	
	}

	double getGrade() {
		
		return grade;
	
	}
	
	void print() {

		super.print();
		System.out.println("Student ID: "+student_ID);
		System.out.println("Grade: "+grade);

	}

}
	
class BaitapVenha{

	public static void main(String[] args){

		Student s1= new Student("Khoa", 19, "517H0008", "DH Ton Duc Thang");
		Result r1 = new Result("Long", 18, "517H0069", 9.5);
		Result r2 = new Result("Nam", 19, "517H0099", 5.0);
		Result r3 = new Result("Tai", 20, "517H0096", 7.5);
		
		System.out.print("\n");
		s1.print(); 

		System.out.print("\n\n");
		r1.print();

		System.out.print("\n\n");
		r2.print();

		System.out.print("\n\n");
		r3.print();
		
	}

}