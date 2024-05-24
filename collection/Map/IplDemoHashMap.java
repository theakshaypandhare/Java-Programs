package Map;

import java.util.HashMap;
import java.util.Map;

public class IplDemoHashMap {
	public static void main(String[] args) {
		Team t = new Team("ncb", "mallaya");
		Team t1 = new Team("db", "maya");
		Team t2 = new Team("rb", "sallllaya");
		Team t3 = new Team("jcb", "laya");

		Player p = new Player("Dhoni", 11);
		Player p1 = new Player("virat", 41);
		Player p2 = new Player("pandya", 5);
		Player p3 = new Player("rahul", 33);
		
		Map<Team, Player> m = new HashMap<>();
		m.put(t, p);
		m.put(t1, p1);
		m.put(t2, p2);
		m.put(t3, p3);
		
		System.out.println(m);
	}
}
