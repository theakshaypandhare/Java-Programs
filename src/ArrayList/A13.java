package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class A13 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(33);
		al.add(12);
		al.add(33);
		al.add(12);
		al.add(33);
		
		
		for (Object object : al) {
			System.out.println(object);
		}
	}
}
