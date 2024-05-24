package Sorting;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ComparableDemo {
	public static void main(String[] args) {

		Student s1 = new Student("akshay", 99.0);
		Student s2 = new Student("samay", 99.6);
		Student s3 = new Student("ram", 38.65);
		Student s4 = new Student("tausif", 60.32);
		Student s5 = new Student("rohit", 81.66);
		Student s6 = new Student("mayur", 55.37);
		Student s7 = new Student("priya", 62.56);

		List<Student> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		Collections.sort(l);
		Iterator<Student> s=l.iterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}
		
	}
}
