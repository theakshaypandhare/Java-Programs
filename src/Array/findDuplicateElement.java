package Array;

import java.util.Iterator;

public class findDuplicateElement {
public static void main(String[] args) {
	int arr[]= {23,43,43,23,23,24,45,56,6787,86,45,56,232,45,45,5,54,45,32,45,576,8,67,98,56};

for (int i = 0; i < arr.length; i++) 
{	int count=0;
	for (int j = i+1; j < arr.length; j++) {
	
		if(arr[i]==arr[j] && arr[j]!=0) {
			arr[j]=0;
			count++;}
	}
	if (count>0) {
//		System.out.println("count "+count);
		System.out.println(arr[i]);	
	}
}
	
}
}
