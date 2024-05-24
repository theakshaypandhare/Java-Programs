
public class equalsMEthod {
public static void main(String[] args) {
	String s="Akshay";
	String s1=new String("Akshay");
	String s2=new String("Akshay");
	System.out.println(s.equals(s2));//true    //we pass literal and object string it checks the content address of both 
									// are diffrent but content is same thats why output is true
	System.out.println(s1.equals(s2));//true
	
	if (s==s2) {       //comapre location
		System.out.println(true); //but we passed litral string and object string thats why output is
	}								//false
	else 
		System.out.println(false);
	
	
	if (s1==s2) {					//comapre location
			System.out.println(true);// we passed both object string and address of both is diffrent thats why output
		}							//false
		else 
			System.out.println(false);
	System.out.println(s.hashCode());
	System.out.println(s2.hashCode());
	int a=10;
	
}
}
