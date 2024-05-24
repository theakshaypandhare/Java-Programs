package ArrayList;
import java.util.*;
public class CollToArray {
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add("akshay");
	col.add("sundra");
	col.add(232);
	col.add(true);
	col.add(4323.545);
	
	System.out.println("way one");
	Object []arr=col.toArray();
	for (Object object : arr) {
		System.out.println(object);
	}
	
	System.out.println("way two");
	System.out.println(Arrays.toString(arr));
	
	System.out.println("Col collection:  "+col);
}
}
