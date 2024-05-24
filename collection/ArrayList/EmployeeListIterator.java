package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeListIterator {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("rohan");
		e.setEmpid(1);
		e.setContact(123456);
		Employee e1 = new Employee();
		e1.setName("SOham");
		e1.setEmpid(1);
		e1.setContact(123456);
		Employee e2 = new Employee();
		e2.setName("Ram");
		e2.setEmpid(1);
		e2.setContact(123456);
		Employee e3 = new Employee();
		e3.setName("SHam");
		e3.setEmpid(1);
		e3.setContact(123456);
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		System.out.println("iterate forword using ListIterator");
		ListIterator<Employee> li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(	li.nextIndex());//					nextIndex()
			System.out.println(li.next());
		}

		System.out.println("iterate backward using ListIterator");
		while (li.hasPrevious()) {	//								hasPrevious()
			System.out.println(li.previousIndex());//				previousIndex()
			System.out.println(li.previous());//					previous();
		}
	}
}
