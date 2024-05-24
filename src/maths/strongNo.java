package maths;

import java.util.Scanner;

public class strongNo {
	public static void strong(int num) {

		int temp=num;
		int sum111=0;
		while(num>0)
		{
			int dig=num%10;
			int fact=1;
				
			for (int i = 1; i <= dig; i++) 
			{
				fact=fact*i; //strong
				
			}
			sum111=sum111+fact;
			num=num/10;
		}
		
		if(sum111==temp)
		{
			System.out.println("Strong number");
		
	}
		else
			System.out.println("not strong no");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no ");
		int i=sc.nextInt();
		strong(i);
	}

}
