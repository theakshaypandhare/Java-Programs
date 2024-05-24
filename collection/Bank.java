interface Bank {
	final int SIZE = 10;

	String createAccount(int accno, String name, float amount);

	String withdrawAmount(int accno, float amount);

	String depositeAmount(int accno, float amount);

	String checkBalance(int accno);
}
