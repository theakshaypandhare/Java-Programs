package exceptionhandling;

public class NestedTryInCatch {
	public static void main(String[] args) {
		try {
			System.out.println("first Try Starts");
			int ar[] = new int[5];
			ar[10] = 11;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			try {
				System.out.println("2nd try starts inside catch");
				int sum = 100 / 0;
			} catch (ArithmeticException e2) {
				System.out.println(e2);
				System.out.println("catch inside catch is executed");
			}
		}
	}
}
