
public class primeNo03March {
public static void main(String[] args) {
	int num=1987;
int count=0;
	while(num>0)
	{ 
		int dig=num%10;
		int i=2;
		while(i>0) {
			
		if(dig%i==0)
		{
			break;
		}
		i++;
		}
		if(dig==i)
		{ count++;
			System.out.println("prime no"+dig);
		}
		num=num/10;
		
	}
	System.out.println("count"+count);
}
}
