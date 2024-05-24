package maths;
import java.util.Scanner;

//********************************DONE**********************************
public class palendrome 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0) //reverse no
		{
			int dig=num%10;
			rev=(rev*10)+dig;
			num=num/10;
		}
			if(temp==rev)
				System.out.println("it is  plaendrome");
			else
				System.out.println("not  palendrom");
		
	}
}
