package exceptionhandling;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Execution starts");
			int sum = 100 / 0;
		} catch (ArithmeticException e2) {
			System.out.println(e2);
		}
		System.out.println("rest of code executed");
		System.out.println("end of execution");
	}

}
