package Map;

import java.util.Objects;

public class StudentRollNoHashMap {
int rollNo;
String name;
public StudentRollNoHashMap(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}
@Override
public String toString() {
	return "[rollNo=" + rollNo + ", name=" + name + "]";
}
@Override
public int hashCode() {
	return Objects.hash(name, rollNo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	StudentRollNoHashMap other = (StudentRollNoHashMap) obj;
	return Objects.equals(name, other.name) && rollNo == other.rollNo;
}


}
