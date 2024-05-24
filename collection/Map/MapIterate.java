package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterate {
public static void main(String[] args) {
	Map<Integer, String> m=new HashMap();
	m.put(1, null);
	m.put(2, "soham");
	m.put(3, "pritam");
	m.put(4, "bob");
	Set<Map.Entry<Integer,	String>> keyval=m.entrySet();
	for (Map.Entry<Integer, String> entry : keyval) {
		int key = entry.getKey();
		String val = entry.getValue();
		System.out.println("key="+key+" Value="+val);
		
	}
}
}
