package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	Map<Integer,String> m=new TreeMap<>();
	m.put(2, "sayam");
	m.put(3, "mayank");
	m.put(1, "vayam");
 
	Iterator<Integer> iterator=m.keySet().iterator();
	while (iterator.hasNext()) {
		int i=iterator.next();
		System.out.println(i+" = "+m.get(i));
		
	}
	
	
};	
}

