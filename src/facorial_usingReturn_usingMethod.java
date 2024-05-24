
public class facorial_usingReturn_usingMethod {
	public static int factorial(int a)
	{
		int fact=1;
		for (int i = 1; i <=a; i++) {
			fact=fact*i;
			
		}
		return fact;
	}
public static void main(String[] args) {
	int res=factorial(5);
	System.out.println("factorial "+res);
}
}
