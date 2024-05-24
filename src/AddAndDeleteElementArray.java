
public class AddAndDeleteElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 8, 5, 3, 9 };
		System.out.println("array before adding");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr[3] = 1;

		arr[5] = 7;
		System.out.println("array after adding");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int index = 2;
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
			if (arr.length-2==i) {
				arr[arr.length-1]=0;
				
			}
		}
		System.out.println("array after delete");
		for (int i = 0; i <arr.length; i++) { // using for loop
			System.out.print(arr[i] + " ");
		} 
	}

}
