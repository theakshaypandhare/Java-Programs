package practice5jun;

public class pallindrome {
public static void main(String[] args) {
	int num=121;
	int num1=num;
	int temp=0;
	while(num>0)
	{
		int dig=num%10;
		temp=(temp*10)+dig;
		num=num/10;
	}
	if(num1==temp)
	{
		System.out.print(temp);
		System.out.println(" is pallendrome");
	}
	else
	{
		System.out.print(temp);
		System.out.println(" is not pallendrome");
	}
}
	}
