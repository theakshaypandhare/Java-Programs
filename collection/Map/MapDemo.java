package Map;

import java.util.HashMap;

public class MapDemo {
public static void main(String[] args) {
	HashMap h=new HashMap<>();	
	h.put(4, "shantanu");
	h.put(2, "vishal");
	h.put(1, "akshay");//													V put()
	h.put(3, "soham");
	HashMap hm=new HashMap<>();
	hm.putAll(h);//		V putAll()
	hm.put(8, null);											
	hm.put(5, "pravin");
	hm.put(6, "omkar");
	hm.put(7, null);
	System.out.println(hm); //printing all entries
	//  {1=akshay, 2=vishal, 3=soham, 4=shantanu, 5=pravin, 6=omkar, 7=null, 8=null} z
	
	System.out.println(hm.values());  //							collection values()
	
	
	//	[akshay, vishal, soham, shantanu, pravin, omkar, null, null]
	
	
	System.out.println(hm.putIfAbsent(8,"ram"));//	hoga to replace nahito insert			V putIfAbsent(K,V) 
	
	//	null
	
	System.out.println(hm);//						K=v
	
	//{1=akshay, 2=vishal, 3=soham, 4=shantanu, 5=pravin, 6=omkar, 7=null, 8=ram}
	
	System.out.println(hm.remove(2));//remove and display			V remove(k);
	
	//vishal
	
	hm.remove(1, "akshay");//												Boolean remove(k,v);
	System.out.println(hm);//						K=v
	
	//	{3=soham, 4=shantanu, 5=pravin, 6=omkar, 7=null, 8=ram}
	
	System.out.println(hm.keySet());//								Set keySet()
	
	//[3, 4, 5, 6, 7, 8]
	
	System.out.println(hm.entrySet());//						Set<Map.Entry<K,V>> entrySet()   K=v
	
	//	[3=soham, 4=shantanu, 5=pravin, 6=omkar, 7=null, 8=ram]
	
	System.out.println(hm.containsKey(3));//					boolean containsValue(Object key)
	
	//true
	
	System.out.println(hm.containsValue("vishal"));//		 boolean containsValue(Object value)
	
	//false
	
	System.out.println("replaced "+hm.replace(8,"sonu"));//		replace(K, V) 
	
	//replaced ram
	
	System.out.println(hm.replace(3,"soham","anu"));//				Boolean replace(K, oldValue, newValue) 
	
	//true
	
	System.out.println(hm.get(6));//							v.get(k)
	
	//omkar
	
	System.out.println(hm);
	
	//	{3=anu, 4=shantanu, 5=pravin, 6=omkar, 7=null, 8=sonu}
}
}
