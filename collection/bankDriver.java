import java.util.Scanner;

public class bankDriver {
	public static void main(String[] args) {

		BankService b = new BankService();
		Scanner sc = new Scanner(System.in);
		int i;
		int accno;
		String name, x;
		float amount;
		do {
			System.out.println("------------------------------------------------");
			System.out.println("1.create account");

			System.out.println("2.withdraw");

			System.out.println("3.deposit");

			System.out.println("4.check Balance");
			System.out.println("enter your choice:");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("enter account no");
				accno = sc.nextInt();
				System.out.println("enter customer name");
				name = sc.next();
				System.out.println("enter deposite ammount");
				amount = sc.nextFloat();
				System.out.println(b.createAccount(accno, name, amount));
				break;
			case 2:
				System.out.println("enter account no");
				accno = sc.nextInt();
				System.out.println("enter deposite ammount");
				amount = sc.nextFloat();
				System.out.println(b.withdrawAmount(accno, amount));
				break;
			case 3:
				System.out.println("enter account no");
				accno = sc.nextInt();
				System.out.println("enter deposite ammount");
				amount = sc.nextFloat();
				System.out.println(b.depositeAmount(accno, amount));
				break;
			case 4:
				System.out.println("enter account no");
				accno = sc.nextInt();
				System.out.println(b.checkBalance(accno));
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			System.out.println("do you want to continue? enter y/n");
			x = sc.next();
			if (x.equalsIgnoreCase("y")==false) {
				System.out.println("program is closed");
				i = -2;
			}
			else if (x.equalsIgnoreCase("y")) {
				
			}

		} while (i > 0);
	}
}
