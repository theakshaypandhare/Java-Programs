package ArrayList;

import java.util.ArrayList;

public class A14 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("namo");
	a.add("shrivalli");
	a.add("namo");
	a.add("tum hi ho");
	a.add("kabhi khushi");
	String song=(String)a.get(0);
	int found=0;
	for (int i = 0; i < a.size(); i++) {
		if (song.equals((String)a.get(i))) {
			found=1;
			System.out.println("duplicate is found");
			break;
			}
	}
	if (found==0) {
		System.out.println("duplicate not found");
	}
	
}
}
