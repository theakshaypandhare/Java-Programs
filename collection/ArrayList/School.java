package ArrayList;

public class School implements Comparable<School>{
String name;
int rollNo;
String Branch;
public String getName() {
	return name;
}
public int getRollNo() {
	return rollNo;
}
public String getBranch() {
	return Branch;
}
public School(String name,int rollNo,String Branch) {
	this.name=name;
	this.rollNo=rollNo;
	this.Branch=Branch;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+this.name+" Roll no= "+this.rollNo+" Branch= "+this.Branch;
	}
@Override
public int compareTo(School o) {
	return this.name.compareTo(o.name);
}
}
