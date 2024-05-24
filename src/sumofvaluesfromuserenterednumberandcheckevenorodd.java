import java.util.Scanner;

public class sumofvaluesfromuserenterednumberandcheckevenorodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting value");
		   int i=sc.nextInt();
		   System.out.println("enter ending value");
		   int num=sc.nextInt();
		   int sum=0;
		   while(i<=num)
		   {
			   sum=sum+i;
			   			   i++;
		   }
		   if(sum%2==0)
			   System.out.println("value is even---->"+sum);
		   else
			   System.out.println("value is odd---->"+sum);

	}

}
