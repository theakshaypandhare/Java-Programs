
import java.util.Scanner;

public class rev {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 int digit ,sum=0;
	 while(num>0)
	 {
		 digit=num%10;
		 sum=sum+digit;
		 num=num/10;
	 } System.out.println(sum);
	}
	}

