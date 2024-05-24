import java.util.Scanner;

public class array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int i=sc.nextInt();
	
	int[] a=new int[i];

	for (int j2 = 0; j2 < a.length; j2++) 
	{
		
		a[j2]=sc.nextInt();
	}int digit;
	
	for (int j2 = 0; j2 < a.length; j2++) 
	{	int sum=0;
		int num=a[j2];
		 while(num>0)
		 {
			 digit=num%10;
			 sum=sum+digit;
			 num=num/10;
		 } System.out.print(sum+" ");
		 

	}
}
}
