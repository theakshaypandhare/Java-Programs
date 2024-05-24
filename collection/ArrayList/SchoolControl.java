package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SchoolControl {
public static void main(String[] args) {
	ArrayList<School> sc=new ArrayList<School>();
	School s=new School("Akshay", 1, "co");
	School s1=new School("Samar",2, "ai");
	School s2=new School("amar", 3, "me");
	School s3=new School("tushar", 4, "ce");
	sc.add(s);
	sc.add(s1);
	sc.add(s2);
	sc.add(s3);
	System.out.println(sc);
	Comparator<School> com=new Comparator<School>() {

		@Override
		public int compare(School o1, School o2) {
			
			return o1.getName().compareToIgnoreCase(o2.getName());
		}
	};
	System.out.println(" reverse sorted by using name");
	Collections.sort(sc, com);
	Collections.reverse(sc);
	
	System.out.println(sc);
	
	
	System.out.println("sorted by using ROll no");
	Collections.sort(sc);
	
	System.out.println(sc);
}
}
