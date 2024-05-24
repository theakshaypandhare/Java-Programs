import java.util.Scanner;
public class pgm20 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter end value");
		int end=sc.nextInt();
		int i=1;
		while(end>=i)
		{
			System.out.println(i);
			i++;
		}

	}

}
