import java.util.Iterator;
import java.util.Scanner;

public class arraya {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int a[]=new int[n];
	int[] b=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		a[i] =sc.nextInt();
	}
	int x =sc.nextInt();
	
	
	
	
	for (int i = 0; i < a.length; i++) {
		if(i==a.length-1)
		{

			b[i]=a[i]-a[i+1];
		}
		else
		{
			break;
			
		}
		System.out.println(b[i]);
	}
}

}
