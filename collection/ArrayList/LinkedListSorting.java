package ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListSorting {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("gunda");
		list.add("dingga");
		list.add("munna");
		list.add("chinna");
		list.add("maccha");
		
		System.out.println("Orignal= "+list);
		Collections.sort(list);
		System.out.println("sorted= "+list);
		Collections.reverse(list);
		System.out.println("reverse of sorted= "+list);
		
		ListIterator<String> Litr=list.listIterator();
		System.out.println("==============iterate using listIterator forword=========");
		while (Litr.hasNext()) {
			System.out.println(Litr.next());
			
		}
		System.out.println("==============iterate using listIterator backword=========");
		while (Litr.hasPrevious()) {
			System.out.println(Litr.previous());
			
		}

	}
}
