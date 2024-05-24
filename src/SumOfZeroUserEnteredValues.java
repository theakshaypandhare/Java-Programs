import java.util.Scanner;

public class SumOfZeroUserEnteredValues {
	public static void main(String[] args) 
	{
		int i=1;//init
				int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int a=sc.nextInt();
		while(i<=a)//condn 
		{
			sum=sum+i;//statement
			i++;//updation
		}
		System.out.println(sum);
			
	}

}
