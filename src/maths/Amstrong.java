package maths;
import java.util.Scanner;
//********************************DONE**********************************
public class Amstrong 
{ 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Number ");
	int num=sc.nextInt();
	int temp=num;
	int num1=num;
	int count=0;
	int sum=0;
	while(num>0)
	{
		int dig=num%10;
		count++;
		num=num/10;
	}
	while(num1>0)
	{ int count1=count;
		int dig=num1%10;
		int res=1;
		while(count1>0)
			{  res=res*dig;
				count1--;
			}
		sum=sum+res;		
		num1=num1/10;
	}
	if(sum==temp)
		System.out.println("it is amstrong number ");
}
}
