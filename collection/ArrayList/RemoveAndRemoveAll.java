package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RemoveAndRemoveAll {
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add("akshay");
	col.add("sundra");
	col.add(232);
	col.add(true);
	col.add(4323.545);
	
	Collection col2=new ArrayList();
	col2.add("akshay");
	col2.add("sundra");
	col2.add(4323.545);
	
	System.out.println(col2.remove("sundra"));;
	Collection colAll=new ArrayList(col);//col added in colAll
	colAll.addAll(col2);//col2 added in callAll

	System.out.println(colAll.remove(col2));//NOT POSSIBLE
	System.out.println(colAll);
	colAll.removeAll(col2); 
	/*all similar elements of col2 
	remove from colAll*/
	System.out.println(colAll);
	

}
}
