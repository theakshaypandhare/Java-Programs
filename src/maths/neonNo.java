package maths;
import java.util.Scanner;

//********************************DONE**********************************
public class neonNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		int base=sc.nextInt();
		int res=0,sum=0;
		
			res=base*base;
		
		System.out.println("squre of "+base+" is "+res);
		while(res>0)
		{
			int dig=res%10;
			sum=sum+dig;
			res=res/10;
			
		}
		System.out.println("sum  "+sum);
		if (base==sum)
		{
			System.out.println("neon "+sum);
		}
		else
			System.out.println("not neon "+sum);
	}

}
