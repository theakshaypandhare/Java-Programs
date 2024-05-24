import java.util.Scanner;

public class NumDivBy7FromUserGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt(),end=sc.nextInt();
		int sum=0;
		while(start<=end)
		{
			if(start%7==0)
			{
				sum=sum+start;
			System.out.println(sum);
			}
			start++;
		}
	}

}
