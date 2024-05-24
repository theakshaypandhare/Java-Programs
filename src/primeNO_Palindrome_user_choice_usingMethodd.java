import java.util.Scanner;

class primeNO_Palindrome_user_choice_usingMethodd
{
	public static int prime(int a)
	{
		int num=a;
		int num1;
		int i=2;
		for(i=2;num>i;i++)
		{
			if(num%i==0)
			{
								break;
			}		
		}if(num==i)
		{ System.out.println("prime");
		num1=num;
		}
		return i;
	}
	
	public static void palindrome(int a)
	{ 
		int num=a;
		int temp=a;
		int rev=0;
		while(num>0) //reverse no
		{
			int dig=num%10;
			rev=(rev*10)+dig;
			num=num/10;
		}
		if(temp==rev)//check palindrome
		{
			if(temp==rev)
			{
				System.out.println("it is plaendrome "+a);
			}
			else
			{
				System.out.println("not palindrome");
			}
	}
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("enter ur choice");
		int a=sc.nextInt();
		if (a==1)
			{ System.out.println("enter value for prime");
			int i=sc.nextInt();
			prime(i);
			}
		else if(a==2)
		{System.out.println("enter value for palindrome");
		int i=sc.nextInt();
			palindrome(i);
//		prime(14);
//		palindrome(121);
		}
	}}
