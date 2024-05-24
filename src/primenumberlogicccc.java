import java.util.Scanner;
public class primenumberlogicccc
 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers...");
	  int num =sc.nextInt(), flag = 0;
	   for(int i=2 ; i < num/2 ; i++) {
	      if(num%i == 0) {
	    	  System.out.println("is not a prime number---->"+num);
	         flag = 1;
	         break;
	      }
	   }
	   if(flag == 0) {
		   System.out.println("is a prime number--->"+num);
	   }
	 
	}
	
}
