package ImportantPrograms;

public class PallendromString {
public static void main(String[] args) {
	String str="dad";
	String rev ="";
	for (int i = 0; i < str.length(); i++) {	
		
		rev=str.charAt(i)+rev;
		
	}
	System.out.println(rev);
	if (rev.equals(rev)) 
		System.out.println("pallendrom");
	else
		System.out.println("not pallendrom");
	}
}
