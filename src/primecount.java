import java.util.Scanner;

public class primecount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int count=0;
		while(num<=0)
		{
			int digit=num%10;
			int i=2;
		while(digit>=i)
		{
			if(digit%i==0)
			{
				break;
			}	
			i++;
		}
		if(digit==i)
		{
			System.out.println("it is prime"+digit);
		count++;
		}
		num=num/10;
			}
		}
}


