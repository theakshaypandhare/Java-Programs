package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class suffle {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	System.out.println(a);
	Collections.shuffle(a);
	System.out.println(a);
	Collections.shuffle(a);
	System.out.println(a);
}
}
