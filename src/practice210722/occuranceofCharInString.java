package practice210722;
public class occuranceofCharInString {
	public static void main(String[] args) {
		char a='a';
		String str="akshay";int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==a) {
				count++;
			}
		}System.out.println(count);
	}

}
