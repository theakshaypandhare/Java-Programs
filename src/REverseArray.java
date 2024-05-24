
class REverseArray
{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int temp;
		int start=0;
		int end=arr.length-1;
		while(start<end)//3  <  3
		{
			temp=arr[start];     //3
			arr[start]=arr[end];//5
			arr[end]=temp;// 3
			start++;
			end--;
			//                         7  6 5           3 2  1
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
	}
}