package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeIterator {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("akshay");
		e.setEmpid(0);
		e.setContact(234567);
		Employee e1 = new Employee();
		e1.setName("sdfsdfd");
		e1.setEmpid(0);
		e1.setContact(234567);
		Employee e2 = new Employee();
		e2.setName("sdfsdfd");
		e2.setEmpid(0);
		e2.setContact(234567);
		Employee e3 = new Employee();
		e3.setName("sdfsdfd");
		e3.setEmpid(0);
		e3.setContact(234567);
		List<Employee> l = new ArrayList<Employee>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
String str=l.get(3).getName();
int i=l.get(3).getEmpid();
		System.out.println(str+" "+i);
		
		
		
		
		
		/*
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(l);
		System.out.println();
		System.out.println("Iterate using iterator");
		Iterator<Employee> i = l.iterator();
		while (i.hasNext()) {// 									hasNext();
			System.out.println(i.next());//							 next();

		}
		System.out.println("Remove from iterator interface");
		Iterator<Employee> i1 = l.iterator();
		while (i1.hasNext()) {
			String str = i1.next().getName();
			if (str.equals("akshay")) {
				i1.remove();//										 remove();
				Iterator<Employee> i2 = l.iterator();
				while (i2.hasNext()) {
					System.out.println(i2.next());
				}
				break;
			}
		}

		System.out.println("Iterate using for loop with size");
for (int j = 0; j < l.size(); j++) 
{
	System.out.println(l.get(j));	
}
		System.out.println("Iterate using two paramenter for loop with iterator");

		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

		System.out.println("Iterate using for loop with element object");
		for (Employee employee : l) {
			System.out.println(employee);
		}

	};
	*/
}
}
