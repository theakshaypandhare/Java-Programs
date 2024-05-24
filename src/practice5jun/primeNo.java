package practice5jun;

public class primeNo {
	private static void prime(int num) 
	{
			int i=2;
			while (i<num) {
				if (num%i==0) 
				{
					break;
				}
				i++;
				
			}
			System.out.print(num+" ");
			if (num==i)
				System.out.println("prime");
			else
				System.out.println("not PRime no");
	}
	public static void main(String[] args) {
		primeNo p=new primeNo();
		for (int i = 0; i <=10; i++) {
			prime(i);
		}
		
	}
}
