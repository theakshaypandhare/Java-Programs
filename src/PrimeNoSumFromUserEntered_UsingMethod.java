
public class PrimeNoSumFromUserEntered_UsingMethod {

	public static void primeNo(int a)
	{	int num=a;

	int sum=0;
		int i=2;
		while (num>i) {
			if (num%i==0) {break;
			}
			i++;
		}
		if(num==i)
		{ 	
			System.out.println(num+" is prime no");
		}sum=sum+num;
		System.out.println("sum= "+sum);
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {
				primeNo(i);	
		}
	}
}
