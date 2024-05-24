import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double Salary;
	String Desig;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		id = sc.nextInt();
//		System.out.println("enter Name");
//		name = sc.next();
//		System.out.println("enter salary");
//		Salary = sc.nextDouble();
//		System.out.println("enter Designation");
//		Desig = sc.next();
//		if (Desig.equalsIgnoreCase("manager")) {
//			Salary = Salary + 5000.0;
//		} else if (Desig.equalsIgnoreCase("programmer")) {
//			Salary = Salary + 3000.0;
//		} else {
//			Salary = Salary + 1500.0;
//		}
	}

	void displayData() {
		System.out.println("id= " + id);
		System.out.println(this.toString());
//		System.out.println("name= " + name);
//		System.out.println("salary= " + Salary);
//		System.out.println("designation= " + Desig);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of employees");
		
		int size = sc.nextInt();
		Employee arr[] = new Employee[size];
		for (int i = 0; i < arr.length; i++) {
			Employee e = new Employee();
			e.setData();
			arr[i]=e;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i].displayData();
			System.out.println("----------------------");
		}
	}
}
