import java.util.Scanner;

public class WiproSumOfEvenOddAndSubstraction 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(),digit=0,sum=0,sum1=0;
		while(num>0) 
		{
			digit=num%10;
			
			if(digit%2==0)
			{
				sum=sum+digit;
				
			}
			else
			{
				sum1=sum1+digit;
			}
			num=num/10;
		}
		int sub=sum-sum1;
		if(sub<0)
		{
        int temp=sub*(-1);
			System.out.println(temp);
		}
		else
		{
			System.out.println(sub);
		}
	}
}
