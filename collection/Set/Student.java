package Set;

import java.util.Objects;

public class Student {
int rollno;
String name;

@Override
public String toString() {
	return "rollno=" + rollno + ", name=" + name ;
}

public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}

@Override
public int hashCode() {
	return this.rollno;
}

@Override
public boolean equals(Object obj) {
	Student other = (Student) obj;
	return other.name==this.name && rollno == other.rollno;
}

}
