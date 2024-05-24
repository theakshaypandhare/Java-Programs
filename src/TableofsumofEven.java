import java.util.Scanner;

public class TableofsumofEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting value");
   int start=sc.nextInt();
   System.out.println("enter ending value");
   int end=sc.nextInt();
   int temp;
   int sum=0;
 if(start>=end)
	 {temp=start;
 start=end;
end=temp;
	 }

 while(start<=end)
 {
	   if(start%2==0)
	   {
		   sum=sum+start;
	   }
	   start++;
 }
 
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"  x  "+sum+"  =  "+sum*i);
		
		}
		System.out.println("---------------------------------------------");
}

}
