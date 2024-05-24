import java.util.Scanner;

public class tables {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for (int j=1;j<=num;j++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+"  x  "+j+"  =  "+j*i);
			
			}
			System.out.println("---------------------------------------------");
		}
	}

}
