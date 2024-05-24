package nestedclasses;

public class OuterClassforInner 
{
	class inner {
		void print() {
			System.out.println("nested Inner Class");

		}
	}

	public void innerObject() {
		inner in = new inner();
		in.print();
	}

	public static void main(String[] args) {
		OuterClassforInner i = new OuterClassforInner();
		OuterClassforInner.inner ii = i.new inner();
		System.out.println("1 way");
		ii.print();
		System.out.println("2 way");
		i.innerObject();

	}
}
