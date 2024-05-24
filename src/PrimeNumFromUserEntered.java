import java.util.Scanner;

public class PrimeNumFromUserEntered {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting from ");
		int start=sc.nextInt();
		System.out.println("enter ending from ");
		int end=sc.nextInt();
		int sum=0;
		for (int i = start; i <end; i++) 
		{ 
			int a=2;
			while(a>0)
			{
				if(i%a==0)
				{
					break;
				}
				a++;
			}
			if(i==a)
			{
				sum+=i;
			}
			
		}System.out.println(sum);
	}


}
