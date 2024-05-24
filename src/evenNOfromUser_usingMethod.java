
public class evenNOfromUser_usingMethod {
	public static void even(int i) 
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int start=2;
		int end=30;
		while(start<end) {
			even(start);
			start++;
		}
	}

}
