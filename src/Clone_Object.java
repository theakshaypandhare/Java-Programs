
public class Clone_Object extends Object implements Cloneable{
	Clone_Object(int a)
	{
		System.out.println(a);
	}
	void hello()
	{
		System.out.println("hello Akshay");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public static void main(String[] args) {
		
		Clone_Object o=new Clone_Object(22);
		Clone_Object o22=new Clone_Object(22);
		int a=77,b=77;
		
		try {
			Clone_Object o2=(Clone_Object) o.clone();

			System.out.println(o.hashCode());
			System.out.println(o2.hashCode());
			System.out.println(o.toString());
			System.out.println(o2.toString());
			System.out.println(o.getClass());
			o.hello();
			o2.hello();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
