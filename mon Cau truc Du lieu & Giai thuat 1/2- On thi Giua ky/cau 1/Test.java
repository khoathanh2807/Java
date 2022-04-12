public class Test {

	public static void main(String[] args){

		MyEmployee emp1 = new MyEmployee("John", 'M', 45, 33000);
		MyEmployee emp2 = new MyEmployee("Mary", 'F', 46, 38500);
		MyEmployee emp3 = new MyEmployee("John", 'M', 45, 33000);

		System.out.println("\n Salary of emp1 = " + emp1.computeSalary());
		System.out.println(" Salary of emp2 = " + emp2.computeSalary());
		System.out.println(" Salary of emp3 = " + emp3.computeSalary());

		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		System.out.println(emp2.equals(emp3));

		System.out.println("\n Qty = " + MyEmployee.getQuantity());

	}

}