package TwoD_Array;
import java.util.Scanner;

public class MAtrix {
	public static void main(String[] args) {
		
		String st="akshay";
		System.out.println(st.length());
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(arr.length);
//		int arr[][]=getArray();
//		System.out.println("Length of row  "+arr.length);
//		System.out.println("Length of column   "+arr[0].length);
//		display(arr);
		
	}

	private static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[  "+arr[i][j]+"  ]");;				
			}
			System.out.println();
		}
		
	}

	private static int[][] getArray() {
		System.out.println(" enter arrAY ORDER");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();		
		int arr[][]= new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();				
			}
			
		}
		
		return arr;
	}

}
