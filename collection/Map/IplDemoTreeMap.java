package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IplDemoTreeMap {
	public static void main(String[] args) {

		Team t = new Team("ncb", "mallaya");
		Team t1 = new Team("db", "maya");
		Team t2 = new Team("rb", "sallllaya");
		Team t3 = new Team("jcb", "laya");

		Player p = new Player("Dhoni", 11);
		Player p1 = new Player("virat", 41);
		Player p2 = new Player("pandya", 5);
		Player p3 = new Player("rahul", 33);

		Map<Team, Player> m = new TreeMap<Team, Player>();
		m.put(t, p);
		m.put(t1, p1);
		m.put(t2, p2);
		m.put(t3, p3);
		System.out.println("sorted by using comparable compareTO() by owner  name");

		Set<Entry<Team, Player>> keyVals = m.entrySet();
		for (Map.Entry<Team, Player> entry : keyVals) {
			Team key = entry.getKey();
			Player val = entry.getValue();
			System.out.println(key+" = "+m.get(key));
		}
		///////////////////////////////////////////////////////////////
		Comparator<Team> comp = new Comparator<Team>() {

			@Override
			public int compare(Team o1, Team o2) {
				// TODO Auto-generated method stub
				return o1.getTeamName().compareTo(o2.getTeamName());
			}
		};

		Map<Team, Player> m2 = new TreeMap<Team, Player>(comp);
		m2.putAll(m);
		System.out.println();
		
		System.out.println("sorted by using comparator compare() by team name");

		Set<Team> s = m2.keySet();
		for (Team te : s) {
			System.out.println(te + " = " + m2.get(te));
		}

	}
}
