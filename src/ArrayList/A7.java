package ArrayList;
import java.util.ArrayList;
public class A7 {
public static void main(String[] args) {
	ArrayList maruti=new ArrayList();
	maruti.add("alto");
	maruti.add("swift");
	maruti.add("baleno");
	
	ArrayList tata=new ArrayList();
	tata.add("safari");
	tata.add("harrier");
	tata.add("tiago");
	
	ArrayList cars=new ArrayList(tata);
	cars.addAll(maruti);
	System.out.println(cars);
	cars.removeAll(maruti);
	System.out.println(cars);
	cars.removeAll(tata);
	System.out.println(cars.isEmpty());
	
}
}
