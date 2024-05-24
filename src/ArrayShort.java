import java.util.Arrays;

class ArrayShort {
//public static void main(String[] args) {
//	int[] arr= {341,100,553,4232,5};
//
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//System.out.println(Arrays.toString(arr));
//}
	public static void main(String[] args) {
//creating an instance of an array  
		int[] arr = new int[] { 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
		//                      
		System.out.println("Array elements after sorting:");
//sorting logic  
		for (int i = 0; i < arr.length; i++) //   1
		{
			for (int j = i + 1; j < arr.length; j++) //  4
			{
				int tmp = 0;//  
				if (arr[i] > arr[j]) //   1 > 3
				{
					tmp = arr[i];//   78
					arr[i] = arr[j];//  34
					arr[j] = tmp;// 78  
				}
			}//   1 34
//prints the sorted element of the array  
			System.out.println(arr[i]);
		}
	}
}
