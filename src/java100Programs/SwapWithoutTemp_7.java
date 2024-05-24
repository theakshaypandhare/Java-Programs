package java100Programs;

public class SwapWithoutTemp_7 {
	public static void main(String[] args) {
		int a=10,b=20;
		a=a+b;//30
		b=a-b;//10
		a=a-b;
		System.out.println("a "+a+" b "+b);
	}
	
}
