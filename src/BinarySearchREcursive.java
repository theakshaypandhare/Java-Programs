
public class BinarySearchREcursive {//				3		  4         40
	public static int binarySearch(int arr[], int first, int last, int key) {
		if (last >= first) {    //4-3
			System.out.println(last+" last"); 
			System.out.println(first+" first");
			int mid = first + (last - first) / 2;//   2
			System.out.println(mid);
			if (arr[mid] == key) { //    f
				return mid;
			}
			if (key < arr[mid]) {// 40<f 
				System.out.println("key < arr[mid]");
				return binarySearch(arr, first, mid - 1, key);// search in left subarray
			} else { //t
System.out.println("mid  "+" "+(mid+1));
				return binarySearch(arr, mid + 1, last, key);// search in right subarray
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 40;
		int last = arr.length - 1;
		int result = binarySearch(arr, 0, last, key);
		if (result == -1)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}
}