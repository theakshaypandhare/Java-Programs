package ArrayList;

import java.util.ArrayList;

public class A2 {
	public static void main(String[] args) {
		ArrayList cric = new ArrayList();// add cricketers in new list
		cric.add("ms dhoni");
		cric.add("virat");
		cric.add("ABD");
		ArrayList tp = new ArrayList();// add tenies player in new list
		tp.add("mirza");
		tp.add("mb");
		tp.add("sw");
		ArrayList ss = new ArrayList(cric);// merge cricketers and tenies player
		ss.addAll(tp);
		System.out.println(cric);
		System.out.println(tp);
		System.out.println(ss);

	}
}
