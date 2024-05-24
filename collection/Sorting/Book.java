package Sorting;

public class Book {
String bname;
int Bookid;
public Book(String bname, int bookid) {
	super();
	this.bname = bname;
	Bookid = bookid;
}
@Override
public String toString() {
	return "BookName=" + bname + ", Bookid=" + Bookid;
}

}
