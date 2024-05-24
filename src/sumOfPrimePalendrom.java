import java.util.Scanner;

public class sumOfPrimePalendrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start");
		int start=sc.nextInt();
		System.out.println("enter end");
		int end=sc.nextInt();
		for (int num = start; num < end; num++) 
		{ int temp=num;
			int rev=0;
			while(temp>0)
			{
				int dig=temp%10;
				rev=(rev*10)+dig;
				temp=temp/10;
			}
			if(num==rev)
			{
				int num1=rev;
				int i=2;
				for(i=2;num1>i;i++)
				{
					if(num1%i==0)
					{
										break;
					}		
				}if(num1==i)
				{ int sum=0;
						sum=sum+num1;
					System.out.println("it is prime "+sum);
			}
		   }
		}
	}

}
