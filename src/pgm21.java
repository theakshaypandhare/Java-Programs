import java.util.Scanner;
public class pgm21 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter end value");
		int end=sc.nextInt();
		int i=0;
		while(end>=i)
		{
			if(i%2==0)
			{
				System.out.println("even no " +i);
				
			}
			i++;
		}

	}

}
