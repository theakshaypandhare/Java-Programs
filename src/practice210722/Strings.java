package practice210722;

public class Strings {
	public static void main(String[] args) {
//		String a = "Ajit";
//		String b = "Ai";
//		System.out.println(a.length());
//		System.out.println(a.equals(b));
//		System.out.println(a.contains(b));
//		System.out.println(a.isEmpty());
//		System.out.println(a.concat(b));
//	System.out.println(a.isBlank());
		String s = "ajit";
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s1.reverse());
		
		///////////////////////////////////////
		StringBuilder s11=new StringBuilder(s);
		System.out.println(s11.reverse());

		
	}
}
