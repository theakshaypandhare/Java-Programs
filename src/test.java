
public class test {
	int id=100;
	static int age=99;
	static test t1=new test();
	public static void main(String[] args) {
		int age=55;
		System.out.println(test.age);
		System.out.println(t1.age);
		
		run();
		t1.abc();
		
	}
	public static void run() 
	{
		int age=500;
		int id=22;
	System.out.println(test.age);
	System.out.println(t1.id);
	}
	public void abc() 
	{int age=44;
		System.out.println(t1.age);
		
	}

}
