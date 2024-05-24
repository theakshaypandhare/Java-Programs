package ArrayList;
import java.util.ArrayList;
public class A8 {
public static void main(String[] args) {
	ArrayList perfum=new ArrayList();		
	perfum.add("fogg");	
	perfum.add("pa");	
	perfum.add("do");
	
	System.out.println(perfum);
	System.out.println(perfum.contains("axe"));
	ArrayList maruti=new ArrayList();
	System.out.println(perfum.clone());
}
}
