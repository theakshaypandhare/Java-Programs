package ArrayList;


public class Dogi extends ani {
	public void Drink() {
		super.Drink();
		System.out.println("Drink milk");
	}

	public void Bark() {
		System.out.println("Bark");
	}
public static void main(String[] args) {
	Dogi d=new Dogi();
	d.Bark();
	d.Drink();
	
}
}
