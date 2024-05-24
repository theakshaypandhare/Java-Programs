package ImportantPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortUsingSwap {
	public static void main(String[] args) {
		int arr[]= {12,4,5,8,4,6,2,3,5,4,8,4};
		/*for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		Arrays.sort(arr);
		
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
