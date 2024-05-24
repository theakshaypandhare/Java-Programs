import java.util.Arrays;

public class SeprateStringReverse {
	public static void main(String[] args) {
		
		String str = "Welcome To Java Training";
		
		String[] strr = str.split(" ");//using split method split string
										//from space and store in array
		for (int i = 0; i < strr.length; i++) {
			//string stored at place of i making type of string builder 
			StringBuilder s = new StringBuilder(strr[i]);
			//used inbuilt reverse method of stringbuilder class
			s.reverse();
			strr[i] = s.toString();//converted stringbuilder type string into string
		}
		//converted array into string
		System.out.println(Arrays.toString(strr));
	}
}
