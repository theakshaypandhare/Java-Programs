
public class powerOfGivenValue_usingReturn_usingMethod {
	public static int power(int a,int b)
	{int pow=1;
		for (int i = 1; i <=b; i++) {
			
			pow=pow*a;
		}
		return pow;
	}
public static void main(String[] args) {
	int res=power(6, 2);
	System.out.println(res);
}
}
