
public class SumOfMinus10to10 {

	public static void main(String[] args) {
		int i=-10;
		int sum=0;
		System.out.println("Using  While");

		while (i<=10) 
		{ 
			sum=sum+i;	
			
				i++;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub
		
		
		System.out.println("Using do While");
		
		do
		{ 
			sum=sum+i;	
			
				i++;
		}
		while (i<=10) ;
		System.out.println(sum);

	}

}
