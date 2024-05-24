package nestedclasses;

public class anony {
	public static void main(String[] args) {
		anonym ano = new anonym() {
			@Override
			public void syso() {
				System.out.println("hii by interface");
			}
		};
		ano.syso();
		
		anoabs anoabs=new anoabs() {
			@Override
			void print() {
				System.out.println("hii by abstract class");
			}
		};
		anoabs.print();
	}
}
