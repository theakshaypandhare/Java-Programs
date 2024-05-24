package nestedclasses;

public class OuterClassforMethodInnerClass {
	public void innerMethod() {
		class methodinner {
			private void print() {
				System.out.println("method Inner class");
			}

		}
		methodinner m = new methodinner();
		m.print();
	}

	public static void main(String[] args) {
		OuterClassforMethodInnerClass o = new OuterClassforMethodInnerClass();
		System.out.println("1 way");
		o.innerMethod();
		
	}
}
