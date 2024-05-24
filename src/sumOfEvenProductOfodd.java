
public class sumOfEvenProductOfodd {
	public static void main(String[] args) 
	{
		int sum=0,sum1=1;
	for (int i = 20; i <=120; i++) 
	{
	if(i%2==0)
		{
	      sum=sum+i;
		}
	else
		{
		sum1=sum1*i;
		}
	}
	System.out.println("sum of even   "+sum);
	System.out.println("sum of product of odd   "+sum1);

	
	}

}
