
//********************************DONE**********************************
public class DecimalToBinary {
	public static void main(String[] args) {
		int i=1;
		int a=9;
		System.out.println("decimal no : "+a);
		String rev="";
		while(a>0) {
		int x=a%2;
		rev=rev+x;
		a=a/2;
		}
		System.out.println("Binaray: "+rev);
	}

}
