package ArrayList;

import java.util.*;

public class RetainAll {
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add("akshay");
	col.add("sundra");
	col.add(232);
	col.add(true);
	col.add(4323.545);
	System.out.println("col: "+col);

	System.out.println();
	Collection col2=new ArrayList();
	col2.add("rohan");
	col2.add("suman");
	col2.add(111);
	System.out.println("col2: "+col2);

	System.out.println();
	Collection colAll=new ArrayList(col);//col added in colAll
	colAll.addAll(col2);//col2 added in callAll
	
	System.out.println("colAll: "+colAll);

	System.out.println();
	System.out.println("Before retain colAll: ");
	System.out.println("colAll"+colAll);
	
	colAll.retainAll(col2);//keep only col2
	System.out.println();
	System.out.println("After retain colAll col2: ");
	System.out.println("colAll"+colAll);
}
}
