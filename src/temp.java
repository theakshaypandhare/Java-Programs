
public class temp implements Cloneable{
 
	public static void main(String[] args)
	{	
		temp o = new temp();
		System.out.println(o);
		System.out.println(o.hashCode());
		System.out.println(o.getClass());
		System.out.println(o.toString());
	}
	public void b() {
		System.out.println(this.toString());
	}
}
