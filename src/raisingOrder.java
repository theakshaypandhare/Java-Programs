import java.util.Scanner;

public class raisingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int dig;int rev=0,rev1=0;
		int digg;
		while(num>0)
		{
			dig=num%10;
		//	System.out.println(dig);
			if(num
					<=num%10)
			{  
				rev=(rev*10)+dig;
			}
			else {
				rev1=(rev1*10)+dig;
			}
			
			num=num/10;
			
		}
		System.out.println(rev);
		System.out.println(rev1);
	}

}
