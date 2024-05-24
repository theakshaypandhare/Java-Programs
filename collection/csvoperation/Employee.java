package csvoperation;

public class Employee {
	String name;
	String birthdate;
	double salary;

	public Employee(String name, String birthdate, double salary) {
		this.name = name;
		this.birthdate = birthdate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", birthdate=" + birthdate + ", salary=" + salary ;
	}
	
}
