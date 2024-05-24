import java.util.Scanner;

public class sumofdigitAndCheckitisprine 
{
	//********************************DONE**********************************
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("enter no:  ");
	int num=sc.nextInt(),sum=0;
	while(num>0)
	{
		int digit=num%10;
		sum=sum+digit;
		System.out.println(digit);
		num=num/10;
	}
	System.out.println("sum "+sum);
	int i=2;
	for(i=2;sum>i;i++)
	{
		if(sum%i==0)
		{
							break;
		}		
	}if(sum==i)
		System.out.println("it is prime");
	else
		System.out.println("not prime");
}
}

