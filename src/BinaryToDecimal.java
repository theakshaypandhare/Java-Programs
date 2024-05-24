import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary no ");
		int num=sc.nextInt();		

		int s=0;
		int j=1,i;
		while(num>0)
		{
			int dig=num%10;
			s=s+dig*j;
			j=2*j;
			num=num/10;
		}
		System.out.println("binary to decimal "+s);
	}

}
