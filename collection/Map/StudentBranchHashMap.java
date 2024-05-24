package Map;

import java.util.HashMap;
import java.util.Map;

public class StudentBranchHashMap {
	String branch;

	public StudentBranchHashMap(String branch) {
		super();
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "[branch=" + branch + "]";
	}
}
