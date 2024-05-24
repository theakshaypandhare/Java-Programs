package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class sortRevColl {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(22);
	a.add(32);
	a.add(76);
	a.add(9);
	a.add(43);
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	Collections.reverse(a);
			System.out.println(a);
}
}
