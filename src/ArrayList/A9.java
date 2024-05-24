package ArrayList;

import java.util.ArrayList;

public class A9 {
	public static void main(String[] args) {
		ArrayList s = new ArrayList();
		s.add("ola");
		s.add("active");
		s.add("access");
		ArrayList b = new ArrayList();
		b.add("r15");
		b.add("shine");
		b.add("appache");
		
		ArrayList motorBike=new ArrayList(s);
		motorBike.addAll(b);
		System.out.println(motorBike);
		motorBike.retainAll(b);
		System.out.println(motorBike);

	}
}
