import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class aaaaaaaaaaaa {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	for (int i : arr) {
		System.out.println(i);
	}
	int op1=arr.length-1;
	int sum = arr[op1]*arr[0];
	System.out.println(sum);
	
	
	
}
}
