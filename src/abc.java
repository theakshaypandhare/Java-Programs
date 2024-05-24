import java.util.Scanner;

public class abc 
{
	public static void main(String[] args) 
	{ Scanner sc=new Scanner(System.in);
	System.out.println("enter base  ");
		int base =sc.nextInt();
		System.out.println("enter power  ");
		int P =sc.nextInt();
		 int result = 1;
	
		 while( P>0)// 1<4 t
		 { 
			 result =result* base;
			  System.out.println(result);
		       P--;
		 }
	      // System.out.println(result);
	        }
	}
