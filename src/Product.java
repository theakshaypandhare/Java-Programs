import java.util.Scanner;
public class Product{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt(),digit=0,prod=1;
		while(b>0) {
			digit=b%10;
			prod=prod*b;
			System.out.println(prod);
			b=b/10;
		}
		
	}
}
