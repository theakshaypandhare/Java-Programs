package Sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookControl {
public static void main(String[] args) {
	Book b= new Book("shyam", 121);
	Book b1= new Book("Mahabharat", 455);
	Book b2= new Book("ramayan", 325);
	Book b3= new Book("rich Dad", 987);
	
	List<Book> l=new LinkedList<>();
	l.add(b);
	l.add(b1);
	l.add(b2);
	l.add(b3);
	

	for (Book book : l) {
		System.out.println(book.bname+"  "+book.Bookid);
	}
	
	
	System.out.println("------------------------After Sorting------------------------");
	Comparator<Book> cmp=new Comparator<Book>() {
		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.bname.compareToIgnoreCase(o2.bname);
		}
	};
	Collections.sort(l,cmp);
	
	for (Book book : l) {
		System.out.println(book.bname+"  "+book.Bookid);
	}
}
}
