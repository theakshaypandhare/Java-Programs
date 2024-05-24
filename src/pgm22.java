import java.util.Scanner;
public class pgm22 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter end value");
		int end=sc.nextInt();
		int i=0;
		int sum=0;
		while(i<=end)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("sum "+sum);
	}
	

}
