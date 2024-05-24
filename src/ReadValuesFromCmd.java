import java.util.Scanner;
public class ReadValuesFromCmd {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		//Scanner a11=new Scanner(System.in);
		System.out.println("enter how many values u want to enterd");
		int a1=a.nextInt();
		for(int i=1;i<=a.nextInt();i++)
		{ 
			System.out.println("enter value"+i);
			int a3=a.nextInt();
			System.out.println("user enterd values"+i+"--->"+a3);
		}
		
		
	}

}
