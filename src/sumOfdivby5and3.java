import java.util.Scanner;

//********************************DONE**********************************
public class sumOfdivby5and3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting value");
	   int start=sc.nextInt();
	   System.out.println("enter ending value");
	   int end=sc.nextInt(),sum=0;
	   while(start<=end)
	   {
		   if(start%5==0||start%3==0)
		   {
			   sum=sum+start;
		   }
		   start++;
	}
	   if(sum%5==0)
		   System.out.println("sum is div by 5"+sum);
	   else
		   System.out.println("sum is not div by 5");
	}
	}
