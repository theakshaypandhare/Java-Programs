package ImportantPrograms;
public class prime {
	public static void prime(int num) 
	{
		int i=2;
		
		while (i<num) 
		{
			if (num%i==0) 
			{
				break;
			}
			i++;
		}
		if (num==i) {
			System.out.println("prime no: "+i);
		}
	}
	public static void main(String[] args) 
	{
		for (int i = 0; i < 30; i++) {
			prime(i);
		}
	}
}
