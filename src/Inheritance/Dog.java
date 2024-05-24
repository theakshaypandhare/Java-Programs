package Inheritance;

public class Dog extends Animal{
String Bread;

public  void set(String bread)
{
	Bread=bread;
}
public void get() {
System.out.println(this.Weight);
	System.out.println(Bread);
	System.out.println(Colour);
}
}
