package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemoStudentControllerORIterate {
	public static void main(String[] args) {
		Student s0 = new Student(1, "abdu");
		Student s1 = new Student(1, "mc");
		Student s2 = new Student(2, "shiv");

		Set<Student> s = new HashSet<>();
		s.add(s0);
		s.add(s1);
		s.add(s2);
		
		System.out.println("---------------Iterate Using iterator interface");
		Iterator<Student> itr = s.iterator();
		
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		System.out.println("---------------Iterate Using foreach");

		for (Student student : s) {
			System.out.println(student);
			
		}
		System.out.println("---------------Iterate Using for each method of iterator interface");

		s.forEach(System.out :: println);
	}
}
