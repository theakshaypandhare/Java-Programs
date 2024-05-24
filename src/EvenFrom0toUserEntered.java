import java.util.Scanner;

public class EvenFrom0toUserEntered {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		int a=sc.nextInt();
		int i = 1;
		while(i<=20)
		{
			if(i%2==0)
				System.out.println(i);
			    i++;
				
		}
		
		
		
	}

}
