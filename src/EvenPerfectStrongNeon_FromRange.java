import java.util.Scanner;
public class EvenPerfectStrongNeon_FromRange {
	public static void main(String[] args) {
		System.out.println("waptd find sum of user given range"+"\n"+"check sum is even or odd "+"\n"+"if the sum is even check perfect or not"+"\n"+"if sum is odd check strong or not"+"\n"+"if sum div of 3 check neon no or not");
		System.out.println("*********************************************************************************************");
		Scanner sc=new Scanner(System.in); 	//scann numbering and ending value of loop
		System.out.println("enter number");
		int number=sc.nextInt();
		int sum=0;
	while(number>0)
	{  int dig=number%10;
		sum=sum+dig;		//seperate numbers and sum of user enterd value
		number=number/10;
	}
	if(sum%2==0)		//check sum is even or odd
	{ System.out.println("sum is even "+sum);
		int num=sum;
		int i=1;					
		int sum1=0;
		while(num>i)//6>
		{
			if(num%i==0)
			{				   // if sum is even check perfect no or not
				sum1=sum1+i;
			}
			i++;
		}
		if(sum1==num) 
		System.out.println("perfect no "+sum1);
		else
			System.out.println("not perfect no  "+sum1);
	}
	else
	{
		int num=sum;
		int temp=num;
		int sum111=0;
		while(num>0)
		{ 			int dig=num%10;
		System.out.println("dig"+dig);
				int fact=1;
				
			for (int i = 1; i <= dig; i++) 
			{
				fact=fact*i; //strong
				
			}
		System.out.println(fact);
			sum111=sum111+fact;
			num=num/10;
		}
		
		if(sum111==temp)
		{
			System.out.println("Strong number");
		
	}
	}
	if(sum%3==0)
	{					//if sum is divisible by 3 check neon nos
		System.out.println("sum is divisible by 3 "+sum);      
		int base=sum;
		int res=0,sum11=0;
			res=base*base;
		System.out.println("squre of "+base+" is "+res);
		while(res>0)
		{
			int dig=res%10;
			sum11=sum11+dig;					
			res=res/10;
		}
		System.out.println("sum  "+sum11);
		if (base==sum11)
		{
			System.out.println("neon "+sum11);
		}
		else
			System.out.println("not neon "+sum11);
	}
	else
		System.out.println(sum +"not divisible by 3");
	}

}
	
