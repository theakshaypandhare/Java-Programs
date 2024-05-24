package exceptionhandling;

public class MultipleExcepInSingleCatch {
	public static void main(String[] args) {
		try {
			int ar[] = { 1, 2, 3, 4 };
			ar[10] = 322;
			int sum = 100 / 0;
			System.out.println(sum);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
		}
	}
}
