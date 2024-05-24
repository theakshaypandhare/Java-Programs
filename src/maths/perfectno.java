package maths;
import java.util.Scanner;
public class perfectno
{
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no ");
	int num=sc.nextInt();
	int i=1;
	int sum=0;
	while(num>i)//6>
	{
		if(num%i==0)
		{
		System.out.println(i);
			sum=sum+i;
		}
		i++;
	}
	if(sum==num) 
	System.out.println("perfect no "+sum);
	else
		System.out.println("not perfect no  "+sum);
}
}
