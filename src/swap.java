import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting value A--> ");
	   int a=sc.nextInt();//10
	   System.out.println("enter ending value B--> ");
	   int b=sc.nextInt();//20
	   System.out.println("enter 1 for swap with temp");
	   System.out.println("enter 2 for swap without temp");
	  
	   int ii=sc.nextInt();
	   System.out.println("before swapping");
       System.out.println("A=="+a);
       System.out.println("B=="+b);
       switch (ii) {
	case 1:
		   int temp=a;//temp=10
	       a=b;//a=20
	       b=temp;//b=10
		break;

	case 2:
		 a=a+b;//10+20=30 a=30
	       b=a-b;//30-20=10 b=10
	       a=a-b;//30-10=20 a=20
		break;
	}	      
	       System.out.println("after swapping");
	       System.out.println("A=="+a);
	       System.out.println("B=="+b);
	}

}
