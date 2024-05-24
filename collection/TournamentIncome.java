
public class TournamentIncome extends Player implements GradeBonus {
	int grade;
	double rate;
	PlayerIncome p = new PlayerIncome("akshay", 100);
	PlayerIncome p1 = new PlayerIncome("sanket", 100);
	PlayerIncome p2 = new PlayerIncome("rohit", 100);
	PlayerIncome p3 = new PlayerIncome("ajit", 100);
	PlayerIncome p4 = new PlayerIncome("sachin", 100);
	PlayerIncome p5 = new PlayerIncome("tushar", 100);

	public TournamentIncome(String name, int grade, double rate) {
		super();
		this.name = name;
		this.grade = grade;
		this.rate = rate;
	}

	@Override
	public void calculateGradeBonus() {
	rate-=(rate/100)*GRADE_BONUS_PERCENTAGE;
	}

	@Override
	void displayDetails() {
		PlayerIncome x=null;
		x.income+=rate;
		System.out.println("grade "+grade);
		System.out.println("rate "+rate);
		System.out.println("income "+x.income);
	}

}
