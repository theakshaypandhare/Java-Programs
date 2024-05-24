import java.util.Scanner;
public class UserEnteredValueIsEvenOROdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("no is even"+a);
		}
		else
		{
			System.out.println("no is odd"+a);
		}
	}

}
