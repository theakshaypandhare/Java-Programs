
public class seperateMethod {
public static void seperate(int num) {
	while(num>0)
	{
		int dig=num%10;
		System.out.println(dig);
		num=num/10;
	}
}
public static void main(String[] args) {
	
	seperate(1234);
}
}
