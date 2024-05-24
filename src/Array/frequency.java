package Array;

public class frequency {
	public static void main(String[]args)
	{
		int arr[]= {11,22,33,44,33,44,33,33};
		int fr[]=new int[arr.length];	
		int visited=-1;
		int i=0;
		while (i<arr.length) 
		{
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
				if(fr[i] != visited) 
				{
					fr[i] = count;  
			}
			i++;
		}
		for (int j = 0; j < fr.length; j++) {
			System.out.println(fr[j]);
		}
		}
	}}
