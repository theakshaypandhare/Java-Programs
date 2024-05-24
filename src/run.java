
public class run {
	int id;
	String name;
	public run(int i ,String name)
	{
		this(10);
		System.out.println("con 1");
	}
	public run()
	{
		System.out.println("con 2");
	}
	public run(int id)
	{
		this();
		System.out.println("con 3");
	}
	public run(String name)
	{
		this(10,"java");
		System.out.println("con 4");
		
	}
	public static void main(String[] args) {
		new run(null);
		
	}
}
