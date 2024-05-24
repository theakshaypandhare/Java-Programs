package ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class A10 {
public static void main(String[] args) {
	ArrayList ip=new ArrayList();
	ip.add("srt");
	ip.add("msd");
	ip.add("vk");
	ArrayList itp=new ArrayList(ip);
	itp.add("abd");
	itp.add("cg");
	
	System.out.println(itp.containsAll(ip));
	System.out.println(itp.indexOf("srt"));
	System.out.println(itp.indexOf("yuvi"));
	System.out.println(itp.size());
}
}
