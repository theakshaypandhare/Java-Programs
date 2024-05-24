import java.util.Scanner;

public class revreseString 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String rstr="";
	int i=str.length()-1;
	while(i>=0)
	{
		rstr=rstr+str.charAt(i);
		i--;
	}
	System.out.println(rstr);
}
}
