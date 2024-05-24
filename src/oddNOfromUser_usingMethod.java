import java.util.Scanner;

public class oddNOfromUser_usingMethod {
	public static void odd(int i) 
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start value");
		int start=sc.nextInt();
		System.out.println("enter start value");
		int end=sc.nextInt();
		
		while(start<end) 
		{
			odd(start);
			start++;
		}
	}

}
