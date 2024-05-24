
public class Student {
	String name;
	static int id=1;
	long mob;
	int age;
	String gn;
	public Student()
	{
		System.out.println("constructor");
	}
	public Student(String name,long mob,	int age,	String gn) 
	{ this.name=name;
	this.mob=mob;
	this.age=age;
	this.gn=gn;
	}
	public static void main(String[] args) {
		new Student();
		Student s1=new Student("akshay",  7774454, 23, "male");
		student(s1);
		Student a2=new Student("ruta",  927072238008l, 33, "female");
		student(a2);
		Student a3=new Student("ruta",  927072238008l, 33, "female");
		student(a3);
		Student a4=new Student("ruta",  927072238008l, 33, "female");
		student(a4);
		Student a5=new Student("ruta",  927072238008l, 33, "female");
		student(a5);
	}
	public  static void student(Student x) {
		System.out.println("name "+x.name);
		System.out.println("id "+x.id++);
		System.out.println("mob "+x.mob);
		System.out.println("age "+x.age);
		System.out.println("gender "+x.gn);
System.out.println("-------------------------------------------------");
		
	}
	

}
