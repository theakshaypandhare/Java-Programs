package practice5jun;

public class reverseString {

private static void revstr(String str) 
{
	String temp="";
	for (int i = 0; i < str.length(); i++) {
		temp=str.charAt(i)+temp;
	}
	System.out.println(temp);
}

public static void main(String[] args) {
	revstr("akshay");
}
}
