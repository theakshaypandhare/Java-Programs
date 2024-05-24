import java.util.Scanner;

public class OddDigitFromUserEntered {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	int digit=0;
	// 
	while(num>0)
	{
		digit=num%10;
		if(digit%2==0)
			System.out.println(digit);
		num=num/10;
	}
}
}
