package maths;
import java.util.Scanner;
//*****************************************DONE**********************************
public class primeNO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=2;
		for(i=2;num>i;i++)
		{
			if(num%i==0)
			{
								break;
			}		
		}if(num==i)
			System.out.println("it is prime");
		else
			System.out.println("not prime");
	}

}
