package maths;

public class AutoMorp {
	public static void main(String[] args) {
		int num=76;
		int temp=num;
		int divsor=1;
		
		while(num>0)
		{
		 num=num/10;
		 divsor=divsor*10;
		}
		System.out.println("Divisor "+divsor);
		int x=(temp*temp)%divsor;
		System.out.println("after seperation   "+x);
		if (x==temp) 
			System.out.println("auto morph");
		else
		{
			System.out.println("not automorph");
		}
	}

}
