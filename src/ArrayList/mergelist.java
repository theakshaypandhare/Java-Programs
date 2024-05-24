package ArrayList;
import java.util.ArrayList;
public class mergelist {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(11);
	a.add(11);
	a.add(11);
	a.add(11);
	ArrayList b=new ArrayList();
	b.add(33);
	b.add(33);
	b.addAll(1,a);
	System.out.println(a);
}
}
