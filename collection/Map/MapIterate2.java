package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import maths.strongNo;

public class MapIterate2 {
public static void main(String[] args) {
	Map<Integer,String> m=new LinkedHashMap<>();
	m.put(1, "sameer");
	m.put(3, "jeer");
	m.put(4, "ameer");
	m.put(2, "paneer");
	m.put(5, "heer");
	
	//using iterator keySet();
	Iterator<Integer> iterator=m.keySet().iterator();
while (iterator.hasNext()) {
	int key=iterator.next();
	System.out.println(m.get(key));
}
//using for each loop keySet()

for (int a :m.keySet()) {
	System.out.println(a);
	
}
//using for each loop entrySet()
Set<Entry<Integer, String>> map=m.entrySet(); 
for (Map.Entry<Integer, String> entry : map) {
	int key = entry.getKey();
	System.out.println(key+" "+m.get(key));
	
}

	
}
}
