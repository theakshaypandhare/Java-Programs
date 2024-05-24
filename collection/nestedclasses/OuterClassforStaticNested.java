package nestedclasses;

public class OuterClassforStaticNested {
	static class inner {
		void print() {
			System.out.println("Static Nested Class");
		}
	}
	public static void main(String[] args) {
		inner i=new inner();
		i.print();
	}
}
