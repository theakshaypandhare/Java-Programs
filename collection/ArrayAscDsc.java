import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayAscDsc {
	public static void main(String[] args) {
		String arr[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}

		Comparator<String> asc = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		Comparator<String> dsc = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2) * -1;
			}
		};
		Arrays.sort(arr, asc);
		System.out.println();
		;
		for (String string : arr) {
			System.out.println(string);
		}
		
		Arrays.sort(arr, dsc);
		System.out.println();
		;
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
