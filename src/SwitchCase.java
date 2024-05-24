import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
		{
			int a,b;
			Scanner sc=new Scanner(System.in);
			int i;
			System.out.println("enter 1 for add  ");
			System.out.println("enter 2 for sub  ");
			System.out.println("enter 3 for mul   ");
			i=sc.nextInt();
			System.out.println("enter operand A   ");
			a=sc.nextInt();
			System.out.println("enter operand b   ");
			b=sc.nextInt();
			
			switch (i) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
			
			case 3:
				System.out.println(a*b);
			}
			
		}
	}

