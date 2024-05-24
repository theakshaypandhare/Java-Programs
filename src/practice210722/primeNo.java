package practice210722;

import java.util.Iterator;

public class primeNo {
	public static void main(String[] args) {
		int i = 2;
		int num = 7;
		while (i<=num) 
		{
			if (num % i == 0) {
				break;
			}
			i++;
		}
		System.out.println(i);
		if (i == num)
			System.out.println("prime no");
		else
			System.out.println("not prime");
	}
}
