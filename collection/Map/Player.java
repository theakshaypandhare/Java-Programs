package Map;

public class Player {
	private String playerName;
	private int jarseyNo;
	
	public Player(String playerName, int jarseyNo) {
		super();
		this.playerName = playerName;
		this.jarseyNo = jarseyNo;
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", jarseyNo=" + jarseyNo + "]";
	}
}