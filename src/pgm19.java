import java.util.Scanner;

public class pgm19 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter int= ");
	int i=sc.nextInt();
	
	System.out.println("enter short= ");
	short s1=sc.nextShort();
	
	System.out.println("enter Byte= ");
	byte b1=sc.nextByte();
	
	System.out.println("enter Long= ");
	long l1=sc.nextLong();
	
	System.out.println("enter float= ");
	float f1=sc.nextFloat();
	
	System.out.println("enter double= ");
	double d1=sc.nextDouble();
	
	System.out.println("enter boolean= ");
	boolean bool=sc.nextBoolean();
	
	System.out.println("enter single string= ");
	String str=sc.next();
	
	System.out.println("enter StringLine.full= ");
	String strL=sc.nextLine();
	
	char ch=sc.next().charAt(0);
}
}
