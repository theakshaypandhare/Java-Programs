package maths;
import java.util.Scanner;
public class RevrseString {
	public static void strRev(String s) {
		String str=s;
		char ch=' ';
		String rev="";
		for (int i =str.length()-1; i>=0; i--) {
			ch=str.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string for reverse ");
		String str=sc.nextLine();
		strRev(str);
	}
	}


