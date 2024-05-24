package Map;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMapController {
public static void main(String[] args) {
	StudentRollNoHashMap s=new StudentRollNoHashMap(1, "santosh");
	StudentRollNoHashMap s2=new StudentRollNoHashMap(1, "santosh");

	StudentBranchHashMap b=new StudentBranchHashMap("co");
	StudentBranchHashMap b2=new StudentBranchHashMap("ro");
	Map<StudentRollNoHashMap,StudentBranchHashMap> m=new HashMap<>();
	m.put(s, b);
	m.put(s2, b2);
	System.out.println(m);
}
	
}
