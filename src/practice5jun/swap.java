package practice5jun;

public class swap {
public static void main(String[] args) {
	int a=44;
	int b=55,temp;
	temp=a;
	a=b;  //  10
	b=temp; //20
	System.out.println("a "+a+" b "+b);
	
	a=a+b; //30
	b=a-b; //10 
	a=a-b;//10
	System.out.println("a "+a+" b "+b);
	
}
}
