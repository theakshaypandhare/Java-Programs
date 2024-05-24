package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A12 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		al.add(66);
		al.add(77);
		al.add(88);
		
		for (int i = 0; i < al.size(); i++) {
			Object o=al.get(i);
			int j=(Integer)o;
			j=j+5;
			System.out.println(j);
		}
	}
}
