package maths;

import java.util.Scanner;

public class reverseNumber{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no for rev ");
		int i=sc.nextInt();
		reverese(i);
	}
	public static void reverese(int i) {

		//reverse no
		int rev=0;
		while(i>0)
		{
		int digit=i%10;//
		rev=(rev*10)+digit;//
		i=i/10;//
		}
		System.out.println("--------------------");
		System.out.println("final rev  "+rev);

	}
}
