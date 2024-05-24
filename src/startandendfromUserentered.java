import java.util.Scanner;

public class startandendfromUserentered {
	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter starting value");
   int start=sc.nextInt();
   System.out.println("enter ending value");
   int end=sc.nextInt();
   while(start<=end)
   {
	   System.out.println(start);
	   start++;
   }
		
	}

}
