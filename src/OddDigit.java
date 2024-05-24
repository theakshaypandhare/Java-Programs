import java.util.Scanner;  
public class OddDigit   
{  
public static void main(String args[])  
{  
int number, digit, sum = 0;

Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = sc.nextInt();  
int num = 33, i = 2;
boolean flag = false;

	while(number > 0)  
	{  
			//finds the last digit of the given number    
			digit = number % 10; 

		  
		    while (i <= digit / 2) {
		      // condition for nonprime number
		      if (digit % i == 0) {
		        flag = true;
		        break;
		      }

		      ++i;
		    }

		    if (!flag)
		      System.out.println(digit + " is a prime number.");
		    else
		      System.out.println(digit + " is not a prime number.");
				sum = sum + digit; 
				
				//end of else  

//removes the last digit from the number  
number = number / 10;  
}  }
//prints the result  
//System.out.println("Sum of Digits: "+sum);  
}   