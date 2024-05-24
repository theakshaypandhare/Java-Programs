package comparable;

import java.util.ArrayList;

public class shufflee {
	

public static void main(String[] args) {
	
ArrayList a=new ArrayList();
a.add(new car("kia", "seltos", 235345433.6));
a.add(new car("fort", "toyt", 5434232323433.6));
a.add(new car("figo", "ford", 212121.6));
a.add(new car("alto", "maruti", 100000.6));
System.out.println(a);

}
}
 class car
{
	String name;
	String company;
	double price;
	
car(String name, String company, double price) {
		this.name = name;
		this.company = company;
		this.price = price;
	}


@Override
public String toString() {
	return "price=" + price + "]";
}
}
