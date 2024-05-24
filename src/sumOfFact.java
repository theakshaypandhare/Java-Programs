
public class sumOfFact {
	static int num=145;
int temp=num;
int sum=0;
	public static void main(String[] args) 
	{
		int num=145;
		int temp=num;
		int sum=0;
		while(num>0)
		{ 			int dig=num%10;
		System.out.println("dig"+dig);
				int fact=1;
				
			for (int i = 1; i <= dig; i++) 
			{
				fact=fact*i;
				
			}
		System.out.println(fact);
			sum=sum+fact;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		
	}

}
