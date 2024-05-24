package Sorting;

public class Student implements Comparable<Student> {
	String name;
	double perc;

	Student(String name, double perc) {
		this.name = name;
		this.perc = perc;
	}

	@Override
	public String toString() {
		return this.name + " " + this.perc;
	}

	@Override
	public int compareTo(Student o) {
//		if (this.name.equals(o.name)) 
//			return 0;
//		else if (this.name.compareToIgnoreCase(o.name)<0)
//			return -1;
//		else
//			return 1;

		return (int) (this.perc-o.perc);
		
		/* [or]
		 * for Ascending Order
		 * return this.name.compareToIgnoreCase(o.name);
		 */

		/* [or]
		 * for DescendSing Order
		 * return this.name.compareToIgnoreCase(o.name)*-1;
		 */
		}
		
		
		
		

	}

