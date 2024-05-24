import java.util.Scanner;

public class allBinaryFromUserGivenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start num ");
		int start=sc.nextInt();
		System.out.println("enter end num ");
		int end=sc.nextInt();
		while(start<=end)
		{int num=start;
		String con="";
			while(num>0)
			{
				int dig=num%2;
				con=con+dig;
				num=num/2;
				
			}
			System.out.println("num "+start+ " to bin " +con);
			start++;
		}
	}

}
