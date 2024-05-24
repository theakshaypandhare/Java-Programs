package Map;


public class Team implements Comparable<Team>{
	private String TeamName;
	private String OwnerName;
	public String getTeamName() {
		return TeamName;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public Team(String teamName, String ownerName) {
		super();
		TeamName = teamName;
		OwnerName = ownerName;
	}
	@Override
	public String toString() {
		return "Team [TeamName=" + TeamName + ", OwnerName=" + OwnerName + "]";
	}
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return this.OwnerName.compareToIgnoreCase(o.OwnerName);
	}
	
}
