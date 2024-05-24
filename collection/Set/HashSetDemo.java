package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set s = new HashSet<>();
		s.add("sas");
		s.add(2323);
		s.add(23.232);
		s.add("32323");
		s.add("32323");
		s.add(null);
		s.add(null);
		System.out.println(s.contains("sas"));

		System.out.println(s);
	}
}
