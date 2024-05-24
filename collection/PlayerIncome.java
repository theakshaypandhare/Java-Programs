
public class PlayerIncome extends Player implements Tax{
	double income;
	PlayerIncome(String name,double income) {
		this.name=name;
		this.income=income;
	}
	@Override
	public void calculateTax() {
				income-=(income/100)*TAX_PERCENT;
	}

	@Override
	void displayDetails() {
		System.out.println("Name "+name);
		System.out.println("Income "+income);
	}

}
