class BankService implements Bank {
	int accno[] = new int[SIZE];
	String name[] = new String[SIZE];
	float amount[] = new float[SIZE];
	static int count = 0;

	@Override
	public String createAccount(int accno, String name, float amount) {
		for (int i = 0; i < this.accno.length; i++) {
			if (accno == this.accno[i]) 
			{
				return "Account no is already avilable";
			} 
			else if (this.accno[i] == 0) 
			{
				this.accno[i] = accno;
				this.name[i] = name;
				if (amount < 500) {
					return "enter amount greather than 500";
				} else {
					this.amount[i] = amount;
				}
				count++;
				break;
			}
		}
		return accno + " " + name + " " + amount;
	}

	@Override
	public String withdrawAmount(int accno, float amount) {
	for (int i = 0; i < this.accno.length; i++) 
	{
		if (accno != this.accno[i]) 
		{
			return "Account no is not exist";
		}
		else 
		{
			this.amount[i]=this.amount[i]-amount;
			if (this.amount[i]<=500) 
			{
				return "need to maintain min 500";
			}
			else 
			{
				return amount+"withdraw";
			}
		}
	}
		return null;
	}

	@Override
	public String depositeAmount(int accno, float amount) {
		for (int i = 0; i < this.accno.length; i++) 
		{
			if (accno != this.accno[i]) 
			{
				return "Account no is not exist";
			}
			else if(amount>50000)
			{
				return "you cant deposite amount greater than 50000";
			}
			else {
				this.amount[i]=this.amount[i]+amount;
				return "available balance "+this.amount[i];
			}
			
		}
		return null;
	}

	@Override
	public String checkBalance(int accno) {
	for (int i = 0; i < this.accno.length; i++) 
	{
		if (accno != this.accno[i]) 
		{
			return "Account no is not exist";
		}
		else
		{
			return "balance is"+this.amount[i];
		}
		
	}
	return null;
}
}	