import java.util.Scanner;

public class PrimeNoMethod {
	
	
	//--------------------------------------------------------------
	public static void prime(int prime)
	{
		int i=2;
			while(i<prime)
			{
				if(prime%i==0){
					break;
					}
				i++;
			}
		if(prime==i)
			System.out.println("prime no "+i);
	}
	//--------------------------------------------------------------

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start value");
		int start=sc.nextInt();
		System.out.println("enter start value");
		int end=sc.nextInt();
		
		while(start<end) 
		{
			prime(start);
			start++;
		}

	}
	

}
