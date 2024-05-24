package TestVagrant;
/*package whatever //do not write package name here */

import java.io.*;

class Main {
	public static String isPalindrome(String str)
	{
		
		
		
		
		
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			return str;
		}
		return "not possible";
		
		
		
		
		}
	
	public static void main(String[] args)
	{
		// Input string
		String str = "geeks";

		// Convert the string to lowercase
		str = str.toLowerCase();
		String A = isPalindrome(str);
		System.out.println(A);
	}
}
