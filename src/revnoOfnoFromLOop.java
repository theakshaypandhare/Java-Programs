import java.util.Scanner;

//********************************DONE**********************************
public class revnoOfnoFromLOop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting value");
	   int start=sc.nextInt();
	   System.out.println("enter ending value");
	   int end=sc.nextInt();
	 
	   while(start<=end)
	   {
		  System.out.println("Num-> "+start); 
		  int temp1=start;
		  int rev=0;
		  while(temp1>0)
			{  
				int digit=temp1%10;
				rev=(rev*10)+digit;
				//  System.out.println(digit);
				
				temp1=temp1/10;
				
			}
		 System.out.println("Rev-> "+rev);
		
		  start++;
	   }
	   		//System.out.println(rev);
	}
}
